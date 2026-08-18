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
                    mentionsAdapter.lambda$searchUsernameOrHashtag$8(mentionsAdapter.lastText, MentionsAdapter.this.lastPosition, MentionsAdapter.this.messages, MentionsAdapter.this.lastUsernameOnly, MentionsAdapter.this.lastForSearch);
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
                this.f$0.lambda$searchServerStickers$1(str, tLObject, tL_error);
            }
        });
    }

    public void lambda$searchServerStickers$1(final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchServerStickers$0(str, tLObject);
            }
        });
    }

    public void lambda$searchServerStickers$0(String str, TLObject tLObject) {
        ArrayList arrayList;
        this.lastReqId = 0;
        if (str.equals(this.lastSticker) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
            this.delayLocalResults = false;
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            ArrayList arrayList2 = this.stickers;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            addStickersToResult(tL_messages_stickers.stickers, "sticker_search_" + str);
            ArrayList arrayList3 = this.stickers;
            int size2 = arrayList3 != null ? arrayList3.size() : 0;
            if (!this.visibleByStickersSearch && (arrayList = this.stickers) != null && !arrayList.isEmpty()) {
                checkStickerFilesExistAndDownload();
                this.delegate.needChangePanelVisibility(getItemCountInternal() > 0);
                this.visibleByStickersSearch = true;
            }
            if (size != size2) {
                notifyDataSetChanged();
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
            lambda$searchUsernameOrHashtag$8(str, this.lastPosition, this.messages, this.lastUsernameOnly, this.lastForSearch);
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
                            this.f$0.lambda$processFoundUser$2(zArr, user2, alertDialog, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i) {
                            this.f$0.lambda$processFoundUser$3(zArr, alertDialog, i);
                        }
                    });
                    this.parentFragment.showDialog(builder.create(), new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            this.f$0.lambda$processFoundUser$4(zArr, dialogInterface);
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

    public void lambda$processFoundUser$2(boolean[] zArr, TLRPC.User user, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        if (user != null) {
            MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean("inlinegeo_" + user.id, true).commit();
            checkLocationPermissionsOrStart();
        }
    }

    public void lambda$processFoundUser$3(boolean[] zArr, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        onLocationUnavailable();
    }

    public void lambda$processFoundUser$4(boolean[] zArr, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        onLocationUnavailable();
    }

    private void searchForContextBot(String str, String str2) {
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
            if (TextUtils.isEmpty(str) || ((str3 = this.searchingContextUsername) != null && !str3.equals(str))) {
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
                MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
                if (mentionsAdapterDelegate != null) {
                    mentionsAdapterDelegate.onContextSearch(false);
                }
                if (str == null || str.length() == 0) {
                    return;
                }
            }
            if (str2 == null) {
                if (this.contextQueryReqid != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
                    this.contextQueryReqid = 0;
                }
                this.searchingContextQuery = null;
                MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
                if (mentionsAdapterDelegate2 != null) {
                    mentionsAdapterDelegate2.onContextSearch(false);
                    return;
                }
                return;
            }
            MentionsAdapterDelegate mentionsAdapterDelegate3 = this.delegate;
            if (mentionsAdapterDelegate3 != null) {
                if (this.foundContextBot != null) {
                    mentionsAdapterDelegate3.onContextSearch(true);
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
                    this.f$0.lambda$run$1(str, messagesController, messagesStorage, tLObject, tL_error);
                }
            });
        }

        public void lambda$run$1(final String str, final MessagesController messagesController, final MessagesStorage messagesStorage, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$run$0(str, tL_error, tLObject, messagesController, messagesStorage);
                }
            });
        }

        public void lambda$run$0(String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
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
                this.f$0.lambda$searchForContextBotResults$6(str, z, user, str2, messagesStorage, string, tLObject, tL_error);
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

    public void lambda$searchForContextBotResults$6(final String str, final boolean z, final TLRPC.User user, final String str2, final MessagesStorage messagesStorage, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$searchForContextBotResults$5(str, z, tLObject, user, str2, messagesStorage, str3);
            }
        });
    }

    public void lambda$searchForContextBotResults$5(String str, boolean z, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        boolean z2;
        if (str.equals(this.searchingContextQuery)) {
            this.contextQueryReqid = 0;
            if (z && tLObject == null) {
                searchForContextBotResults(false, user, str, str2);
            } else {
                MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
                if (mentionsAdapterDelegate != null) {
                    mentionsAdapterDelegate.onContextSearch(false);
                }
            }
            if (tLObject instanceof TLRPC.TL_messages_botResults) {
                TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                if (!z && tL_messages_botResults.cache_time != 0) {
                    messagesStorage.saveBotCache(str3, tL_messages_botResults);
                }
                this.nextQueryOffset = tL_messages_botResults.next_offset;
                if (this.searchResultBotContextSwitch == null) {
                    this.searchResultBotContextSwitch = tL_messages_botResults.switch_pm;
                }
                this.searchResultBotWebViewSwitch = tL_messages_botResults.switch_webview;
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
                if (this.searchResultBotContext == null || str2.length() == 0) {
                    this.searchResultBotContext = tL_messages_botResults.results;
                    this.contextMedia = tL_messages_botResults.gallery;
                    z2 = false;
                } else {
                    this.searchResultBotContext.addAll(tL_messages_botResults.results);
                    if (tL_messages_botResults.results.isEmpty()) {
                        this.nextQueryOffset = "";
                    }
                    z2 = true;
                }
                Runnable runnable = this.cancelDelayRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.cancelDelayRunnable = null;
                }
                this.searchResultHashtags = null;
                this.stickers = null;
                this.searchResultUsernames = null;
                this.searchResultUsernamesMap = null;
                this.searchResultCommands = null;
                this.searchResultCommandsEphemeral = null;
                this.quickReplies = null;
                this.searchResultSuggestions = null;
                this.searchResultCommandsHelp = null;
                this.searchResultCommandsUsers = null;
                this.visibleByStickersSearch = false;
                this.delegate.needChangePanelVisibility((this.searchResultBotContext.isEmpty() && this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? false : true);
                if (z2) {
                    int i2 = (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? 0 : 1;
                    notifyItemChanged(((this.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2) - 1);
                    notifyItemRangeInserted((this.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2, tL_messages_botResults.results.size());
                    return;
                }
                notifyDataSetChanged();
            }
        }
    }

    public static int lambda$sortAndDeduplicateTopPeers$7(TLRPC.TL_topPeer tL_topPeer, TLRPC.TL_topPeer tL_topPeer2) {
        return Double.compare(tL_topPeer2.rating, tL_topPeer.rating);
    }

    private static ArrayList sortAndDeduplicateTopPeers(ArrayList arrayList) {
        List.EL.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return MentionsAdapter.lambda$sortAndDeduplicateTopPeers$7((TLRPC.TL_topPeer) obj, (TLRPC.TL_topPeer) obj2);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) it.next();
            Map.EL.putIfAbsent(linkedHashMap, Long.valueOf(DialogObject.getPeerDialogId(tL_topPeer.peer)), tL_topPeer);
        }
        return new ArrayList(linkedHashMap.values());
    }

    public void lambda$searchUsernameOrHashtag$8(final CharSequence charSequence, final int i, final ArrayList arrayList, final boolean z, final boolean z2) {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        StringBuilder sb2;
        ?? r15;
        String str4;
        char c;
        TLRPC.Chat chat;
        String str5;
        ChatActivity chatActivity;
        String str6;
        byte b;
        String str7;
        String strSubstring;
        String strSubstring2;
        ?? r0;
        StringBuilder sb3;
        ?? r14;
        int i2;
        int i3;
        boolean z3;
        int i4;
        ?? r3;
        HashtagHint hashtagHint;
        String[] currentKeyboardLanguage;
        boolean z4;
        ArrayList arrayList2;
        int i5;
        ?? r4;
        boolean z5;
        ArrayList arrayList3;
        TL_bots.BotInfo botInfo;
        int i6;
        TLRPC.BotCommand botCommand;
        String str8;
        ArrayList hashtags;
        int i7;
        boolean z6;
        SearchAdapterHelper.HashtagObject hashtagObject;
        String str9;
        ArrayList arrayList4;
        String lowerCase;
        boolean z7;
        final ArrayList arrayList5;
        final LongSparseArray longSparseArray;
        ArrayList arrayList6;
        ChatActivity chatActivity2;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat chat2;
        long threadId;
        TLRPC.User currentUser;
        ArrayList<TLRPC.Dialog> allDialogs;
        int i8;
        ArrayList arrayList7;
        TLRPC.Chat chat3;
        String str10;
        long j;
        TLRPC.User user;
        TLRPC.ChatFull chatFull2;
        int i9;
        long j2;
        ArrayList arrayList8;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user2;
        String str11;
        String publicUsername;
        long j3;
        Object obj;
        String str12;
        TLRPC.User user3;
        int i10;
        int i11;
        long fromChatId;
        boolean z8;
        TLRPC.Chat chat4;
        String str13;
        int i12;
        boolean z9;
        boolean z10;
        int i13;
        boolean z11 = z;
        boolean z12 = z2;
        String str14 = "";
        String string = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat currentChat = this.chat;
        ChatActivity chatActivity3 = this.parentFragment;
        if (chatActivity3 != null) {
            currentChat = chatActivity3.getCurrentChat();
            this.parentFragment.getCurrentUser();
        }
        TLRPC.Chat chat5 = currentChat;
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
        int i14 = string.length() > 0 ? i - 1 : i;
        this.lastText = null;
        this.lastUsernameOnly = z11;
        this.lastForSearch = z12;
        StringBuilder sb4 = new StringBuilder();
        boolean z13 = !z11 && string.length() > 0 && string.length() <= 14;
        if (z13) {
            int length = string.length();
            CharSequence charSequenceConcat = string;
            int i15 = 0;
            while (i15 < length) {
                String str15 = str14;
                char cCharAt = charSequenceConcat.charAt(i15);
                StringBuilder sb5 = sb4;
                int i16 = length - 1;
                char cCharAt2 = i15 < i16 ? charSequenceConcat.charAt(i15 + 1) : (char) 0;
                if (i15 >= i16 || cCharAt != 55356 || cCharAt2 < 57339 || cCharAt2 > 57343) {
                    if (cCharAt == 65039) {
                        i13 = 1;
                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i15), charSequenceConcat.subSequence(i15 + 1, charSequenceConcat.length()));
                        length--;
                        i15--;
                    }
                    i15 += i13;
                    str14 = str15;
                    sb4 = sb5;
                    string = string;
                } else {
                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i15), charSequenceConcat.subSequence(i15 + 2, charSequenceConcat.length()));
                    length -= 2;
                    i15--;
                }
                i13 = 1;
                i15 += i13;
                str14 = str15;
                sb4 = sb5;
                string = string;
            }
            str = str14;
            sb = sb4;
            str2 = string;
            this.lastSticker = charSequenceConcat.toString().trim();
            str3 = str2;
        } else {
            str = "";
            sb = sb4;
            str2 = string;
            str3 = str;
        }
        boolean z14 = z13 && (Emoji.isValidEmoji(str3) || Emoji.isValidEmoji(this.lastSticker));
        if (z14 && (charSequence instanceof Spanned)) {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
            z14 = animatedEmojiSpanArr == null || animatedEmojiSpanArr.length == 0;
        }
        if (this.allowStickers && z14 && (chat5 == null || ChatObject.canSendStickers(chat5))) {
            this.stickersToLoad.clear();
            int i17 = SharedConfig.suggestStickers;
            if (i17 == 2 || !z14) {
                if (this.visibleByStickersSearch && i17 == 2) {
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
                z8 = false;
                this.lastReqId = 0;
            } else {
                z8 = false;
            }
            boolean z15 = MessagesController.getInstance(this.currentAccount).suggestStickersApiOnly;
            this.delayLocalResults = z8;
            if (z15) {
                chat4 = chat5;
                sb2 = sb;
                str13 = str2;
                i12 = 5;
                z9 = true;
                z10 = z15;
            } else {
                sb2 = sb;
                z10 = z15;
                i12 = 5;
                chat4 = chat5;
                str13 = str2;
                z9 = true;
                z9 = true;
                this.checkAgainRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$searchUsernameOrHashtag$8(charSequence, i, arrayList, z, z2);
                    }
                };
                MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
                final ArrayList<TLRPC.Document> recentStickersNoCopy = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(0);
                final ArrayList<TLRPC.Document> recentStickersNoCopy2 = MediaDataController.getInstance(this.currentAccount).getRecentStickersNoCopy(2);
                int iMin = Math.min(20, recentStickersNoCopy.size());
                int i18 = 0;
                for (int i19 = 0; i19 < iMin; i19++) {
                    TLRPC.Document document = recentStickersNoCopy.get(i19);
                    if (isValidSticker(document, this.lastSticker)) {
                        addStickerToResult(document, "recent");
                        i18++;
                        if (i18 >= 5) {
                            break;
                        }
                    }
                }
                int size = recentStickersNoCopy2.size();
                for (int i20 = 0; i20 < size; i20++) {
                    TLRPC.Document document2 = recentStickersNoCopy2.get(i20);
                    if (isValidSticker(document2, this.lastSticker)) {
                        addStickerToResult(document2, "fav");
                    }
                }
                MediaDataController.getInstance(this.currentAccount).checkStickers(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(this.currentAccount).getAllStickers();
                ArrayList<TLRPC.Document> arrayList9 = allStickers != null ? allStickers.get(this.lastSticker) : null;
                if (arrayList9 != null && !arrayList9.isEmpty()) {
                    addStickersToResult(arrayList9, null);
                }
                ArrayList arrayList10 = this.stickers;
                if (arrayList10 != null) {
                    Collections.sort(arrayList10, new Comparator() {
                        private int getIndex(StickerResult stickerResult) {
                            for (int i21 = 0; i21 < recentStickersNoCopy2.size(); i21++) {
                                if (((TLRPC.Document) recentStickersNoCopy2.get(i21)).id == stickerResult.sticker.id) {
                                    return i21 + 2000000;
                                }
                            }
                            for (int i22 = 0; i22 < Math.min(20, recentStickersNoCopy.size()); i22++) {
                                if (((TLRPC.Document) recentStickersNoCopy.get(i22)).id == stickerResult.sticker.id) {
                                    return (recentStickersNoCopy.size() - i22) + 1000000;
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
            if (SharedConfig.suggestStickers == 0 || z10) {
                searchServerStickers(this.lastSticker, str3);
            }
            ArrayList arrayList11 = this.stickers;
            if (arrayList11 != null && !arrayList11.isEmpty()) {
                if (SharedConfig.suggestStickers == 0 && this.stickers.size() < i12) {
                    this.delayLocalResults = z9;
                    this.delegate.needChangePanelVisibility(false);
                    this.visibleByStickersSearch = false;
                } else {
                    checkStickerFilesExistAndDownload();
                    this.delegate.needChangePanelVisibility(this.stickersToLoad.isEmpty());
                    this.visibleByStickersSearch = z9;
                }
                notifyDataSetChanged();
            } else {
                if (this.visibleByStickersSearch) {
                    this.delegate.needChangePanelVisibility(false);
                    this.visibleByStickersSearch = false;
                }
                chat = chat4;
                r0 = str13;
                c = ' ';
                str5 = null;
                b = 4;
                r15 = z9;
            }
            chat = chat4;
            r0 = str13;
            c = ' ';
            str5 = null;
            b = 4;
            r15 = z9;
        } else {
            sb2 = sb;
            String str16 = str2;
            r15 = 1;
            if (z11 || !this.needBotContext) {
                str4 = str16;
            } else {
                str7 = str16;
                if (str7.charAt(0) == '@') {
                    c = ' ';
                    int iIndexOf = str7.indexOf(32);
                    int length2 = str7.length();
                    if (iIndexOf > 0) {
                        strSubstring2 = str7.substring(1, iIndexOf);
                        strSubstring = str7.substring(iIndexOf + 1);
                    } else if (str7.charAt(length2 - 1) == 't' && str7.charAt(length2 - 2) == 'o' && str7.charAt(length2 - 3) == 'b') {
                        strSubstring2 = str7.substring(1);
                        strSubstring = str;
                    } else {
                        str4 = str7;
                        str4 = str7;
                        str4 = str7;
                        searchForContextBot(null, null);
                        strSubstring = null;
                        strSubstring2 = null;
                    }
                    if (strSubstring2 == null) {
                        str4 = str7;
                        str4 = str7;
                        str4 = str7;
                        strSubstring2 = str;
                        break;
                    }
                    str4 = str7;
                    if (strSubstring2.length() < 1) {
                        str4 = str7;
                        str4 = str7;
                        str4 = str7;
                        strSubstring2 = str;
                        break;
                    }
                    str4 = str7;
                    for (int i21 = 1; i21 < strSubstring2.length(); i21++) {
                        char cCharAt3 = strSubstring2.charAt(i21);
                        if ((cCharAt3 < '0' || cCharAt3 > '9') && ((cCharAt3 < 'a' || cCharAt3 > 'z') && ((cCharAt3 < 'A' || cCharAt3 > 'Z') && cCharAt3 != '_'))) {
                            str4 = str7;
                            str4 = str7;
                            str4 = str7;
                            strSubstring2 = str;
                            break;
                        }
                    }
                    searchForContextBot(strSubstring2, strSubstring);
                    chat = chat5;
                    str5 = null;
                    str6 = str7;
                }
                b = -1;
                r0 = str6;
            }
            str4 = str7;
            c = ' ';
            if (this.allowStickers && (chatActivity = this.parentFragment) != null && chatActivity.getCurrentEncryptedChat() == null) {
                chat = chat5;
                if ((chat == null || ChatObject.canSendStickers(chat)) && str4.trim().length() >= 2 && str4.trim().indexOf(32) < 0) {
                    str5 = null;
                    searchForContextBot(null, null);
                    str6 = str4;
                }
                b = -1;
                r0 = str6;
            } else {
                chat = chat5;
            }
            str5 = null;
            searchForContextBot(null, null);
            str6 = str4;
            b = -1;
            r0 = str6;
        }
        if (this.foundContextBot != null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        String str17 = this.hintHashtag;
        this.hintHashtag = str5;
        this.hintHashtagDivider = false;
        if (!z11) {
            sb3 = sb2;
            while (true) {
                if (i14 >= 0) {
                    if (i14 >= r0.length()) {
                        i4 = -1;
                    } else {
                        char cCharAt4 = r0.charAt(i14);
                        if (i14 != 0) {
                            int i22 = i14 - 1;
                            if (r0.charAt(i22) == c || r0.charAt(i22) == '\n' || cCharAt4 == ':') {
                                if (cCharAt4 == '@') {
                                    z3 = this.searchInDialogs;
                                    if (!z3 || this.needUsernames || (this.needBotContext && i14 == 0)) {
                                        if (z3 && this.info == null && i14 != 0) {
                                            this.lastText = r0;
                                            this.lastPosition = i;
                                            this.messages = arrayList;
                                            this.delegate.needChangePanelVisibility(false);
                                            return;
                                        }
                                        this.resultStartPosition = i14;
                                        this.resultLength = sb3.length() + 1;
                                        i2 = i14;
                                    }
                                } else {
                                    if (cCharAt4 == '#') {
                                        if (!ChatObject.isChannelAndNotMegaGroup(chat) && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
                                            String strSubstring3 = r0.substring(i14);
                                            this.hintHashtag = strSubstring3;
                                            if (strSubstring3.length() < 4 || !this.hintHashtag.matches("^[#$][\\p{L}_-]+$")) {
                                                this.hintHashtag = null;
                                            }
                                        }
                                        if (this.searchAdapterHelper.loadRecentHashtags()) {
                                            this.resultStartPosition = i14;
                                            this.resultLength = sb3.length() + 1;
                                            sb3.insert(0, cCharAt4);
                                            i2 = -1;
                                            b = 1;
                                        } else {
                                            this.lastText = r0;
                                            this.lastPosition = i;
                                            this.messages = arrayList;
                                            return;
                                        }
                                    } else if (i14 != 0 && this.botInfo != null && cCharAt4 == '/') {
                                        this.resultStartPosition = i14;
                                        this.resultLength = sb3.length() + 1;
                                        i2 = -1;
                                        b = 2;
                                    } else if (cCharAt4 == ':' && sb3.length() > 0) {
                                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb3.charAt(0)) >= 0) {
                                            i3 = 1;
                                            if (sb3.length() > 1) {
                                            }
                                        } else {
                                            i3 = 1;
                                        }
                                        this.resultStartPosition = i14;
                                        this.resultLength = sb3.length() + i3;
                                        i2 = -1;
                                        b = 3;
                                    }
                                    r14 = 0;
                                }
                            }
                            sb3.insert(0, cCharAt4);
                            i4 = -1;
                        } else {
                            if (cCharAt4 == '@') {
                                z3 = this.searchInDialogs;
                                if (!z3) {
                                }
                                if (z3) {
                                }
                                this.resultStartPosition = i14;
                                this.resultLength = sb3.length() + 1;
                                i2 = i14;
                            } else {
                                if (cCharAt4 == '#') {
                                    if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
                                    }
                                    if (this.searchAdapterHelper.loadRecentHashtags()) {
                                        this.resultStartPosition = i14;
                                        this.resultLength = sb3.length() + 1;
                                        sb3.insert(0, cCharAt4);
                                        i2 = -1;
                                        b = 1;
                                    } else {
                                        this.lastText = r0;
                                        this.lastPosition = i;
                                        this.messages = arrayList;
                                        return;
                                    }
                                } else {
                                    if (i14 != 0) {
                                    }
                                    if (cCharAt4 == ':') {
                                        if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb3.charAt(0)) >= 0) {
                                            i3 = 1;
                                            if (sb3.length() > 1) {
                                            }
                                        } else {
                                            i3 = 1;
                                        }
                                        this.resultStartPosition = i14;
                                        this.resultLength = sb3.length() + i3;
                                        i2 = -1;
                                        b = 3;
                                    }
                                }
                                r14 = 0;
                            }
                            sb3.insert(0, cCharAt4);
                            i4 = -1;
                        }
                    }
                    i14 += i4;
                } else {
                    r14 = 0;
                    i2 = -1;
                }
                if (str17 != null && this.hintHashtag != null) {
                    notifyItemRangeInserted(r14, 2);
                } else if (str17 == null && this.hintHashtag == null) {
                    notifyItemRangeRemoved(r14, 2);
                } else {
                    r3 = this.topHint;
                    if (r3 != 0) {
                        r3.set(r14, this.hintHashtag, chat);
                    }
                    hashtagHint = this.bottomHint;
                    if (hashtagHint != null) {
                        hashtagHint.set(1, this.hintHashtag, chat);
                    }
                }
                if (b == -1) {
                    this.contextMedia = r14;
                    this.searchResultBotContext = null;
                    this.delegate.needChangePanelVisibility(r14);
                    return;
                }
                if (b == 0) {
                    if (b == 1) {
                        ArrayList arrayList12 = new ArrayList();
                        String lowerCase2 = sb3.toString().toLowerCase();
                        hashtags = this.searchAdapterHelper.getHashtags();
                        for (i7 = 0; i7 < hashtags.size(); i7++) {
                            hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i7);
                            if (hashtagObject == null && (str9 = hashtagObject.hashtag) != null && str9.startsWith(lowerCase2)) {
                                arrayList12.add(hashtagObject.hashtag);
                            }
                        }
                        this.searchResultHashtags = arrayList12;
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
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        mentionsAdapterDelegate.needChangePanelVisibility(z6);
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
                        String string2 = sb3.toString();
                        MediaDataController.KeywordResultCallback keywordResultCallback = new MediaDataController.KeywordResultCallback() {
                            @Override
                            public final void run(ArrayList arrayList13, String str18) {
                                this.f$0.lambda$searchUsernameOrHashtag$10(arrayList13, str18);
                            }
                        };
                        if (SharedConfig.suggestAnimatedEmoji || !UserConfig.getInstance(this.currentAccount).isPremium()) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        mediaDataController.getEmojiSuggestions(strArr, string2, false, keywordResultCallback, z4);
                        return;
                    }
                    arrayList2 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    String lowerCase3 = sb3.toString().toLowerCase();
                    for (i5 = 0; i5 < this.botInfo.size(); i5++) {
                        botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i5);
                        for (i6 = 0; i6 < botInfo.commands.size(); i6++) {
                            botCommand = botInfo.commands.get(i6);
                            if (botCommand == null && (str8 = botCommand.command) != null && str8.startsWith(lowerCase3)) {
                                arrayList2.add("/" + botCommand.command);
                                arrayList13.add(botCommand.description);
                                arrayList14.add(messagesController.getUser(Long.valueOf(botInfo.user_id)));
                                arrayList15.add(Boolean.valueOf(botCommand.ephemeral));
                            }
                        }
                    }
                    if (this.parentFragment == null && !DialogObject.isEncryptedDialog(this.dialog_id) && this.parentFragment.getChatMode() == 0 && this.parentFragment.getCurrentUser() != null && !this.parentFragment.getCurrentUser().bot && !UserObject.isReplyUser(this.parentFragment.getCurrentUser()) && !UserObject.isService(this.parentFragment.getCurrentUser().id)) {
                        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.currentAccount);
                        quickRepliesController.load();
                        this.quickRepliesQuery = lowerCase3;
                        this.quickReplies = new ArrayList();
                        for (int i23 = 0; i23 < quickRepliesController.replies.size(); i23++) {
                            QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) quickRepliesController.replies.get(i23);
                            if (!quickReply.isSpecial()) {
                                String lowerCase4 = quickReply.name.toLowerCase();
                                if (lowerCase4.startsWith(lowerCase3) || AndroidUtilities.translitSafe(lowerCase4).startsWith(lowerCase3)) {
                                    this.quickReplies.add(quickReply);
                                }
                            }
                        }
                        r4 = 0;
                    } else {
                        r4 = 0;
                        this.quickRepliesQuery = null;
                        this.quickReplies = null;
                    }
                    this.searchResultHashtags = r4;
                    this.stickers = r4;
                    this.searchResultUsernames = r4;
                    this.searchResultUsernamesMap = r4;
                    this.searchResultSuggestions = r4;
                    this.searchResultCommands = arrayList2;
                    this.searchResultCommandsHelp = arrayList13;
                    this.searchResultCommandsUsers = arrayList14;
                    this.searchResultCommandsEphemeral = arrayList15;
                    this.contextMedia = false;
                    this.searchResultBotContext = r4;
                    notifyDataSetChanged();
                    MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
                    if (arrayList2.isEmpty() || !((arrayList3 = this.quickReplies) == null || arrayList3.isEmpty())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    mentionsAdapterDelegate2.needChangePanelVisibility(z5);
                    return;
                }
                this.contextMedia = r14;
                this.searchResultBotContext = null;
                arrayList4 = new ArrayList();
                if (arrayList != null) {
                    for (i11 = 0; i11 < Math.min(100, arrayList.size()); i11++) {
                        fromChatId = ((MessageObject) arrayList.get(i11)).getFromChatId();
                        if (fromChatId <= 0 && !arrayList4.contains(Long.valueOf(fromChatId))) {
                            arrayList4.add(Long.valueOf(fromChatId));
                        }
                    }
                }
                lowerCase = sb3.toString().toLowerCase();
                if (lowerCase.indexOf(c) >= 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                arrayList5 = new ArrayList();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                longSparseArray = new LongSparseArray();
                arrayList6 = new ArrayList();
                arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
                if (chat != null || (!ChatObject.isMonoForum(chat) && !ChatObject.isChannelAndNotMegaGroup(chat))) {
                    arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
                }
                ArrayList arrayListSortAndDeduplicateTopPeers = sortAndDeduplicateTopPeers(arrayList6);
                if (!z11 || !this.needBotContext || i2 != 0 || arrayListSortAndDeduplicateTopPeers.isEmpty()) {
                    chat = chat;
                    arrayList4 = arrayList4;
                    break;
                }
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (i24 >= arrayListSortAndDeduplicateTopPeers.size()) {
                        chat = chat;
                        arrayList4 = arrayList4;
                        break;
                    }
                    TLRPC.User user4 = messagesController.getUser(Long.valueOf(((TLRPC.TL_topPeer) arrayListSortAndDeduplicateTopPeers.get(i24)).peer.user_id));
                    if (user4 != null) {
                        String publicUsername2 = UserObject.getPublicUsername(user4);
                        if (TextUtils.isEmpty(publicUsername2) || !(lowerCase.length() == 0 || publicUsername2.toLowerCase().startsWith(lowerCase))) {
                            i10 = 1;
                        } else {
                            arrayList5.add(user4);
                            longSparseArray2.put(user4.id, user4);
                            longSparseArray.put(user4.id, user4);
                            i10 = 1;
                            i25++;
                        }
                        if (i25 == 5) {
                            break;
                        }
                    } else {
                        chat = chat;
                        arrayList4 = arrayList4;
                        i10 = 1;
                    }
                    i24 += i10;
                    arrayList4 = arrayList4;
                    chat = chat;
                }
                chatActivity2 = this.parentFragment;
                if (chatActivity2 != null) {
                    TLRPC.Chat currentChat2 = chatActivity2.getCurrentChat();
                    threadId = this.parentFragment.getThreadId();
                    chat2 = currentChat2;
                } else {
                    chatFull = this.info;
                    if (chatFull != null) {
                        chat2 = messagesController.getChat(Long.valueOf(chatFull.id));
                    } else {
                        chat2 = chat;
                    }
                    threadId = 0;
                }
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                if (chat2 != null && (chatFull2 = this.info) != null && chatFull2.participants != null && (!ChatObject.isChannel(chat2) || chat2.megagroup)) {
                    i9 = -2;
                    while (i9 < this.info.participants.participants.size()) {
                        if (i9 == -2) {
                            j2 = threadId;
                            if (i9 == -1) {
                                if (z12) {
                                    if (lowerCase.length() == 0) {
                                        arrayList5.add(chat2);
                                    } else {
                                        String str18 = chat2.title;
                                        publicUsername = ChatObject.getPublicUsername(chat2);
                                        obj = chat2;
                                        str11 = null;
                                        str12 = str18;
                                        arrayList4 = arrayList4;
                                        j3 = -chat2.id;
                                        user3 = currentUser;
                                        if (TextUtils.isEmpty(publicUsername)) {
                                            arrayList5.add(obj);
                                            longSparseArray.put(j3, obj);
                                        } else {
                                            arrayList5.add(obj);
                                            longSparseArray.put(j3, obj);
                                        }
                                    }
                                }
                                user3 = currentUser;
                            } else {
                                arrayList8 = arrayList4;
                                chatParticipant = this.info.participants.participants.get(i9);
                                if (currentUser != null) {
                                    arrayList4 = arrayList8;
                                    if (chatParticipant.user_id != currentUser.id) {
                                    }
                                    user3 = currentUser;
                                } else {
                                    arrayList4 = arrayList8;
                                }
                                user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                                if (user2 != null && !UserObject.isUserSelf(user2) && longSparseArray2.indexOfKey(user2.id) < 0) {
                                    if (lowerCase.length() != 0 && !user2.deleted) {
                                        arrayList5.add(user2);
                                    } else {
                                        String str19 = user2.first_name;
                                        str11 = user2.last_name;
                                        publicUsername = UserObject.getPublicUsername(user2);
                                        j3 = user2.id;
                                        obj = user2;
                                        str12 = str19;
                                        user3 = currentUser;
                                        if (TextUtils.isEmpty(publicUsername)) {
                                            arrayList5.add(obj);
                                            longSparseArray.put(j3, obj);
                                        } else {
                                            arrayList5.add(obj);
                                            longSparseArray.put(j3, obj);
                                        }
                                    }
                                }
                                user3 = currentUser;
                            }
                        } else if (currentUser != null) {
                            j2 = threadId;
                            user3 = currentUser;
                        } else if (z11) {
                            String str20 = currentUser.first_name;
                            String str21 = currentUser.last_name;
                            publicUsername = UserObject.getPublicUsername(currentUser);
                            j2 = threadId;
                            j3 = currentUser.id;
                            obj = currentUser;
                            str11 = str21;
                            str12 = str20;
                            user3 = currentUser;
                            if ((TextUtils.isEmpty(publicUsername) && publicUsername.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str12) && str12.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str11) && str11.toLowerCase().startsWith(lowerCase)) || (z7 && ContactsController.formatName(str12, str11).toLowerCase().startsWith(lowerCase))))) {
                                arrayList5.add(obj);
                                longSparseArray.put(j3, obj);
                            }
                        } else {
                            user3 = currentUser;
                            j2 = threadId;
                        }
                        i9++;
                        currentUser = user3;
                        z11 = z;
                        z12 = z2;
                        threadId = j2;
                    }
                }
                long j4 = threadId;
                if (this.searchInDialogs) {
                    allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
                    i8 = 0;
                    while (i8 < allDialogs.size()) {
                        if (allDialogs.get(i8).id > 0) {
                            user = messagesController.getUser(Long.valueOf(allDialogs.get(i8).id));
                            if (user != null || UserObject.isUserSelf(user) || longSparseArray2.indexOfKey(user.id) >= 0) {
                                arrayList7 = arrayList4;
                            } else if (lowerCase.length() == 0 && !user.deleted) {
                                arrayList5.add(user);
                                arrayList7 = arrayList4;
                            } else {
                                String str22 = user.first_name;
                                String str23 = user.last_name;
                                String publicUsername3 = UserObject.getPublicUsername(user);
                                long j5 = user.id;
                                arrayList7 = arrayList4;
                                if ((!TextUtils.isEmpty(publicUsername3) && publicUsername3.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str22) && str22.toLowerCase().startsWith(lowerCase)) || ((!TextUtils.isEmpty(str23) && str23.toLowerCase().startsWith(lowerCase)) || (z7 && ContactsController.formatName(str22, str23).toLowerCase().startsWith(lowerCase))))) {
                                    arrayList5.add(user);
                                    longSparseArray.put(j5, user);
                                }
                            }
                        } else {
                            arrayList7 = arrayList4;
                            if (!TextUtils.isEmpty(lowerCase) && (chat3 = messagesController.getChat(Long.valueOf(-allDialogs.get(i8).id))) != null && chat3.username != null && longSparseArray2.indexOfKey(chat3.id) < 0) {
                                if (lowerCase.length() == 0) {
                                    arrayList5.add(chat3);
                                } else {
                                    String str24 = chat3.title;
                                    str10 = chat3.username;
                                    j = chat3.id;
                                    if ((TextUtils.isEmpty(str10) && str10.toLowerCase().startsWith(lowerCase)) || (!TextUtils.isEmpty(str24) && str24.toLowerCase().startsWith(lowerCase))) {
                                        arrayList5.add(chat3);
                                        longSparseArray.put(j, chat3);
                                    }
                                }
                            }
                        }
                        i8++;
                        arrayList4 = arrayList7;
                    }
                }
                final ArrayList arrayList16 = arrayList4;
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
                        int iIndexOf2 = arrayList16.indexOf(Long.valueOf(id));
                        int iIndexOf3 = arrayList16.indexOf(Long.valueOf(id2));
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
                if (((chat2 == null && chat2.megagroup) || this.searchInDialogs) && lowerCase.length() > 0) {
                    if (arrayList5.size() < 5) {
                        Runnable runnable4 = new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$searchUsernameOrHashtag$9(arrayList5, longSparseArray);
                            }
                        };
                        this.cancelDelayRunnable = runnable4;
                        AndroidUtilities.runOnUIThread(runnable4, 1000L);
                    } else {
                        showUsersResult(arrayList5, longSparseArray, true);
                    }
                    AnonymousClass7 anonymousClass7 = new AnonymousClass7(chat2, lowerCase, j4, arrayList5, longSparseArray, messagesController);
                    this.searchGlobalRunnable = anonymousClass7;
                    AndroidUtilities.runOnUIThread(anonymousClass7, 200L);
                    return;
                }
                showUsersResult(arrayList5, longSparseArray, true);
            }
        }
        sb3 = sb2;
        sb3.append(r0.substring(r15));
        this.resultStartPosition = 0;
        this.resultLength = sb3.length();
        i2 = -1;
        b = 0;
        r14 = 0;
        if (str17 != null) {
            if (str17 == null) {
                r3 = this.topHint;
                if (r3 != 0) {
                    r3.set(r14, this.hintHashtag, chat);
                }
                hashtagHint = this.bottomHint;
                if (hashtagHint != null) {
                    hashtagHint.set(1, this.hintHashtag, chat);
                }
            } else {
                r3 = this.topHint;
                if (r3 != 0) {
                    r3.set(r14, this.hintHashtag, chat);
                }
                hashtagHint = this.bottomHint;
                if (hashtagHint != null) {
                    hashtagHint.set(1, this.hintHashtag, chat);
                }
            }
        } else if (str17 == null) {
            r3 = this.topHint;
            if (r3 != 0) {
                r3.set(r14, this.hintHashtag, chat);
            }
            hashtagHint = this.bottomHint;
            if (hashtagHint != null) {
                hashtagHint.set(1, this.hintHashtag, chat);
            }
        } else {
            r3 = this.topHint;
            if (r3 != 0) {
                r3.set(r14, this.hintHashtag, chat);
            }
            hashtagHint = this.bottomHint;
            if (hashtagHint != null) {
                hashtagHint.set(1, this.hintHashtag, chat);
            }
        }
        if (b == -1) {
            this.contextMedia = r14;
            this.searchResultBotContext = null;
            this.delegate.needChangePanelVisibility(r14);
            return;
        }
        if (b == 0) {
            if (b == 1) {
                ArrayList arrayList17 = new ArrayList();
                String lowerCase5 = sb3.toString().toLowerCase();
                hashtags = this.searchAdapterHelper.getHashtags();
                while (i7 < hashtags.size()) {
                    hashtagObject = (SearchAdapterHelper.HashtagObject) hashtags.get(i7);
                    if (hashtagObject == null) {
                    }
                }
                this.searchResultHashtags = arrayList17;
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
                    z6 = true;
                } else {
                    z6 = true;
                }
                mentionsAdapterDelegate3.needChangePanelVisibility(z6);
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
                String string3 = sb3.toString();
                MediaDataController.KeywordResultCallback keywordResultCallback2 = new MediaDataController.KeywordResultCallback() {
                    @Override
                    public final void run(ArrayList arrayList18, String str110) {
                        this.f$0.lambda$searchUsernameOrHashtag$10(arrayList18, str110);
                    }
                };
                if (SharedConfig.suggestAnimatedEmoji) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                mediaDataController2.getEmojiSuggestions(strArr2, string3, false, keywordResultCallback2, z4);
                return;
            }
            arrayList2 = new ArrayList();
            ArrayList arrayList18 = new ArrayList();
            ArrayList arrayList19 = new ArrayList();
            ArrayList arrayList110 = new ArrayList();
            String lowerCase6 = sb3.toString().toLowerCase();
            while (i5 < this.botInfo.size()) {
                botInfo = (TL_bots.BotInfo) this.botInfo.valueAt(i5);
                while (i6 < botInfo.commands.size()) {
                    botCommand = botInfo.commands.get(i6);
                    if (botCommand == null) {
                    }
                }
            }
            if (this.parentFragment == null) {
                r4 = 0;
                this.quickRepliesQuery = null;
                this.quickReplies = null;
            } else {
                r4 = 0;
                this.quickRepliesQuery = null;
                this.quickReplies = null;
            }
            this.searchResultHashtags = r4;
            this.stickers = r4;
            this.searchResultUsernames = r4;
            this.searchResultUsernamesMap = r4;
            this.searchResultSuggestions = r4;
            this.searchResultCommands = arrayList2;
            this.searchResultCommandsHelp = arrayList18;
            this.searchResultCommandsUsers = arrayList19;
            this.searchResultCommandsEphemeral = arrayList110;
            this.contextMedia = false;
            this.searchResultBotContext = r4;
            notifyDataSetChanged();
            MentionsAdapterDelegate mentionsAdapterDelegate4 = this.delegate;
            if (arrayList2.isEmpty()) {
                z5 = true;
            } else {
                z5 = true;
            }
            mentionsAdapterDelegate4.needChangePanelVisibility(z5);
            return;
        }
        this.contextMedia = r14;
        this.searchResultBotContext = null;
        arrayList4 = new ArrayList();
        if (arrayList != null) {
            while (i11 < Math.min(100, arrayList.size())) {
                fromChatId = ((MessageObject) arrayList.get(i11)).getFromChatId();
                if (fromChatId <= 0) {
                }
            }
        }
        lowerCase = sb3.toString().toLowerCase();
        if (lowerCase.indexOf(c) >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        arrayList5 = new ArrayList();
        LongSparseArray longSparseArray3 = new LongSparseArray();
        longSparseArray = new LongSparseArray();
        arrayList6 = new ArrayList();
        arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).inlineBots);
        if (chat != null) {
            arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
        } else {
            arrayList6.addAll(MediaDataController.getInstance(this.currentAccount).guestBots);
        }
        ArrayList arrayListSortAndDeduplicateTopPeers2 = sortAndDeduplicateTopPeers(arrayList6);
        if (!z11) {
            chat = chat;
            arrayList4 = arrayList4;
            break;
        } else {
            chat = chat;
            arrayList4 = arrayList4;
            break;
        }
        chatActivity2 = this.parentFragment;
        if (chatActivity2 != null) {
            TLRPC.Chat currentChat3 = chatActivity2.getCurrentChat();
            threadId = this.parentFragment.getThreadId();
            chat2 = currentChat3;
        } else {
            chatFull = this.info;
            if (chatFull != null) {
                chat2 = messagesController.getChat(Long.valueOf(chatFull.id));
            } else {
                chat2 = chat;
            }
            threadId = 0;
        }
        currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (chat2 != null) {
            i9 = -2;
            while (i9 < this.info.participants.participants.size()) {
                if (i9 == -2) {
                    j2 = threadId;
                    if (i9 == -1) {
                        if (z12) {
                            if (lowerCase.length() == 0) {
                                arrayList5.add(chat2);
                            } else {
                                String str110 = chat2.title;
                                publicUsername = ChatObject.getPublicUsername(chat2);
                                obj = chat2;
                                str11 = null;
                                str12 = str110;
                                arrayList4 = arrayList4;
                                j3 = -chat2.id;
                                user3 = currentUser;
                                if (TextUtils.isEmpty(publicUsername)) {
                                    arrayList5.add(obj);
                                    longSparseArray.put(j3, obj);
                                } else {
                                    arrayList5.add(obj);
                                    longSparseArray.put(j3, obj);
                                }
                            }
                        }
                        user3 = currentUser;
                    } else {
                        arrayList8 = arrayList4;
                        chatParticipant = this.info.participants.participants.get(i9);
                        if (currentUser != null) {
                            arrayList4 = arrayList8;
                            if (chatParticipant.user_id != currentUser.id) {
                            }
                            user3 = currentUser;
                        } else {
                            arrayList4 = arrayList8;
                        }
                        user2 = messagesController.getUser(Long.valueOf(chatParticipant.user_id));
                        if (user2 != null) {
                            if (lowerCase.length() != 0) {
                            }
                            String str111 = user2.first_name;
                            str11 = user2.last_name;
                            publicUsername = UserObject.getPublicUsername(user2);
                            j3 = user2.id;
                            obj = user2;
                            str12 = str111;
                            user3 = currentUser;
                            if (TextUtils.isEmpty(publicUsername)) {
                                arrayList5.add(obj);
                                longSparseArray.put(j3, obj);
                            } else {
                                arrayList5.add(obj);
                                longSparseArray.put(j3, obj);
                            }
                        }
                        user3 = currentUser;
                    }
                } else if (currentUser != null) {
                    j2 = threadId;
                    user3 = currentUser;
                } else if (z11) {
                    user3 = currentUser;
                    j2 = threadId;
                } else {
                    String str25 = currentUser.first_name;
                    String str26 = currentUser.last_name;
                    publicUsername = UserObject.getPublicUsername(currentUser);
                    j2 = threadId;
                    j3 = currentUser.id;
                    obj = currentUser;
                    str11 = str26;
                    str12 = str25;
                    user3 = currentUser;
                    if (TextUtils.isEmpty(publicUsername)) {
                        arrayList5.add(obj);
                        longSparseArray.put(j3, obj);
                    } else {
                        arrayList5.add(obj);
                        longSparseArray.put(j3, obj);
                    }
                }
                i9++;
                currentUser = user3;
                z11 = z;
                z12 = z2;
                threadId = j2;
            }
        }
        long j6 = threadId;
        if (this.searchInDialogs) {
            allDialogs = MessagesController.getInstance(this.currentAccount).getAllDialogs();
            i8 = 0;
            while (i8 < allDialogs.size()) {
                if (allDialogs.get(i8).id > 0) {
                    user = messagesController.getUser(Long.valueOf(allDialogs.get(i8).id));
                    if (user != null) {
                        arrayList7 = arrayList4;
                    } else {
                        arrayList7 = arrayList4;
                    }
                } else {
                    arrayList7 = arrayList4;
                    if (!TextUtils.isEmpty(lowerCase)) {
                        if (lowerCase.length() == 0) {
                            arrayList5.add(chat3);
                        } else {
                            String str27 = chat3.title;
                            str10 = chat3.username;
                            j = chat3.id;
                            if (TextUtils.isEmpty(str10)) {
                                arrayList5.add(chat3);
                                longSparseArray.put(j, chat3);
                            } else {
                                arrayList5.add(chat3);
                                longSparseArray.put(j, chat3);
                            }
                        }
                    }
                }
                i8++;
                arrayList4 = arrayList7;
            }
        }
        final ArrayList arrayList111 = arrayList4;
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
                int iIndexOf2 = arrayList111.indexOf(Long.valueOf(id));
                int iIndexOf3 = arrayList111.indexOf(Long.valueOf(id2));
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
        if (chat2 == null) {
        }
        showUsersResult(arrayList5, longSparseArray, true);
    }

    public void lambda$searchUsernameOrHashtag$9(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.cancelDelayRunnable = null;
        showUsersResult(arrayList, longSparseArray, true);
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
                    this.f$0.lambda$run$1(iAccess$1704, arrayList, longSparseArray, messagesController, tLObject, tL_error);
                }
            });
        }

        public void lambda$run$1(final int i, final ArrayList arrayList, final LongSparseArray longSparseArray, final MessagesController messagesController, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$run$0(i, arrayList, longSparseArray, tL_error, tLObject, messagesController);
                }
            });
        }

        public void lambda$run$0(int i, ArrayList arrayList, LongSparseArray longSparseArray, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController) {
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

    public void lambda$searchUsernameOrHashtag$10(ArrayList arrayList, String str) {
        this.searchResultSuggestions = arrayList;
        this.searchResultHashtags = null;
        this.stickers = null;
        this.searchResultUsernames = null;
        this.searchResultUsernamesMap = null;
        this.searchResultCommands = null;
        this.searchResultCommandsEphemeral = null;
        this.quickReplies = null;
        this.searchResultCommandsHelp = null;
        this.searchResultCommandsUsers = null;
        notifyDataSetChanged();
        MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
        ArrayList arrayList2 = this.searchResultSuggestions;
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
        int size;
        int size2;
        int size3 = 1;
        if (this.foundContextBot != null && !this.inlineMediaEnabled) {
            return 1;
        }
        int i = this.hintHashtag != null ? 2 : 0;
        ArrayList arrayList = this.stickers;
        if (arrayList != null) {
            size2 = arrayList.size();
        } else {
            ArrayList arrayList2 = this.searchResultBotContext;
            if (arrayList2 != null) {
                size = arrayList2.size();
                if (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) {
                    size3 = 0;
                }
            } else {
                ArrayList arrayList3 = this.searchResultUsernames;
                if (arrayList3 != null) {
                    size2 = arrayList3.size();
                } else {
                    ArrayList arrayList4 = this.searchResultHashtags;
                    if (arrayList4 != null) {
                        size2 = arrayList4.size();
                    } else if (this.searchResultCommands != null || this.quickReplies != null) {
                        ArrayList arrayList5 = this.quickReplies;
                        size = arrayList5 == null ? 0 : arrayList5.size();
                        ArrayList arrayList6 = this.searchResultCommands;
                        if (arrayList6 == null) {
                            size3 = 0;
                        } else {
                            size3 = arrayList6.size();
                        }
                    } else {
                        ArrayList arrayList7 = this.searchResultSuggestions;
                        if (arrayList7 == null) {
                            return i;
                        }
                        size2 = arrayList7.size();
                    }
                }
            }
            return i + size + size3;
        }
        return i + size2;
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

    public void lambda$onCreateViewHolder$11(ContextLinkCell contextLinkCell) {
        this.delegate.onContextClick(contextLinkCell.getResult());
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
                    this.f$0.lambda$onCreateViewHolder$11(contextLinkCell2);
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
        if (isStickers()) {
            if (this.mentionsStickersActionTracker == null) {
                EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = new EmojiView.ChooseStickerActionTracker(this.currentAccount, this.dialog_id, this.threadMessageId) {
                    @Override
                    public boolean isShown() {
                        return MentionsAdapter.this.isStickers();
                    }
                };
                this.mentionsStickersActionTracker = chooseStickerActionTracker;
                chooseStickerActionTracker.checkVisibility();
            }
            this.mentionsStickersActionTracker.doSomeAction();
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
