package org.telegram.ui.Adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_botInlineMessageMediaAuto;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_channelParticipantsMentions;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipants;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipants;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inlineBotSwitchPM;
import org.telegram.tgnet.TLRPC$TL_inlineBotWebView;
import org.telegram.tgnet.TLRPC$TL_inputGeoPoint;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_botResults;
import org.telegram.tgnet.TLRPC$TL_messages_getInlineBotResults;
import org.telegram.tgnet.TLRPC$TL_messages_getStickers;
import org.telegram.tgnet.TLRPC$TL_messages_stickers;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photoSize;
import org.telegram.tgnet.TLRPC$TL_photoSizeProgressive;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.BotSwitchCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.RecyclerListView;
public class MentionsAdapter extends RecyclerListView.SelectionAdapter implements NotificationCenter.NotificationCenterDelegate {
    private LongSparseArray<TLRPC$BotInfo> botInfo;
    private int botsCount;
    private Runnable cancelDelayRunnable;
    private int channelLastReqId;
    private int channelReqId;
    private TLRPC$Chat chat;
    private Runnable checkAgainRunnable;
    private boolean contextMedia;
    private int contextQueryReqid;
    private Runnable contextQueryRunnable;
    private int contextUsernameReqid;
    private MentionsAdapterDelegate delegate;
    private long dialog_id;
    private TLRPC$User foundContextBot;
    private TLRPC$ChatFull info;
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
    private Context mContext;
    private EmojiView.ChooseStickerActionTracker mentionsStickersActionTracker;
    private ArrayList<MessageObject> messages;
    private String nextQueryOffset;
    private boolean noUserName;
    private ChatActivity parentFragment;
    private ArrayList<QuickRepliesController.QuickReply> quickReplies;
    private String quickRepliesQuery;
    private final Theme.ResourcesProvider resourcesProvider;
    private int resultLength;
    private int resultStartPosition;
    private SearchAdapterHelper searchAdapterHelper;
    private Runnable searchGlobalRunnable;
    private ArrayList<TLRPC$BotInlineResult> searchResultBotContext;
    private TLRPC$TL_inlineBotSwitchPM searchResultBotContextSwitch;
    private TLRPC$TL_inlineBotWebView searchResultBotWebViewSwitch;
    private ArrayList<String> searchResultCommands;
    private ArrayList<String> searchResultCommandsHelp;
    private ArrayList<TLRPC$User> searchResultCommandsUsers;
    private ArrayList<String> searchResultHashtags;
    private ArrayList<MediaDataController.KeywordResult> searchResultSuggestions;
    private ArrayList<TLObject> searchResultUsernames;
    private LongSparseArray<TLObject> searchResultUsernamesMap;
    private String searchingContextQuery;
    private String searchingContextUsername;
    private ArrayList<StickerResult> stickers;
    private HashMap<String, TLRPC$Document> stickersMap;
    private long threadMessageId;
    private TLRPC$User user;
    private boolean visibleByStickersSearch;
    private boolean allowStickers = true;
    private boolean allowBots = true;
    private boolean allowChats = true;
    private int currentAccount = UserConfig.selectedAccount;
    private boolean needUsernames = true;
    private boolean needBotContext = true;
    private boolean inlineMediaEnabled = true;
    private boolean searchInDailogs = false;
    private ArrayList<String> stickersToLoad = new ArrayList<>();
    private SendMessagesHelper.LocationProvider locationProvider = new SendMessagesHelper.LocationProvider(new SendMessagesHelper.LocationProvider.LocationProviderDelegate() {
        @Override
        public void onLocationAcquired(Location location) {
            if (MentionsAdapter.this.foundContextBot == null || !MentionsAdapter.this.foundContextBot.bot_inline_geo) {
                return;
            }
            MentionsAdapter.this.lastKnownLocation = location;
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            mentionsAdapter.searchForContextBotResults(true, mentionsAdapter.foundContextBot, MentionsAdapter.this.searchingContextQuery, BuildConfig.APP_CENTER_HASH);
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

        void onContextClick(TLRPC$BotInlineResult tLRPC$BotInlineResult);

        void onContextSearch(boolean z);

        void onItemCountUpdate(int i, int i2);
    }

    static int access$1704(MentionsAdapter mentionsAdapter) {
        int i = mentionsAdapter.channelLastReqId + 1;
        mentionsAdapter.channelLastReqId = i;
        return i;
    }

    public static class StickerResult {
        public Object parent;
        public TLRPC$Document sticker;

        public StickerResult(TLRPC$Document tLRPC$Document, Object obj) {
            this.sticker = tLRPC$Document;
            this.parent = obj;
        }
    }

    public MentionsAdapter(Context context, boolean z, long j, long j2, MentionsAdapterDelegate mentionsAdapterDelegate, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.delegate = mentionsAdapterDelegate;
        this.isDarkTheme = z;
        this.dialog_id = j;
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
            public void onSetHashtags(ArrayList<SearchAdapterHelper.HashtagObject> arrayList, HashMap<String, SearchAdapterHelper.HashtagObject> hashMap) {
                if (MentionsAdapter.this.lastText != null) {
                    MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                    mentionsAdapter.lambda$searchUsernameOrHashtag$7(mentionsAdapter.lastText, MentionsAdapter.this.lastPosition, MentionsAdapter.this.messages, MentionsAdapter.this.lastUsernameOnly, MentionsAdapter.this.lastForSearch);
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

    public TLRPC$User getFoundContextBot() {
        return this.foundContextBot;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed) {
            ArrayList<StickerResult> arrayList = this.stickers;
            if (arrayList == null || arrayList.isEmpty() || this.stickersToLoad.isEmpty() || !this.visibleByStickersSearch) {
                return;
            }
            this.stickersToLoad.remove((String) objArr[0]);
            if (this.stickersToLoad.isEmpty()) {
                this.delegate.needChangePanelVisibility(getItemCountInternal() > 0);
            }
        } else if (i == NotificationCenter.recentDocumentsDidLoad) {
            Runnable runnable2 = this.checkAgainRunnable;
            if (runnable2 != null) {
                AndroidUtilities.runOnUIThread(runnable2);
                this.checkAgainRunnable = null;
            }
        } else if (i == NotificationCenter.stickersDidLoad && ((Integer) objArr[0]).intValue() == 0 && (runnable = this.checkAgainRunnable) != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.checkAgainRunnable = null;
        }
    }

    private void addStickerToResult(TLRPC$Document tLRPC$Document, Object obj) {
        if (tLRPC$Document == null) {
            return;
        }
        String str = tLRPC$Document.dc_id + "_" + tLRPC$Document.id;
        HashMap<String, TLRPC$Document> hashMap = this.stickersMap;
        if (hashMap == null || !hashMap.containsKey(str)) {
            if (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(tLRPC$Document)) {
                if (this.stickers == null) {
                    this.stickers = new ArrayList<>();
                    this.stickersMap = new HashMap<>();
                }
                this.stickers.add(new StickerResult(tLRPC$Document, obj));
                this.stickersMap.put(str, tLRPC$Document);
                EmojiView.ChooseStickerActionTracker chooseStickerActionTracker = this.mentionsStickersActionTracker;
                if (chooseStickerActionTracker != null) {
                    chooseStickerActionTracker.checkVisibility();
                }
            }
        }
    }

    private void addStickersToResult(ArrayList<TLRPC$Document> arrayList, Object obj) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$Document tLRPC$Document = arrayList.get(i);
            String str = tLRPC$Document.dc_id + "_" + tLRPC$Document.id;
            HashMap<String, TLRPC$Document> hashMap = this.stickersMap;
            if ((hashMap == null || !hashMap.containsKey(str)) && (UserConfig.getInstance(this.currentAccount).isPremium() || !MessageObject.isPremiumSticker(tLRPC$Document))) {
                int size2 = tLRPC$Document.attributes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i2);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                        obj = tLRPC$DocumentAttribute.stickerset;
                        break;
                    }
                    i2++;
                }
                if (this.stickers == null) {
                    this.stickers = new ArrayList<>();
                    this.stickersMap = new HashMap<>();
                }
                this.stickers.add(new StickerResult(tLRPC$Document, obj));
                this.stickersMap.put(str, tLRPC$Document);
            }
        }
    }

    private boolean checkStickerFilesExistAndDownload() {
        if (this.stickers == null) {
            return false;
        }
        this.stickersToLoad.clear();
        int min = Math.min(6, this.stickers.size());
        for (int i = 0; i < min; i++) {
            StickerResult stickerResult = this.stickers.get(i);
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerResult.sticker.thumbs, 90);
            if (((closestPhotoSizeWithSize instanceof TLRPC$TL_photoSize) || (closestPhotoSizeWithSize instanceof TLRPC$TL_photoSizeProgressive)) && !FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, "webp", true).exists()) {
                this.stickersToLoad.add(FileLoader.getAttachFileName(closestPhotoSizeWithSize, "webp"));
                FileLoader.getInstance(this.currentAccount).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerResult.sticker), stickerResult.parent, "webp", 1, 1);
            }
        }
        return this.stickersToLoad.isEmpty();
    }

    private boolean isValidSticker(TLRPC$Document tLRPC$Document, String str) {
        int size = tLRPC$Document.attributes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                String str2 = tLRPC$DocumentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    private void searchServerStickers(final String str, String str2) {
        TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers = new TLRPC$TL_messages_getStickers();
        tLRPC$TL_messages_getStickers.emoticon = str2;
        tLRPC$TL_messages_getStickers.hash = 0L;
        this.lastReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getStickers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                MentionsAdapter.this.lambda$searchServerStickers$1(str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$searchServerStickers$1(final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MentionsAdapter.this.lambda$searchServerStickers$0(str, tLObject);
            }
        });
    }

    public void lambda$searchServerStickers$0(String str, TLObject tLObject) {
        ArrayList<StickerResult> arrayList;
        this.lastReqId = 0;
        if (str.equals(this.lastSticker) && (tLObject instanceof TLRPC$TL_messages_stickers)) {
            TLRPC$TL_messages_stickers tLRPC$TL_messages_stickers = (TLRPC$TL_messages_stickers) tLObject;
            ArrayList<StickerResult> arrayList2 = this.stickers;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            ArrayList<TLRPC$Document> arrayList3 = tLRPC$TL_messages_stickers.stickers;
            addStickersToResult(arrayList3, "sticker_search_" + str);
            ArrayList<StickerResult> arrayList4 = this.stickers;
            int size2 = arrayList4 != null ? arrayList4.size() : 0;
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
        if (i == -1 || this.lastData == null) {
            MentionsAdapterDelegate mentionsAdapterDelegate2 = this.delegate;
            if (mentionsAdapterDelegate2 != null) {
                mentionsAdapterDelegate2.onItemCountUpdate(0, getItemCount());
            }
            super.notifyDataSetChanged();
            this.lastData = new Object[getItemCount()];
            while (true) {
                Object[] objArr = this.lastData;
                if (r1 >= objArr.length) {
                    return;
                }
                objArr[r1] = getItem(r1);
                r1++;
            }
        } else {
            int itemCount = getItemCount();
            boolean z = i != itemCount;
            int min = Math.min(i, itemCount);
            Object[] objArr2 = new Object[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                objArr2[i2] = getItem(i2);
            }
            while (r1 < min) {
                if (r1 >= 0) {
                    Object[] objArr3 = this.lastData;
                    r1 = (r1 < objArr3.length && r1 < itemCount && itemsEqual(objArr3[r1], objArr2[r1])) ? r1 + 1 : 0;
                }
                notifyItemChanged(r1);
                z = true;
            }
            notifyItemRangeRemoved(min, i - min);
            notifyItemRangeInserted(min, itemCount - min);
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
        if ((obj instanceof TLRPC$User) && (obj2 instanceof TLRPC$User) && ((TLRPC$User) obj).id == ((TLRPC$User) obj2).id) {
            return true;
        }
        if ((obj instanceof TLRPC$Chat) && (obj2 instanceof TLRPC$Chat) && ((TLRPC$Chat) obj).id == ((TLRPC$Chat) obj2).id) {
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

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        ChatActivity chatActivity;
        TLRPC$Chat currentChat;
        this.currentAccount = UserConfig.selectedAccount;
        this.info = tLRPC$ChatFull;
        if (!this.inlineMediaEnabled && this.foundContextBot != null && (chatActivity = this.parentFragment) != null && (currentChat = chatActivity.getCurrentChat()) != null) {
            boolean canSendStickers = ChatObject.canSendStickers(currentChat);
            this.inlineMediaEnabled = canSendStickers;
            if (canSendStickers) {
                this.searchResultUsernames = null;
                notifyDataSetChanged();
                this.delegate.needChangePanelVisibility(false);
                processFoundUser(this.foundContextBot);
            }
        }
        String str = this.lastText;
        if (str != null) {
            lambda$searchUsernameOrHashtag$7(str, this.lastPosition, this.messages, this.lastUsernameOnly, this.lastForSearch);
        }
    }

    public void setNeedUsernames(boolean z) {
        this.needUsernames = z;
    }

    public void setNeedBotContext(boolean z) {
        this.needBotContext = z;
    }

    public void setBotInfo(LongSparseArray<TLRPC$BotInfo> longSparseArray) {
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

    public TLRPC$TL_inlineBotSwitchPM getBotContextSwitch() {
        return this.searchResultBotContextSwitch;
    }

    public TLRPC$TL_inlineBotWebView getBotWebViewSwitch() {
        return this.searchResultBotWebViewSwitch;
    }

    public long getContextBotId() {
        TLRPC$User tLRPC$User = this.foundContextBot;
        if (tLRPC$User != null) {
            return tLRPC$User.id;
        }
        return 0L;
    }

    public TLRPC$User getContextBotUser() {
        return this.foundContextBot;
    }

    public String getContextBotName() {
        TLRPC$User tLRPC$User = this.foundContextBot;
        return tLRPC$User != null ? tLRPC$User.username : BuildConfig.APP_CENTER_HASH;
    }

    public void processFoundUser(TLRPC$User tLRPC$User) {
        ChatActivity chatActivity;
        TLRPC$Chat currentChat;
        this.contextUsernameReqid = 0;
        this.locationProvider.stop();
        if (tLRPC$User != null && tLRPC$User.bot && tLRPC$User.bot_inline_placeholder != null) {
            this.foundContextBot = tLRPC$User;
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && (currentChat = chatActivity2.getCurrentChat()) != null) {
                boolean canSendStickers = ChatObject.canSendStickers(currentChat);
                this.inlineMediaEnabled = canSendStickers;
                if (!canSendStickers) {
                    notifyDataSetChanged();
                    this.delegate.needChangePanelVisibility(true);
                    return;
                }
            }
            if (this.foundContextBot.bot_inline_geo) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
                if (!notificationsSettings.getBoolean("inlinegeo_" + this.foundContextBot.id, false) && (chatActivity = this.parentFragment) != null && chatActivity.getParentActivity() != null) {
                    final TLRPC$User tLRPC$User2 = this.foundContextBot;
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.parentFragment.getParentActivity());
                    builder.setTitle(LocaleController.getString("ShareYouLocationTitle", R.string.ShareYouLocationTitle));
                    builder.setMessage(LocaleController.getString("ShareYouLocationInline", R.string.ShareYouLocationInline));
                    final boolean[] zArr = new boolean[1];
                    builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            MentionsAdapter.this.lambda$processFoundUser$2(zArr, tLRPC$User2, dialogInterface, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            MentionsAdapter.this.lambda$processFoundUser$3(zArr, dialogInterface, i);
                        }
                    });
                    this.parentFragment.showDialog(builder.create(), new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            MentionsAdapter.this.lambda$processFoundUser$4(zArr, dialogInterface);
                        }
                    });
                } else {
                    checkLocationPermissionsOrStart();
                }
            }
        } else {
            this.foundContextBot = null;
            this.inlineMediaEnabled = true;
        }
        if (this.foundContextBot == null) {
            this.noUserName = true;
            return;
        }
        MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
        if (mentionsAdapterDelegate != null) {
            mentionsAdapterDelegate.onContextSearch(true);
        }
        searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, BuildConfig.APP_CENTER_HASH);
    }

    public void lambda$processFoundUser$2(boolean[] zArr, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        if (tLRPC$User != null) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("inlinegeo_" + tLRPC$User.id, true).commit();
            checkLocationPermissionsOrStart();
        }
    }

    public void lambda$processFoundUser$3(boolean[] zArr, DialogInterface dialogInterface, int i) {
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
        TLRPC$User tLRPC$User = this.foundContextBot;
        if (tLRPC$User == null || (str4 = tLRPC$User.username) == null || !str4.equals(str) || (str5 = this.searchingContextQuery) == null || !str5.equals(str2)) {
            if (this.foundContextBot != null) {
                if (!this.inlineMediaEnabled && str != null && str2 != null) {
                    return;
                }
                this.delegate.needChangePanelVisibility(false);
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

    public class AnonymousClass4 implements Runnable {
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
                mentionsAdapter.searchForContextBotResults(true, mentionsAdapter.foundContextBot, this.val$query, BuildConfig.APP_CENTER_HASH);
                return;
            }
            MentionsAdapter.this.searchingContextUsername = this.val$username;
            TLObject userOrChat = this.val$messagesController.getUserOrChat(MentionsAdapter.this.searchingContextUsername);
            if (userOrChat instanceof TLRPC$User) {
                MentionsAdapter.this.processFoundUser((TLRPC$User) userOrChat);
                return;
            }
            TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
            tLRPC$TL_contacts_resolveUsername.username = MentionsAdapter.this.searchingContextUsername;
            MentionsAdapter mentionsAdapter2 = MentionsAdapter.this;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(mentionsAdapter2.currentAccount);
            final String str = this.val$username;
            final MessagesController messagesController = this.val$messagesController;
            final MessagesStorage messagesStorage = this.val$messagesStorage;
            mentionsAdapter2.contextUsernameReqid = connectionsManager.sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MentionsAdapter.AnonymousClass4.this.lambda$run$1(str, messagesController, messagesStorage, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$run$1(final String str, final MessagesController messagesController, final MessagesStorage messagesStorage, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MentionsAdapter.AnonymousClass4.this.lambda$run$0(str, tLRPC$TL_error, tLObject, messagesController, messagesStorage);
                }
            });
        }

        public void lambda$run$0(String str, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
            if (MentionsAdapter.this.searchingContextUsername == null || !MentionsAdapter.this.searchingContextUsername.equals(str)) {
                return;
            }
            TLRPC$User tLRPC$User = null;
            if (tLRPC$TL_error == null) {
                TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
                if (!tLRPC$TL_contacts_resolvedPeer.users.isEmpty()) {
                    TLRPC$User tLRPC$User2 = tLRPC$TL_contacts_resolvedPeer.users.get(0);
                    messagesController.putUser(tLRPC$User2, false);
                    messagesStorage.putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, null, true, true);
                    tLRPC$User = tLRPC$User2;
                }
            }
            MentionsAdapter.this.processFoundUser(tLRPC$User);
            MentionsAdapter.this.contextUsernameReqid = 0;
        }
    }

    public void onLocationUnavailable() {
        TLRPC$User tLRPC$User = this.foundContextBot;
        if (tLRPC$User == null || !tLRPC$User.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.lastKnownLocation = location;
        location.setLatitude(-1000.0d);
        this.lastKnownLocation.setLongitude(-1000.0d);
        searchForContextBotResults(true, this.foundContextBot, this.searchingContextQuery, BuildConfig.APP_CENTER_HASH);
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
        TLRPC$User tLRPC$User = this.foundContextBot;
        if (tLRPC$User == null || !tLRPC$User.bot_inline_geo) {
            return;
        }
        this.locationProvider.start();
    }

    public void setSearchingMentions(boolean z) {
        this.isSearchingMentions = z;
    }

    public String getBotCaption() {
        TLRPC$User tLRPC$User = this.foundContextBot;
        if (tLRPC$User != null) {
            return tLRPC$User.bot_inline_placeholder;
        }
        String str = this.searchingContextUsername;
        if (str == null || !str.equals("gif")) {
            return null;
        }
        return LocaleController.getString("SearchGifsTitle", R.string.SearchGifsTitle);
    }

    public void searchForContextBotForNextOffset() {
        String str;
        TLRPC$User tLRPC$User;
        String str2;
        if (this.contextQueryReqid != 0 || (str = this.nextQueryOffset) == null || str.length() == 0 || (tLRPC$User = this.foundContextBot) == null || (str2 = this.searchingContextQuery) == null) {
            return;
        }
        searchForContextBotResults(true, tLRPC$User, str2, this.nextQueryOffset);
    }

    public void searchForContextBotResults(final boolean z, final TLRPC$User tLRPC$User, final String str, final String str2) {
        Location location;
        if (this.contextQueryReqid != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.contextQueryReqid, true);
            this.contextQueryReqid = 0;
        }
        if (!this.inlineMediaEnabled || !this.allowBots) {
            MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
            if (mentionsAdapterDelegate != null) {
                mentionsAdapterDelegate.onContextSearch(false);
            }
        } else if (str == null || tLRPC$User == null) {
            this.searchingContextQuery = null;
        } else if (tLRPC$User.bot_inline_geo && this.lastKnownLocation == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.dialog_id);
            sb.append("_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("_");
            sb.append(this.dialog_id);
            sb.append("_");
            sb.append(tLRPC$User.id);
            sb.append("_");
            sb.append((!tLRPC$User.bot_inline_geo || this.lastKnownLocation.getLatitude() == -1000.0d) ? BuildConfig.APP_CENTER_HASH : Double.valueOf(this.lastKnownLocation.getLatitude() + this.lastKnownLocation.getLongitude()));
            final String sb2 = sb.toString();
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MentionsAdapter.this.lambda$searchForContextBotResults$6(str, z, tLRPC$User, str2, messagesStorage, sb2, tLObject, tLRPC$TL_error);
                }
            };
            if (z) {
                messagesStorage.getBotCache(sb2, requestDelegate);
                return;
            }
            TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults = new TLRPC$TL_messages_getInlineBotResults();
            tLRPC$TL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tLRPC$User);
            tLRPC$TL_messages_getInlineBotResults.query = str;
            tLRPC$TL_messages_getInlineBotResults.offset = str2;
            if (tLRPC$User.bot_inline_geo && (location = this.lastKnownLocation) != null && location.getLatitude() != -1000.0d) {
                tLRPC$TL_messages_getInlineBotResults.flags |= 1;
                TLRPC$TL_inputGeoPoint tLRPC$TL_inputGeoPoint = new TLRPC$TL_inputGeoPoint();
                tLRPC$TL_messages_getInlineBotResults.geo_point = tLRPC$TL_inputGeoPoint;
                tLRPC$TL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                tLRPC$TL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
            }
            if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                tLRPC$TL_messages_getInlineBotResults.peer = new TLRPC$TL_inputPeerEmpty();
            } else {
                tLRPC$TL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialog_id);
            }
            this.contextQueryReqid = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getInlineBotResults, requestDelegate, 2);
        }
    }

    public void lambda$searchForContextBotResults$6(final String str, final boolean z, final TLRPC$User tLRPC$User, final String str2, final MessagesStorage messagesStorage, final String str3, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MentionsAdapter.this.lambda$searchForContextBotResults$5(str, z, tLObject, tLRPC$User, str2, messagesStorage, str3);
            }
        });
    }

    public void lambda$searchForContextBotResults$5(String str, boolean z, TLObject tLObject, TLRPC$User tLRPC$User, String str2, MessagesStorage messagesStorage, String str3) {
        boolean z2;
        if (str.equals(this.searchingContextQuery)) {
            int i = 0;
            this.contextQueryReqid = 0;
            if (z && tLObject == null) {
                searchForContextBotResults(false, tLRPC$User, str, str2);
            } else {
                MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
                if (mentionsAdapterDelegate != null) {
                    mentionsAdapterDelegate.onContextSearch(false);
                }
            }
            if (tLObject instanceof TLRPC$TL_messages_botResults) {
                TLRPC$TL_messages_botResults tLRPC$TL_messages_botResults = (TLRPC$TL_messages_botResults) tLObject;
                if (!z && tLRPC$TL_messages_botResults.cache_time != 0) {
                    messagesStorage.saveBotCache(str3, tLRPC$TL_messages_botResults);
                }
                this.nextQueryOffset = tLRPC$TL_messages_botResults.next_offset;
                if (this.searchResultBotContextSwitch == null) {
                    this.searchResultBotContextSwitch = tLRPC$TL_messages_botResults.switch_pm;
                }
                this.searchResultBotWebViewSwitch = tLRPC$TL_messages_botResults.switch_webview;
                int i2 = 0;
                while (i2 < tLRPC$TL_messages_botResults.results.size()) {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = tLRPC$TL_messages_botResults.results.get(i2);
                    if (!(tLRPC$BotInlineResult.document instanceof TLRPC$TL_document) && !(tLRPC$BotInlineResult.photo instanceof TLRPC$TL_photo) && !"game".equals(tLRPC$BotInlineResult.type) && tLRPC$BotInlineResult.content == null && (tLRPC$BotInlineResult.send_message instanceof TLRPC$TL_botInlineMessageMediaAuto)) {
                        tLRPC$TL_messages_botResults.results.remove(i2);
                        i2--;
                    }
                    tLRPC$BotInlineResult.query_id = tLRPC$TL_messages_botResults.query_id;
                    i2++;
                }
                if (this.searchResultBotContext == null || str2.length() == 0) {
                    this.searchResultBotContext = tLRPC$TL_messages_botResults.results;
                    this.contextMedia = tLRPC$TL_messages_botResults.gallery;
                    z2 = false;
                } else {
                    this.searchResultBotContext.addAll(tLRPC$TL_messages_botResults.results);
                    if (tLRPC$TL_messages_botResults.results.isEmpty()) {
                        this.nextQueryOffset = BuildConfig.APP_CENTER_HASH;
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
                this.quickReplies = null;
                this.searchResultSuggestions = null;
                this.searchResultCommandsHelp = null;
                this.searchResultCommandsUsers = null;
                this.delegate.needChangePanelVisibility((this.searchResultBotContext.isEmpty() && this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? false : true);
                if (z2) {
                    i = (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? 1 : 1;
                    notifyItemChanged(((this.searchResultBotContext.size() - tLRPC$TL_messages_botResults.results.size()) + i) - 1);
                    notifyItemRangeInserted((this.searchResultBotContext.size() - tLRPC$TL_messages_botResults.results.size()) + i, tLRPC$TL_messages_botResults.results.size());
                    return;
                }
                notifyDataSetChanged();
            }
        }
    }

    public void lambda$searchUsernameOrHashtag$7(final java.lang.CharSequence r23, final int r24, final java.util.ArrayList<org.telegram.messenger.MessageObject> r25, final boolean r26, final boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.MentionsAdapter.lambda$searchUsernameOrHashtag$7(java.lang.CharSequence, int, java.util.ArrayList, boolean, boolean):void");
    }

    public void lambda$searchUsernameOrHashtag$8(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.cancelDelayRunnable = null;
        showUsersResult(arrayList, longSparseArray, true);
    }

    public class AnonymousClass7 implements Runnable {
        final TLRPC$Chat val$chat;
        final MessagesController val$messagesController;
        final LongSparseArray val$newMap;
        final ArrayList val$newResult;
        final long val$threadId;
        final String val$usernameString;

        AnonymousClass7(TLRPC$Chat tLRPC$Chat, String str, long j, ArrayList arrayList, LongSparseArray longSparseArray, MessagesController messagesController) {
            this.val$chat = tLRPC$Chat;
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
            TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants = new TLRPC$TL_channels_getParticipants();
            tLRPC$TL_channels_getParticipants.channel = MessagesController.getInputChannel(this.val$chat);
            tLRPC$TL_channels_getParticipants.limit = 20;
            tLRPC$TL_channels_getParticipants.offset = 0;
            TLRPC$TL_channelParticipantsMentions tLRPC$TL_channelParticipantsMentions = new TLRPC$TL_channelParticipantsMentions();
            int i = tLRPC$TL_channelParticipantsMentions.flags | 1;
            tLRPC$TL_channelParticipantsMentions.flags = i;
            tLRPC$TL_channelParticipantsMentions.q = this.val$usernameString;
            long j = this.val$threadId;
            if (j != 0) {
                tLRPC$TL_channelParticipantsMentions.flags = i | 2;
                tLRPC$TL_channelParticipantsMentions.top_msg_id = (int) j;
            }
            tLRPC$TL_channels_getParticipants.filter = tLRPC$TL_channelParticipantsMentions;
            final int access$1704 = MentionsAdapter.access$1704(MentionsAdapter.this);
            MentionsAdapter mentionsAdapter = MentionsAdapter.this;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(mentionsAdapter.currentAccount);
            final ArrayList arrayList = this.val$newResult;
            final LongSparseArray longSparseArray = this.val$newMap;
            final MessagesController messagesController = this.val$messagesController;
            mentionsAdapter.channelReqId = connectionsManager.sendRequest(tLRPC$TL_channels_getParticipants, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    MentionsAdapter.AnonymousClass7.this.lambda$run$1(access$1704, arrayList, longSparseArray, messagesController, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$run$1(final int i, final ArrayList arrayList, final LongSparseArray longSparseArray, final MessagesController messagesController, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MentionsAdapter.AnonymousClass7.this.lambda$run$0(i, arrayList, longSparseArray, tLRPC$TL_error, tLObject, messagesController);
                }
            });
        }

        public void lambda$run$0(int i, ArrayList arrayList, LongSparseArray longSparseArray, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, MessagesController messagesController) {
            if (MentionsAdapter.this.channelReqId != 0 && i == MentionsAdapter.this.channelLastReqId && MentionsAdapter.this.searchResultUsernamesMap != null && MentionsAdapter.this.searchResultUsernames != null) {
                MentionsAdapter.this.showUsersResult(arrayList, longSparseArray, false);
                if (tLRPC$TL_error == null) {
                    TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants = (TLRPC$TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tLRPC$TL_channels_channelParticipants.users, false);
                    messagesController.putChats(tLRPC$TL_channels_channelParticipants.chats, false);
                    MentionsAdapter.this.searchResultUsernames.isEmpty();
                    if (!tLRPC$TL_channels_channelParticipants.participants.isEmpty()) {
                        long clientUserId = UserConfig.getInstance(MentionsAdapter.this.currentAccount).getClientUserId();
                        for (int i2 = 0; i2 < tLRPC$TL_channels_channelParticipants.participants.size(); i2++) {
                            long peerId = MessageObject.getPeerId(tLRPC$TL_channels_channelParticipants.participants.get(i2).peer);
                            if (MentionsAdapter.this.searchResultUsernamesMap.indexOfKey(peerId) < 0 && ((peerId != 0 || MentionsAdapter.this.searchResultUsernamesMap.indexOfKey(clientUserId) < 0) && (MentionsAdapter.this.isSearchingMentions || (peerId != clientUserId && peerId != 0)))) {
                                if (peerId >= 0) {
                                    TLRPC$User user = messagesController.getUser(Long.valueOf(peerId));
                                    if (user == null) {
                                        return;
                                    }
                                    MentionsAdapter.this.searchResultUsernames.add(user);
                                } else {
                                    TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                                    if (chat == null) {
                                        return;
                                    }
                                    MentionsAdapter.this.searchResultUsernames.add(chat);
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

    public void lambda$searchUsernameOrHashtag$9(ArrayList arrayList, String str) {
        this.searchResultSuggestions = arrayList;
        this.searchResultHashtags = null;
        this.stickers = null;
        this.searchResultUsernames = null;
        this.searchResultUsernamesMap = null;
        this.searchResultCommands = null;
        this.quickReplies = null;
        this.searchResultCommandsHelp = null;
        this.searchResultCommandsUsers = null;
        notifyDataSetChanged();
        MentionsAdapterDelegate mentionsAdapterDelegate = this.delegate;
        ArrayList<MediaDataController.KeywordResult> arrayList2 = this.searchResultSuggestions;
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

    public void showUsersResult(ArrayList<TLObject> arrayList, LongSparseArray<TLObject> longSparseArray, boolean z) {
        this.searchResultUsernames = arrayList;
        if ((!this.allowBots || !this.allowChats) && arrayList != null) {
            Iterator<TLObject> it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject next = it.next();
                if ((next instanceof TLRPC$Chat) && !this.allowChats) {
                    it.remove();
                } else if (next instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User = (TLRPC$User) next;
                    if (tLRPC$User.bot || UserObject.isService(tLRPC$User.id)) {
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

    public ArrayList<TLRPC$BotInlineResult> getSearchResultBotContext() {
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
        if (this.foundContextBot == null || this.inlineMediaEnabled) {
            ArrayList<StickerResult> arrayList = this.stickers;
            if (arrayList != null) {
                return arrayList.size();
            }
            ArrayList<TLRPC$BotInlineResult> arrayList2 = this.searchResultBotContext;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                if (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) {
                    i = 0;
                }
                return size + i;
            }
            ArrayList<TLObject> arrayList3 = this.searchResultUsernames;
            if (arrayList3 != null) {
                return arrayList3.size();
            }
            ArrayList<String> arrayList4 = this.searchResultHashtags;
            if (arrayList4 != null) {
                return arrayList4.size();
            }
            if (this.searchResultCommands != null || this.quickReplies != null) {
                ArrayList<QuickRepliesController.QuickReply> arrayList5 = this.quickReplies;
                int size2 = arrayList5 == null ? 0 : arrayList5.size();
                ArrayList<String> arrayList6 = this.searchResultCommands;
                return size2 + (arrayList6 != null ? arrayList6.size() : 0);
            }
            ArrayList<MediaDataController.KeywordResult> arrayList7 = this.searchResultSuggestions;
            if (arrayList7 != null) {
                return arrayList7.size();
            }
            return 0;
        }
        return 1;
    }

    @Override
    public int getItemViewType(int i) {
        if (this.stickers != null) {
            return 4;
        }
        if (this.foundContextBot == null || this.inlineMediaEnabled) {
            if (this.searchResultBotContext == null) {
                ArrayList<QuickRepliesController.QuickReply> arrayList = this.quickReplies;
                return (arrayList == null || i < 0 || i >= arrayList.size()) ? 0 : 5;
            } else if (i == 0) {
                return (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? 1 : 2;
            } else {
                return 1;
            }
        }
        return 3;
    }

    public void addHashtagsFromMessage(CharSequence charSequence) {
        this.searchAdapterHelper.addHashtagsFromMessage(charSequence);
    }

    public int getItemPosition(int i) {
        return this.searchResultBotContext != null ? (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? i : i - 1 : i;
    }

    public Object getItemParent(int i) {
        ArrayList<StickerResult> arrayList = this.stickers;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return this.stickers.get(i).parent;
    }

    public Object getItem(int i) {
        ArrayList<StickerResult> arrayList = this.stickers;
        if (arrayList != null) {
            if (i < 0 || i >= arrayList.size()) {
                return null;
            }
            return this.stickers.get(i).sticker;
        }
        ArrayList<TLRPC$BotInlineResult> arrayList2 = this.searchResultBotContext;
        if (arrayList2 != null) {
            TLRPC$TL_inlineBotWebView tLRPC$TL_inlineBotWebView = this.searchResultBotWebViewSwitch;
            if (tLRPC$TL_inlineBotWebView == null) {
                TLRPC$TL_inlineBotSwitchPM tLRPC$TL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                if (tLRPC$TL_inlineBotSwitchPM != null) {
                    if (i == 0) {
                        return tLRPC$TL_inlineBotSwitchPM;
                    }
                }
                if (i >= 0 || i >= arrayList2.size()) {
                    return null;
                }
                return this.searchResultBotContext.get(i);
            } else if (i == 0) {
                return tLRPC$TL_inlineBotWebView;
            }
            i--;
            if (i >= 0) {
            }
            return null;
        }
        ArrayList<TLObject> arrayList3 = this.searchResultUsernames;
        if (arrayList3 != null) {
            if (i < 0 || i >= arrayList3.size()) {
                return null;
            }
            return this.searchResultUsernames.get(i);
        }
        ArrayList<String> arrayList4 = this.searchResultHashtags;
        if (arrayList4 != null) {
            if (i < 0 || i >= arrayList4.size()) {
                return null;
            }
            return this.searchResultHashtags.get(i);
        }
        ArrayList<MediaDataController.KeywordResult> arrayList5 = this.searchResultSuggestions;
        if (arrayList5 != null) {
            if (i < 0 || i >= arrayList5.size()) {
                return null;
            }
            return this.searchResultSuggestions.get(i);
        }
        ArrayList<QuickRepliesController.QuickReply> arrayList6 = this.quickReplies;
        if (arrayList6 != null || this.searchResultCommands != null) {
            if (arrayList6 != null) {
                if (i >= 0 && i < arrayList6.size()) {
                    return this.quickReplies.get(i);
                }
                ArrayList<QuickRepliesController.QuickReply> arrayList7 = this.quickReplies;
                if (arrayList7 != null) {
                    i -= arrayList7.size();
                }
            }
            ArrayList<String> arrayList8 = this.searchResultCommands;
            if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                ArrayList<TLRPC$User> arrayList9 = this.searchResultCommandsUsers;
                if (arrayList9 != null && (this.botsCount != 1 || (this.info instanceof TLRPC$TL_channelFull))) {
                    if (arrayList9.get(i) != null) {
                        Object[] objArr = new Object[2];
                        objArr[0] = this.searchResultCommands.get(i);
                        objArr[1] = this.searchResultCommandsUsers.get(i) != null ? this.searchResultCommandsUsers.get(i).username : BuildConfig.APP_CENTER_HASH;
                        return String.format("%s@%s", objArr);
                    }
                    return String.format("%s", this.searchResultCommands.get(i));
                }
                return this.searchResultCommands.get(i);
            }
        }
        return null;
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

    public void lambda$onCreateViewHolder$10(ContextLinkCell contextLinkCell) {
        this.delegate.onContextClick(contextLinkCell.getResult());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ContextLinkCell contextLinkCell;
        if (i == 0) {
            MentionCell mentionCell = new MentionCell(this.mContext, this.resourcesProvider);
            mentionCell.setIsDarkTheme(this.isDarkTheme);
            contextLinkCell = mentionCell;
        } else if (i == 1) {
            ContextLinkCell contextLinkCell2 = new ContextLinkCell(this.mContext);
            contextLinkCell2.setDelegate(new ContextLinkCell.ContextLinkCellDelegate() {
                @Override
                public final void didPressedImage(ContextLinkCell contextLinkCell3) {
                    MentionsAdapter.this.lambda$onCreateViewHolder$10(contextLinkCell3);
                }
            });
            contextLinkCell = contextLinkCell2;
        } else if (i == 2) {
            contextLinkCell = new BotSwitchCell(this.mContext);
        } else if (i == 3) {
            TextView textView = new TextView(this.mContext);
            textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
            contextLinkCell = textView;
        } else if (i == 5) {
            contextLinkCell = new QuickRepliesActivity.QuickReplyView(this.mContext, false, this.resourcesProvider);
        } else {
            contextLinkCell = new StickerCell(this.mContext, this.resourcesProvider);
        }
        return new RecyclerListView.Holder(contextLinkCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights;
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 4) {
            StickerCell stickerCell = (StickerCell) viewHolder.itemView;
            StickerResult stickerResult = this.stickers.get(i);
            stickerCell.setSticker(stickerResult.sticker, stickerResult.parent);
            stickerCell.setClearsInputField(true);
        } else if (itemViewType == 3) {
            TextView textView = (TextView) viewHolder.itemView;
            TLRPC$Chat currentChat = this.parentFragment.getCurrentChat();
            if (currentChat != null) {
                if (!ChatObject.hasAdminRights(currentChat) && (tLRPC$TL_chatBannedRights = currentChat.default_banned_rights) != null && tLRPC$TL_chatBannedRights.send_inline) {
                    textView.setText(LocaleController.getString("GlobalAttachInlineRestricted", R.string.GlobalAttachInlineRestricted));
                } else if (AndroidUtilities.isBannedForever(currentChat.banned_rights)) {
                    textView.setText(LocaleController.getString("AttachInlineRestrictedForever", R.string.AttachInlineRestrictedForever));
                } else {
                    textView.setText(LocaleController.formatString("AttachInlineRestricted", R.string.AttachInlineRestricted, LocaleController.formatDateForBan(currentChat.banned_rights.until_date)));
                }
            }
        } else if (itemViewType == 5) {
            QuickRepliesActivity.QuickReplyView quickReplyView = (QuickRepliesActivity.QuickReplyView) viewHolder.itemView;
            ArrayList<QuickRepliesController.QuickReply> arrayList = this.quickReplies;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            quickReplyView.set(this.quickReplies.get(i), this.quickRepliesQuery, false);
        } else if (this.searchResultBotContext != null) {
            boolean z = (this.searchResultBotContextSwitch == null && this.searchResultBotWebViewSwitch == null) ? false : true;
            if (viewHolder.getItemViewType() != 2) {
                if (z) {
                    i--;
                }
                ((ContextLinkCell) viewHolder.itemView).setLink(this.searchResultBotContext.get(i), this.foundContextBot, this.contextMedia, i != this.searchResultBotContext.size() - 1, z && i == 0, "gif".equals(this.searchingContextUsername));
            } else if (z) {
                BotSwitchCell botSwitchCell = (BotSwitchCell) viewHolder.itemView;
                TLRPC$TL_inlineBotSwitchPM tLRPC$TL_inlineBotSwitchPM = this.searchResultBotContextSwitch;
                botSwitchCell.setText(tLRPC$TL_inlineBotSwitchPM != null ? tLRPC$TL_inlineBotSwitchPM.text : this.searchResultBotWebViewSwitch.text);
            }
        } else {
            MentionCell mentionCell = (MentionCell) viewHolder.itemView;
            ArrayList<TLObject> arrayList2 = this.searchResultUsernames;
            if (arrayList2 != null) {
                TLObject tLObject = arrayList2.get(i);
                if (tLObject instanceof TLRPC$User) {
                    mentionCell.setUser((TLRPC$User) tLObject);
                } else if (tLObject instanceof TLRPC$Chat) {
                    mentionCell.setChat((TLRPC$Chat) tLObject);
                }
            } else {
                ArrayList<String> arrayList3 = this.searchResultHashtags;
                if (arrayList3 != null) {
                    mentionCell.setText(arrayList3.get(i));
                } else {
                    ArrayList<MediaDataController.KeywordResult> arrayList4 = this.searchResultSuggestions;
                    if (arrayList4 != null) {
                        mentionCell.setEmojiSuggestion(arrayList4.get(i));
                    } else {
                        ArrayList<String> arrayList5 = this.searchResultCommands;
                        if (arrayList5 != null) {
                            String str = arrayList5.get(i);
                            String str2 = this.searchResultCommandsHelp.get(i);
                            ArrayList<TLRPC$User> arrayList6 = this.searchResultCommandsUsers;
                            mentionCell.setBotCommand(str, str2, arrayList6 != null ? arrayList6.get(i) : null);
                        }
                    }
                }
            }
            mentionCell.setDivider(false);
        }
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        TLRPC$User tLRPC$User;
        if (i == 2 && (tLRPC$User = this.foundContextBot) != null && tLRPC$User.bot_inline_geo) {
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
        this.dialog_id = j;
    }

    public void setUserOrChat(TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
        this.user = tLRPC$User;
        this.chat = tLRPC$Chat;
    }

    public void setSearchInDailogs(boolean z) {
        this.searchInDailogs = z;
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
}
