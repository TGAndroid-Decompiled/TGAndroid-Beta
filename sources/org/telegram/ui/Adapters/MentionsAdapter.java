package org.telegram.ui.Adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.BotSwitchCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PremiumPreviewFragment;

public class MentionsAdapter extends RecyclerListView.SelectionAdapter implements NotificationCenter.NotificationCenterDelegate {
    private LongSparseArray botInfo;
    private int botsCount;
    private HashtagHint bottomHint;
    private Runnable cancelDelayRunnable;
    private int channelLastReqId;
    private int channelReqId;
    public TLRPC.Chat chat;
    private Runnable checkAgainRunnable;
    private boolean contextMedia;
    private int contextQueryReqid;
    private Runnable contextQueryRunnable;
    private int contextUsernameReqid;
    private boolean delayLocalResults;
    private MentionsAdapterDelegate delegate;
    private long dialog_id;
    private TLRPC.User foundContextBot;
    private String hintHashtag;
    private boolean hintHashtagDivider;
    private TLRPC.ChatFull info;
    private boolean isDarkTheme;
    private boolean isSearchingMentions;
    private Object[] lastData;
    private boolean lastForSearch;
    private Location lastKnownLocation;
    private int lastPosition;
    private int lastReqId;
    private String[] lastSearchKeyboardLanguage;
    private String lastSticker;
    private String lastText;
    private boolean lastUsernameOnly;
    private final Context mContext;
    private EmojiView.ChooseStickerActionTracker mentionsStickersActionTracker;
    private ArrayList messages;
    private String nextQueryOffset;
    private boolean noUserName;
    public ChatActivity parentFragment;
    private ArrayList quickReplies;
    private String quickRepliesQuery;
    private final Theme.ResourcesProvider resourcesProvider;
    private int resultLength;
    private int resultStartPosition;
    private SearchAdapterHelper searchAdapterHelper;
    private Runnable searchGlobalRunnable;
    private ArrayList searchResultBotContext;
    private TLRPC.TL_inlineBotSwitchPM searchResultBotContextSwitch;
    private long searchResultBotContextSwitchUserId;
    private TLRPC.TL_inlineBotWebView searchResultBotWebViewSwitch;
    private ArrayList searchResultCommands;
    private ArrayList searchResultCommandsEphemeral;
    private ArrayList searchResultCommandsHelp;
    private ArrayList searchResultCommandsUsers;
    private ArrayList searchResultHashtags;
    private ArrayList searchResultSuggestions;
    private ArrayList searchResultUsernames;
    private LongSparseArray searchResultUsernamesMap;
    private String searchingContextQuery;
    private String searchingContextUsername;
    private ArrayList stickers;
    private HashMap stickersMap;
    private final boolean stories;
    private long threadMessageId;
    private HashtagHint topHint;
    private TLRPC.User user;
    private boolean visibleByStickersSearch;
    private boolean allowStickers = true;
    private boolean allowBots = true;
    private boolean allowChats = true;
    private final boolean USE_DIVIDERS = false;
    private int currentAccount = UserConfig.selectedAccount;
    private boolean needUsernames = true;
    private boolean needBotContext = true;
    private boolean inlineMediaEnabled = true;
    private boolean searchInDialogs = false;
    private ArrayList stickersToLoad = new ArrayList();
    private SendMessagesHelper.LocationProvider locationProvider = new SendMessagesHelper.LocationProvider(new SendMessagesHelper.LocationProvider.LocationProviderDelegate() {
        @Override
        public void onLocationAcquired(Location location) {
            if (MentionsAdapter.this.foundContextBot == null || !MentionsAdapter.this.foundContextBot.bot_inline_geo) {
                return;
            }
            MentionsAdapter.this.lastKnownLocation = location;
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            mentionsAdapter.searchForContextBotResults(true, mentionsAdapter.foundContextBot, MentionsAdapter.this.searchingContextQuery, "");
        }

        @Override
        public void onUnableLocationAcquire() {
            MentionsAdapter.this.onLocationUnavailable();
        }
    }) {
        @Override
        public void stop() {
            super.stop();
            MentionsAdapter.this.lastKnownLocation = null;
        }
    };
    private boolean isReversed = false;
    private int lastItemCount = -1;

    public interface MentionsAdapterDelegate {
        void needChangePanelVisibility(boolean z);

        void onContextClick(TLRPC.BotInlineResult botInlineResult);

        void onContextSearch(boolean z);

        void onItemCountUpdate(int i, int i2);
    }

    static int access$1704(MentionsAdapter mentionsAdapter) {
        int i = mentionsAdapter.channelLastReqId + 1;
        mentionsAdapter.channelLastReqId = i;
        return i;
    }

    private static class StickerResult {
        public Object parent;
        public TLRPC.Document sticker;

        public StickerResult(TLRPC.Document document, Object obj) {
            this.sticker = document;
            this.parent = obj;
        }
    }

    public MentionsAdapter(Context context, boolean z, long j, long j2, MentionsAdapterDelegate mentionsAdapterDelegate, Theme.ResourcesProvider resourcesProvider, boolean z2) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.delegate = mentionsAdapterDelegate;
        this.isDarkTheme = z;
        this.dialog_id = j;
        this.stories = z2;
        this.threadMessageId = j2;
        SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
        this.searchAdapterHelper = searchAdapterHelper;
        searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
            @Override
            public boolean canApplySearchResults(int i) {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i);
            }

            @Override
            public LongSparseArray getExcludeCallParticipants() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
            }

            @Override
            public LongSparseArray getExcludeUsers() {
                return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
            }

            @Override
            public void onDataSetChanged(int i) {
                MentionsAdapter.this.notifyDataSetChanged();
            }

            @Override
            public void onSetHashtags(ArrayList arrayList, HashMap map) {
                if (MentionsAdapter.this.lastText != null) {
                    MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                    mentionsAdapter.searchUsernameOrHashtag(mentionsAdapter.lastText, MentionsAdapter.this.lastPosition, MentionsAdapter.this.messages, MentionsAdapter.this.lastUsernameOnly, MentionsAdapter.this.lastForSearch);
                }
            }
        });
        if (!z) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    public TLRPC.User getFoundContextBot() {
        return this.foundContextBot;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed) {
            ArrayList arrayList = this.stickers;
            if (arrayList == null || arrayList.isEmpty() || this.stickersToLoad.isEmpty() || !this.visibleByStickersSearch) {
                return;
            }
            this.stickersToLoad.remove((String) objArr[0]);
            if (this.stickersToLoad.isEmpty()) {
                this.delegate.needChangePanelVisibility(getItemCountInternal() > 0);
                return;
            }
            return;
        }
        if (i == NotificationCenter.recentDocumentsDidLoad) {
            Runnable runnable2 = this.checkAgainRunnable;
            if (runnable2 != null) {
                AndroidUtilities.runOnUIThread(runnable2);
                this.checkAgainRunnable = null;
                return;
            }
            return;
        }
        if (i == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (runnable = this.checkAgainRunnable) != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.checkAgainRunnable = null;
        }
    }

    private void addStickerToResult(TLRPC.Document document, Object obj) {
        if (document == null) {
            return;
        }
        String str = document.dc_id + "_" + document.id;
        HashMap map = this.stickersMap;
        if (map == null || !map.containsKey(str)) {
            if (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(document)) {
                if (this.stickers == null) {
                    this.stickers = new ArrayList();
                    this.stickersMap = new HashMap();
                }
                this.stickers.add(new StickerResult(document, obj));
                this.stickersMap.put(str, document);
                EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = this.mentionsStickersActionTracker;
                if (chooseStickerActionTracker != null) {
                    chooseStickerActionTracker.checkVisibility();
                }
            }
        }
    }

    private void addStickersToResult(ArrayList arrayList, Object obj) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            String str = document.dc_id + "_" + document.id;
            HashMap map = this.stickersMap;
            if ((map == null || !map.containsKey(str)) && (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(document))) {
                int size2 = document.attributes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                }
                if (this.stickers == null) {
                    this.stickers = new ArrayList();
                    this.stickersMap = new HashMap();
                }
                this.stickers.add(new StickerResult(document, obj));
                this.stickersMap.put(str, document);
            }
        }
    }

    private boolean checkStickerFilesExistAndDownload() {
        if (this.stickers == null) {
            return false;
        }
        this.stickersToLoad.clear();
        int iMin = Math.min(6, this.stickers.size());
        for (int i = 0; i < iMin; i++) {
            StickerResult stickerResult = (StickerResult) this.stickers.get(i);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerResult.sticker.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) && !FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                this.stickersToLoad.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerResult.sticker), stickerResult.parent, "webp", 1, 1);
            }
        }
        return this.stickersToLoad.isEmpty();
    }

    private boolean isValidSticker(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    private void searchServerStickers(final String str, String str2) {
        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
        tL_messages_getStickers.emoticon = str2;
        tL_messages_getStickers.hash = 0L;
        this.lastReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MentionsAdapter.m1295$r8$lambda$AffoJHTKkZmQ_azaCO4vltWJzM(this.f$0, str, tLObject, tL_error);
            }
        });
    }

    public static void m1295$r8$lambda$AffoJHTKkZmQ_azaCO4vltWJzM(final MentionsAdapter mentionsAdapter, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mentionsAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MentionsAdapter.m1301$r8$lambda$wn91zgqvphjFG0nsqFo8J1dKbc(this.f$0, str, tLObject);
            }
        });
    }

    public static void m1301$r8$lambda$wn91zgqvphjFG0nsqFo8J1dKbc(MentionsAdapter mentionsAdapter, String str, TLObject tLObject) {
        ArrayList arrayList;
        mentionsAdapter.lastReqId = 0;
        if (str.equals(mentionsAdapter.lastSticker) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
            mentionsAdapter.delayLocalResults = false;
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            ArrayList arrayList2 = mentionsAdapter.stickers;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            mentionsAdapter.addStickersToResult(tL_messages_stickers.stickers, "sticker_search_" + str);
            ArrayList arrayList3 = mentionsAdapter.stickers;
            int size2 = arrayList3 != null ? arrayList3.size() : 0;
            if (!mentionsAdapter.visibleByStickersSearch && (arrayList = mentionsAdapter.stickers) != null && !arrayList.isEmpty()) {
                mentionsAdapter.checkStickerFilesExistAndDownload();
                mentionsAdapter.delegate.needChangePanelVisibility(mentionsAdapter.getItemCountInternal() > 0);
                mentionsAdapter.visibleByStickersSearch = true;
            }
            if (size != size2) {
                mentionsAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void notifyDataSetChanged() {
        MentionsAdapterDelegate mentionsAdapterDelegate;
        int i = this.lastItemCount;
        int i2 = 0;
        if (i == -1 || this.lastData == null) {
            MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
            if (mentionsAdapterDelegate2 != null) {
                mentionsAdapterDelegate2.onItemCountUpdate(0, getItemCount());
            }
            super.notifyDataSetChanged();
            this.lastData = new Object[getItemCount()];
            while (true) {
                Object[] objArr = this.lastData;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = getItem(i2);
                i2++;
            }
        } else {
            int itemCount = getItemCount();
            boolean z = i != itemCount;
            int iMin = Math.min(i, itemCount);
            Object[] objArr2 = new Object[itemCount];
            for (int i3 = 0; i3 < itemCount; i3++) {
                objArr2[i3] = getItem(i3);
            }
            while (i2 < iMin) {
                if (i2 >= 0) {
                    Object[] objArr3 = this.lastData;
                    if (i2 >= objArr3.length || i2 >= itemCount || !itemsEqual(objArr3[i2], objArr2[i2])) {
                        notifyItemChanged(i2);
                        z = true;
                    }
                } else {
                    notifyItemChanged(i2);
                    z = true;
                }
                i2++;
            }
            notifyItemRangeRemoved(iMin, i - iMin);
            notifyItemRangeInserted(iMin, itemCount - iMin);
            if (z && (mentionsAdapterDelegate = this.delegate) != null) {
                mentionsAdapterDelegate.onItemCountUpdate(i, itemCount);
            }
            this.lastData = objArr2;
        }
    }

    private boolean itemsEqual(Object obj, Object obj2) {
        MediaDataController.KeywordResult keywordResult;
        String str;
        String str2;
        if (obj instanceof QuickRepliesController.QuickReply) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        if ((obj instanceof StickerResult) && (obj2 instanceof StickerResult) && ((StickerResult) obj).sticker == ((StickerResult) obj2).sticker) {
            return true;
        }
        if ((obj instanceof TLRPC.User) && (obj2 instanceof TLRPC.User) && ((TLRPC.User) obj).id == ((TLRPC.User) obj2).id) {
            return true;
        }
        if ((obj instanceof TLRPC.Chat) && (obj2 instanceof TLRPC.Chat) && ((TLRPC.Chat) obj).id == ((TLRPC.Chat) obj2).id) {
            return true;
        }
        if ((obj instanceof String) && (obj2 instanceof String) && obj.equals(obj2)) {
            return true;
        }
        if ((obj instanceof MediaDataController.KeywordResult) && (obj2 instanceof MediaDataController.KeywordResult) && (str = (keywordResult = (MediaDataController.KeywordResult) obj).keyword) != null) {
            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) obj2;
            if (str.equals(keywordResult2.keyword) && (str2 = keywordResult.emoji) != null && str2.equals(keywordResult2.emoji)) {
                return true;
            }
        }
        return false;
    }

    private void clearStickers() {
        this.lastSticker = null;
        this.stickers = null;
        this.stickersMap = null;
        notifyDataSetChanged();
        this.visibleByStickersSearch = false;
        if (this.lastReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastReqId, true);
            this.lastReqId = 0;
        }
        EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = this.mentionsStickersActionTracker;
        if (chooseStickerActionTracker != null) {
            chooseStickerActionTracker.checkVisibility();
        }
    }

    public void onDestroy() {
        SendMessagesHelper.LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.stop();
        }
        Runnable runnable = this.contextQueryRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.contextQueryRunnable = null;
        }
        if (this.contextUsernameReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextUsernameReqid, true);
            this.contextUsernameReqid = 0;
        }
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        this.foundContextBot = null;
        this.searchResultBotContextSwitch = null;
        this.inlineMediaEnabled = true;
        this.searchingContextUsername = null;
        this.searchingContextQuery = null;
        this.noUserName = false;
        if (!this.isDarkTheme) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    public void setParentFragment(ChatActivity chatActivity) {
        this.parentFragment = chatActivity;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        ChatActivity chatActivity;
        TLRPC.Chat currentChat;
        this.currentAccount = UserConfig.selectedAccount;
        this.info = chatFull;
        if (!this.inlineMediaEnabled && this.foundContextBot != null && (chatActivity = this.parentFragment) != null && (currentChat = chatActivity.getCurrentChat()) != null) {
            boolean zCanSendStickers = ChatObject.canSendStickers(currentChat);
            this.inlineMediaEnabled = zCanSendStickers;
            if (zCanSendStickers) {
                this.searchResultUsernames = null;
                notifyDataSetChanged();
                this.delegate.needChangePanelVisibility(false);
                processFoundUser(this.foundContextBot);
            }
        }
        String str = this.lastText;
        if (str != null) {
            searchUsernameOrHashtag(str, this.lastPosition, this.messages, this.lastUsernameOnly, this.lastForSearch);
        }
    }

    public void setNeedUsernames(boolean z) {
        this.needUsernames = z;
    }

    public void setNeedBotContext(boolean z) {
        this.needBotContext = z;
    }

    public void setBotInfo(LongSparseArray longSparseArray) {
        this.botInfo = longSparseArray;
    }

    public void setBotsCount(int i) {
        this.botsCount = i;
    }

    public void clearRecentHashtags() {
        this.searchAdapterHelper.clearRecentHashtags();
        this.searchResultHashtags.clear();
        notifyDataSetChanged();
        MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
        if (mentionsAdapterDelegate != null) {
            mentionsAdapterDelegate.needChangePanelVisibility(false);
        }
    }

    public TLRPC.TL_inlineBotSwitchPM getBotContextSwitch() {
        TLRPC.User user = this.foundContextBot;
        if (user == null || user.id == this.searchResultBotContextSwitchUserId) {
            return this.searchResultBotContextSwitch;
        }
        return null;
    }

    public TLRPC.TL_inlineBotWebView getBotWebViewSwitch() {
        return this.searchResultBotWebViewSwitch;
    }

    public long getContextBotId() {
        TLRPC.User user = this.foundContextBot;
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    public TLRPC.User getContextBotUser() {
        return this.foundContextBot;
    }

    public String getContextBotName() {
        TLRPC.User user = this.foundContextBot;
        return user != null ? user.username : "";
    }

    public void processFoundUser(TLRPC.User user) {
        ChatActivity chatActivity;
        TLRPC.Chat currentChat;
        this.contextUsernameReqid = 0;
        this.locationProvider.stop();
        if (user != null && user.bot && user.bot_inline_placeholder != null) {
            this.foundContextBot = user;
            long j = user.id;
            if (j != this.searchResultBotContextSwitchUserId) {
                this.searchResultBotContextSwitch = null;
                this.searchResultBotContextSwitchUserId = j;
            }
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && (currentChat = chatActivity2.getCurrentChat()) != null) {
                boolean zCanSendStickers = ChatObject.canSendStickers(currentChat);
                this.inlineMediaEnabled = zCanSendStickers;
                if (!zCanSendStickers) {
                    notifyDataSetChanged();
                    this.delegate.needChangePanelVisibility(true);
                    return;
                }
            }
            if (this.foundContextBot.bot_inline_geo) {
                if (!MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("inlinegeo_" + this.foundContextBot.id, false) && (chatActivity = this.parentFragment) != null && chatActivity.getParentActivity() != null) {
                    final TLRPC.User user2 = this.foundContextBot;
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.parentFragment.getParentActivity());
                    builder.setTitle(LocaleController.getString(R.string.ShareYouLocationTitle));
                    builder.setMessage(LocaleController.getString(R.string.ShareYouLocationInline));
                    final boolean[] zArr = new boolean[1];
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i) {
                            MentionsAdapter.$r8$lambda$KDJjnBBRzDBMfFATCoi30PsSO8I(this.f$0, zArr, user2, alertDialog, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i) {
                            MentionsAdapter.m1300$r8$lambda$vKm2jnehT0bBetKIrBbn4T8h2E(this.f$0, zArr, alertDialog, i);
                        }
                    });
                    this.parentFragment.showDialog(builder.create(), new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            MentionsAdapter.m1302$r8$lambda$wnxqc5Lojznr_6niaInwI8KWpE(this.f$0, zArr, dialogInterface);
                        }
                    });
                } else {
                    checkLocationPermissionsOrStart();
                }
            }
        } else {
            this.foundContextBot = null;
            this.searchResultBotContextSwitch = null;
            this.inlineMediaEnabled = true;
        }
        if (this.foundContextBot == null) {
            this.noUserName = true;
            this.searchResultBotContextSwitch = null;
        } else {
            MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
            if (mentionsAdapterDelegate != null) {
                mentionsAdapterDelegate.onContextSearch(true);
            }
            searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, "");
        }
    }

    public static void $r8$lambda$KDJjnBBRzDBMfFATCoi30PsSO8I(MentionsAdapter mentionsAdapter, boolean[] zArr, TLRPC.User user, AlertDialog alertDialog, int i) {
        mentionsAdapter.getClass();
        zArr[0] = true;
        if (user != null) {
            MessagesController.getNotificationsSettings(mentionsAdapter.currentAccount).edit().putBoolean("inlinegeo_" + user.id, true).commit();
            mentionsAdapter.checkLocationPermissionsOrStart();
        }
    }

    public static void m1300$r8$lambda$vKm2jnehT0bBetKIrBbn4T8h2E(MentionsAdapter mentionsAdapter, boolean[] zArr, AlertDialog alertDialog, int i) {
        mentionsAdapter.getClass();
        zArr[0] = true;
        mentionsAdapter.onLocationUnavailable();
    }

    public static void m1302$r8$lambda$wnxqc5Lojznr_6niaInwI8KWpE(MentionsAdapter mentionsAdapter, boolean[] zArr, DialogInterface dialogInterface) {
        mentionsAdapter.getClass();
        if (zArr[0]) {
            return;
        }
        mentionsAdapter.onLocationUnavailable();
    }

    private void searchForContextBot(String str, String str2) {
        MentionsAdapterDelegate mentionsAdapterDelegate;
        MentionsAdapterDelegate mentionsAdapterDelegate2;
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.foundContextBot;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.searchingContextQuery) == null || !str5.equals(str2)) {
            if (this.foundContextBot != null) {
                if (!this.inlineMediaEnabled && str != null && str2 != null) {
                    return;
                } else {
                    this.delegate.needChangePanelVisibility(false);
                }
            }
            Runnable runnable = this.contextQueryRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.contextQueryRunnable = null;
            }
            if (TextUtils.isEmpty(str) || !((str3 = this.searchingContextUsername) == null || str3.equals(str))) {
                if (this.contextUsernameReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextUsernameReqid, true);
                    this.contextUsernameReqid = 0;
                }
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.foundContextBot = null;
                this.searchResultBotContextSwitch = null;
                this.inlineMediaEnabled = true;
                this.searchingContextUsername = null;
                this.searchingContextQuery = null;
                this.locationProvider.stop();
                this.noUserName = false;
                MentionsAdapterDelegate mentionsAdapterDelegate3 = this.delegate;
                if (mentionsAdapterDelegate3 != null) {
                    mentionsAdapterDelegate3.onContextSearch(false);
                }
                if (str != null && str.length() != 0) {
                    if (str2 == null) {
                        if (this.contextQueryReqid != 0) {
                            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                            this.contextQueryReqid = 0;
                        }
                        this.searchingContextQuery = null;
                        mentionsAdapterDelegate2 = this.delegate;
                        if (mentionsAdapterDelegate2 != null) {
                            mentionsAdapterDelegate2.onContextSearch(false);
                        }
                    } else {
                        mentionsAdapterDelegate = this.delegate;
                        if (mentionsAdapterDelegate != null) {
                            if (this.foundContextBot != null) {
                                mentionsAdapterDelegate.onContextSearch(true);
                            } else if (str.equals("gif")) {
                                this.searchingContextUsername = "gif";
                                this.delegate.onContextSearch(false);
                            }
                        }
                        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                        this.searchingContextQuery = str2;
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(str2, str, messagesController, messagesStorage);
                        this.contextQueryRunnable = anonymousClass4;
                        AndroidUtilities.runOnUIThread(anonymousClass4, 400L);
                    }
                }
            } else if (str2 == null) {
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.searchingContextQuery = null;
                mentionsAdapterDelegate2 = this.delegate;
                if (mentionsAdapterDelegate2 != null) {
                    mentionsAdapterDelegate2.onContextSearch(false);
                }
            } else {
                mentionsAdapterDelegate = this.delegate;
                if (mentionsAdapterDelegate != null) {
                    if (this.foundContextBot != null) {
                        mentionsAdapterDelegate.onContextSearch(true);
                    } else if (str.equals("gif")) {
                        this.searchingContextUsername = "gif";
                        this.delegate.onContextSearch(false);
                    }
                }
                MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(this.currentAccount);
                this.searchingContextQuery = str2;
                AnonymousClass4 anonymousClass5 = new AnonymousClass4(str2, str, messagesController2, messagesStorage2);
                this.contextQueryRunnable = anonymousClass5;
                AndroidUtilities.runOnUIThread(anonymousClass5, 400L);
            }
        }
    }

    class AnonymousClass4 implements Runnable {
        final MessagesController val$messagesController;
        final MessagesStorage val$messagesStorage;
        final String val$query;
        final String val$username;

        AnonymousClass4(String str, String str2, MessagesController messagesController, MessagesStorage messagesStorage) {
            this.val$query = str;
            this.val$username = str2;
            this.val$messagesController = messagesController;
            this.val$messagesStorage = messagesStorage;
        }

        @Override
        public void run() {
            if (MentionsAdapter.this.contextQueryRunnable != this) {
                return;
            }
            MentionsAdapter.this.contextQueryRunnable = null;
            if (MentionsAdapter.this.foundContextBot != null || MentionsAdapter.this.noUserName) {
                if (MentionsAdapter.this.noUserName) {
                    return;
                }
                MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                mentionsAdapter.searchForContextBotResults(true, mentionsAdapter.foundContextBot, this.val$query, "");
                return;
            }
            MentionsAdapter.this.searchingContextUsername = this.val$username;
            TLObject userOrChat = this.val$messagesController.getUserOrChat(MentionsAdapter.this.searchingContextUsername);
            if (userOrChat instanceof TLRPC.User) {
                MentionsAdapter.this.processFoundUser((TLRPC.User) userOrChat);
                return;
            }
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MentionsAdapter.this.searchingContextUsername;
            MentionsAdapter mentionsAdapter2 = MentionsAdapter.this;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(mentionsAdapter2.currentAccount);
            final String str = this.val$username;
            final MessagesController messagesController = this.val$messagesController;
            final MessagesStorage messagesStorage = this.val$messagesStorage;
            mentionsAdapter2.contextUsernameReqid = connectionsManager.sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MentionsAdapter.AnonymousClass4.$r8$lambda$6qFBhbA5el53zmjUAQbOdy4ZCq0(this.f$0, str, messagesController, messagesStorage, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$6qFBhbA5el53zmjUAQbOdy4ZCq0(final AnonymousClass4 anonymousClass4, final String str, final MessagesController messagesController, final MessagesStorage messagesStorage, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            anonymousClass4.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MentionsAdapter.AnonymousClass4.m1303$r8$lambda$m8BXuePyYlp3o_WtWb6BQAxPko(this.f$0, str, tL_error, tLObject, messagesController, messagesStorage);
                }
            });
        }

        public static void m1303$r8$lambda$m8BXuePyYlp3o_WtWb6BQAxPko(AnonymousClass4 anonymousClass4, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
            if (MentionsAdapter.this.searchingContextUsername == null || !MentionsAdapter.this.searchingContextUsername.equals(str)) {
                return;
            }
            TLRPC.User user = null;
            if (tL_error == null) {
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                    TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                    messagesController.putUser(user2, false);
                    messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer.users, null, true, true);
                    user = user2;
                }
            }
            MentionsAdapter.this.processFoundUser(user);
            MentionsAdapter.this.contextUsernameReqid = 0;
        }
    }

    public void onLocationUnavailable() {
        TLRPC.User user = this.foundContextBot;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.lastKnownLocation = location;
        location.setLatitude(-1000.0d);
        this.lastKnownLocation.setLongitude(-1000.0d);
        searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, "");
    }

    private void checkLocationPermissionsOrStart() {
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity == null || chatActivity.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.parentFragment.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.parentFragment.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.foundContextBot;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.locationProvider.start();
    }

    public void setSearchingMentions(boolean z) {
        this.isSearchingMentions = z;
    }

    public String getBotCaption() {
        TLRPC.User user = this.foundContextBot;
        if (user != null) {
            return user.bot_inline_placeholder;
        }
        String str = this.searchingContextUsername;
        if (str == null || !str.equals("gif")) {
            return null;
        }
        return LocaleController.getString(R.string.SearchGifsTitle);
    }

    public void searchForContextBotForNextOffset() {
        String str;
        TLRPC.User user;
        String str2;
        if (this.contextQueryReqid != 0 || (str = this.nextQueryOffset) == null || str.length() == 0 || (user = this.foundContextBot) == null || (str2 = this.searchingContextQuery) == null) {
            return;
        }
        searchForContextBotResults(true, user, str2, this.nextQueryOffset);
    }

    public void searchForContextBotResults(final boolean z, final TLRPC.User user, final String str, final String str2) {
        Location location;
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        if (!this.inlineMediaEnabled || !this.allowBots) {
            MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
            if (mentionsAdapterDelegate != null) {
                mentionsAdapterDelegate.onContextSearch(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.searchingContextQuery = null;
            return;
        }
        if (user.bot_inline_geo && this.lastKnownLocation == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dialog_id);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(this.dialog_id);
        sb.append("_");
        sb.append(user.id);
        sb.append("_");
        sb.append((!user.bot_inline_geo || this.lastKnownLocation.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.lastKnownLocation.getLatitude() + this.lastKnownLocation.getLongitude()));
        final String string = sb.toString();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                MentionsAdapter.m1296$r8$lambda$FEVHHL3jLtKUMGMF3sKKFq47k(this.f$0, str, z, user, str2, messagesStorage, string, tLObject, tL_error);
            }
        };
        long j = user.id;
        if (j != this.searchResultBotContextSwitchUserId) {
            this.searchResultBotContextSwitch = null;
            this.searchResultBotContextSwitchUserId = j;
        }
        if (z) {
            messagesStorage.getBotCache(string, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.lastKnownLocation) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
        }
        if (DialogObject.isEncryptedDialog(this.dialog_id)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialog_id);
        }
        this.contextQueryReqid = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
    }

    public static void m1296$r8$lambda$FEVHHL3jLtKUMGMF3sKKFq47k(final MentionsAdapter mentionsAdapter, final String str, final boolean z, final TLRPC.User user, final String str2, final MessagesStorage messagesStorage, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        mentionsAdapter.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MentionsAdapter.m1299$r8$lambda$eV3DaMEBh4FLqclvdf9Dshac84(this.f$0, str, z, tLObject, user, str2, messagesStorage, str3);
            }
        });
    }

    public static void m1299$r8$lambda$eV3DaMEBh4FLqclvdf9Dshac84(MentionsAdapter mentionsAdapter, String str, boolean z, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        boolean z2;
        if (str.equals(mentionsAdapter.searchingContextQuery)) {
            mentionsAdapter.contextQueryReqid = 0;
            if (z && tLObject == null) {
                mentionsAdapter.searchForContextBotResults(false, user, str, str2);
            } else {
                MentionsAdapterDelegate mentionsAdapterDelegate = mentionsAdapter.delegate;
                if (mentionsAdapterDelegate != null) {
                    mentionsAdapterDelegate.onContextSearch(false);
                }
            }
            if (tLObject instanceof TLRPC.TL_messages_botResults) {
                TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                if (!z && tL_messages_botResults.cache_time != 0) {
                    messagesStorage.saveBotCache(str3, tL_messages_botResults);
                }
                mentionsAdapter.nextQueryOffset = tL_messages_botResults.next_offset;
                if (mentionsAdapter.searchResultBotContextSwitch == null) {
                    mentionsAdapter.searchResultBotContextSwitch = tL_messages_botResults.switch_pm;
                }
                mentionsAdapter.searchResultBotWebViewSwitch = tL_messages_botResults.switch_webview;
                int i = 0;
                while (i < tL_messages_botResults.results.size()) {
                    TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i);
                    if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                        tL_messages_botResults.results.remove(i);
                        i--;
                    }
                    botInlineResult.query_id = tL_messages_botResults.query_id;
                    i++;
                }
                if (mentionsAdapter.searchResultBotContext == null || str2.length() == 0) {
                    mentionsAdapter.searchResultBotContext = tL_messages_botResults.results;
                    mentionsAdapter.contextMedia = tL_messages_botResults.gallery;
                    z2 = false;
                } else {
                    mentionsAdapter.searchResultBotContext.addAll(tL_messages_botResults.results);
                    if (tL_messages_botResults.results.isEmpty()) {
                        mentionsAdapter.nextQueryOffset = "";
                    }
                    z2 = true;
                }
                Runnable runnable = mentionsAdapter.cancelDelayRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    mentionsAdapter.cancelDelayRunnable = null;
                }
                mentionsAdapter.searchResultHashtags = null;
                mentionsAdapter.stickers = null;
                mentionsAdapter.searchResultUsernames = null;
                mentionsAdapter.searchResultUsernamesMap = null;
                mentionsAdapter.searchResultCommands = null;
                mentionsAdapter.searchResultCommandsEphemeral = null;
                mentionsAdapter.quickReplies = null;
                mentionsAdapter.searchResultSuggestions = null;
                mentionsAdapter.searchResultCommandsHelp = null;
                mentionsAdapter.searchResultCommandsUsers = null;
                mentionsAdapter.visibleByStickersSearch = false;
                mentionsAdapter.delegate.needChangePanelVisibility((mentionsAdapter.searchResultBotContext.isEmpty() && mentionsAdapter.searchResultBotContextSwitch == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? false : true);
                if (z2) {
                    int i2 = (mentionsAdapter.searchResultBotContextSwitch == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? 0 : 1;
                    mentionsAdapter.notifyItemChanged(((mentionsAdapter.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2) - 1);
                    mentionsAdapter.notifyItemRangeInserted((mentionsAdapter.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2, tL_messages_botResults.results.size());
                    return;
                }
                mentionsAdapter.notifyDataSetChanged();
            }
        }
    }

    private static ArrayList sortAndDeduplicateTopPeers(ArrayList arrayList) {
        List.EL.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
            Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
        }
        return new ArrayList(linkedHashMap.values());
    }

    public void searchUsernameOrHashtag(final CharSequence charSequence, int i, ArrayList arrayList, final boolean z, final boolean z2) {
        boolean z3;
        String str;
        boolean z4;
        final ArrayList arrayList2;
        StringBuilder sb;
        final int i2;
        String str2;
        ChatActivity chatActivity;
        byte b;
        int i3;
        String strSubstring;
        String strSubstring2;
        MessagesController messagesController;
        String str3;
        char cCharAt;
        String strSubstring3;
        int i4;
        int i5;
        boolean z5;
        ?? r6;
        int i6;
        HashtagHint hashtagHint;
        HashtagHint hashtagHint2;
        String[] currentKeyboardLanguage;
        boolean z6;
        ArrayList arrayList3;
        int i7;
        ?? r7;
        boolean z7;
        ArrayList arrayList4;
        TL_bots.BotInfo botInfo;
        int i8;
        TLRPC.BotCommand botCommand;
        String str4;
        ArrayList hashtags;
        int i9;
        boolean z8;
        SearchAdapterHelper.HashtagObject hashtagObject;
        String str5;
        long j;
        String lowerCase;
        boolean z9;
        final ArrayList arrayList5;
        final LongSparseArray longSparseArray;
        ArrayList arrayList6;
        long j2;
        ChatActivity chatActivity2;
        TLRPC.ChatFull chatFull;
        long threadId;
        TLRPC.Chat chat;
        TLRPC.User currentUser;
        String str6;
        boolean z10;
        ArrayList<TLRPC.Dialog> allDialogs;
        int i10;
        boolean z11;
        TLRPC.Chat chat2;
        String str7;
        long j3;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        int i11;
        String str8;
        boolean z12;
        TLRPC.User user2;
        String str9;
        long j4;
        String publicUsername;
        String str10;
        Object obj;
        long j5;
        int i12;
        long fromChatId;
        ?? r8;
        boolean z13;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int length;
        CharSequence charSequenceConcat;
        int i13;
        char cCharAt2;
        int i14;
        char cCharAt3;
        String str11 = "";
        String string = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat currentChat = this.chat;
        ChatActivity chatActivity3 = this.parentFragment;
        if (chatActivity3 != null) {
            currentChat = chatActivity3.getCurrentChat();
            this.parentFragment.getCurrentUser();
        }
        TLRPC.Chat chat3 = currentChat;
        Runnable runnable = this.cancelDelayRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.cancelDelayRunnable = null;
        }
        if (this.channelReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.channelReqId, true);
            this.channelReqId = 0;
        }
        Runnable runnable2 = this.searchGlobalRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.searchGlobalRunnable = null;
        }
        Runnable runnable3 = this.checkAgainRunnable;
        if (runnable3 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable3);
            this.checkAgainRunnable = null;
        }
        if (TextUtils.isEmpty(string) || string.length() > MessagesController.getInstance(this.currentAccount).getMaxMessageLength()) {
            searchForContextBot(null, null);
            this.delegate.needChangePanelVisibility(false);
            this.lastText = null;
            clearStickers();
            return;
        }
        int i15 = string.length() > 0 ? i - 1 : i;
        this.lastText = null;
        this.lastUsernameOnly = z;
        this.lastForSearch = z2;
        StringBuilder sb2 = new StringBuilder();
        if (!z && string.length() > 0) {
            z3 = string.length() <= 14;
            if (z3) {
                length = string.length();
                charSequenceConcat = string;
                i13 = 0;
                while (i13 < length) {
                    cCharAt2 = charSequenceConcat.charAt(i13);
                    i14 = length - 1;
                    if (i13 < i14) {
                        cCharAt3 = charSequenceConcat.charAt(i13 + 1);
                    } else {
                        cCharAt3 = 0;
                    }
                    if (i13 < i14 || cCharAt2 != 55356 || cCharAt3 < 57339 || cCharAt3 > 57343) {
                        if (cCharAt2 == 65039) {
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i13), charSequenceConcat.subSequence(i13 + 1, charSequenceConcat.length()));
                            length--;
                        }
                        i13++;
                    } else {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i13), charSequenceConcat.subSequence(i13 + 2, charSequenceConcat.length()));
                        length -= 2;
                    }
                    i13--;
                    i13++;
                }
                this.lastSticker = charSequenceConcat.toString().trim();
                str = string;
            } else {
                str = "";
            }
            if (z3 || !(Emoji.isValidEmoji(str) || Emoji.isValidEmoji(this.lastSticker))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4 && (charSequence instanceof Spanned)) {
                animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
                if (animatedEmojiSpanArr != null || animatedEmojiSpanArr.length == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (this.allowStickers && z4 && (chat3 == null || ChatObject.canSendStickers(chat3))) {
                this.stickersToLoad.clear();
                int i16 = SharedConfig.suggestStickers;
                if (i16 == 2 || !z4) {
                    if (this.visibleByStickersSearch && i16 == 2) {
                        this.visibleByStickersSearch = false;
                        this.delegate.needChangePanelVisibility(false);
                        notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                this.stickers = null;
                this.stickersMap = null;
                if (this.lastReqId != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.lastReqId, true);
                    r8 = 0;
                    this.lastReqId = 0;
                } else {
                    r8 = 0;
                }
                boolean z14 = MessagesController.getInstance(this.currentAccount).suggestStickersApiOnly;
                this.delayLocalResults = r8;
                if (z14) {
                    arrayList2 = arrayList;
                    z13 = z14;
                    sb = sb2;
                    i2 = i;
                } else {
                    sb = sb2;
                    z13 = z14;
                    i2 = i;
                    arrayList2 = arrayList;
                    this.checkAgainRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.searchUsernameOrHashtag(charSequence, i2, arrayList2, z, z2);
                        }
                    };
                    MediaDataController.getInstance(this.currentAccount).loadRecents(r8, r8, true, r8);
                    MediaDataController.getInstance(this.currentAccount).loadRecents(2, r8, true, r8);
                    final ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(r8);
                    final ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(2);
                    int iMin = Math.min(20, recentStickersNoCopy.size());
                    int i17 = 0;
                    for (int i18 = 0; i18 < iMin; i18++) {
                        TLRPC.Document document = recentStickersNoCopy.get(i18);
                        if (isValidSticker(document, this.lastSticker)) {
                            addStickerToResult(document, "recent");
                            i17++;
                            if (i17 >= 5) {
                                break;
                            }
                        }
                    }
                    int size = recentStickersNoCopy2.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        TLRPC.Document document2 = recentStickersNoCopy2.get(i19);
                        if (isValidSticker(document2, this.lastSticker)) {
                            addStickerToResult(document2, "fav");
                        }
                    }
                    MediaDataController.getInstance(this.currentAccount).checkStickers(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.currentAccount).getAllStickers();
                    ArrayList<TLRPC.Document> arrayList7 = allStickers != null ? allStickers.get(this.lastSticker) : null;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        addStickersToResult(arrayList7, null);
                    }
                    ArrayList arrayList8 = this.stickers;
                    if (arrayList8 != null) {
                        Collections.sort(arrayList8, new Comparator() {
                            private int getIndex(StickerResult stickerResult) {
                                for (int i20 = 0; i20 < recentStickersNoCopy2.size(); i20++) {
                                    if (((TLRPC.Document) recentStickersNoCopy2.get(i20)).id == stickerResult.sticker.id) {
                                        return i20 + 2000000;
                                    }
                                }
                                for (int i21 = 0; i21 < Math.min(20, recentStickersNoCopy.size()); i21++) {
                                    if (((TLRPC.Document) recentStickersNoCopy.get(i21)).id == stickerResult.sticker.id) {
                                        return (recentStickersNoCopy.size() - i21) + 1000000;
                                    }
                                }
                                return -1;
                            }

                            @Override
                            public int compare(StickerResult stickerResult, StickerResult stickerResult2) {
                                boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(stickerResult.sticker, true);
                                if (zIsAnimatedStickerDocument != MessageObject.isAnimatedStickerDocument(stickerResult2.sticker, true)) {
                                    return zIsAnimatedStickerDocument ? -1 : 1;
                                }
                                int index = getIndex(stickerResult);
                                int index2 = getIndex(stickerResult2);
                                if (index > index2) {
                                    return -1;
                                }
                                return index < index2 ? 1 : 0;
                            }
                        });
                    }
                }
                if (SharedConfig.suggestStickers == 0 || z13) {
                    searchServerStickers(this.lastSticker, str);
                }
                ArrayList arrayList9 = this.stickers;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    if (SharedConfig.suggestStickers == 0 && this.stickers.size() < 5) {
                        this.delayLocalResults = true;
                        this.delegate.needChangePanelVisibility(false);
                        this.visibleByStickersSearch = false;
                    } else {
                        checkStickerFilesExistAndDownload();
                        this.delegate.needChangePanelVisibility(this.stickersToLoad.isEmpty());
                        this.visibleByStickersSearch = true;
                    }
                    notifyDataSetChanged();
                } else {
                    if (this.visibleByStickersSearch) {
                        this.delegate.needChangePanelVisibility(false);
                        this.visibleByStickersSearch = false;
                    }
                    b = 4;
                    str2 = null;
                }
                b = 4;
                str2 = null;
            } else {
                arrayList2 = arrayList;
                sb = sb2;
                i2 = i;
                if (z && this.needBotContext && string.charAt(0) == '@') {
                    int iIndexOf = string.indexOf(32);
                    int length2 = string.length();
                    if (iIndexOf > 0) {
                        String strSubstring4 = string.substring(1, iIndexOf);
                        strSubstring2 = string.substring(iIndexOf + 1);
                        strSubstring = strSubstring4;
                        i3 = 1;
                    } else if (string.charAt(length2 - 1) == 't' && string.charAt(length2 - 2) == 'o' && string.charAt(length2 - 3) == 'b') {
                        i3 = 1;
                        strSubstring = string.substring(1);
                        strSubstring2 = "";
                    } else {
                        i3 = 1;
                        searchForContextBot(null, null);
                        strSubstring = null;
                        strSubstring2 = null;
                    }
                    if (strSubstring != null && strSubstring.length() >= i3) {
                        int i20 = 1;
                        while (true) {
                            if (i20 >= strSubstring.length()) {
                                str11 = strSubstring;
                                break;
                            }
                            char cCharAt4 = strSubstring.charAt(i20);
                            if ((cCharAt4 < '0' || cCharAt4 > '9') && ((cCharAt4 < 'a' || cCharAt4 > 'z') && ((cCharAt4 < 'A' || cCharAt4 > 'Z') && cCharAt4 != '_'))) {
                                break;
                            } else {
                                i20++;
                            }
                        }
                    }
                    searchForContextBot(str11, strSubstring2);
                    str2 = null;
                } else if (!this.allowStickers && (chatActivity = this.parentFragment) != null && chatActivity.getCurrentEncryptedChat() == null && ((chat3 == null || ChatObject.canSendStickers(chat3)) && string.trim().length() >= 2 && string.trim().indexOf(32) < 0)) {
                    str2 = null;
                    searchForContextBot(null, null);
                } else {
                    str2 = null;
                    searchForContextBot(null, null);
                }
                b = -1;
            }
            if (this.foundContextBot != null) {
                return;
            }
            messagesController = MessagesController.getInstance(this.currentAccount);
            str3 = this.hintHashtag;
            this.hintHashtag = str2;
            this.hintHashtagDivider = false;
            if (z) {
                sb.append(string.substring(1));
                this.resultStartPosition = 0;
                this.resultLength = sb.length();
                b = 0;
            } else {
                while (true) {
                    if (i15 < 0) {
                        if (i15 >= string.length()) {
                            cCharAt = string.charAt(i15);
                            if (i15 != 0) {
                                i6 = i15 - 1;
                                if (string.charAt(i6) == ' ' && string.charAt(i6) != '\n' && cCharAt != ':') {
                                    i5 = 0;
                                }
                                sb.insert(i5, cCharAt);
                            }
                            if (cCharAt == '@') {
                                z5 = this.searchInDialogs;
                                if (!z5 || this.needUsernames || (this.needBotContext && i15 == 0)) {
                                    if (z5 && this.info == null && i15 != 0) {
                                        this.lastText = string;
                                        this.lastPosition = i2;
                                        this.messages = arrayList2;
                                        this.delegate.needChangePanelVisibility(false);
                                        return;
                                    }
                                    this.resultStartPosition = i15;
                                    this.resultLength = sb.length() + 1;
                                    b = 0;
                                    r6 = 0;
                                    if (str3 != null && this.hintHashtag != null) {
                                        notifyItemRangeInserted(r6, 2);
                                    } else if (str3 == null && this.hintHashtag == null) {
                                        notifyItemRangeRemoved(r6, 2);
                                    } else {
                                        hashtagHint = this.topHint;
                                        if (hashtagHint != 0) {
                                            hashtagHint.set(r6, this.hintHashtag, chat3);
                                        }
                                        hashtagHint2 = this.bottomHint;
                                        if (hashtagHint2 != null) {
                                            hashtagHint2.set(1, this.hintHashtag, chat3);
                                        }
                                    }
                                    if (b == -1) {
                                        this.contextMedia = r6;
                                        this.searchResultBotContext = null;
                                        this.delegate.needChangePanelVisibility(r6);
                                        return;
                                    }
                                    if (b == 0) {
                                        if (b == 1) {
                                            ArrayList arrayList10 = new ArrayList();
                                            String lowerCase2 = sb.toString().toLowerCase();
                                            hashtags = this.searchAdapterHelper.getHashtags();
                                            for (i9 = 0; i9 < hashtags.size(); i9++) {
                                                hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i9);
                                                if (hashtagObject == null && (str5 = hashtagObject.hashtag) != null && str5.startsWith(lowerCase2)) {
                                                    arrayList10.add(hashtagObject.hashtag);
                                                }
                                            }
                                            this.searchResultHashtags = arrayList10;
                                            this.stickers = null;
                                            this.searchResultUsernames = null;
                                            this.searchResultUsernamesMap = null;
                                            this.quickReplies = null;
                                            this.searchResultCommands = null;
                                            this.searchResultCommandsEphemeral = null;
                                            this.searchResultCommandsHelp = null;
                                            this.searchResultCommandsUsers = null;
                                            this.searchResultSuggestions = null;
                                            this.contextMedia = false;
                                            this.searchResultBotContext = null;
                                            notifyDataSetChanged();
                                            MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
                                            if (this.searchResultHashtags.isEmpty() || this.hintHashtag != null) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            mentionsAdapterDelegate.needChangePanelVisibility(z8);
                                            return;
                                        }
                                        if (b == 2) {
                                            if (b == 3) {
                                                if (b == 4) {
                                                    this.searchResultHashtags = null;
                                                    this.searchResultUsernames = null;
                                                    this.searchResultUsernamesMap = null;
                                                    this.searchResultSuggestions = null;
                                                    this.searchResultCommands = null;
                                                    this.searchResultCommandsEphemeral = null;
                                                    this.quickReplies = null;
                                                    this.searchResultCommandsHelp = null;
                                                    this.searchResultCommandsUsers = null;
                                                    return;
                                                }
                                                return;
                                            }
                                            currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                            if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                                                MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                            }
                                            this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                                            String[] strArr = this.lastSearchKeyboardLanguage;
                                            String string2 = sb.toString();
                                            MediaDataController.KeywordResultCallback keywordResultCallback = new MediaDataController.KeywordResultCallback() {
                                                @Override
                                                public final void run(ArrayList arrayList11, String str12) {
                                                    MentionsAdapter.$r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(this.f$0, arrayList11, str12);
                                                }
                                            };
                                            if (SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(this.currentAccount).isPremium()) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            mediaDataController.getEmojiSuggestions(strArr, string2, false, keywordResultCallback, z6);
                                            return;
                                        }
                                        arrayList3 = new ArrayList();
                                        ArrayList arrayList11 = new ArrayList();
                                        ArrayList arrayList12 = new ArrayList();
                                        ArrayList arrayList13 = new ArrayList();
                                        String lowerCase3 = sb.toString().toLowerCase();
                                        for (i7 = 0; i7 < this.botInfo.size(); i7++) {
                                            botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                                            for (i8 = 0; i8 < botInfo.commands.size(); i8++) {
                                                botCommand = botInfo.commands.get(i8);
                                                if (botCommand == null && (str4 = botCommand.command) != null && str4.startsWith(lowerCase3)) {
                                                    arrayList3.add("/" + botCommand.command);
                                                    arrayList11.add(botCommand.description);
                                                    arrayList12.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                                                    arrayList13.add(Boolean.valueOf(botCommand.ephemeral));
                                                }
                                            }
                                        }
                                        if (this.parentFragment == null && !DialogObject.isEncryptedDialog(this.dialog_id) && this.parentFragment.getChatMode() == 0 && this.parentFragment.getCurrentUser() != null && !this.parentFragment.getCurrentUser().bot && !UserObject.isReplyUser(this.parentFragment.getCurrentUser()) && !UserObject.isService(this.parentFragment.getCurrentUser().id)) {
                                            QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
                                            quickRepliesController.load();
                                            this.quickRepliesQuery = lowerCase3;
                                            this.quickReplies = new ArrayList();
                                            for (int i21 = 0; i21 < quickRepliesController.replies.size(); i21++) {
                                                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) quickRepliesController.replies.get(i21);
                                                if (!quickReply.isSpecial()) {
                                                    String lowerCase4 = quickReply.name.toLowerCase();
                                                    if (lowerCase4.startsWith(lowerCase3) || AndroidUtilities.translitSafe(lowerCase4).startsWith(lowerCase3)) {
                                                        this.quickReplies.add(quickReply);
                                                    }
                                                }
                                            }
                                            r7 = 0;
                                        } else {
                                            r7 = 0;
                                            this.quickRepliesQuery = null;
                                            this.quickReplies = null;
                                        }
                                        this.searchResultHashtags = r7;
                                        this.stickers = r7;
                                        this.searchResultUsernames = r7;
                                        this.searchResultUsernamesMap = r7;
                                        this.searchResultSuggestions = r7;
                                        this.searchResultCommands = arrayList3;
                                        this.searchResultCommandsHelp = arrayList11;
                                        this.searchResultCommandsUsers = arrayList12;
                                        this.searchResultCommandsEphemeral = arrayList13;
                                        this.contextMedia = false;
                                        this.searchResultBotContext = r7;
                                        notifyDataSetChanged();
                                        MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
                                        if (arrayList3.isEmpty() || !((arrayList4 = this.quickReplies) == null || arrayList4.isEmpty())) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        mentionsAdapterDelegate2.needChangePanelVisibility(z7);
                                        return;
                                    }
                                    this.contextMedia = r6;
                                    this.searchResultBotContext = null;
                                    final ArrayList arrayList14 = new ArrayList();
                                    j = 0;
                                    if (arrayList2 != null) {
                                        for (i12 = 0; i12 < Math.min(100, arrayList2.size()); i12++) {
                                            fromChatId = ((MessageObject) arrayList2.get(i12)).getFromChatId();
                                            if (fromChatId <= 0 && !arrayList14.contains(Long.valueOf(fromChatId))) {
                                                arrayList14.add(Long.valueOf(fromChatId));
                                            }
                                        }
                                    }
                                    lowerCase = sb.toString().toLowerCase();
                                    if (lowerCase.indexOf(32) >= 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    arrayList5 = new ArrayList();
                                    LongSparseArray longSparseArray2 = new LongSparseArray();
                                    longSparseArray = new LongSparseArray();
                                    arrayList6 = new ArrayList();
                                    arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
                                    if (chat3 != null || (!ChatObject.isMonoForum(chat3) && !ChatObject.isChannelAndNotMegaGroup(chat3))) {
                                        arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                                    }
                                    ArrayList arrayListSortAndDeduplicateTopPeers = sortAndDeduplicateTopPeers(arrayList6);
                                    if (!z || !this.needBotContext || i15 != 0 || arrayListSortAndDeduplicateTopPeers.isEmpty()) {
                                        j2 = j;
                                        break;
                                    }
                                    int i22 = 0;
                                    int i23 = 0;
                                    while (true) {
                                        if (i22 >= arrayListSortAndDeduplicateTopPeers.size()) {
                                            j2 = j;
                                            break;
                                        }
                                        j2 = j;
                                        TLRPC.User user3 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayListSortAndDeduplicateTopPeers.get(i22)).peer.user_id));
                                        if (user3 != null) {
                                            String publicUsername2 = UserObject.getPublicUsername(user3);
                                            if (!TextUtils.isEmpty(publicUsername2) && (lowerCase.length() == 0 || publicUsername2.toLowerCase().startsWith(lowerCase))) {
                                                arrayList5.add(user3);
                                                longSparseArray2.put(user3.id, user3);
                                                longSparseArray.put(user3.id, user3);
                                                i23++;
                                            }
                                            if (i23 == 5) {
                                                break;
                                            }
                                        } else {
                                            arrayListSortAndDeduplicateTopPeers = arrayListSortAndDeduplicateTopPeers;
                                        }
                                        i22++;
                                        j = j2;
                                        arrayListSortAndDeduplicateTopPeers = arrayListSortAndDeduplicateTopPeers;
                                    }
                                    chatActivity2 = this.parentFragment;
                                    if (chatActivity2 != null) {
                                        chat3 = chatActivity2.getCurrentChat();
                                        threadId = this.parentFragment.getThreadId();
                                    } else {
                                        chatFull = this.info;
                                        if (chatFull != null) {
                                            chat3 = messagesController.getChat(Long.valueOf(chatFull.id));
                                        }
                                        threadId = j2;
                                    }
                                    chat = chat3;
                                    currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                                    if (chat != null && (chatFull2 = this.info) != null && chatFull2.participants != null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                                        i11 = -2;
                                        while (i11 < this.info.participants.participants.size()) {
                                            if (i11 == -2) {
                                                if (currentUser != null && z) {
                                                    String str12 = currentUser.first_name;
                                                    String str13 = currentUser.last_name;
                                                    publicUsername = UserObject.getPublicUsername(currentUser);
                                                    str10 = str12;
                                                    str9 = str13;
                                                    obj = currentUser;
                                                    str8 = lowerCase;
                                                    z12 = z9;
                                                    j4 = currentUser.id;
                                                    if (TextUtils.isEmpty(publicUsername)) {
                                                        j5 = threadId;
                                                    } else {
                                                        j5 = threadId;
                                                        if (!publicUsername.toLowerCase().startsWith(str8)) {
                                                            arrayList5.add(obj);
                                                            longSparseArray.put(j4, obj);
                                                        }
                                                    }
                                                    if ((TextUtils.isEmpty(str10) && str10.toLowerCase().startsWith(str8)) || ((!TextUtils.isEmpty(str9) && str9.toLowerCase().startsWith(str8)) || (z12 && ContactsController.formatName(str10, str9).toLowerCase().startsWith(str8)))) {
                                                        arrayList5.add(obj);
                                                        longSparseArray.put(j4, obj);
                                                    }
                                                }
                                                str8 = lowerCase;
                                                z12 = z9;
                                                j5 = threadId;
                                            } else {
                                                if (i11 == -1) {
                                                    if (z2) {
                                                        if (lowerCase.length() == 0) {
                                                            arrayList5.add(chat);
                                                        } else {
                                                            String str14 = chat.title;
                                                            str8 = lowerCase;
                                                            publicUsername = ChatObject.getPublicUsername(chat);
                                                            str9 = null;
                                                            str10 = str14;
                                                            z12 = z9;
                                                            j4 = -chat.id;
                                                            obj = chat;
                                                        }
                                                    }
                                                    str8 = lowerCase;
                                                    z12 = z9;
                                                    j5 = threadId;
                                                } else {
                                                    str8 = lowerCase;
                                                    TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i11);
                                                    z12 = z9;
                                                    if ((currentUser != null || chatParticipant.user_id != currentUser.id) && (user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id))) != null && !UserObject.isUserSelf(user2) && longSparseArray2.indexOfKey(user2.id) < 0) {
                                                        if (str8.length() != 0 && !user2.deleted) {
                                                            arrayList5.add(user2);
                                                        } else {
                                                            String str15 = user2.first_name;
                                                            String str16 = user2.last_name;
                                                            String publicUsername3 = UserObject.getPublicUsername(user2);
                                                            str9 = str16;
                                                            j4 = user2.id;
                                                            publicUsername = publicUsername3;
                                                            str10 = str15;
                                                            obj = user2;
                                                        }
                                                    }
                                                    j5 = threadId;
                                                }
                                                if (TextUtils.isEmpty(publicUsername)) {
                                                    j5 = threadId;
                                                    if (!publicUsername.toLowerCase().startsWith(str8)) {
                                                        arrayList5.add(obj);
                                                        longSparseArray.put(j4, obj);
                                                    }
                                                } else {
                                                    j5 = threadId;
                                                }
                                                if (TextUtils.isEmpty(str10)) {
                                                    arrayList5.add(obj);
                                                    longSparseArray.put(j4, obj);
                                                } else {
                                                    arrayList5.add(obj);
                                                    longSparseArray.put(j4, obj);
                                                }
                                            }
                                            i11++;
                                            lowerCase = str8;
                                            z9 = z12;
                                            threadId = j5;
                                        }
                                    }
                                    str6 = lowerCase;
                                    z10 = z9;
                                    long j6 = threadId;
                                    if (this.searchInDialogs) {
                                        allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                                        i10 = 0;
                                        while (i10 < allDialogs.size()) {
                                            if (allDialogs.get(i10).id > j2) {
                                                user = messagesController.getUser(Long.valueOf(allDialogs.get(i10).id));
                                                if (user != null || UserObject.isUserSelf(user) || longSparseArray2.indexOfKey(user.id) >= 0) {
                                                    z11 = z10;
                                                } else if (str6.length() == 0 && !user.deleted) {
                                                    arrayList5.add(user);
                                                    z11 = z10;
                                                } else {
                                                    String str17 = user.first_name;
                                                    String str18 = user.last_name;
                                                    String publicUsername4 = UserObject.getPublicUsername(user);
                                                    long j7 = user.id;
                                                    if (TextUtils.isEmpty(publicUsername4)) {
                                                        z11 = z10;
                                                    } else {
                                                        z11 = z10;
                                                        if (publicUsername4.toLowerCase().startsWith(str6)) {
                                                            arrayList5.add(user);
                                                            longSparseArray.put(j7, user);
                                                        }
                                                    }
                                                    if ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(str6)) || ((!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(str6)) || (z11 && ContactsController.formatName(str17, str18).toLowerCase().startsWith(str6)))) {
                                                        arrayList5.add(user);
                                                        longSparseArray.put(j7, user);
                                                    }
                                                }
                                            } else {
                                                z11 = z10;
                                                if (!TextUtils.isEmpty(str6) && (chat2 = messagesController.getChat(Long.valueOf(-allDialogs.get(i10).id))) != null && chat2.username != null && longSparseArray2.indexOfKey(chat2.id) < 0) {
                                                    if (str6.length() == 0) {
                                                        arrayList5.add(chat2);
                                                    } else {
                                                        String str19 = chat2.title;
                                                        str7 = chat2.username;
                                                        j3 = chat2.id;
                                                        if ((TextUtils.isEmpty(str7) && str7.toLowerCase().startsWith(str6)) || (!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(str6))) {
                                                            arrayList5.add(chat2);
                                                            longSparseArray.put(j3, chat2);
                                                        }
                                                    }
                                                }
                                            }
                                            i10++;
                                            z10 = z11;
                                        }
                                    }
                                    Collections.sort(arrayList5, new Comparator() {
                                        private long getId(TLObject tLObject) {
                                            if (tLObject instanceof TLRPC.User) {
                                                return ((TLRPC.User) tLObject).id;
                                            }
                                            return -((TLRPC.Chat) tLObject).id;
                                        }

                                        @Override
                                        public int compare(TLObject tLObject, TLObject tLObject2) {
                                            long id = getId(tLObject);
                                            long id2 = getId(tLObject2);
                                            if (longSparseArray.indexOfKey(id) >= 0 && longSparseArray.indexOfKey(id2) >= 0) {
                                                return 0;
                                            }
                                            if (longSparseArray.indexOfKey(id) >= 0) {
                                                return -1;
                                            }
                                            if (longSparseArray.indexOfKey(id2) >= 0) {
                                                return 1;
                                            }
                                            int iIndexOf2 = arrayList14.indexOf(Long.valueOf(id));
                                            int iIndexOf3 = arrayList14.indexOf(Long.valueOf(id2));
                                            if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                                                if (iIndexOf2 < iIndexOf3) {
                                                    return -1;
                                                }
                                                return iIndexOf2 == iIndexOf3 ? 0 : 1;
                                            }
                                            if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                                                return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                                            }
                                            return -1;
                                        }
                                    });
                                    this.searchResultHashtags = null;
                                    this.stickers = null;
                                    this.quickReplies = null;
                                    this.searchResultCommands = null;
                                    this.searchResultCommandsEphemeral = null;
                                    this.searchResultCommandsHelp = null;
                                    this.searchResultCommandsUsers = null;
                                    this.searchResultSuggestions = null;
                                    if (((chat == null && chat.megagroup) || this.searchInDialogs) && str6.length() > 0) {
                                        if (arrayList5.size() < 5) {
                                            Runnable runnable4 = new Runnable() {
                                                @Override
                                                public final void run() {
                                                    MentionsAdapter.m1298$r8$lambda$aqOFF8rYLGVmfQrjC23gXAXSy4(this.f$0, arrayList5, longSparseArray);
                                                }
                                            };
                                            this.cancelDelayRunnable = runnable4;
                                            AndroidUtilities.runOnUIThread(runnable4, 1000L);
                                        } else {
                                            showUsersResult(arrayList5, longSparseArray, true);
                                        }
                                        AnonymousClass7 anonymousClass7 = new AnonymousClass7(chat, str6, j6, arrayList5, longSparseArray, messagesController);
                                        this.searchGlobalRunnable = anonymousClass7;
                                        AndroidUtilities.runOnUIThread(anonymousClass7, 200L);
                                        return;
                                    }
                                    showUsersResult(arrayList5, longSparseArray, true);
                                }
                            } else if (cCharAt == '#') {
                                if (ChatObject.isChannelAndNotMegaGroup(chat3) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                                    strSubstring3 = string.substring(i15);
                                    this.hintHashtag = strSubstring3;
                                    if (strSubstring3.length() >= 4 || !this.hintHashtag.matches("^[#$][\\p{L}_-]+$")) {
                                        this.hintHashtag = null;
                                    }
                                }
                                if (this.searchAdapterHelper.loadRecentHashtags()) {
                                    this.resultStartPosition = i15;
                                    this.resultLength = sb.length() + 1;
                                    sb.insert(0, cCharAt);
                                    b = 1;
                                } else {
                                    this.lastText = string;
                                    this.lastPosition = i2;
                                    this.messages = arrayList2;
                                    return;
                                }
                            } else if (i15 != 0 && this.botInfo != null && cCharAt == '/') {
                                this.resultStartPosition = i15;
                                this.resultLength = sb.length() + 1;
                                b = 2;
                            } else if (cCharAt == ':' && sb.length() > 0) {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                                    i4 = 1;
                                    if (sb.length() > 1) {
                                    }
                                } else {
                                    i4 = 1;
                                }
                                this.resultStartPosition = i15;
                                this.resultLength = sb.length() + i4;
                                b = 3;
                            }
                            i5 = 0;
                            sb.insert(i5, cCharAt);
                        }
                        i15--;
                    }
                }
            }
            r6 = 0;
            i15 = -1;
            if (str3 != null) {
                if (str3 == null) {
                    hashtagHint = this.topHint;
                    if (hashtagHint != 0) {
                        hashtagHint.set(r6, this.hintHashtag, chat3);
                    }
                    hashtagHint2 = this.bottomHint;
                    if (hashtagHint2 != null) {
                        hashtagHint2.set(1, this.hintHashtag, chat3);
                    }
                } else {
                    hashtagHint = this.topHint;
                    if (hashtagHint != 0) {
                        hashtagHint.set(r6, this.hintHashtag, chat3);
                    }
                    hashtagHint2 = this.bottomHint;
                    if (hashtagHint2 != null) {
                        hashtagHint2.set(1, this.hintHashtag, chat3);
                    }
                }
            } else if (str3 == null) {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r6, this.hintHashtag, chat3);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat3);
                }
            } else {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r6, this.hintHashtag, chat3);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat3);
                }
            }
            if (b == -1) {
                this.contextMedia = r6;
                this.searchResultBotContext = null;
                this.delegate.needChangePanelVisibility(r6);
                return;
            }
            if (b == 0) {
                if (b == 1) {
                    ArrayList arrayList15 = new ArrayList();
                    String lowerCase5 = sb.toString().toLowerCase();
                    hashtags = this.searchAdapterHelper.getHashtags();
                    while (i9 < hashtags.size()) {
                        hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i9);
                        if (hashtagObject == null) {
                        }
                    }
                    this.searchResultHashtags = arrayList15;
                    this.stickers = null;
                    this.searchResultUsernames = null;
                    this.searchResultUsernamesMap = null;
                    this.quickReplies = null;
                    this.searchResultCommands = null;
                    this.searchResultCommandsEphemeral = null;
                    this.searchResultCommandsHelp = null;
                    this.searchResultCommandsUsers = null;
                    this.searchResultSuggestions = null;
                    this.contextMedia = false;
                    this.searchResultBotContext = null;
                    notifyDataSetChanged();
                    MentionsAdapterDelegate mentionsAdapterDelegate3 = this.delegate;
                    if (this.searchResultHashtags.isEmpty()) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    mentionsAdapterDelegate3.needChangePanelVisibility(z8);
                    return;
                }
                if (b == 2) {
                    if (b == 3) {
                        if (b == 4) {
                            this.searchResultHashtags = null;
                            this.searchResultUsernames = null;
                            this.searchResultUsernamesMap = null;
                            this.searchResultSuggestions = null;
                            this.searchResultCommands = null;
                            this.searchResultCommandsEphemeral = null;
                            this.quickReplies = null;
                            this.searchResultCommandsHelp = null;
                            this.searchResultCommandsUsers = null;
                            return;
                        }
                        return;
                    }
                    currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                    MediaDataController mediaDataController2 = MediaDataController.getInstance(this.currentAccount);
                    String[] strArr2 = this.lastSearchKeyboardLanguage;
                    String string3 = sb.toString();
                    MediaDataController.KeywordResultCallback keywordResultCallback2 = new MediaDataController.KeywordResultCallback() {
                        @Override
                        public final void run(ArrayList arrayList16, String str110) {
                            MentionsAdapter.$r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(this.f$0, arrayList16, str110);
                        }
                    };
                    if (SharedConfig.suggestAnimatedEmoji) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    mediaDataController2.getEmojiSuggestions(strArr2, string3, false, keywordResultCallback2, z6);
                    return;
                }
                arrayList3 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                String lowerCase6 = sb.toString().toLowerCase();
                while (i7 < this.botInfo.size()) {
                    botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                    while (i8 < botInfo.commands.size()) {
                        botCommand = botInfo.commands.get(i8);
                        if (botCommand == null) {
                        }
                    }
                }
                if (this.parentFragment == null) {
                    r7 = 0;
                    this.quickRepliesQuery = null;
                    this.quickReplies = null;
                } else {
                    r7 = 0;
                    this.quickRepliesQuery = null;
                    this.quickReplies = null;
                }
                this.searchResultHashtags = r7;
                this.stickers = r7;
                this.searchResultUsernames = r7;
                this.searchResultUsernamesMap = r7;
                this.searchResultSuggestions = r7;
                this.searchResultCommands = arrayList3;
                this.searchResultCommandsHelp = arrayList16;
                this.searchResultCommandsUsers = arrayList17;
                this.searchResultCommandsEphemeral = arrayList18;
                this.contextMedia = false;
                this.searchResultBotContext = r7;
                notifyDataSetChanged();
                MentionsAdapterDelegate mentionsAdapterDelegate4 = this.delegate;
                if (arrayList3.isEmpty()) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                mentionsAdapterDelegate4.needChangePanelVisibility(z7);
                return;
            }
            this.contextMedia = r6;
            this.searchResultBotContext = null;
            final ArrayList arrayList19 = new ArrayList();
            j = 0;
            if (arrayList2 != null) {
                while (i12 < Math.min(100, arrayList2.size())) {
                    fromChatId = ((MessageObject) arrayList2.get(i12)).getFromChatId();
                    if (fromChatId <= 0) {
                    }
                }
            }
            lowerCase = sb.toString().toLowerCase();
            if (lowerCase.indexOf(32) >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            arrayList5 = new ArrayList();
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray = new LongSparseArray();
            arrayList6 = new ArrayList();
            arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
            if (chat3 != null) {
                arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
            } else {
                arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
            }
            ArrayList arrayListSortAndDeduplicateTopPeers2 = sortAndDeduplicateTopPeers(arrayList6);
            if (!z) {
                j2 = j;
                break;
            } else {
                j2 = j;
                break;
            }
            chatActivity2 = this.parentFragment;
            if (chatActivity2 != null) {
                chat3 = chatActivity2.getCurrentChat();
                threadId = this.parentFragment.getThreadId();
            } else {
                chatFull = this.info;
                if (chatFull != null) {
                    chat3 = messagesController.getChat(Long.valueOf(chatFull.id));
                }
                threadId = j2;
            }
            chat = chat3;
            currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (chat != null) {
                i11 = -2;
                while (i11 < this.info.participants.participants.size()) {
                    if (i11 == -2) {
                        if (currentUser != null) {
                            String str110 = currentUser.first_name;
                            String str111 = currentUser.last_name;
                            publicUsername = UserObject.getPublicUsername(currentUser);
                            str10 = str110;
                            str9 = str111;
                            obj = currentUser;
                            str8 = lowerCase;
                            z12 = z9;
                            j4 = currentUser.id;
                            if (TextUtils.isEmpty(publicUsername)) {
                                j5 = threadId;
                                if (!publicUsername.toLowerCase().startsWith(str8)) {
                                    arrayList5.add(obj);
                                    longSparseArray.put(j4, obj);
                                }
                            } else {
                                j5 = threadId;
                            }
                            if (TextUtils.isEmpty(str10)) {
                                arrayList5.add(obj);
                                longSparseArray.put(j4, obj);
                            } else {
                                arrayList5.add(obj);
                                longSparseArray.put(j4, obj);
                            }
                        }
                        str8 = lowerCase;
                        z12 = z9;
                        j5 = threadId;
                    } else {
                        if (i11 == -1) {
                            if (z2) {
                                if (lowerCase.length() == 0) {
                                    arrayList5.add(chat);
                                } else {
                                    String str112 = chat.title;
                                    str8 = lowerCase;
                                    publicUsername = ChatObject.getPublicUsername(chat);
                                    str9 = null;
                                    str10 = str112;
                                    z12 = z9;
                                    j4 = -chat.id;
                                    obj = chat;
                                }
                            }
                            str8 = lowerCase;
                            z12 = z9;
                            j5 = threadId;
                        } else {
                            str8 = lowerCase;
                            TLRPC.ChatParticipant chatParticipant2 = this.info.participants.participants.get(i11);
                            z12 = z9;
                            if (currentUser != null) {
                                if (str8.length() != 0) {
                                }
                                String str113 = user2.first_name;
                                String str114 = user2.last_name;
                                String publicUsername5 = UserObject.getPublicUsername(user2);
                                str9 = str114;
                                j4 = user2.id;
                                publicUsername = publicUsername5;
                                str10 = str113;
                                obj = user2;
                            } else {
                                if (str8.length() != 0) {
                                }
                                String str115 = user2.first_name;
                                String str116 = user2.last_name;
                                String publicUsername6 = UserObject.getPublicUsername(user2);
                                str9 = str116;
                                j4 = user2.id;
                                publicUsername = publicUsername6;
                                str10 = str115;
                                obj = user2;
                            }
                            j5 = threadId;
                        }
                        if (TextUtils.isEmpty(publicUsername)) {
                            j5 = threadId;
                            if (!publicUsername.toLowerCase().startsWith(str8)) {
                                arrayList5.add(obj);
                                longSparseArray.put(j4, obj);
                            }
                        } else {
                            j5 = threadId;
                        }
                        if (TextUtils.isEmpty(str10)) {
                            arrayList5.add(obj);
                            longSparseArray.put(j4, obj);
                        } else {
                            arrayList5.add(obj);
                            longSparseArray.put(j4, obj);
                        }
                    }
                    i11++;
                    lowerCase = str8;
                    z9 = z12;
                    threadId = j5;
                }
            }
            str6 = lowerCase;
            z10 = z9;
            long j8 = threadId;
            if (this.searchInDialogs) {
                allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                i10 = 0;
                while (i10 < allDialogs.size()) {
                    if (allDialogs.get(i10).id > j2) {
                        user = messagesController.getUser(Long.valueOf(allDialogs.get(i10).id));
                        if (user != null) {
                            z11 = z10;
                        } else {
                            z11 = z10;
                        }
                    } else {
                        z11 = z10;
                        if (!TextUtils.isEmpty(str6)) {
                            if (str6.length() == 0) {
                                arrayList5.add(chat2);
                            } else {
                                String str117 = chat2.title;
                                str7 = chat2.username;
                                j3 = chat2.id;
                                if (TextUtils.isEmpty(str7)) {
                                    arrayList5.add(chat2);
                                    longSparseArray.put(j3, chat2);
                                } else {
                                    arrayList5.add(chat2);
                                    longSparseArray.put(j3, chat2);
                                }
                            }
                        }
                    }
                    i10++;
                    z10 = z11;
                }
            }
            Collections.sort(arrayList5, new Comparator() {
                private long getId(TLObject tLObject) {
                    if (tLObject instanceof TLRPC.User) {
                        return ((TLRPC.User) tLObject).id;
                    }
                    return -((TLRPC.Chat) tLObject).id;
                }

                @Override
                public int compare(TLObject tLObject, TLObject tLObject2) {
                    long id = getId(tLObject);
                    long id2 = getId(tLObject2);
                    if (longSparseArray.indexOfKey(id) >= 0 && longSparseArray.indexOfKey(id2) >= 0) {
                        return 0;
                    }
                    if (longSparseArray.indexOfKey(id) >= 0) {
                        return -1;
                    }
                    if (longSparseArray.indexOfKey(id2) >= 0) {
                        return 1;
                    }
                    int iIndexOf2 = arrayList19.indexOf(Long.valueOf(id));
                    int iIndexOf3 = arrayList19.indexOf(Long.valueOf(id2));
                    if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                        if (iIndexOf2 < iIndexOf3) {
                            return -1;
                        }
                        return iIndexOf2 == iIndexOf3 ? 0 : 1;
                    }
                    if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                        return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                    }
                    return -1;
                }
            });
            this.searchResultHashtags = null;
            this.stickers = null;
            this.quickReplies = null;
            this.searchResultCommands = null;
            this.searchResultCommandsEphemeral = null;
            this.searchResultCommandsHelp = null;
            this.searchResultCommandsUsers = null;
            this.searchResultSuggestions = null;
            if (chat == null) {
            }
            showUsersResult(arrayList5, longSparseArray, true);
        }
        if (z3) {
            length = string.length();
            charSequenceConcat = string;
            i13 = 0;
            while (i13 < length) {
                cCharAt2 = charSequenceConcat.charAt(i13);
                i14 = length - 1;
                if (i13 < i14) {
                    cCharAt3 = charSequenceConcat.charAt(i13 + 1);
                } else {
                    cCharAt3 = 0;
                }
                if (i13 < i14) {
                    if (cCharAt2 == 65039) {
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i13), charSequenceConcat.subSequence(i13 + 1, charSequenceConcat.length()));
                        length--;
                        i13--;
                    }
                } else if (cCharAt2 == 65039) {
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i13), charSequenceConcat.subSequence(i13 + 1, charSequenceConcat.length()));
                    length--;
                    i13--;
                }
                i13++;
            }
            this.lastSticker = charSequenceConcat.toString().trim();
            str = string;
        } else {
            str = "";
        }
        if (z3) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z4) {
            animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
            if (animatedEmojiSpanArr != null) {
                z4 = true;
            } else {
                z4 = true;
            }
        }
        if (this.allowStickers) {
            arrayList2 = arrayList;
            sb = sb2;
            i2 = i;
            if (z) {
                if (!this.allowStickers) {
                    str2 = null;
                    searchForContextBot(null, null);
                } else {
                    str2 = null;
                    searchForContextBot(null, null);
                }
            } else if (!this.allowStickers) {
                str2 = null;
                searchForContextBot(null, null);
            } else {
                str2 = null;
                searchForContextBot(null, null);
            }
            b = -1;
        } else {
            arrayList2 = arrayList;
            sb = sb2;
            i2 = i;
            if (z) {
                if (!this.allowStickers) {
                    str2 = null;
                    searchForContextBot(null, null);
                } else {
                    str2 = null;
                    searchForContextBot(null, null);
                }
            } else if (!this.allowStickers) {
                str2 = null;
                searchForContextBot(null, null);
            } else {
                str2 = null;
                searchForContextBot(null, null);
            }
            b = -1;
        }
        if (this.foundContextBot != null) {
            return;
        }
        messagesController = MessagesController.getInstance(this.currentAccount);
        str3 = this.hintHashtag;
        this.hintHashtag = str2;
        this.hintHashtagDivider = false;
        if (z) {
            sb.append(string.substring(1));
            this.resultStartPosition = 0;
            this.resultLength = sb.length();
            b = 0;
        } else {
            while (true) {
                if (i15 < 0) {
                    if (i15 >= string.length()) {
                        cCharAt = string.charAt(i15);
                        if (i15 != 0) {
                            i6 = i15 - 1;
                            if (string.charAt(i6) == ' ') {
                            }
                        }
                        if (cCharAt == '@') {
                            z5 = this.searchInDialogs;
                            if (!z5) {
                            }
                            if (z5) {
                            }
                            this.resultStartPosition = i15;
                            this.resultLength = sb.length() + 1;
                            b = 0;
                            r6 = 0;
                            if (str3 != null) {
                                if (str3 == null) {
                                    hashtagHint = this.topHint;
                                    if (hashtagHint != 0) {
                                        hashtagHint.set(r6, this.hintHashtag, chat3);
                                    }
                                    hashtagHint2 = this.bottomHint;
                                    if (hashtagHint2 != null) {
                                        hashtagHint2.set(1, this.hintHashtag, chat3);
                                    }
                                } else {
                                    hashtagHint = this.topHint;
                                    if (hashtagHint != 0) {
                                        hashtagHint.set(r6, this.hintHashtag, chat3);
                                    }
                                    hashtagHint2 = this.bottomHint;
                                    if (hashtagHint2 != null) {
                                        hashtagHint2.set(1, this.hintHashtag, chat3);
                                    }
                                }
                            } else if (str3 == null) {
                                hashtagHint = this.topHint;
                                if (hashtagHint != 0) {
                                    hashtagHint.set(r6, this.hintHashtag, chat3);
                                }
                                hashtagHint2 = this.bottomHint;
                                if (hashtagHint2 != null) {
                                    hashtagHint2.set(1, this.hintHashtag, chat3);
                                }
                            } else {
                                hashtagHint = this.topHint;
                                if (hashtagHint != 0) {
                                    hashtagHint.set(r6, this.hintHashtag, chat3);
                                }
                                hashtagHint2 = this.bottomHint;
                                if (hashtagHint2 != null) {
                                    hashtagHint2.set(1, this.hintHashtag, chat3);
                                }
                            }
                            if (b == -1) {
                                this.contextMedia = r6;
                                this.searchResultBotContext = null;
                                this.delegate.needChangePanelVisibility(r6);
                                return;
                            }
                            if (b == 0) {
                                if (b == 1) {
                                    ArrayList arrayList110 = new ArrayList();
                                    String lowerCase7 = sb.toString().toLowerCase();
                                    hashtags = this.searchAdapterHelper.getHashtags();
                                    while (i9 < hashtags.size()) {
                                        hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i9);
                                        if (hashtagObject == null) {
                                        }
                                    }
                                    this.searchResultHashtags = arrayList110;
                                    this.stickers = null;
                                    this.searchResultUsernames = null;
                                    this.searchResultUsernamesMap = null;
                                    this.quickReplies = null;
                                    this.searchResultCommands = null;
                                    this.searchResultCommandsEphemeral = null;
                                    this.searchResultCommandsHelp = null;
                                    this.searchResultCommandsUsers = null;
                                    this.searchResultSuggestions = null;
                                    this.contextMedia = false;
                                    this.searchResultBotContext = null;
                                    notifyDataSetChanged();
                                    MentionsAdapterDelegate mentionsAdapterDelegate5 = this.delegate;
                                    if (this.searchResultHashtags.isEmpty()) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    mentionsAdapterDelegate5.needChangePanelVisibility(z8);
                                    return;
                                }
                                if (b == 2) {
                                    if (b == 3) {
                                        if (b == 4) {
                                            this.searchResultHashtags = null;
                                            this.searchResultUsernames = null;
                                            this.searchResultUsernamesMap = null;
                                            this.searchResultSuggestions = null;
                                            this.searchResultCommands = null;
                                            this.searchResultCommandsEphemeral = null;
                                            this.quickReplies = null;
                                            this.searchResultCommandsHelp = null;
                                            this.searchResultCommandsUsers = null;
                                            return;
                                        }
                                        return;
                                    }
                                    currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                                    if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                                        MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                                    }
                                    this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                                    MediaDataController mediaDataController3 = MediaDataController.getInstance(this.currentAccount);
                                    String[] strArr3 = this.lastSearchKeyboardLanguage;
                                    String string4 = sb.toString();
                                    MediaDataController.KeywordResultCallback keywordResultCallback3 = new MediaDataController.KeywordResultCallback() {
                                        @Override
                                        public final void run(ArrayList arrayList111, String str118) {
                                            MentionsAdapter.$r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(this.f$0, arrayList111, str118);
                                        }
                                    };
                                    if (SharedConfig.suggestAnimatedEmoji) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    mediaDataController3.getEmojiSuggestions(strArr3, string4, false, keywordResultCallback3, z6);
                                    return;
                                }
                                arrayList3 = new ArrayList();
                                ArrayList arrayList111 = new ArrayList();
                                ArrayList arrayList112 = new ArrayList();
                                ArrayList arrayList113 = new ArrayList();
                                String lowerCase8 = sb.toString().toLowerCase();
                                while (i7 < this.botInfo.size()) {
                                    botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                                    while (i8 < botInfo.commands.size()) {
                                        botCommand = botInfo.commands.get(i8);
                                        if (botCommand == null) {
                                        }
                                    }
                                }
                                if (this.parentFragment == null) {
                                    r7 = 0;
                                    this.quickRepliesQuery = null;
                                    this.quickReplies = null;
                                } else {
                                    r7 = 0;
                                    this.quickRepliesQuery = null;
                                    this.quickReplies = null;
                                }
                                this.searchResultHashtags = r7;
                                this.stickers = r7;
                                this.searchResultUsernames = r7;
                                this.searchResultUsernamesMap = r7;
                                this.searchResultSuggestions = r7;
                                this.searchResultCommands = arrayList3;
                                this.searchResultCommandsHelp = arrayList111;
                                this.searchResultCommandsUsers = arrayList112;
                                this.searchResultCommandsEphemeral = arrayList113;
                                this.contextMedia = false;
                                this.searchResultBotContext = r7;
                                notifyDataSetChanged();
                                MentionsAdapterDelegate mentionsAdapterDelegate6 = this.delegate;
                                if (arrayList3.isEmpty()) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                mentionsAdapterDelegate6.needChangePanelVisibility(z7);
                                return;
                            }
                            this.contextMedia = r6;
                            this.searchResultBotContext = null;
                            final ArrayList arrayList114 = new ArrayList();
                            j = 0;
                            if (arrayList2 != null) {
                                while (i12 < Math.min(100, arrayList2.size())) {
                                    fromChatId = ((MessageObject) arrayList2.get(i12)).getFromChatId();
                                    if (fromChatId <= 0) {
                                    }
                                }
                            }
                            lowerCase = sb.toString().toLowerCase();
                            if (lowerCase.indexOf(32) >= 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            arrayList5 = new ArrayList();
                            LongSparseArray longSparseArray4 = new LongSparseArray();
                            longSparseArray = new LongSparseArray();
                            arrayList6 = new ArrayList();
                            arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
                            if (chat3 != null) {
                                arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                            } else {
                                arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                            }
                            ArrayList arrayListSortAndDeduplicateTopPeers3 = sortAndDeduplicateTopPeers(arrayList6);
                            if (!z) {
                                j2 = j;
                                break;
                            } else {
                                j2 = j;
                                break;
                            }
                            chatActivity2 = this.parentFragment;
                            if (chatActivity2 != null) {
                                chat3 = chatActivity2.getCurrentChat();
                                threadId = this.parentFragment.getThreadId();
                            } else {
                                chatFull = this.info;
                                if (chatFull != null) {
                                    chat3 = messagesController.getChat(Long.valueOf(chatFull.id));
                                }
                                threadId = j2;
                            }
                            chat = chat3;
                            currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                            if (chat != null) {
                                i11 = -2;
                                while (i11 < this.info.participants.participants.size()) {
                                    if (i11 == -2) {
                                        if (currentUser != null) {
                                            String str118 = currentUser.first_name;
                                            String str119 = currentUser.last_name;
                                            publicUsername = UserObject.getPublicUsername(currentUser);
                                            str10 = str118;
                                            str9 = str119;
                                            obj = currentUser;
                                            str8 = lowerCase;
                                            z12 = z9;
                                            j4 = currentUser.id;
                                            if (TextUtils.isEmpty(publicUsername)) {
                                                j5 = threadId;
                                                if (!publicUsername.toLowerCase().startsWith(str8)) {
                                                    arrayList5.add(obj);
                                                    longSparseArray.put(j4, obj);
                                                }
                                            } else {
                                                j5 = threadId;
                                            }
                                            if (TextUtils.isEmpty(str10)) {
                                                arrayList5.add(obj);
                                                longSparseArray.put(j4, obj);
                                            } else {
                                                arrayList5.add(obj);
                                                longSparseArray.put(j4, obj);
                                            }
                                        }
                                        str8 = lowerCase;
                                        z12 = z9;
                                        j5 = threadId;
                                    } else {
                                        if (i11 == -1) {
                                            if (z2) {
                                                if (lowerCase.length() == 0) {
                                                    arrayList5.add(chat);
                                                } else {
                                                    String str1110 = chat.title;
                                                    str8 = lowerCase;
                                                    publicUsername = ChatObject.getPublicUsername(chat);
                                                    str9 = null;
                                                    str10 = str1110;
                                                    z12 = z9;
                                                    j4 = -chat.id;
                                                    obj = chat;
                                                }
                                            }
                                            str8 = lowerCase;
                                            z12 = z9;
                                            j5 = threadId;
                                        } else {
                                            str8 = lowerCase;
                                            TLRPC.ChatParticipant chatParticipant3 = this.info.participants.participants.get(i11);
                                            z12 = z9;
                                            if (currentUser != null) {
                                                if (str8.length() != 0) {
                                                }
                                                String str1111 = user2.first_name;
                                                String str1112 = user2.last_name;
                                                String publicUsername7 = UserObject.getPublicUsername(user2);
                                                str9 = str1112;
                                                j4 = user2.id;
                                                publicUsername = publicUsername7;
                                                str10 = str1111;
                                                obj = user2;
                                            } else {
                                                if (str8.length() != 0) {
                                                }
                                                String str1113 = user2.first_name;
                                                String str1114 = user2.last_name;
                                                String publicUsername8 = UserObject.getPublicUsername(user2);
                                                str9 = str1114;
                                                j4 = user2.id;
                                                publicUsername = publicUsername8;
                                                str10 = str1113;
                                                obj = user2;
                                            }
                                            j5 = threadId;
                                        }
                                        if (TextUtils.isEmpty(publicUsername)) {
                                            j5 = threadId;
                                            if (!publicUsername.toLowerCase().startsWith(str8)) {
                                                arrayList5.add(obj);
                                                longSparseArray.put(j4, obj);
                                            }
                                        } else {
                                            j5 = threadId;
                                        }
                                        if (TextUtils.isEmpty(str10)) {
                                            arrayList5.add(obj);
                                            longSparseArray.put(j4, obj);
                                        } else {
                                            arrayList5.add(obj);
                                            longSparseArray.put(j4, obj);
                                        }
                                    }
                                    i11++;
                                    lowerCase = str8;
                                    z9 = z12;
                                    threadId = j5;
                                }
                            }
                            str6 = lowerCase;
                            z10 = z9;
                            long j9 = threadId;
                            if (this.searchInDialogs) {
                                allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                                i10 = 0;
                                while (i10 < allDialogs.size()) {
                                    if (allDialogs.get(i10).id > j2) {
                                        user = messagesController.getUser(Long.valueOf(allDialogs.get(i10).id));
                                        if (user != null) {
                                            z11 = z10;
                                        } else {
                                            z11 = z10;
                                        }
                                    } else {
                                        z11 = z10;
                                        if (!TextUtils.isEmpty(str6)) {
                                            if (str6.length() == 0) {
                                                arrayList5.add(chat2);
                                            } else {
                                                String str1115 = chat2.title;
                                                str7 = chat2.username;
                                                j3 = chat2.id;
                                                if (TextUtils.isEmpty(str7)) {
                                                    arrayList5.add(chat2);
                                                    longSparseArray.put(j3, chat2);
                                                } else {
                                                    arrayList5.add(chat2);
                                                    longSparseArray.put(j3, chat2);
                                                }
                                            }
                                        }
                                    }
                                    i10++;
                                    z10 = z11;
                                }
                            }
                            Collections.sort(arrayList5, new Comparator() {
                                private long getId(TLObject tLObject) {
                                    if (tLObject instanceof TLRPC.User) {
                                        return ((TLRPC.User) tLObject).id;
                                    }
                                    return -((TLRPC.Chat) tLObject).id;
                                }

                                @Override
                                public int compare(TLObject tLObject, TLObject tLObject2) {
                                    long id = getId(tLObject);
                                    long id2 = getId(tLObject2);
                                    if (longSparseArray.indexOfKey(id) >= 0 && longSparseArray.indexOfKey(id2) >= 0) {
                                        return 0;
                                    }
                                    if (longSparseArray.indexOfKey(id) >= 0) {
                                        return -1;
                                    }
                                    if (longSparseArray.indexOfKey(id2) >= 0) {
                                        return 1;
                                    }
                                    int iIndexOf2 = arrayList114.indexOf(Long.valueOf(id));
                                    int iIndexOf3 = arrayList114.indexOf(Long.valueOf(id2));
                                    if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                                        if (iIndexOf2 < iIndexOf3) {
                                            return -1;
                                        }
                                        return iIndexOf2 == iIndexOf3 ? 0 : 1;
                                    }
                                    if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                                        return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                                    }
                                    return -1;
                                }
                            });
                            this.searchResultHashtags = null;
                            this.stickers = null;
                            this.quickReplies = null;
                            this.searchResultCommands = null;
                            this.searchResultCommandsEphemeral = null;
                            this.searchResultCommandsHelp = null;
                            this.searchResultCommandsUsers = null;
                            this.searchResultSuggestions = null;
                            if (chat == null) {
                            }
                            showUsersResult(arrayList5, longSparseArray, true);
                        }
                        if (cCharAt == '#') {
                            if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
                                strSubstring3 = string.substring(i15);
                                this.hintHashtag = strSubstring3;
                                if (strSubstring3.length() >= 4) {
                                    this.hintHashtag = null;
                                } else {
                                    this.hintHashtag = null;
                                }
                            }
                            if (this.searchAdapterHelper.loadRecentHashtags()) {
                                this.resultStartPosition = i15;
                                this.resultLength = sb.length() + 1;
                                sb.insert(0, cCharAt);
                                b = 1;
                            } else {
                                this.lastText = string;
                                this.lastPosition = i2;
                                this.messages = arrayList2;
                                return;
                            }
                        } else if (i15 != 0) {
                            if (cCharAt == ':') {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                                    i4 = 1;
                                    if (sb.length() > 1) {
                                    }
                                } else {
                                    i4 = 1;
                                }
                                this.resultStartPosition = i15;
                                this.resultLength = sb.length() + i4;
                                b = 3;
                            }
                        } else if (cCharAt == ':') {
                            if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                                i4 = 1;
                                if (sb.length() > 1) {
                                }
                            } else {
                                i4 = 1;
                            }
                            this.resultStartPosition = i15;
                            this.resultLength = sb.length() + i4;
                            b = 3;
                        }
                        i5 = 0;
                        sb.insert(i5, cCharAt);
                    }
                    i15--;
                }
            }
        }
        r6 = 0;
        i15 = -1;
        if (str3 != null) {
            if (str3 == null) {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r6, this.hintHashtag, chat3);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat3);
                }
            } else {
                hashtagHint = this.topHint;
                if (hashtagHint != 0) {
                    hashtagHint.set(r6, this.hintHashtag, chat3);
                }
                hashtagHint2 = this.bottomHint;
                if (hashtagHint2 != null) {
                    hashtagHint2.set(1, this.hintHashtag, chat3);
                }
            }
        } else if (str3 == null) {
            hashtagHint = this.topHint;
            if (hashtagHint != 0) {
                hashtagHint.set(r6, this.hintHashtag, chat3);
            }
            hashtagHint2 = this.bottomHint;
            if (hashtagHint2 != null) {
                hashtagHint2.set(1, this.hintHashtag, chat3);
            }
        } else {
            hashtagHint = this.topHint;
            if (hashtagHint != 0) {
                hashtagHint.set(r6, this.hintHashtag, chat3);
            }
            hashtagHint2 = this.bottomHint;
            if (hashtagHint2 != null) {
                hashtagHint2.set(1, this.hintHashtag, chat3);
            }
        }
        if (b == -1) {
            this.contextMedia = r6;
            this.searchResultBotContext = null;
            this.delegate.needChangePanelVisibility(r6);
            return;
        }
        if (b == 0) {
            if (b == 1) {
                ArrayList arrayList115 = new ArrayList();
                String lowerCase9 = sb.toString().toLowerCase();
                hashtags = this.searchAdapterHelper.getHashtags();
                while (i9 < hashtags.size()) {
                    hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i9);
                    if (hashtagObject == null) {
                    }
                }
                this.searchResultHashtags = arrayList115;
                this.stickers = null;
                this.searchResultUsernames = null;
                this.searchResultUsernamesMap = null;
                this.quickReplies = null;
                this.searchResultCommands = null;
                this.searchResultCommandsEphemeral = null;
                this.searchResultCommandsHelp = null;
                this.searchResultCommandsUsers = null;
                this.searchResultSuggestions = null;
                this.contextMedia = false;
                this.searchResultBotContext = null;
                notifyDataSetChanged();
                MentionsAdapterDelegate mentionsAdapterDelegate7 = this.delegate;
                if (this.searchResultHashtags.isEmpty()) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                mentionsAdapterDelegate7.needChangePanelVisibility(z8);
                return;
            }
            if (b == 2) {
                if (b == 3) {
                    if (b == 4) {
                        this.searchResultHashtags = null;
                        this.searchResultUsernames = null;
                        this.searchResultUsernamesMap = null;
                        this.searchResultSuggestions = null;
                        this.searchResultCommands = null;
                        this.searchResultCommandsEphemeral = null;
                        this.quickReplies = null;
                        this.searchResultCommandsHelp = null;
                        this.searchResultCommandsUsers = null;
                        return;
                    }
                    return;
                }
                currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                if (!Arrays.equals(currentKeyboardLanguage, this.lastSearchKeyboardLanguage)) {
                    MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                MediaDataController mediaDataController4 = MediaDataController.getInstance(this.currentAccount);
                String[] strArr4 = this.lastSearchKeyboardLanguage;
                String string5 = sb.toString();
                MediaDataController.KeywordResultCallback keywordResultCallback4 = new MediaDataController.KeywordResultCallback() {
                    @Override
                    public final void run(ArrayList arrayList116, String str1116) {
                        MentionsAdapter.$r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(this.f$0, arrayList116, str1116);
                    }
                };
                if (SharedConfig.suggestAnimatedEmoji) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                mediaDataController4.getEmojiSuggestions(strArr4, string5, false, keywordResultCallback4, z6);
                return;
            }
            arrayList3 = new ArrayList();
            ArrayList arrayList116 = new ArrayList();
            ArrayList arrayList117 = new ArrayList();
            ArrayList arrayList118 = new ArrayList();
            String lowerCase10 = sb.toString().toLowerCase();
            while (i7 < this.botInfo.size()) {
                botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i7);
                while (i8 < botInfo.commands.size()) {
                    botCommand = botInfo.commands.get(i8);
                    if (botCommand == null) {
                    }
                }
            }
            if (this.parentFragment == null) {
                r7 = 0;
                this.quickRepliesQuery = null;
                this.quickReplies = null;
            } else {
                r7 = 0;
                this.quickRepliesQuery = null;
                this.quickReplies = null;
            }
            this.searchResultHashtags = r7;
            this.stickers = r7;
            this.searchResultUsernames = r7;
            this.searchResultUsernamesMap = r7;
            this.searchResultSuggestions = r7;
            this.searchResultCommands = arrayList3;
            this.searchResultCommandsHelp = arrayList116;
            this.searchResultCommandsUsers = arrayList117;
            this.searchResultCommandsEphemeral = arrayList118;
            this.contextMedia = false;
            this.searchResultBotContext = r7;
            notifyDataSetChanged();
            MentionsAdapterDelegate mentionsAdapterDelegate8 = this.delegate;
            if (arrayList3.isEmpty()) {
                z7 = true;
            } else {
                z7 = true;
            }
            mentionsAdapterDelegate8.needChangePanelVisibility(z7);
            return;
        }
        this.contextMedia = r6;
        this.searchResultBotContext = null;
        final ArrayList arrayList119 = new ArrayList();
        j = 0;
        if (arrayList2 != null) {
            while (i12 < Math.min(100, arrayList2.size())) {
                fromChatId = ((MessageObject) arrayList2.get(i12)).getFromChatId();
                if (fromChatId <= 0) {
                }
            }
        }
        lowerCase = sb.toString().toLowerCase();
        if (lowerCase.indexOf(32) >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        arrayList5 = new ArrayList();
        LongSparseArray longSparseArray5 = new LongSparseArray();
        longSparseArray = new LongSparseArray();
        arrayList6 = new ArrayList();
        arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
        if (chat3 != null) {
            arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
        } else {
            arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
        }
        ArrayList arrayListSortAndDeduplicateTopPeers4 = sortAndDeduplicateTopPeers(arrayList6);
        if (!z) {
            j2 = j;
            break;
        } else {
            j2 = j;
            break;
        }
        chatActivity2 = this.parentFragment;
        if (chatActivity2 != null) {
            chat3 = chatActivity2.getCurrentChat();
            threadId = this.parentFragment.getThreadId();
        } else {
            chatFull = this.info;
            if (chatFull != null) {
                chat3 = messagesController.getChat(Long.valueOf(chatFull.id));
            }
            threadId = j2;
        }
        chat = chat3;
        currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (chat != null) {
            i11 = -2;
            while (i11 < this.info.participants.participants.size()) {
                if (i11 == -2) {
                    if (currentUser != null) {
                        String str1116 = currentUser.first_name;
                        String str1117 = currentUser.last_name;
                        publicUsername = UserObject.getPublicUsername(currentUser);
                        str10 = str1116;
                        str9 = str1117;
                        obj = currentUser;
                        str8 = lowerCase;
                        z12 = z9;
                        j4 = currentUser.id;
                        if (TextUtils.isEmpty(publicUsername)) {
                            j5 = threadId;
                            if (!publicUsername.toLowerCase().startsWith(str8)) {
                                arrayList5.add(obj);
                                longSparseArray.put(j4, obj);
                            }
                        } else {
                            j5 = threadId;
                        }
                        if (TextUtils.isEmpty(str10)) {
                            arrayList5.add(obj);
                            longSparseArray.put(j4, obj);
                        } else {
                            arrayList5.add(obj);
                            longSparseArray.put(j4, obj);
                        }
                    }
                    str8 = lowerCase;
                    z12 = z9;
                    j5 = threadId;
                } else {
                    if (i11 == -1) {
                        if (z2) {
                            if (lowerCase.length() == 0) {
                                arrayList5.add(chat);
                            } else {
                                String str1118 = chat.title;
                                str8 = lowerCase;
                                publicUsername = ChatObject.getPublicUsername(chat);
                                str9 = null;
                                str10 = str1118;
                                z12 = z9;
                                j4 = -chat.id;
                                obj = chat;
                            }
                        }
                        str8 = lowerCase;
                        z12 = z9;
                        j5 = threadId;
                    } else {
                        str8 = lowerCase;
                        TLRPC.ChatParticipant chatParticipant4 = this.info.participants.participants.get(i11);
                        z12 = z9;
                        if (currentUser != null) {
                            if (str8.length() != 0) {
                            }
                            String str1119 = user2.first_name;
                            String str11110 = user2.last_name;
                            String publicUsername9 = UserObject.getPublicUsername(user2);
                            str9 = str11110;
                            j4 = user2.id;
                            publicUsername = publicUsername9;
                            str10 = str1119;
                            obj = user2;
                        } else {
                            if (str8.length() != 0) {
                            }
                            String str11111 = user2.first_name;
                            String str11112 = user2.last_name;
                            String publicUsername10 = UserObject.getPublicUsername(user2);
                            str9 = str11112;
                            j4 = user2.id;
                            publicUsername = publicUsername10;
                            str10 = str11111;
                            obj = user2;
                        }
                        j5 = threadId;
                    }
                    if (TextUtils.isEmpty(publicUsername)) {
                        j5 = threadId;
                        if (!publicUsername.toLowerCase().startsWith(str8)) {
                            arrayList5.add(obj);
                            longSparseArray.put(j4, obj);
                        }
                    } else {
                        j5 = threadId;
                    }
                    if (TextUtils.isEmpty(str10)) {
                        arrayList5.add(obj);
                        longSparseArray.put(j4, obj);
                    } else {
                        arrayList5.add(obj);
                        longSparseArray.put(j4, obj);
                    }
                }
                i11++;
                lowerCase = str8;
                z9 = z12;
                threadId = j5;
            }
        }
        str6 = lowerCase;
        z10 = z9;
        long j10 = threadId;
        if (this.searchInDialogs) {
            allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
            i10 = 0;
            while (i10 < allDialogs.size()) {
                if (allDialogs.get(i10).id > j2) {
                    user = messagesController.getUser(Long.valueOf(allDialogs.get(i10).id));
                    if (user != null) {
                        z11 = z10;
                    } else {
                        z11 = z10;
                    }
                } else {
                    z11 = z10;
                    if (!TextUtils.isEmpty(str6)) {
                        if (str6.length() == 0) {
                            arrayList5.add(chat2);
                        } else {
                            String str11113 = chat2.title;
                            str7 = chat2.username;
                            j3 = chat2.id;
                            if (TextUtils.isEmpty(str7)) {
                                arrayList5.add(chat2);
                                longSparseArray.put(j3, chat2);
                            } else {
                                arrayList5.add(chat2);
                                longSparseArray.put(j3, chat2);
                            }
                        }
                    }
                }
                i10++;
                z10 = z11;
            }
        }
        Collections.sort(arrayList5, new Comparator() {
            private long getId(TLObject tLObject) {
                if (tLObject instanceof TLRPC.User) {
                    return ((TLRPC.User) tLObject).id;
                }
                return -((TLRPC.Chat) tLObject).id;
            }

            @Override
            public int compare(TLObject tLObject, TLObject tLObject2) {
                long id = getId(tLObject);
                long id2 = getId(tLObject2);
                if (longSparseArray.indexOfKey(id) >= 0 && longSparseArray.indexOfKey(id2) >= 0) {
                    return 0;
                }
                if (longSparseArray.indexOfKey(id) >= 0) {
                    return -1;
                }
                if (longSparseArray.indexOfKey(id2) >= 0) {
                    return 1;
                }
                int iIndexOf2 = arrayList119.indexOf(Long.valueOf(id));
                int iIndexOf3 = arrayList119.indexOf(Long.valueOf(id2));
                if (iIndexOf2 != -1 && iIndexOf3 != -1) {
                    if (iIndexOf2 < iIndexOf3) {
                        return -1;
                    }
                    return iIndexOf2 == iIndexOf3 ? 0 : 1;
                }
                if (iIndexOf2 == -1 || iIndexOf3 != -1) {
                    return (iIndexOf2 != -1 || iIndexOf3 == -1) ? 0 : 1;
                }
                return -1;
            }
        });
        this.searchResultHashtags = null;
        this.stickers = null;
        this.quickReplies = null;
        this.searchResultCommands = null;
        this.searchResultCommandsEphemeral = null;
        this.searchResultCommandsHelp = null;
        this.searchResultCommandsUsers = null;
        this.searchResultSuggestions = null;
        if (chat == null) {
        }
        showUsersResult(arrayList5, longSparseArray, true);
    }

    public static void m1298$r8$lambda$aqOFF8rYLGVmfQrjC23gXAXSy4(MentionsAdapter mentionsAdapter, ArrayList arrayList, LongSparseArray longSparseArray) {
        mentionsAdapter.cancelDelayRunnable = null;
        mentionsAdapter.showUsersResult(arrayList, longSparseArray, true);
    }

    class AnonymousClass7 implements Runnable {
        final TLRPC.Chat val$chat;
        final MessagesController val$messagesController;
        final LongSparseArray val$newMap;
        final ArrayList val$newResult;
        final long val$threadId;
        final String val$usernameString;

        AnonymousClass7(TLRPC.Chat chat, String str, long j, ArrayList arrayList, LongSparseArray longSparseArray, MessagesController messagesController) {
            this.val$chat = chat;
            this.val$usernameString = str;
            this.val$threadId = j;
            this.val$newResult = arrayList;
            this.val$newMap = longSparseArray;
            this.val$messagesController = messagesController;
        }

        @Override
        public void run() {
            if (MentionsAdapter.this.searchGlobalRunnable != this) {
                return;
            }
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.val$chat);
            tL_channels_getParticipants.limit = 20;
            tL_channels_getParticipants.offset = 0;
            TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
            int i = tL_channelParticipantsMentions.flags;
            tL_channelParticipantsMentions.flags = i | 1;
            tL_channelParticipantsMentions.q = this.val$usernameString;
            long j = this.val$threadId;
            if (j != 0) {
                tL_channelParticipantsMentions.flags = i | 3;
                tL_channelParticipantsMentions.top_msg_id = (int) j;
            }
            tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
            final int iAccess$1704 = MentionsAdapter.access$1704(MentionsAdapter.this);
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(mentionsAdapter.currentAccount);
            final ArrayList arrayList = this.val$newResult;
            final LongSparseArray longSparseArray = this.val$newMap;
            final MessagesController messagesController = this.val$messagesController;
            mentionsAdapter.channelReqId = connectionsManager.sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MentionsAdapter.AnonymousClass7.m1304$r8$lambda$GbNyoj88ETEeDcc6FugJEVVLBI(this.f$0, iAccess$1704, arrayList, longSparseArray, messagesController, tLObject, tL_error);
                }
            });
        }

        public static void m1304$r8$lambda$GbNyoj88ETEeDcc6FugJEVVLBI(final AnonymousClass7 anonymousClass7, final int i, final ArrayList arrayList, final LongSparseArray longSparseArray, final MessagesController messagesController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            anonymousClass7.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MentionsAdapter.AnonymousClass7.m1305$r8$lambda$K8UUnJxcF5nCg3Gd8FW7m5C7y8(this.f$0, i, arrayList, longSparseArray, tL_error, tLObject, messagesController);
                }
            });
        }

        public static void m1305$r8$lambda$K8UUnJxcF5nCg3Gd8FW7m5C7y8(AnonymousClass7 anonymousClass7, int i, ArrayList arrayList, LongSparseArray longSparseArray, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController) {
            if (MentionsAdapter.this.channelReqId != 0 && i == MentionsAdapter.this.channelLastReqId && MentionsAdapter.this.searchResultUsernamesMap != null && MentionsAdapter.this.searchResultUsernames != null) {
                MentionsAdapter.this.showUsersResult(arrayList, longSparseArray, false);
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    MentionsAdapter.this.searchResultUsernames.isEmpty();
                    if (!tL_channels_channelParticipants.participants.isEmpty()) {
                        long clientUserId = UserConfig.getInstance(MentionsAdapter.this.currentAccount).getClientUserId();
                        for (int i2 = 0; i2 < tL_channels_channelParticipants.participants.size(); i2++) {
                            long peerId = MessageObject.getPeerId(tL_channels_channelParticipants.participants.get(i2).peer);
                            if (MentionsAdapter.this.searchResultUsernamesMap.indexOfKey(peerId) < 0 && ((peerId != 0 || MentionsAdapter.this.searchResultUsernamesMap.indexOfKey(clientUserId) < 0) && (MentionsAdapter.this.isSearchingMentions || (peerId != clientUserId && peerId != 0)))) {
                                if (peerId >= 0) {
                                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                                    if (user == null) {
                                        return;
                                    } else {
                                        MentionsAdapter.this.searchResultUsernames.add(user);
                                    }
                                } else {
                                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                    if (chat == null) {
                                        return;
                                    } else {
                                        MentionsAdapter.this.searchResultUsernames.add(chat);
                                    }
                                }
                            }
                        }
                    }
                }
                MentionsAdapter.this.notifyDataSetChanged();
                MentionsAdapter.this.delegate.needChangePanelVisibility(!MentionsAdapter.this.searchResultUsernames.isEmpty());
            }
            MentionsAdapter.this.channelReqId = 0;
        }
    }

    public static void $r8$lambda$FrjSOflCLM6nezBOA1EGIg2EtQc(MentionsAdapter mentionsAdapter, ArrayList arrayList, String str) {
        mentionsAdapter.searchResultSuggestions = arrayList;
        mentionsAdapter.searchResultHashtags = null;
        mentionsAdapter.stickers = null;
        mentionsAdapter.searchResultUsernames = null;
        mentionsAdapter.searchResultUsernamesMap = null;
        mentionsAdapter.searchResultCommands = null;
        mentionsAdapter.searchResultCommandsEphemeral = null;
        mentionsAdapter.quickReplies = null;
        mentionsAdapter.searchResultCommandsHelp = null;
        mentionsAdapter.searchResultCommandsUsers = null;
        mentionsAdapter.notifyDataSetChanged();
        MentionsAdapterDelegate mentionsAdapterDelegate = mentionsAdapter.delegate;
        ArrayList arrayList2 = mentionsAdapter.searchResultSuggestions;
        mentionsAdapterDelegate.needChangePanelVisibility((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }

    public void setIsReversed(boolean z) {
        if (this.isReversed != z) {
            this.isReversed = z;
            int lastItemCount = getLastItemCount();
            if (lastItemCount > 0) {
                notifyItemChanged(0);
            }
            if (lastItemCount > 1) {
                notifyItemChanged(lastItemCount - 1);
            }
        }
    }

    public void showUsersResult(ArrayList arrayList, LongSparseArray longSparseArray, boolean z) {
        this.searchResultUsernames = arrayList;
        if ((!this.allowBots || !this.allowChats) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.allowChats) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || UserObject.isService(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.searchResultUsernamesMap = longSparseArray;
        Runnable runnable = this.cancelDelayRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.cancelDelayRunnable = null;
        }
        this.searchResultBotContext = null;
        this.stickers = null;
        if (z) {
            notifyDataSetChanged();
            this.delegate.needChangePanelVisibility(!this.searchResultUsernames.isEmpty());
        }
    }

    public int getResultStartPosition() {
        return this.resultStartPosition;
    }

    public int getResultLength() {
        return this.resultLength;
    }

    public ArrayList getSearchResultBotContext() {
        return this.searchResultBotContext;
    }

    @Override
    public int getItemCount() {
        int itemCountInternal = getItemCountInternal();
        this.lastItemCount = itemCountInternal;
        return itemCountInternal;
    }

    public int getLastItemCount() {
        return this.lastItemCount;
    }

    public int getItemCountInternal() {
        int i = 1;
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 1;
        }
        int i2 = this.hintHashtag != null ? 2 : 0;
        ArrayList arrayList = this.stickers;
        if (arrayList != null) {
            return i2 + arrayList.size();
        }
        ArrayList arrayList2 = this.searchResultBotContext;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            if (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) {
                i = 0;
            }
            return i2 + size + i;
        }
        ArrayList arrayList3 = this.searchResultUsernames;
        if (arrayList3 != null) {
            return i2 + arrayList3.size();
        }
        ArrayList arrayList4 = this.searchResultHashtags;
        if (arrayList4 != null) {
            return i2 + arrayList4.size();
        }
        if (this.searchResultCommands != null || this.quickReplies != null) {
            ArrayList arrayList5 = this.quickReplies;
            int size2 = arrayList5 == null ? 0 : arrayList5.size();
            ArrayList arrayList6 = this.searchResultCommands;
            return i2 + size2 + (arrayList6 != null ? arrayList6.size() : 0);
        }
        ArrayList arrayList7 = this.searchResultSuggestions;
        return arrayList7 != null ? i2 + arrayList7.size() : i2;
    }

    public void clear(boolean z) {
        if (!z || (this.channelReqId == 0 && this.contextQueryReqid == 0 && this.contextUsernameReqid == 0 && this.lastReqId == 0)) {
            this.foundContextBot = null;
            this.hintHashtag = null;
            ArrayList arrayList = this.stickers;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = this.searchResultBotContext;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            this.searchResultBotContextSwitch = null;
            this.searchResultBotWebViewSwitch = null;
            ArrayList arrayList3 = this.searchResultUsernames;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            ArrayList arrayList4 = this.searchResultHashtags;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            ArrayList arrayList5 = this.searchResultCommands;
            if (arrayList5 != null) {
                arrayList5.clear();
            }
            ArrayList arrayList6 = this.quickReplies;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            ArrayList arrayList7 = this.searchResultSuggestions;
            if (arrayList7 != null) {
                arrayList7.clear();
            }
            notifyDataSetChanged();
        }
    }

    @Override
    public int getItemViewType(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return 6;
            }
            i -= 2;
        }
        if (this.stickers != null) {
            return 4;
        }
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 3;
        }
        if (this.searchResultBotContext == null) {
            ArrayList arrayList = this.quickReplies;
            return (arrayList == null || i < 0 || i >= arrayList.size()) ? 0 : 5;
        }
        if (i == 0) {
            return (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? 1 : 2;
        }
        return 1;
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    public int getItemPosition(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return 0;
            }
            i -= 2;
        }
        if (this.searchResultBotContext != null) {
            return (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? i : i - 1;
        }
        return i;
    }

    public Object getItemParent(int i) {
        if (this.hintHashtag != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.stickers;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return ((StickerResult) this.stickers.get(i)).parent;
    }

    public Object getItem(int i) {
        String str;
        TLRPC.User user = null;
        if (this.hintHashtag != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.stickers;
        if (arrayList != null) {
            if (i < 0 || i >= arrayList.size()) {
                return null;
            }
            return ((StickerResult) this.stickers.get(i)).sticker;
        }
        ArrayList arrayList2 = this.searchResultBotContext;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.searchResultBotWebViewSwitch;
            if (tL_inlineBotWebView == null) {
                TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                if (tL_inlineBotSwitchPM != null) {
                    if (i == 0) {
                        return tL_inlineBotSwitchPM;
                    }
                }
                if (i >= 0 || i >= arrayList2.size()) {
                    return null;
                }
                return this.searchResultBotContext.get(i);
            }
            if (i == 0) {
                return tL_inlineBotWebView;
            }
            i--;
            if (i >= 0) {
            }
            return null;
        }
        ArrayList arrayList3 = this.searchResultUsernames;
        if (arrayList3 != null) {
            if (i < 0 || i >= arrayList3.size()) {
                return null;
            }
            return this.searchResultUsernames.get(i);
        }
        ArrayList arrayList4 = this.searchResultHashtags;
        if (arrayList4 != null) {
            if (i < 0 || i >= arrayList4.size()) {
                return null;
            }
            return this.searchResultHashtags.get(i);
        }
        ArrayList arrayList5 = this.searchResultSuggestions;
        if (arrayList5 != null) {
            if (i < 0 || i >= arrayList5.size()) {
                return null;
            }
            return this.searchResultSuggestions.get(i);
        }
        ArrayList arrayList6 = this.quickReplies;
        if (arrayList6 != null || this.searchResultCommands != null) {
            if (arrayList6 != null) {
                if (i >= 0 && i < arrayList6.size()) {
                    return this.quickReplies.get(i);
                }
                ArrayList arrayList7 = this.quickReplies;
                if (arrayList7 != null) {
                    i -= arrayList7.size();
                }
            }
            ArrayList arrayList8 = this.searchResultCommands;
            if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                ArrayList arrayList9 = this.searchResultCommandsUsers;
                if (arrayList9 != null && (this.botsCount != 1 || (this.info instanceof TLRPC.TL_channelFull))) {
                    if (arrayList9.get(i) != null) {
                        user = (TLRPC.User) this.searchResultCommandsUsers.get(i);
                        str = String.format("%s@%s", this.searchResultCommands.get(i), user != null ? UserObject.getPublicUsername(user) : "");
                    } else {
                        str = String.format("%s", this.searchResultCommands.get(i));
                    }
                } else {
                    str = (String) this.searchResultCommands.get(i);
                }
                ArrayList arrayList10 = this.searchResultCommandsEphemeral;
                if (arrayList10 == null || !((Boolean) arrayList10.get(i)).booleanValue()) {
                    return str;
                }
                return new EphemeralCommand(str, user != null ? user.id : 0L);
            }
        }
        return null;
    }

    public static class EphemeralCommand {
        public final long botUserId;
        public final String command;

        public EphemeralCommand(String str, long j) {
            this.command = str;
            this.botUserId = j;
        }
    }

    public boolean isLongClickEnabled() {
        return (this.searchResultHashtags == null && this.searchResultCommands == null) ? false : true;
    }

    public boolean isBotCommands() {
        return this.searchResultCommands != null;
    }

    public boolean isStickers() {
        return this.stickers != null;
    }

    public boolean isBotContext() {
        return this.searchResultBotContext != null;
    }

    public boolean isBannedInline() {
        return (this.foundContextBot == null || this.inlineMediaEnabled) ? false : true;
    }

    public boolean isMediaLayout() {
        return this.contextMedia || this.stickers != null;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return (this.foundContextBot == null || this.inlineMediaEnabled) && this.stickers == null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View botSwitchCell;
        View view;
        if (i == 0) {
            MentionCell mentionCell = new MentionCell(this.mContext, this.resourcesProvider);
            mentionCell.setIsDarkTheme(this.isDarkTheme);
            botSwitchCell = mentionCell;
        } else if (i == 1) {
            ContextLinkCell contextLinkCell = new ContextLinkCell(this.mContext);
            contextLinkCell.setDelegate(new ContextLinkCell.ContextLinkCellDelegate() {
                @Override
                public final void didPressedImage(ContextLinkCell contextLinkCell2) {
                    this.f$0.delegate.onContextClick(contextLinkCell2.getResult());
                }
            });
            botSwitchCell = contextLinkCell;
        } else if (i != 2) {
            if (i == 3) {
                TextView textView = new TextView(this.mContext);
                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
                view = textView;
            } else if (i == 5) {
                botSwitchCell = new QuickRepliesActivity.QuickReplyView(this.mContext, false, this.resourcesProvider);
            } else if (i == 6) {
                botSwitchCell = new HashtagHint(this.mContext, this.stories, this.resourcesProvider);
            } else if (i == 7) {
                View view2 = new View(this.mContext) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(8.0f), 1073741824));
                    }
                };
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(this.stories ? Theme.multAlpha(-1, 0.15f) : Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider)), Theme.getThemedDrawable(this.mContext, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, this.resourcesProvider)), 0, 0);
                combinedDrawable.setFullsize(true);
                view2.setBackground(combinedDrawable);
                view = view2;
            } else {
                botSwitchCell = new StickerCell(this.mContext, this.resourcesProvider);
            }
            botSwitchCell = view;
        } else {
            botSwitchCell = new BotSwitchCell(this.mContext);
        }
        return new RecyclerListView.Holder(botSwitchCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ChatActivity chatActivity;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.hintHashtag != null) {
            i -= 2;
        }
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 4) {
            StickerCell stickerCell = (StickerCell) viewHolder.itemView;
            if (i < 0 || i >= this.stickers.size()) {
                return;
            }
            StickerResult stickerResult = (StickerResult) this.stickers.get(i);
            stickerCell.setSticker(stickerResult.sticker, stickerResult.parent);
            stickerCell.setClearsInputField(true);
            return;
        }
        if (itemViewType == 3) {
            TextView textView = (TextView) viewHolder.itemView;
            TLRPC.Chat currentChat = this.parentFragment.getCurrentChat();
            if (currentChat != null) {
                if (!ChatObject.hasAdminRights(currentChat) && (tL_chatBannedRights = currentChat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString(R.string.GlobalAttachInlineRestricted));
                    return;
                } else if (AndroidUtilities.isBannedForever(currentChat.banned_rights)) {
                    textView.setText(LocaleController.getString(R.string.AttachInlineRestrictedForever));
                    return;
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(currentChat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (itemViewType == 5) {
            QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
            ArrayList arrayList = this.quickReplies;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            quickReplyView.set((QuickRepliesController.QuickReply) this.quickReplies.get(i), this.quickRepliesQuery, false);
            return;
        }
        if (this.searchResultBotContext != null) {
            boolean z = (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? false : true;
            if (viewHolder.getItemViewType() == 2) {
                if (z) {
                    BotSwitchCell botSwitchCell = (BotSwitchCell) viewHolder.itemView;
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                    botSwitchCell.setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.searchResultBotWebViewSwitch.text);
                    return;
                }
                return;
            }
            if (z) {
                i--;
            }
            if (i < 0 || i >= this.searchResultBotContext.size()) {
                return;
            }
            ((ContextLinkCell) viewHolder.itemView).setLink((TLRPC.BotInlineResult) this.searchResultBotContext.get(i), this.foundContextBot, this.contextMedia, i != this.searchResultBotContext.size() - 1, z && i == 0, "gif".equals(this.searchingContextUsername));
            return;
        }
        if (itemViewType == 6) {
            HashtagHint hashtagHint = (HashtagHint) viewHolder.itemView;
            int i2 = i + 2;
            if (i2 == 0) {
                this.topHint = hashtagHint;
            } else {
                this.bottomHint = hashtagHint;
            }
            TLRPC.Chat currentChat2 = this.chat;
            if (currentChat2 == null && (chatActivity = this.parentFragment) != null) {
                currentChat2 = chatActivity.getCurrentChat();
            }
            hashtagHint.set(i2, this.hintHashtag, currentChat2);
            return;
        }
        if (itemViewType == 7) {
            return;
        }
        MentionCell mentionCell = (MentionCell) viewHolder.itemView;
        ArrayList arrayList2 = this.searchResultUsernames;
        if (arrayList2 != null) {
            TLObject tLObject = (TLObject) arrayList2.get(i);
            if (tLObject instanceof TLRPC.User) {
                mentionCell.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                mentionCell.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList3 = this.searchResultHashtags;
            if (arrayList3 != null && i >= 0 && i < arrayList3.size()) {
                mentionCell.setText((String) this.searchResultHashtags.get(i));
            } else {
                ArrayList arrayList4 = this.searchResultSuggestions;
                if (arrayList4 != null && i >= 0 && i < arrayList4.size()) {
                    mentionCell.setEmojiSuggestion((MediaDataController.KeywordResult) this.searchResultSuggestions.get(i));
                } else {
                    ArrayList arrayList5 = this.searchResultCommands;
                    if (arrayList5 != null && i >= 0 && i < arrayList5.size()) {
                        ArrayList arrayList6 = this.searchResultCommandsHelp;
                        Boolean bool = null;
                        String str = (arrayList6 == null || i < 0 || i >= arrayList6.size()) ? null : (String) this.searchResultCommandsHelp.get(i);
                        ArrayList arrayList7 = this.searchResultCommandsUsers;
                        TLRPC.User user = (arrayList7 == null || i < 0 || i >= arrayList7.size()) ? null : (TLRPC.User) this.searchResultCommandsUsers.get(i);
                        ArrayList arrayList8 = this.searchResultCommandsEphemeral;
                        if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                            bool = (Boolean) this.searchResultCommandsEphemeral.get(i);
                        }
                        mentionCell.setBotCommand((String) this.searchResultCommands.get(i), str, user, bool.booleanValue());
                    }
                }
            }
        }
        mentionCell.setDivider(false);
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        TLRPC.User user;
        if (i == 2 && (user = this.foundContextBot) != null && user.bot_inline_geo) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.locationProvider.start();
            } else {
                onLocationUnavailable();
            }
        }
    }

    public void doSomeStickersAction() {
        MentionsAdapter mentionsAdapter;
        if (isStickers()) {
            if (this.mentionsStickersActionTracker == null) {
                mentionsAdapter = this;
                EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = new EmojiView.ChooseStickerActionTracker(this.currentAccount, this.dialog_id, this.threadMessageId) {
                    @Override
                    public boolean isShown() {
                        return MentionsAdapter.this.isStickers();
                    }
                };
                mentionsAdapter.mentionsStickersActionTracker = chooseStickerActionTracker;
                chooseStickerActionTracker.checkVisibility();
            } else {
                mentionsAdapter = this;
            }
            mentionsAdapter.mentionsStickersActionTracker.doSomeAction();
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void setDialogId(long j) {
        if (this.dialog_id != j) {
            this.dialog_id = j;
        }
    }

    public void setUserOrChat(TLRPC.User user, TLRPC.Chat chat) {
        this.user = user;
        this.chat = chat;
    }

    public void setSearchInDialogs(boolean z) {
        this.searchInDialogs = z;
    }

    public void setAllowStickers(boolean z) {
        this.allowStickers = z;
    }

    public void setAllowBots(boolean z) {
        this.allowBots = z;
    }

    public void setAllowChats(boolean z) {
        this.allowChats = z;
    }

    public String getHashtagHint() {
        return this.hintHashtag;
    }

    public boolean isLocalHashtagHint(int i) {
        return this.hintHashtag != null && i == 1;
    }

    public boolean isGlobalHashtagHint(int i) {
        return this.hintHashtag != null && i == 0;
    }

    public static class HashtagHint extends LinearLayout {
        private final AvatarDrawable avatarDrawable;
        private final BackupImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinearLayout textLayout;
        private final TextView textView;
        private final TextView titleView;
        private final boolean transparent;

        public HashtagHint(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.resourcesProvider = resourcesProvider;
            this.transparent = z;
            setOrientation(0);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            addView(backupImageView, LayoutHelper.createLinear(28, 28, 19, 12, 0, 12, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 0, 4, 12, 4));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 15.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(z ? Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.5f) : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }

        public void set(int i, String str, TLRPC.Chat chat) {
            if (str == null) {
                return;
            }
            if (i == 0) {
                CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
                combinedDrawable.setIconOffset(AndroidUtilities.dp(-0.66f), 0);
                combinedDrawable.setIconSize(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.imageView.setImageDrawable(combinedDrawable);
                this.titleView.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
                this.textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
                return;
            }
            this.avatarDrawable.setInfo(chat);
            this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            this.titleView.setText(PremiumPreviewFragment.applyNewSpan(LocaleController.formatString(R.string.HashtagSuggestion2Title, str + "@" + ChatObject.getPublicUsername(chat)), 8));
            this.textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }
}
