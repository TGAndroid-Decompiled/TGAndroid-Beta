package org.telegram.ui.Stories;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$CC;
import j$.util.function.ToIntFunction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_contacts_block;
import org.telegram.tgnet.TLRPC$TL_contacts_blocked;
import org.telegram.tgnet.TLRPC$TL_contacts_blockedSlice;
import org.telegram.tgnet.TLRPC$TL_contacts_getBlocked;
import org.telegram.tgnet.TLRPC$TL_contacts_setBlocked;
import org.telegram.tgnet.TLRPC$TL_contacts_unblock;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputFileStoryDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaDocument;
import org.telegram.tgnet.TLRPC$TL_inputMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageMediaUnsupported;
import org.telegram.tgnet.TLRPC$TL_messages_chats;
import org.telegram.tgnet.TLRPC$TL_peerBlocked;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmpty;
import org.telegram.tgnet.TLRPC$TL_updateStoryID;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$messages_Chats;
import org.telegram.tgnet.tl.TL_bots$botPreviewMedia;
import org.telegram.tgnet.tl.TL_bots$deletePreviewMedia;
import org.telegram.tgnet.tl.TL_bots$getPreviewInfo;
import org.telegram.tgnet.tl.TL_bots$getPreviewMedias;
import org.telegram.tgnet.tl.TL_bots$previewInfo;
import org.telegram.tgnet.tl.TL_bots$reorderPreviewMedias;
import org.telegram.tgnet.tl.TL_stories$MediaArea;
import org.telegram.tgnet.tl.TL_stories$PeerStories;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$StoryView;
import org.telegram.tgnet.tl.TL_stories$StoryViews;
import org.telegram.tgnet.tl.TL_stories$StoryViewsList;
import org.telegram.tgnet.tl.TL_stories$TL_foundStories;
import org.telegram.tgnet.tl.TL_stories$TL_foundStory;
import org.telegram.tgnet.tl.TL_stories$TL_peerStories;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.tgnet.tl.TL_stories$TL_storiesStealthMode;
import org.telegram.tgnet.tl.TL_stories$TL_stories_allStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_allStoriesNotModified;
import org.telegram.tgnet.tl.TL_stories$TL_stories_canSendStory;
import org.telegram.tgnet.tl.TL_stories$TL_stories_deleteStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getAllStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getPeerStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getPinnedStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesArchive;
import org.telegram.tgnet.tl.TL_stories$TL_stories_getStoriesByID;
import org.telegram.tgnet.tl.TL_stories$TL_stories_incrementStoryViews;
import org.telegram.tgnet.tl.TL_stories$TL_stories_peerStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_readStories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_searchPosts;
import org.telegram.tgnet.tl.TL_stories$TL_stories_sendReaction;
import org.telegram.tgnet.tl.TL_stories$TL_stories_stories;
import org.telegram.tgnet.tl.TL_stories$TL_stories_togglePeerStoriesHidden;
import org.telegram.tgnet.tl.TL_stories$TL_stories_togglePinned;
import org.telegram.tgnet.tl.TL_stories$TL_storyItem;
import org.telegram.tgnet.tl.TL_stories$TL_storyItemDeleted;
import org.telegram.tgnet.tl.TL_stories$TL_storyItemSkipped;
import org.telegram.tgnet.tl.TL_stories$TL_togglePinnedToTop;
import org.telegram.tgnet.tl.TL_stories$TL_updateStory;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

public class StoriesController {
    public static final Comparator storiesComparator = Comparator$CC.comparingInt(new ToIntFunction() {
        @Override
        public final int applyAsInt(Object obj) {
            int i;
            i = ((TL_stories$StoryItem) obj).date;
            return i;
        }
    });
    boolean allHiddenStoriesLoaded;
    boolean allStoriesLoaded;
    private int blocklistCount;
    private int blocklistReqId;
    private final int currentAccount;
    private final DraftsController draftsController;
    boolean hasMore;
    private boolean loadedSendAs;
    boolean loadingFromDatabase;
    private boolean loadingFromServer;
    private boolean loadingFromServerHidden;
    private boolean loadingSendAs;
    SharedPreferences mainSettings;
    public final ArrayList sendAs;
    final Runnable sortStoriesRunnable;
    String state;
    private String stateHidden;
    private TL_stories$TL_storiesStealthMode stealthMode;
    private boolean storiesReadLoaded;
    StoriesStorage storiesStorage;
    private StoryLimit storyLimitCached;
    private boolean storyLimitFetched;
    private int totalStoriesCount;
    private int totalStoriesCountHidden;
    private final LongSparseArray uploadingStoriesByDialogId = new LongSparseArray();
    private final LongSparseArray uploadingAndEditingStories = new LongSparseArray();
    private final LongSparseArray editingStories = new LongSparseArray();
    public LongSparseIntArray dialogIdToMaxReadId = new LongSparseIntArray();
    private ArrayList dialogListStories = new ArrayList();
    private ArrayList hiddenListStories = new ArrayList();
    private LongSparseArray allStoriesMap = new LongSparseArray();
    private LongSparseIntArray loadingDialogsStories = new LongSparseIntArray();
    final LongSparseArray pollingViewsForSelfStoriesRequester = new LongSparseArray();
    public LongSparseArray selfViewsModel = new LongSparseArray();
    private boolean hasMoreHidden = true;
    private boolean firstLoad = true;
    HashSet allStoriesLoading = new HashSet();
    HashSet loadingAllStories = new HashSet();
    LongSparseArray resolvedStories = new LongSparseArray();
    private final HashMap[] storiesLists = new HashMap[5];
    private final Comparator peerStoriesComparator = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            int lambda$new$22;
            lambda$new$22 = StoriesController.this.lambda$new$22((TL_stories$PeerStories) obj, (TL_stories$PeerStories) obj2);
            return lambda$new$22;
        }
    };
    public HashSet blocklist = new HashSet();
    private LongSparseArray blockedOverride = new LongSparseArray();
    public boolean blocklistFull = false;
    private boolean blocklistLoadingReset = false;
    private boolean blocklistLoading = false;
    private long lastBlocklistRequested = 0;

    public class AnonymousClass1 implements RequestDelegate {
        final Consumer val$consumer;
        final long val$hash;

        AnonymousClass1(long j, Consumer consumer) {
            this.val$hash = j;
            this.val$consumer = consumer;
        }

        public void lambda$run$0(TLObject tLObject, long j, Consumer consumer) {
            TL_stories$StoryItem tL_stories$StoryItem;
            if (tLObject != null) {
                TL_stories$TL_stories_stories tL_stories$TL_stories_stories = (TL_stories$TL_stories_stories) tLObject;
                MessagesController.getInstance(StoriesController.this.currentAccount).putUsers(tL_stories$TL_stories_stories.users, false);
                MessagesController.getInstance(StoriesController.this.currentAccount).putChats(tL_stories$TL_stories_stories.chats, false);
                if (tL_stories$TL_stories_stories.stories.size() > 0) {
                    tL_stories$StoryItem = (TL_stories$StoryItem) tL_stories$TL_stories_stories.stories.get(0);
                    StoriesController.this.resolvedStories.put(j, tL_stories$StoryItem);
                    consumer.accept(tL_stories$StoryItem);
                }
            }
            tL_stories$StoryItem = null;
            consumer.accept(tL_stories$StoryItem);
        }

        @Override
        public void run(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            final long j = this.val$hash;
            final Consumer consumer = this.val$consumer;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.AnonymousClass1.this.lambda$run$0(tLObject, j, consumer);
                }
            });
        }
    }

    public static class BotPreview extends TL_stories$StoryItem {
        public final BotPreviewsList list;

        public BotPreview(BotPreviewsList botPreviewsList, long j, TL_bots$botPreviewMedia tL_bots$botPreviewMedia) {
            this.list = botPreviewsList;
            this.dialogId = j;
            TLRPC$MessageMedia tLRPC$MessageMedia = tL_bots$botPreviewMedia.media;
            this.media = tLRPC$MessageMedia;
            TLRPC$Document tLRPC$Document = tLRPC$MessageMedia.document;
            if (tLRPC$Document != null) {
                tLRPC$Document.date = tL_bots$botPreviewMedia.date;
                return;
            }
            TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
            if (tLRPC$Photo != null) {
                tLRPC$Photo.date = tL_bots$botPreviewMedia.date;
            }
        }
    }

    public static class BotPreviewsList extends StoriesList {
        private final ArrayList fakeDays;
        public final String lang_code;
        public final ArrayList lang_codes;
        private int lastId;
        private boolean loaded;
        private boolean loading;
        private int reqId;

        public BotPreviewsList(int i, long j, String str, Utilities.Callback callback) {
            super(i, j, 4, callback, null);
            this.lang_codes = new ArrayList();
            this.fakeDays = new ArrayList();
            this.lastId = 0;
            this.lang_code = str;
        }

        public void lambda$loadInternal$0(TLObject tLObject, Runnable runnable) {
            MessageObject messageObject;
            int id;
            this.reqId = 0;
            this.loading = false;
            this.loaded = true;
            this.done = true;
            ArrayList arrayList = new ArrayList();
            if (tLObject instanceof TLRPC$Vector) {
                Iterator it = ((TLRPC$Vector) tLObject).objects.iterator();
                while (it.hasNext()) {
                    arrayList.add((TL_bots$botPreviewMedia) it.next());
                }
            } else {
                if (!(tLObject instanceof TL_bots$previewInfo)) {
                    return;
                }
                TL_bots$previewInfo tL_bots$previewInfo = (TL_bots$previewInfo) tLObject;
                this.lang_codes.clear();
                this.lang_codes.addAll(tL_bots$previewInfo.lang_codes);
                arrayList.addAll(tL_bots$previewInfo.media);
            }
            ArrayList arrayList2 = new ArrayList(this.messageObjects);
            this.messageObjects.clear();
            this.fakeDays.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TL_bots$botPreviewMedia tL_bots$botPreviewMedia = (TL_bots$botPreviewMedia) it2.next();
                MessageObject messageObject2 = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, tL_bots$botPreviewMedia));
                int i = 0;
                while (true) {
                    if (i >= arrayList2.size()) {
                        messageObject = null;
                        break;
                    } else {
                        if (MessagesController.equals(((MessageObject) arrayList2.get(i)).storyItem.media, tL_bots$botPreviewMedia.media)) {
                            messageObject = (MessageObject) arrayList2.get(i);
                            break;
                        }
                        i++;
                    }
                }
                TL_stories$StoryItem tL_stories$StoryItem = messageObject2.storyItem;
                TLRPC$Message tLRPC$Message = messageObject2.messageOwner;
                if (messageObject == null) {
                    id = this.lastId;
                    this.lastId = id + 1;
                } else {
                    id = messageObject.getId();
                }
                tLRPC$Message.id = id;
                tL_stories$StoryItem.id = id;
                messageObject2.parentStoriesList = this;
                messageObject2.generateThumbs(false);
                if (this.fakeDays.isEmpty()) {
                    this.fakeDays.add(new ArrayList());
                }
                ((ArrayList) this.fakeDays.get(0)).add(Integer.valueOf(messageObject2.getId()));
                this.messageObjects.add(messageObject2);
            }
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) this).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) this).notify);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }

        public void lambda$loadInternal$1(final Runnable runnable, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.BotPreviewsList.this.lambda$loadInternal$0(tLObject, runnable);
                }
            });
        }

        public void lambda$requestReference$2(BotPreview botPreview, Utilities.Callback callback) {
            TL_stories$StoryItem tL_stories$StoryItem;
            TLRPC$MessageMedia tLRPC$MessageMedia;
            TLRPC$Photo tLRPC$Photo;
            for (int i = 0; i < this.messageObjects.size(); i++) {
                MessageObject messageObject = (MessageObject) this.messageObjects.get(i);
                if (messageObject != null && (tL_stories$StoryItem = messageObject.storyItem) != null && (tLRPC$MessageMedia = tL_stories$StoryItem.media) != null) {
                    TLRPC$MessageMedia tLRPC$MessageMedia2 = botPreview.media;
                    TLRPC$Document tLRPC$Document = tLRPC$MessageMedia2.document;
                    if (tLRPC$Document != null) {
                        TLRPC$Document tLRPC$Document2 = tLRPC$MessageMedia.document;
                        if (tLRPC$Document2 == null) {
                            continue;
                        } else if (tLRPC$Document2.id == tLRPC$Document.id) {
                            callback.run((BotPreview) tL_stories$StoryItem);
                            return;
                        }
                    }
                    TLRPC$Photo tLRPC$Photo2 = tLRPC$MessageMedia2.photo;
                    if (tLRPC$Photo2 != null && (tLRPC$Photo = tLRPC$MessageMedia.photo) != null && tLRPC$Photo.id == tLRPC$Photo2.id) {
                        callback.run((BotPreview) tL_stories$StoryItem);
                        return;
                    }
                }
            }
            callback.run(null);
        }

        public void delete(ArrayList arrayList) {
            if (arrayList == null) {
                return;
            }
            int i = 0;
            while (i < this.messageObjects.size()) {
                MessageObject messageObject = (MessageObject) this.messageObjects.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (MessagesController.equals(messageObject.storyItem.media, (TLRPC$MessageMedia) arrayList.get(i2))) {
                        this.messageObjects.remove(i);
                        if (!this.fakeDays.isEmpty() && messageObject.getId() < ((ArrayList) this.fakeDays.get(0)).size()) {
                            ((ArrayList) this.fakeDays.get(0)).remove(messageObject.getId());
                        }
                        i--;
                    } else {
                        i2++;
                    }
                }
                i++;
            }
            TL_bots$deletePreviewMedia tL_bots$deletePreviewMedia = new TL_bots$deletePreviewMedia();
            tL_bots$deletePreviewMedia.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                tL_bots$deletePreviewMedia.media.add(MessagesController.toInputMedia((TLRPC$MessageMedia) arrayList.get(i3)));
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_bots$deletePreviewMedia, null);
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) this).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) this).notify);
        }

        public void delete(TLRPC$MessageMedia tLRPC$MessageMedia) {
            delete(new ArrayList(Arrays.asList(tLRPC$MessageMedia)));
        }

        public void edit(TLRPC$InputMedia tLRPC$InputMedia, TL_bots$botPreviewMedia tL_bots$botPreviewMedia) {
            MessageObject messageObject;
            int id;
            TL_stories$StoryItem tL_stories$StoryItem;
            TLRPC$MessageMedia tLRPC$MessageMedia;
            TLRPC$Document tLRPC$Document;
            int i = 0;
            while (true) {
                if (i >= this.messageObjects.size()) {
                    messageObject = null;
                    i = 0;
                    break;
                }
                messageObject = (MessageObject) this.messageObjects.get(i);
                if (tLRPC$InputMedia != null && (tL_stories$StoryItem = messageObject.storyItem) != null && (tLRPC$MessageMedia = tL_stories$StoryItem.media) != null) {
                    if (!(tLRPC$InputMedia instanceof TLRPC$TL_inputMediaPhoto)) {
                        if ((tLRPC$InputMedia instanceof TLRPC$TL_inputMediaDocument) && (tLRPC$Document = tLRPC$MessageMedia.document) != null && tLRPC$Document.id == ((TLRPC$TL_inputMediaDocument) tLRPC$InputMedia).id.id) {
                            break;
                        }
                    } else {
                        TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
                        if (tLRPC$Photo != null && tLRPC$Photo.id == ((TLRPC$TL_inputMediaPhoto) tLRPC$InputMedia).id.id) {
                            break;
                        }
                    }
                }
                i++;
            }
            if (messageObject != null) {
                this.messageObjects.remove(messageObject);
                if (this.fakeDays.isEmpty()) {
                    this.fakeDays.add(new ArrayList());
                }
                if (i > 0 && i < ((ArrayList) this.fakeDays.get(0)).size()) {
                    ((ArrayList) this.fakeDays.get(0)).remove(i);
                }
            }
            MessageObject messageObject2 = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, tL_bots$botPreviewMedia));
            TL_stories$StoryItem tL_stories$StoryItem2 = messageObject2.storyItem;
            TLRPC$Message tLRPC$Message = messageObject2.messageOwner;
            if (messageObject == null) {
                id = this.lastId;
                this.lastId = id + 1;
            } else {
                id = messageObject.getId();
            }
            tLRPC$Message.id = id;
            tL_stories$StoryItem2.id = id;
            messageObject2.parentStoriesList = this;
            messageObject2.generateThumbs(false);
            if (this.fakeDays.isEmpty()) {
                this.fakeDays.add(new ArrayList());
            }
            ((ArrayList) this.fakeDays.get(0)).add(i, Integer.valueOf(messageObject2.getId()));
            this.messageObjects.add(i, messageObject2);
            notifyUpdate();
        }

        @Override
        public MessageObject findMessageObject(int i) {
            for (int i2 = 0; i2 < this.messageObjects.size(); i2++) {
                if (((MessageObject) this.messageObjects.get(i2)).getId() == i) {
                    return (MessageObject) this.messageObjects.get(i2);
                }
            }
            return null;
        }

        @Override
        public int getCount() {
            return this.messageObjects.size();
        }

        @Override
        protected ArrayList getDays() {
            return this.fakeDays;
        }

        @Override
        public int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override
        protected void invalidateCache() {
        }

        @Override
        public boolean isLoading() {
            return this.loading;
        }

        @Override
        public boolean isOnlyCache() {
            return false;
        }

        @Override
        public boolean load(boolean z, int i, List list) {
            return loadInternal(null);
        }

        public boolean loadInternal(final Runnable runnable) {
            TL_bots$getPreviewMedias tL_bots$getPreviewMedias;
            if (this.loading || this.loaded) {
                return false;
            }
            if (this.lang_code != null) {
                TL_bots$getPreviewInfo tL_bots$getPreviewInfo = new TL_bots$getPreviewInfo();
                tL_bots$getPreviewInfo.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
                tL_bots$getPreviewInfo.lang_code = this.lang_code;
                tL_bots$getPreviewMedias = tL_bots$getPreviewInfo;
            } else {
                TL_bots$getPreviewMedias tL_bots$getPreviewMedias2 = new TL_bots$getPreviewMedias();
                tL_bots$getPreviewMedias2.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
                tL_bots$getPreviewMedias = tL_bots$getPreviewMedias2;
            }
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_bots$getPreviewMedias, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.BotPreviewsList.this.lambda$loadInternal$1(runnable, tLObject, tLRPC$TL_error);
                }
            });
            return true;
        }

        @Override
        protected boolean markAsRead(int i) {
            return false;
        }

        public void notifyUpdate() {
            AndroidUtilities.cancelRunOnUIThread(((StoriesList) this).notify);
            AndroidUtilities.runOnUIThread(((StoriesList) this).notify);
        }

        @Override
        protected void preloadCache() {
        }

        public void push(TL_bots$botPreviewMedia tL_bots$botPreviewMedia) {
            MessageObject messageObject = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, tL_bots$botPreviewMedia));
            TL_stories$StoryItem tL_stories$StoryItem = messageObject.storyItem;
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            int i = this.lastId;
            this.lastId = i + 1;
            tLRPC$Message.id = i;
            tL_stories$StoryItem.id = i;
            messageObject.parentStoriesList = this;
            messageObject.generateThumbs(false);
            if (this.fakeDays.isEmpty()) {
                this.fakeDays.add(new ArrayList());
            }
            ((ArrayList) this.fakeDays.get(0)).add(0, Integer.valueOf(messageObject.getId()));
            this.messageObjects.add(0, messageObject);
            notifyUpdate();
        }

        public void reload(Runnable runnable) {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            this.loading = false;
            this.loaded = false;
            loadInternal(runnable);
        }

        public void requestReference(final BotPreview botPreview, final Utilities.Callback callback) {
            reload(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.BotPreviewsList.this.lambda$requestReference$2(botPreview, callback);
                }
            });
        }

        @Override
        protected void saveCache() {
        }

        @Override
        public void updatePinnedOrder(ArrayList arrayList, boolean z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            TL_bots$reorderPreviewMedias tL_bots$reorderPreviewMedias = new TL_bots$reorderPreviewMedias();
            tL_bots$reorderPreviewMedias.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.dialogId);
            tL_bots$reorderPreviewMedias.lang_code = this.lang_code;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                MessageObject findMessageObject = findMessageObject(num.intValue());
                if (findMessageObject != null) {
                    tL_bots$reorderPreviewMedias.order.add(MessagesController.toInputMedia(findMessageObject.storyItem.media));
                    arrayList2.add(findMessageObject);
                    arrayList3.add(num);
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_bots$reorderPreviewMedias, null);
            if (this.fakeDays.isEmpty()) {
                this.fakeDays.add(new ArrayList());
            }
            ((ArrayList) this.fakeDays.get(0)).clear();
            ((ArrayList) this.fakeDays.get(0)).addAll(arrayList3);
            this.messageObjects.clear();
            this.messageObjects.addAll(arrayList2);
        }
    }

    public static class SearchStoriesList extends StoriesList {
        private int count;
        private final ArrayList fakeDays;
        private String last_offset;
        private boolean loading;
        public final String query;
        public final TL_stories$MediaArea queryArea;
        private int reqId;

        public SearchStoriesList(int i, String str) {
            super(i, 0L, 3, null, null);
            this.fakeDays = new ArrayList();
            this.last_offset = "";
            this.query = str;
            this.queryArea = null;
        }

        public SearchStoriesList(int i, TL_stories$MediaArea tL_stories$MediaArea) {
            super(i, 0L, 3, null, null);
            this.fakeDays = new ArrayList();
            this.last_offset = "";
            this.query = null;
            this.queryArea = tL_stories$MediaArea;
        }

        public void lambda$load$0(TLObject tLObject) {
            this.reqId = 0;
            if (tLObject instanceof TL_stories$TL_foundStories) {
                TL_stories$TL_foundStories tL_stories$TL_foundStories = (TL_stories$TL_foundStories) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_stories$TL_foundStories.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_stories$TL_foundStories.chats, false);
                Iterator it = tL_stories$TL_foundStories.stories.iterator();
                while (it.hasNext()) {
                    TL_stories$TL_foundStory tL_stories$TL_foundStory = (TL_stories$TL_foundStory) it.next();
                    tL_stories$TL_foundStory.storyItem.dialogId = DialogObject.getPeerDialogId(tL_stories$TL_foundStory.peer);
                    tL_stories$TL_foundStory.storyItem.messageId = this.messageObjects.size();
                    MessageObject messageObject = new MessageObject(this.currentAccount, tL_stories$TL_foundStory.storyItem);
                    messageObject.generateThumbs(false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(this.messageObjects.size()));
                    this.fakeDays.add(arrayList);
                    this.messageObjects.add(messageObject);
                }
                this.count = Math.max(this.messageObjects.size(), tL_stories$TL_foundStories.count);
                if (tL_stories$TL_foundStories.stories.isEmpty()) {
                    this.count = this.messageObjects.size();
                }
                this.last_offset = (this.messageObjects.size() >= tL_stories$TL_foundStories.count || tL_stories$TL_foundStories.stories.isEmpty()) ? null : tL_stories$TL_foundStories.next_offset;
                this.loading = false;
                AndroidUtilities.cancelRunOnUIThread(((StoriesList) this).notify);
                AndroidUtilities.runOnUIThread(((StoriesList) this).notify);
            }
        }

        public void lambda$load$1(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.SearchStoriesList.this.lambda$load$0(tLObject);
                }
            });
        }

        public void cancel() {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
        }

        @Override
        public MessageObject findMessageObject(int i) {
            if (i < 0 || i >= this.messageObjects.size()) {
                return null;
            }
            return (MessageObject) this.messageObjects.get(i);
        }

        @Override
        public int getCount() {
            return this.count;
        }

        @Override
        protected ArrayList getDays() {
            return this.fakeDays;
        }

        @Override
        public int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override
        protected void invalidateCache() {
        }

        @Override
        public boolean isLoading() {
            return this.loading;
        }

        @Override
        public boolean isOnlyCache() {
            return false;
        }

        @Override
        public boolean load(boolean z, int i, List list) {
            if (this.loading || this.last_offset == null) {
                return false;
            }
            TL_stories$TL_stories_searchPosts tL_stories$TL_stories_searchPosts = new TL_stories$TL_stories_searchPosts();
            tL_stories$TL_stories_searchPosts.offset = this.last_offset;
            tL_stories$TL_stories_searchPosts.limit = i;
            String str = this.query;
            if (str != null) {
                tL_stories$TL_stories_searchPosts.flags |= 1;
                tL_stories$TL_stories_searchPosts.hashtag = str;
            }
            TL_stories$MediaArea tL_stories$MediaArea = this.queryArea;
            if (tL_stories$MediaArea != null) {
                tL_stories$TL_stories_searchPosts.flags |= 2;
                tL_stories$TL_stories_searchPosts.area = tL_stories$MediaArea;
            }
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_searchPosts, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.SearchStoriesList.this.lambda$load$1(tLObject, tLRPC$TL_error);
                }
            });
            return true;
        }

        @Override
        protected boolean markAsRead(int i) {
            return false;
        }

        @Override
        protected void preloadCache() {
        }

        @Override
        protected void saveCache() {
        }
    }

    public static class StoriesList {
        private static HashMap lastLoadTime;
        private final SortedSet cachedObjects;
        public final int currentAccount;
        private final Runnable destroyRunnable;
        public final long dialogId;
        public boolean done;
        private boolean error;
        public final HashMap groupedByDay;
        private boolean invalidateAfterPreload;
        private final ArrayList links;
        private final SortedSet loadedObjects;
        private boolean loading;
        private int maxLinkId;
        public final ArrayList messageObjects;
        private final HashMap messageObjectsMap;
        private final Runnable notify;
        public final ArrayList pinnedIds;
        protected boolean preloading;
        private boolean saving;
        public final HashSet seenStories;
        private boolean showPhotos;
        private boolean showVideos;
        private final ArrayList tempArr;
        protected Utilities.CallbackReturn toLoad;
        private int totalCount;
        public final int type;

        private StoriesList(int i, long j, int i2, final Utilities.Callback callback) {
            this.maxLinkId = 0;
            this.links = new ArrayList();
            this.pinnedIds = new ArrayList();
            this.groupedByDay = new HashMap();
            this.messageObjects = new ArrayList();
            this.messageObjectsMap = new HashMap();
            this.cachedObjects = new TreeSet(Comparator$CC.reverseOrder());
            this.loadedObjects = new TreeSet(Comparator$CC.reverseOrder());
            this.seenStories = new HashSet();
            this.showPhotos = true;
            this.showVideos = true;
            this.tempArr = new ArrayList();
            this.notify = new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$new$0();
                }
            };
            this.totalCount = -1;
            this.currentAccount = i;
            this.dialogId = j;
            this.type = i2;
            this.destroyRunnable = new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$new$1(callback);
                }
            };
            preloadCache();
        }

        StoriesList(int i, long j, int i2, Utilities.Callback callback, AnonymousClass1 anonymousClass1) {
            this(i, j, i2, callback);
        }

        public static long day(MessageObject messageObject) {
            if (messageObject == null) {
                return 0L;
            }
            long j = messageObject.messageOwner.date;
            Calendar.getInstance().setTimeInMillis(j * 1000);
            return (r6.get(1) * 10000) + (r6.get(2) * 100) + r6.get(5);
        }

        private boolean filter(MessageObject messageObject, boolean z, boolean z2) {
            return messageObject != null && messageObject.isStory() && ((z && messageObject.isPhoto()) || ((z2 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC$TL_messageMediaUnsupported)));
        }

        public static int lambda$getDays$4(Long l, Long l2) {
            return (int) (l2.longValue() - l.longValue());
        }

        public void lambda$invalidateCache$5() {
            this.cachedObjects.clear();
            fill(true);
        }

        public void lambda$invalidateCache$6(MessagesStorage messagesStorage) {
            try {
                messagesStorage.getDatabase().executeFast(String.format(Locale.US, "DELETE FROM profile_stories WHERE dialog_id = %d AND type = %d", Long.valueOf(this.dialogId), Integer.valueOf(this.type))).stepThis().dispose();
            } catch (Throwable th) {
                messagesStorage.checkSQLException(th);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$invalidateCache$5();
                }
            });
        }

        public Boolean lambda$load$10(boolean z, int i, List list, Integer num) {
            return Boolean.valueOf(load(z, i, list));
        }

        public void lambda$load$11(ArrayList arrayList, TL_stories$TL_stories_stories tL_stories$TL_stories_stories, int i) {
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} loaded {" + StoriesController.storyItemMessageIds(arrayList) + "}");
            this.pinnedIds.clear();
            this.pinnedIds.addAll(tL_stories$TL_stories_stories.pinned_to_top);
            MessagesController.getInstance(this.currentAccount).putUsers(tL_stories$TL_stories_stories.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_stories$TL_stories_stories.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_stories$TL_stories_stories.users, tL_stories$TL_stories_stories.chats, true, true);
            this.loading = false;
            this.totalCount = tL_stories$TL_stories_stories.count;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                pushObject((MessageObject) arrayList.get(i2), false);
            }
            boolean z = this.loadedObjects.size() >= this.totalCount;
            this.done = z;
            if (z) {
                Iterator it = this.cachedObjects.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    int intValue = num.intValue();
                    if (!this.loadedObjects.contains(num)) {
                        it.remove();
                        removeObject(intValue, false);
                    }
                }
            } else {
                if (i == -1) {
                    i = firstLoadedId();
                }
                int lastLoadedId = lastLoadedId();
                Iterator it2 = this.cachedObjects.iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    int intValue2 = num2.intValue();
                    if (!this.loadedObjects.contains(num2) && intValue2 >= i && intValue2 <= lastLoadedId) {
                        it2.remove();
                        removeObject(intValue2, false);
                    }
                }
            }
            fill(true);
            if (this.done) {
                if (lastLoadTime == null) {
                    lastLoadTime = new HashMap();
                }
                lastLoadTime.put(Integer.valueOf(Objects.hash(Integer.valueOf(this.currentAccount), Integer.valueOf(this.type), Long.valueOf(this.dialogId))), Long.valueOf(System.currentTimeMillis()));
            } else {
                resetCanLoad();
            }
            saveCache();
        }

        public void lambda$load$12() {
            this.loading = false;
            this.error = true;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this, Boolean.FALSE);
        }

        public void lambda$load$13(final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (!(tLObject instanceof TL_stories$TL_stories_stories)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoriesController.StoriesList.this.lambda$load$12();
                    }
                });
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final TL_stories$TL_stories_stories tL_stories$TL_stories_stories = (TL_stories$TL_stories_stories) tLObject;
            for (int i2 = 0; i2 < tL_stories$TL_stories_stories.stories.size(); i2++) {
                arrayList.add(toMessageObject((TL_stories$StoryItem) tL_stories$TL_stories_stories.stories.get(i2), tL_stories$TL_stories_stories));
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$load$11(arrayList, tL_stories$TL_stories_stories, i);
                }
            });
        }

        public static void lambda$markAsRead$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        public void lambda$new$0() {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
        }

        public void lambda$new$1(Utilities.Callback callback) {
            callback.run(this);
        }

        public void lambda$preloadCache$2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet) {
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} preloadCache {" + StoriesController.storyItemMessageIds(arrayList) + "}");
            this.pinnedIds.clear();
            this.pinnedIds.addAll(arrayList2);
            this.preloading = false;
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList3, true);
            MessagesController.getInstance(this.currentAccount).putChats(arrayList4, true);
            if (this.invalidateAfterPreload) {
                this.invalidateAfterPreload = false;
                this.toLoad = null;
                invalidateCache();
                return;
            }
            this.seenStories.addAll(hashSet);
            this.cachedObjects.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                pushObject((MessageObject) arrayList.get(i), true);
            }
            fill(false);
            Utilities.CallbackReturn callbackReturn = this.toLoad;
            if (callbackReturn != null) {
                callbackReturn.run(0);
                this.toLoad = null;
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
        }

        public void lambda$preloadCache$3(org.telegram.messenger.MessagesStorage r22) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.StoriesList.lambda$preloadCache$3(org.telegram.messenger.MessagesStorage):void");
        }

        public void lambda$saveCache$7() {
            this.saving = false;
        }

        public void lambda$saveCache$8(java.util.ArrayList r11, org.telegram.messenger.MessagesStorage r12, java.util.ArrayList r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.StoriesList.lambda$saveCache$8(java.util.ArrayList, org.telegram.messenger.MessagesStorage, java.util.ArrayList):void");
        }

        public static void lambda$updatePinned$14() {
        }

        public static void lambda$updatePinned$15(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.lambda$updatePinned$14();
                }
            });
        }

        public static void lambda$updatePinnedOrder$16() {
        }

        public static void lambda$updatePinnedOrder$17(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.lambda$updatePinnedOrder$16();
                }
            });
        }

        private void pushObject(MessageObject messageObject, boolean z) {
            if (messageObject == null) {
                return;
            }
            this.messageObjectsMap.put(Integer.valueOf(messageObject.getId()), messageObject);
            (z ? this.cachedObjects : this.loadedObjects).add(Integer.valueOf(messageObject.getId()));
            long day = day(messageObject);
            TreeSet treeSet = (TreeSet) this.groupedByDay.get(Long.valueOf(day));
            if (treeSet == null) {
                HashMap hashMap = this.groupedByDay;
                Long valueOf = Long.valueOf(day);
                TreeSet treeSet2 = new TreeSet(Comparator$CC.reverseOrder());
                hashMap.put(valueOf, treeSet2);
                treeSet = treeSet2;
            }
            treeSet.add(Integer.valueOf(messageObject.getId()));
        }

        private boolean removeObject(int i, boolean z) {
            MessageObject messageObject = (MessageObject) this.messageObjectsMap.remove(Integer.valueOf(i));
            if (z) {
                this.cachedObjects.remove(Integer.valueOf(i));
            }
            this.loadedObjects.remove(Integer.valueOf(i));
            this.pinnedIds.remove(Integer.valueOf(i));
            if (messageObject == null) {
                return false;
            }
            long day = day(messageObject);
            Collection collection = (Collection) this.groupedByDay.get(Long.valueOf(day));
            if (collection == null) {
                return true;
            }
            collection.remove(Integer.valueOf(i));
            if (!collection.isEmpty()) {
                return true;
            }
            this.groupedByDay.remove(Long.valueOf(day));
            return true;
        }

        private MessageObject toMessageObject(TL_stories$StoryItem tL_stories$StoryItem, TL_stories$TL_stories_stories tL_stories$TL_stories_stories) {
            tL_stories$StoryItem.dialogId = this.dialogId;
            tL_stories$StoryItem.messageId = tL_stories$StoryItem.id;
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_stories$StoryItem);
            messageObject.generateThumbs(false);
            return messageObject;
        }

        protected boolean canLoad() {
            Long l;
            return lastLoadTime == null || (l = (Long) lastLoadTime.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.currentAccount), Integer.valueOf(this.type), Long.valueOf(this.dialogId))))) == null || System.currentTimeMillis() - l.longValue() > 120000;
        }

        public boolean equal(TL_stories$StoryItem tL_stories$StoryItem, TL_stories$StoryItem tL_stories$StoryItem2) {
            if (tL_stories$StoryItem == null && tL_stories$StoryItem2 == null) {
                return true;
            }
            if ((tL_stories$StoryItem == null) != (tL_stories$StoryItem2 == null)) {
                return false;
            }
            if (tL_stories$StoryItem != tL_stories$StoryItem2) {
                return tL_stories$StoryItem.id == tL_stories$StoryItem2.id && tL_stories$StoryItem.media == tL_stories$StoryItem2.media && TextUtils.equals(tL_stories$StoryItem.caption, tL_stories$StoryItem2.caption);
            }
            return true;
        }

        public void fill(ArrayList arrayList, boolean z, boolean z2) {
            this.tempArr.clear();
            if (this.type == 0) {
                Iterator it = this.pinnedIds.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    MessageObject messageObject = (MessageObject) this.messageObjectsMap.get(num);
                    if (filter(messageObject, z, z2)) {
                        this.tempArr.add(messageObject);
                    }
                }
            }
            int i = Integer.MAX_VALUE;
            for (Integer num2 : this.loadedObjects) {
                int intValue = num2.intValue();
                MessageObject messageObject2 = (MessageObject) this.messageObjectsMap.get(num2);
                if (this.type != 0 || !this.pinnedIds.contains(num2)) {
                    if (filter(messageObject2, z, z2)) {
                        this.tempArr.add(messageObject2);
                    }
                    if (intValue < i) {
                        i = intValue;
                    }
                }
            }
            if (!this.done) {
                Iterator it2 = this.cachedObjects.iterator();
                while (it2.hasNext() && (this.totalCount == -1 || this.tempArr.size() < this.totalCount)) {
                    Integer num3 = (Integer) it2.next();
                    int intValue2 = num3.intValue();
                    if (this.type != 0 || !this.pinnedIds.contains(num3)) {
                        if (i == Integer.MAX_VALUE || intValue2 < i) {
                            MessageObject messageObject3 = (MessageObject) this.messageObjectsMap.get(num3);
                            if (filter(messageObject3, z, z2)) {
                                this.tempArr.add(messageObject3);
                            }
                        }
                    }
                }
            }
            arrayList.clear();
            arrayList.addAll(this.tempArr);
        }

        public void fill(boolean z) {
            fill(this.messageObjects, this.showPhotos, this.showVideos);
            if (z) {
                AndroidUtilities.cancelRunOnUIThread(this.notify);
                AndroidUtilities.runOnUIThread(this.notify);
            }
        }

        public MessageObject findMessageObject(int i) {
            return (MessageObject) this.messageObjectsMap.get(Integer.valueOf(i));
        }

        public int firstLoadedId() {
            if (this.loadedObjects.isEmpty()) {
                return -1;
            }
            ArrayList arrayList = new ArrayList(this.loadedObjects);
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                int intValue = num.intValue();
                if (!this.pinnedIds.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }

        public int getCount() {
            return (this.showVideos && this.showPhotos) ? this.totalCount < 0 ? this.messageObjects.size() : Math.max(this.messageObjects.size(), this.totalCount) : this.messageObjects.size();
        }

        public ArrayList getDays() {
            ArrayList arrayList = new ArrayList(this.groupedByDay.keySet());
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$getDays$4;
                    lambda$getDays$4 = StoriesController.StoriesList.lambda$getDays$4((Long) obj, (Long) obj2);
                    return lambda$getDays$4;
                }
            });
            ArrayList arrayList2 = new ArrayList();
            if (this.type == 0 && !this.pinnedIds.isEmpty()) {
                arrayList2.add(new ArrayList(this.pinnedIds));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TreeSet treeSet = (TreeSet) this.groupedByDay.get((Long) it.next());
                if (treeSet != null) {
                    ArrayList arrayList3 = new ArrayList(treeSet);
                    if (this.type == 0 && !this.pinnedIds.isEmpty()) {
                        Iterator it2 = this.pinnedIds.iterator();
                        while (it2.hasNext()) {
                            Integer num = (Integer) it2.next();
                            num.intValue();
                            arrayList3.remove(num);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList2.add(arrayList3);
                    }
                }
            }
            return arrayList2;
        }

        public int getLoadedCount() {
            return this.loadedObjects.size();
        }

        protected void invalidateCache() {
            if (this.preloading) {
                this.invalidateAfterPreload = true;
                return;
            }
            resetCanLoad();
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$invalidateCache$6(messagesStorage);
                }
            });
        }

        public boolean isFull() {
            return this.done;
        }

        public boolean isLoading() {
            return this.preloading || this.loading;
        }

        public boolean isOnlyCache() {
            return this.loadedObjects.isEmpty() && canLoad();
        }

        public boolean isPinned(int i) {
            if (this.type != 0) {
                return false;
            }
            return this.pinnedIds.contains(Integer.valueOf(i));
        }

        public int lastLoadedId() {
            if (this.loadedObjects.isEmpty()) {
                return -1;
            }
            ArrayList arrayList = new ArrayList(this.loadedObjects);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int intValue = num.intValue();
                if (!this.pinnedIds.contains(num)) {
                    return intValue;
                }
            }
            return -1;
        }

        public int link() {
            int i = this.maxLinkId;
            this.maxLinkId = i + 1;
            this.links.add(Integer.valueOf(i));
            Runnable runnable = this.destroyRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            return i;
        }

        public boolean load(List list) {
            boolean z;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (!this.messageObjectsMap.containsKey((Integer) it.next())) {
                    z = true;
                    break;
                }
            }
            return load(z, 0, list);
        }

        public boolean load(boolean z, int i) {
            return load(z, i, Collections.emptyList());
        }

        public boolean load(final boolean z, final int i, final List list) {
            final int lastLoadedId;
            TL_stories$TL_stories_getStoriesArchive tL_stories$TL_stories_getStoriesArchive;
            if (this.loading || ((this.done || this.error || !canLoad()) && !z)) {
                return false;
            }
            if (this.preloading) {
                this.toLoad = new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        Boolean lambda$load$10;
                        lambda$load$10 = StoriesController.StoriesList.this.lambda$load$10(z, i, list, (Integer) obj);
                        return lambda$load$10;
                    }
                };
                return false;
            }
            int i2 = this.type;
            if (i2 == 0) {
                TL_stories$TL_stories_getPinnedStories tL_stories$TL_stories_getPinnedStories = new TL_stories$TL_stories_getPinnedStories();
                tL_stories$TL_stories_getPinnedStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                lastLoadedId = lastLoadedId();
                tL_stories$TL_stories_getPinnedStories.offset_id = lastLoadedId;
                tL_stories$TL_stories_getPinnedStories.limit = i;
                tL_stories$TL_stories_getStoriesArchive = tL_stories$TL_stories_getPinnedStories;
            } else if (i2 == 2) {
                TL_stories$TL_stories_getStoriesByID tL_stories$TL_stories_getStoriesByID = new TL_stories$TL_stories_getStoriesByID();
                tL_stories$TL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_stories$TL_stories_getStoriesByID.id.addAll(list);
                lastLoadedId = -1;
                tL_stories$TL_stories_getStoriesArchive = tL_stories$TL_stories_getStoriesByID;
            } else {
                TL_stories$TL_stories_getStoriesArchive tL_stories$TL_stories_getStoriesArchive2 = new TL_stories$TL_stories_getStoriesArchive();
                tL_stories$TL_stories_getStoriesArchive2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                lastLoadedId = lastLoadedId();
                tL_stories$TL_stories_getStoriesArchive2.offset_id = lastLoadedId;
                tL_stories$TL_stories_getStoriesArchive2.limit = i;
                tL_stories$TL_stories_getStoriesArchive = tL_stories$TL_stories_getStoriesArchive2;
            }
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} load");
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_getStoriesArchive, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.StoriesList.this.lambda$load$13(lastLoadedId, tLObject, tLRPC$TL_error);
                }
            });
            return true;
        }

        public boolean markAsRead(int i) {
            if (this.seenStories.contains(Integer.valueOf(i))) {
                return false;
            }
            this.seenStories.add(Integer.valueOf(i));
            saveCache();
            TL_stories$TL_stories_incrementStoryViews tL_stories$TL_stories_incrementStoryViews = new TL_stories$TL_stories_incrementStoryViews();
            tL_stories$TL_stories_incrementStoryViews.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_stories$TL_stories_incrementStoryViews.id.add(Integer.valueOf(i));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_incrementStoryViews, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.StoriesList.lambda$markAsRead$9(tLObject, tLRPC$TL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
            return true;
        }

        protected void preloadCache() {
            if (this.preloading || this.loading || this.error) {
                return;
            }
            this.preloading = true;
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$preloadCache$3(messagesStorage);
                }
            });
        }

        protected void resetCanLoad() {
            HashMap hashMap = lastLoadTime;
            if (hashMap != null) {
                hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.currentAccount), Integer.valueOf(this.type), Long.valueOf(this.dialogId))));
            }
        }

        protected void saveCache() {
            if (this.saving) {
                return;
            }
            this.saving = true;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList(this.pinnedIds);
            fill(arrayList, true, true);
            final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.StoriesList.this.lambda$saveCache$8(arrayList, messagesStorage, arrayList2);
                }
            });
        }

        public boolean showPhotos() {
            return this.showPhotos;
        }

        public boolean showVideos() {
            return this.showVideos;
        }

        public void unlink(int i) {
            Runnable runnable;
            this.links.remove(Integer.valueOf(i));
            if (!this.links.isEmpty() || (runnable = this.destroyRunnable) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(this.destroyRunnable, 300000L);
        }

        public void updateDeletedStories(List list) {
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} updateDeletedStories {" + StoriesController.storyItemIds(list) + "}");
            if (list == null) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) list.get(i);
                if (tL_stories$StoryItem != null) {
                    if (this.loadedObjects.contains(Integer.valueOf(tL_stories$StoryItem.id)) || this.cachedObjects.contains(Integer.valueOf(tL_stories$StoryItem.id))) {
                        this.loadedObjects.remove(Integer.valueOf(tL_stories$StoryItem.id));
                        this.cachedObjects.remove(Integer.valueOf(tL_stories$StoryItem.id));
                        int i2 = this.totalCount;
                        if (i2 != -1) {
                            this.totalCount = i2 - 1;
                        }
                        z = true;
                    }
                    removeObject(tL_stories$StoryItem.id, true);
                }
            }
            if (z) {
                fill(true);
                saveCache();
            }
        }

        public void updateFilters(boolean z, boolean z2) {
            this.showPhotos = z;
            this.showVideos = z2;
            fill(true);
        }

        public boolean updatePinned(ArrayList arrayList, boolean z) {
            int i;
            ArrayList arrayList2 = new ArrayList(this.pinnedIds);
            int size = arrayList.size() - 1;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                Integer num = (Integer) arrayList.get(size);
                num.intValue();
                if (z && !arrayList2.contains(num)) {
                    arrayList2.add(0, num);
                } else if (!z && arrayList2.contains(num)) {
                    arrayList2.remove(num);
                }
                size--;
            }
            boolean z2 = arrayList2.size() > MessagesController.getInstance(this.currentAccount).storiesPinnedToTopCountMax;
            if (z2) {
                return true;
            }
            boolean z3 = this.pinnedIds.size() != arrayList2.size();
            if (!z3) {
                while (true) {
                    if (i >= this.pinnedIds.size()) {
                        break;
                    }
                    if (this.pinnedIds.get(i) != arrayList2.get(i)) {
                        z3 = true;
                        break;
                    }
                    i++;
                }
            }
            if (z3) {
                this.pinnedIds.clear();
                this.pinnedIds.addAll(arrayList2);
                fill(true);
                TL_stories$TL_togglePinnedToTop tL_stories$TL_togglePinnedToTop = new TL_stories$TL_togglePinnedToTop();
                tL_stories$TL_togglePinnedToTop.id.addAll(this.pinnedIds);
                tL_stories$TL_togglePinnedToTop.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_togglePinnedToTop, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StoriesController.StoriesList.lambda$updatePinned$15(tLObject, tLRPC$TL_error);
                    }
                });
            }
            return z2;
        }

        public void updatePinnedOrder(ArrayList arrayList, boolean z) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = MessagesController.getInstance(this.currentAccount).storiesPinnedToTopCountMax;
            if (arrayList2.size() > i) {
                arrayList2.subList(i, arrayList2.size()).clear();
            }
            if (this.pinnedIds.size() == arrayList2.size()) {
                for (int i2 = 0; i2 < this.pinnedIds.size() && this.pinnedIds.get(i2) == arrayList2.get(i2); i2++) {
                }
            }
            this.pinnedIds.clear();
            this.pinnedIds.addAll(arrayList2);
            fill(false);
            if (z) {
                TL_stories$TL_togglePinnedToTop tL_stories$TL_togglePinnedToTop = new TL_stories$TL_togglePinnedToTop();
                tL_stories$TL_togglePinnedToTop.id.addAll(this.pinnedIds);
                tL_stories$TL_togglePinnedToTop.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_togglePinnedToTop, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StoriesController.StoriesList.lambda$updatePinnedOrder$17(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }

        public void updateStories(List list) {
            MessageObject messageObject;
            int i;
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} updateStories {" + StoriesController.storyItemIds(list) + "}");
            if (list == null) {
                return;
            }
            boolean z = false;
            for (int i2 = 0; i2 < list.size(); i2++) {
                TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) list.get(i2);
                if (tL_stories$StoryItem != null) {
                    boolean z2 = this.loadedObjects.contains(Integer.valueOf(tL_stories$StoryItem.id)) || this.cachedObjects.contains(Integer.valueOf(tL_stories$StoryItem.id));
                    boolean z3 = this.type == 1 ? true : tL_stories$StoryItem.pinned;
                    if (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) {
                        z3 = false;
                    }
                    if (z2 != z3) {
                        if (z3) {
                            FileLog.d("StoriesList put story " + tL_stories$StoryItem.id);
                            pushObject(toMessageObject(tL_stories$StoryItem, null), false);
                            int i3 = this.totalCount;
                            if (i3 != -1) {
                                i = i3 + 1;
                                this.totalCount = i;
                            }
                        } else {
                            FileLog.d("StoriesList remove story " + tL_stories$StoryItem.id);
                            removeObject(tL_stories$StoryItem.id, true);
                            int i4 = this.totalCount;
                            if (i4 != -1) {
                                i = i4 - 1;
                                this.totalCount = i;
                            }
                        }
                    } else if (z2 && z3 && ((messageObject = (MessageObject) this.messageObjectsMap.get(Integer.valueOf(tL_stories$StoryItem.id))) == null || !equal(messageObject.storyItem, tL_stories$StoryItem))) {
                        FileLog.d("StoriesList update story " + tL_stories$StoryItem.id);
                        this.messageObjectsMap.put(Integer.valueOf(tL_stories$StoryItem.id), toMessageObject(tL_stories$StoryItem, null));
                    }
                    z = true;
                }
            }
            if (z) {
                fill(true);
                saveCache();
            }
        }

        public void updateStoryViews(List list, ArrayList arrayList) {
            TL_stories$StoryItem tL_stories$StoryItem;
            if (list == null || arrayList == null) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                num.intValue();
                if (i >= arrayList.size()) {
                    break;
                }
                TL_stories$StoryViews tL_stories$StoryViews = (TL_stories$StoryViews) arrayList.get(i);
                MessageObject messageObject = (MessageObject) this.messageObjectsMap.get(num);
                if (messageObject != null && (tL_stories$StoryItem = messageObject.storyItem) != null) {
                    tL_stories$StoryItem.views = tL_stories$StoryViews;
                    z = true;
                }
            }
            if (z) {
                saveCache();
            }
        }
    }

    public static class StoryLimit {
        public int type;
        public long until;

        public StoryLimit(int i, long j) {
            this.type = i;
            this.until = j;
        }

        public boolean active(int i) {
            int i2 = this.type;
            return !(i2 == 2 || i2 == 3) || ((long) ConnectionsManager.getInstance(i).getCurrentTime()) < this.until;
        }

        public int getLimitReachedType() {
            int i = this.type;
            if (i != 2) {
                return i != 3 ? 14 : 16;
            }
            return 15;
        }
    }

    public class UploadingStory implements NotificationCenter.NotificationCenterDelegate {
        boolean canceled;
        float convertingProgress;
        private int currentRequest;
        long dialogId;
        private long duration;
        public final boolean edit;
        public final StoryEntry entry;
        private boolean entryDestroyed;
        public boolean failed;
        public String firstFramePath;
        public boolean hadFailed;
        public VideoEditedInfo info;
        public boolean isCloseFriends;
        boolean isVideo;
        public MessageObject messageObject;
        String path;
        private TL_bots$botPreviewMedia previewMedia;
        public float progress;
        public boolean putMessages;
        boolean ready;
        public MessageObject sharedMessageObject;
        float uploadProgress;
        private long firstSecondSize = -1;
        public final long random_id = Utilities.random.nextLong();

        public UploadingStory(StoryEntry storyEntry) {
            long peerDialogId;
            this.entry = storyEntry;
            this.edit = storyEntry.isEdit;
            File file = storyEntry.uploadThumbFile;
            if (file != null) {
                this.firstFramePath = file.getAbsolutePath();
            }
            boolean z = storyEntry.isError;
            this.hadFailed = z;
            this.failed = z;
            long j = storyEntry.botId;
            if (j != 0) {
                this.dialogId = j;
                return;
            }
            if (storyEntry.isEdit) {
                peerDialogId = storyEntry.editStoryPeerId;
            } else {
                TLRPC$InputPeer tLRPC$InputPeer = storyEntry.peer;
                peerDialogId = (tLRPC$InputPeer == null || (tLRPC$InputPeer instanceof TLRPC$TL_inputPeerSelf)) ? UserConfig.getInstance(StoriesController.this.currentAccount).clientUserId : DialogObject.getPeerDialogId(tLRPC$InputPeer);
            }
            this.dialogId = peerDialogId;
        }

        public void lambda$sendUploadedRequest$3(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda5(StoriesController.this));
        }

        public void lambda$sendUploadedRequest$4(TL_stories$TL_updateStory tL_stories$TL_updateStory) {
            MessagesController.getInstance(StoriesController.this.currentAccount).getStoriesController().processUpdate(tL_stories$TL_updateStory);
        }

        public void lambda$sendUploadedRequest$5(long j, TL_stories$StoryItem tL_stories$StoryItem) {
            this.entryDestroyed = true;
            if (this.entry.isError) {
                StoriesController.this.getDraftsController().delete(this.entry);
            }
            StoryEntry storyEntry = this.entry;
            storyEntry.isError = false;
            storyEntry.error = null;
            if (!storyEntry.isEditingCover) {
                StoriesController.this.getDraftsController().saveForEdit(this.entry, j, tL_stories$StoryItem);
            }
            if (this.edit) {
                return;
            }
            StoriesController.this.invalidateStoryLimit();
        }

        public void lambda$sendUploadedRequest$6(TLRPC$Document tLRPC$Document) {
            this.entry.editingCoverDocument = tLRPC$Document;
            TLRPC$TL_inputFileStoryDocument tLRPC$TL_inputFileStoryDocument = new TLRPC$TL_inputFileStoryDocument();
            tLRPC$TL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.entry.editingCoverDocument);
            sendUploadedRequest(tLRPC$TL_inputFileStoryDocument);
        }

        public void lambda$sendUploadedRequest$7(TLRPC$TL_error tLRPC$TL_error) {
            this.entry.isError = true;
            if (StoriesController.this.checkStoryError(tLRPC$TL_error)) {
                this.entry.error = null;
            } else {
                this.entry.error = tLRPC$TL_error;
            }
            this.entryDestroyed = true;
            this.failed = true;
            this.hadFailed = true;
            StoriesController.this.getDraftsController().edit(this.entry);
        }

        public void lambda$sendUploadedRequest$8(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            Utilities.Callback callback;
            if (tLObject instanceof TLRPC$Updates) {
                this.failed = false;
                TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
                if (this.entry.isEditingCover) {
                    MessagesController.getInstance(StoriesController.this.currentAccount).processUpdates(tLRPC$Updates, false);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StoriesController.UploadingStory.this.cleanup();
                        }
                    });
                    return;
                }
                final TL_stories$StoryItem tL_stories$StoryItem = null;
                int i = 0;
                for (int i2 = 0; i2 < tLRPC$Updates.updates.size(); i2++) {
                    if (tLRPC$Updates.updates.get(i2) instanceof TL_stories$TL_updateStory) {
                        TL_stories$StoryItem tL_stories$StoryItem2 = ((TL_stories$TL_updateStory) tLRPC$Updates.updates.get(i2)).story;
                        tL_stories$StoryItem2.attachPath = this.path;
                        tL_stories$StoryItem2.firstFramePath = this.firstFramePath;
                        tL_stories$StoryItem2.justUploaded = !this.edit;
                        int i3 = tL_stories$StoryItem2.id;
                        if (tL_stories$StoryItem == null) {
                            tL_stories$StoryItem = tL_stories$StoryItem2;
                        } else {
                            tL_stories$StoryItem.media = tL_stories$StoryItem2.media;
                        }
                        i = i3;
                    }
                    if (tLRPC$Updates.updates.get(i2) instanceof TLRPC$TL_updateStoryID) {
                        TLRPC$TL_updateStoryID tLRPC$TL_updateStoryID = (TLRPC$TL_updateStoryID) tLRPC$Updates.updates.get(i2);
                        if (tL_stories$StoryItem == null) {
                            tL_stories$StoryItem = new TL_stories$TL_storyItem();
                            int currentTime = ConnectionsManager.getInstance(StoriesController.this.currentAccount).getCurrentTime();
                            tL_stories$StoryItem.date = currentTime;
                            StoryEntry storyEntry = this.entry;
                            int i4 = storyEntry.period;
                            if (i4 == Integer.MAX_VALUE) {
                                i4 = 86400;
                            }
                            tL_stories$StoryItem.expire_date = currentTime + i4;
                            tL_stories$StoryItem.parsedPrivacy = null;
                            tL_stories$StoryItem.privacy = StoryPrivacyBottomSheet.StoryPrivacy.toOutput(storyEntry.privacyRules);
                            tL_stories$StoryItem.pinned = this.entry.period == Integer.MAX_VALUE;
                            tL_stories$StoryItem.dialogId = UserConfig.getInstance(StoriesController.this.currentAccount).clientUserId;
                            tL_stories$StoryItem.attachPath = this.path;
                            tL_stories$StoryItem.firstFramePath = this.firstFramePath;
                            tL_stories$StoryItem.id = tLRPC$TL_updateStoryID.id;
                            tL_stories$StoryItem.justUploaded = !this.edit;
                        }
                    }
                }
                final long j = this.dialogId;
                if (this.canceled) {
                    TL_stories$TL_stories_deleteStories tL_stories$TL_stories_deleteStories = new TL_stories$TL_stories_deleteStories();
                    TLRPC$InputPeer inputPeer = MessagesController.getInstance(StoriesController.this.currentAccount).getInputPeer(this.dialogId);
                    tL_stories$TL_stories_deleteStories.peer = inputPeer;
                    if (inputPeer != null) {
                        tL_stories$TL_stories_deleteStories.id.add(Integer.valueOf(i));
                        ConnectionsManager.getInstance(StoriesController.this.currentAccount).sendRequest(tL_stories$TL_stories_deleteStories, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                                StoriesController.UploadingStory.this.lambda$sendUploadedRequest$3(tLObject2, tLRPC$TL_error2);
                            }
                        });
                    }
                } else {
                    if ((i == 0 || this.edit) && tL_stories$StoryItem != null) {
                        final TL_stories$TL_updateStory tL_stories$TL_updateStory = new TL_stories$TL_updateStory();
                        tL_stories$TL_updateStory.peer = MessagesController.getInstance(StoriesController.this.currentAccount).getPeer(j);
                        tL_stories$TL_updateStory.story = tL_stories$StoryItem;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                StoriesController.UploadingStory.this.lambda$sendUploadedRequest$4(tL_stories$TL_updateStory);
                            }
                        });
                    }
                    TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem.media;
                    if (tLRPC$MessageMedia != null && tL_stories$StoryItem.attachPath != null) {
                        if (tLRPC$MessageMedia.document != null) {
                            FileLoader.getInstance(StoriesController.this.currentAccount).setLocalPathTo(tL_stories$StoryItem.media.document, tL_stories$StoryItem.attachPath);
                        } else {
                            TLRPC$Photo tLRPC$Photo = tLRPC$MessageMedia.photo;
                            if (tLRPC$Photo != null) {
                                FileLoader.getInstance(StoriesController.this.currentAccount).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, Integer.MAX_VALUE), tL_stories$StoryItem.attachPath);
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StoriesController.UploadingStory.this.lambda$sendUploadedRequest$5(j, tL_stories$StoryItem);
                        }
                    });
                    MessagesController.getInstance(StoriesController.this.currentAccount).processUpdateArray(tLRPC$Updates.updates, tLRPC$Updates.users, tLRPC$Updates.chats, false, tLRPC$Updates.date);
                }
            } else if (tLObject instanceof TL_bots$botPreviewMedia) {
                this.previewMedia = (TL_bots$botPreviewMedia) tLObject;
            } else {
                if (tLRPC$TL_error != null && FileRefController.isFileRefError(tLRPC$TL_error.text)) {
                    StoryEntry storyEntry2 = this.entry;
                    if (storyEntry2.editingCoverDocument != null && (callback = storyEntry2.updateDocumentRef) != null) {
                        callback.run(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                StoriesController.UploadingStory.this.lambda$sendUploadedRequest$6((TLRPC$Document) obj);
                            }
                        });
                        this.entry.updateDocumentRef = null;
                        return;
                    }
                }
                if (tLRPC$TL_error != null && !this.edit) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            StoriesController.UploadingStory.this.lambda$sendUploadedRequest$7(tLRPC$TL_error);
                        }
                    });
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.UploadingStory.this.cleanup();
                }
            });
        }

        public void lambda$start$0(VideoEditedInfo videoEditedInfo) {
            this.info = videoEditedInfo;
            this.messageObject.videoEditedInfo = videoEditedInfo;
            this.duration = videoEditedInfo.estimatedDuration / 1000;
            if (videoEditedInfo.needConvert()) {
                MediaController.getInstance().scheduleVideoConvert(this.messageObject, false, false, false);
            } else if (new File(this.messageObject.videoEditedInfo.originalPath).renameTo(new File(this.path))) {
                FileLoader.getInstance(StoriesController.this.currentAccount).uploadFile(this.path, false, false, 33554432);
            }
        }

        public void lambda$start$1() {
            this.ready = true;
            upload();
        }

        public void lambda$start$2(File file) {
            this.entry.buildPhoto(file);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoriesController.UploadingStory.this.lambda$start$1();
                }
            });
        }

        private void putMessages() {
            ArrayList arrayList = this.entry.shareUserIds;
            if (arrayList == null || this.putMessages) {
                return;
            }
            int size = arrayList.size();
            CharSequence charSequence = this.entry.caption;
            String charSequence2 = charSequence == null ? null : charSequence.toString();
            ArrayList<TLRPC$MessageEntity> entities = this.entry.caption != null ? MediaDataController.getInstance(StoriesController.this.currentAccount).getEntities(new CharSequence[]{this.entry.caption}, true) : null;
            for (int i = 0; i < size; i++) {
                long longValue = ((Long) this.entry.shareUserIds.get(i)).longValue();
                if (this.entry.wouldBeVideo()) {
                    SendMessagesHelper.prepareSendingVideo(AccountInstance.getInstance(StoriesController.this.currentAccount), this.path, null, longValue, null, null, null, null, entities, 0, null, !r8.silent, this.entry.scheduleDate, false, false, charSequence2, null, 0, 0L);
                } else {
                    SendMessagesHelper.prepareSendingPhoto(AccountInstance.getInstance(StoriesController.this.currentAccount), this.path, null, null, longValue, null, null, null, null, entities, null, null, 0, null, null, !r8.silent, this.entry.scheduleDate, 0, false, charSequence2, null, 0, 0L);
                }
            }
            this.putMessages = true;
        }

        private void sendUploadedRequest(org.telegram.tgnet.TLRPC$InputFile r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.UploadingStory.sendUploadedRequest(org.telegram.tgnet.TLRPC$InputFile):void");
        }

        private void startForeground() {
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
            intent.putExtra("path", this.path);
            intent.putExtra("currentAccount", StoriesController.this.currentAccount);
            try {
                ApplicationLoader.applicationContext.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        private void upload() {
            if (this.entry.shareUserIds != null) {
                putMessages();
                return;
            }
            FileLoader fileLoader = FileLoader.getInstance(StoriesController.this.currentAccount);
            String str = this.path;
            boolean z = !this.entry.isVideo;
            if (this.isVideo) {
                VideoEditedInfo videoEditedInfo = this.info;
                r5 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
            }
            fileLoader.uploadFile(str, false, z, r5, this.entry.isVideo ? 33554432 : 16777216, true);
        }

        public void cancel() {
            if (this.failed) {
                StoriesController.this.getDraftsController().delete(this.entry);
                ((ArrayList) StoriesController.this.uploadingStoriesByDialogId.get(this.dialogId)).remove(this);
            }
            this.canceled = true;
            if (this.entry.wouldBeVideo()) {
                MediaController.getInstance().cancelVideoConvert(this.messageObject);
            }
            FileLoader.getInstance(StoriesController.this.currentAccount).cancelFileUpload(this.path, false);
            if (this.currentRequest >= 0) {
                ConnectionsManager.getInstance(StoriesController.this.currentAccount).cancelRequest(this.currentRequest, true);
            }
            cleanup();
        }

        public void cleanup() {
            HashMap hashMap;
            ArrayList arrayList;
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            if (!this.failed && (arrayList = (ArrayList) StoriesController.this.uploadingStoriesByDialogId.get(this.dialogId)) != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = (ArrayList) StoriesController.this.uploadingAndEditingStories.get(this.dialogId);
            if (arrayList2 != null) {
                arrayList2.remove(this);
            }
            if (this.edit && (hashMap = (HashMap) StoriesController.this.editingStories.get(this.dialogId)) != null) {
                hashMap.remove(Integer.valueOf(this.entry.editStoryId));
            }
            if (this.previewMedia != null) {
                StoriesList storiesList = StoriesController.this.getStoriesList(this.dialogId, 4, false);
                StoryEntry storyEntry = this.entry;
                if (storyEntry == null || !storyEntry.isEdit) {
                    if (storiesList instanceof BotPreviewsList) {
                        ((BotPreviewsList) storiesList).push(this.previewMedia);
                    }
                    BotPreviewsEditContainer.push(StoriesController.this.currentAccount, this.dialogId, this.entry.botLang, this.previewMedia);
                } else {
                    if (storiesList instanceof BotPreviewsList) {
                        ((BotPreviewsList) storiesList).edit(storyEntry.editingBotPreview, this.previewMedia);
                    }
                    int i = StoriesController.this.currentAccount;
                    long j = this.dialogId;
                    StoryEntry storyEntry2 = this.entry;
                    BotPreviewsEditContainer.edit(i, j, storyEntry2.botLang, storyEntry2.editingBotPreview, this.previewMedia);
                }
                this.previewMedia = null;
            }
            NotificationCenter.getInstance(StoriesController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            StoryEntry storyEntry3 = this.entry;
            if (storyEntry3 != null && !storyEntry3.isEditSaved && !this.entryDestroyed) {
                storyEntry3.destroy(false);
                this.entryDestroyed = true;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.path);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.filePreparingStarted) {
                if (objArr[0] == this.messageObject) {
                    this.path = (String) objArr[1];
                    upload();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.fileNewChunkAvailable) {
                if (objArr[0] == this.messageObject) {
                    String str = (String) objArr[1];
                    long longValue = ((Long) objArr[2]).longValue();
                    long longValue2 = ((Long) objArr[3]).longValue();
                    float floatValue = ((Float) objArr[4]).floatValue();
                    this.convertingProgress = floatValue;
                    this.progress = (floatValue * 0.3f) + (this.uploadProgress * 0.7f);
                    NotificationCenter.getInstance(StoriesController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.path, Float.valueOf(this.progress));
                    if (this.firstSecondSize < 0 && this.convertingProgress * ((float) this.duration) >= 1000.0f) {
                        this.firstSecondSize = longValue;
                    }
                    FileLoader.getInstance(StoriesController.this.currentAccount).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.convertingProgress));
                    if (longValue2 > 0) {
                        if (this.firstSecondSize < 0) {
                            this.firstSecondSize = longValue2;
                        }
                        this.ready = true;
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == NotificationCenter.filePreparingFailed) {
                if (objArr[0] != this.messageObject) {
                    return;
                }
                if (!this.edit) {
                    StoryEntry storyEntry = this.entry;
                    storyEntry.isError = true;
                    storyEntry.error = new TLRPC$TL_error();
                    TLRPC$TL_error tLRPC$TL_error = this.entry.error;
                    tLRPC$TL_error.code = 400;
                    tLRPC$TL_error.text = "FILE_PREPARE_FAILED";
                    this.entryDestroyed = true;
                    this.failed = true;
                    this.hadFailed = true;
                    StoriesController.this.getDraftsController().edit(this.entry);
                }
            } else {
                if (i == NotificationCenter.fileUploaded) {
                    String str2 = (String) objArr[0];
                    String str3 = this.path;
                    if (str3 == null || !str2.equals(str3)) {
                        return;
                    }
                    sendUploadedRequest((TLRPC$InputFile) objArr[1]);
                    return;
                }
                if (i != NotificationCenter.fileUploadFailed) {
                    if (i == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.path)) {
                        float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                        this.uploadProgress = min;
                        this.progress = (this.convertingProgress * 0.3f) + (min * 0.7f);
                        NotificationCenter.getInstance(StoriesController.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.path, Float.valueOf(this.progress));
                        return;
                    }
                    return;
                }
                String str4 = (String) objArr[0];
                String str5 = this.path;
                if (str5 == null || !str4.equals(str5)) {
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                }
            }
            cleanup();
        }

        public boolean isCloseFriends() {
            return this.isCloseFriends;
        }

        public void start() {
            StoryEntry storyEntry = this.entry;
            if (storyEntry.isEditingCover) {
                TLRPC$TL_inputFileStoryDocument tLRPC$TL_inputFileStoryDocument = new TLRPC$TL_inputFileStoryDocument();
                tLRPC$TL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.entry.editingCoverDocument);
                sendUploadedRequest(tLRPC$TL_inputFileStoryDocument);
            } else if ((storyEntry.isEdit || (storyEntry.isRepost && storyEntry.repostMedia != null)) && !storyEntry.editedMedia && storyEntry.round == null) {
                sendUploadedRequest(null);
                return;
            }
            StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = this.entry.privacy;
            this.isCloseFriends = storyPrivacy != null && storyPrivacy.isCloseFriends();
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            boolean wouldBeVideo = this.entry.wouldBeVideo();
            this.isVideo = wouldBeVideo;
            if (wouldBeVideo) {
                TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                tLRPC$TL_message.id = 1;
                String absolutePath = StoryEntry.makeCacheFile(StoriesController.this.currentAccount, true).getAbsolutePath();
                tLRPC$TL_message.attachPath = absolutePath;
                this.path = absolutePath;
                this.messageObject = new MessageObject(StoriesController.this.currentAccount, (TLRPC$Message) tLRPC$TL_message, (MessageObject) null, false, false);
                this.entry.getVideoEditedInfo(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoriesController.UploadingStory.this.lambda$start$0((VideoEditedInfo) obj);
                    }
                });
            } else {
                final File makeCacheFile = StoryEntry.makeCacheFile(StoriesController.this.currentAccount, false);
                this.path = makeCacheFile.getAbsolutePath();
                Utilities.themeQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        StoriesController.UploadingStory.this.lambda$start$2(makeCacheFile);
                    }
                });
            }
            startForeground();
        }

        public void tryAgain() {
            this.failed = false;
            this.entryDestroyed = false;
            this.progress = 0.0f;
            this.uploadProgress = 0.0f;
            this.convertingProgress = 0.0f;
            if (this.path != null) {
                try {
                    new File(this.path).delete();
                    this.path = null;
                } catch (Exception unused) {
                }
            }
            start();
        }
    }

    public StoriesController(final int i) {
        this.state = "";
        ArrayList arrayList = new ArrayList();
        this.sendAs = arrayList;
        arrayList.add(new TLRPC$TL_inputPeerSelf());
        this.loadingSendAs = false;
        this.loadedSendAs = false;
        this.currentAccount = i;
        this.storiesStorage = new StoriesStorage(i);
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        this.mainSettings = mainSettings;
        this.state = mainSettings.getString("last_stories_state", "");
        this.stateHidden = this.mainSettings.getString("last_stories_state_hidden", "");
        this.totalStoriesCountHidden = this.mainSettings.getInt("total_stores_hidden", 0);
        this.totalStoriesCount = this.mainSettings.getInt("total_stores", 0);
        this.storiesReadLoaded = this.mainSettings.getBoolean("read_loaded", false);
        this.stealthMode = readStealthMode(this.mainSettings.getString("stories_stealth_mode", null));
        this.storiesStorage.getMaxReadIds(new Consumer() {
            @Override
            public final void accept(Object obj) {
                StoriesController.this.lambda$new$1((LongSparseIntArray) obj);
            }
        });
        this.sortStoriesRunnable = new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$new$2(i);
            }
        };
        this.draftsController = new DraftsController(i);
    }

    private void addUploadingStoryToList(long j, UploadingStory uploadingStory, LongSparseArray longSparseArray) {
        ArrayList arrayList = (ArrayList) longSparseArray.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList();
            longSparseArray.put(j, arrayList);
        }
        arrayList.add(uploadingStory);
    }

    private void addUserToHiddenList(TL_stories$PeerStories tL_stories$PeerStories) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.hiddenListStories.size(); i++) {
            if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.hiddenListStories.get(i)).peer) == peerDialogId) {
                z = true;
            }
        }
        if (!z) {
            this.hiddenListStories.add(tL_stories$PeerStories);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
    }

    private void applyNewStories(TL_stories$PeerStories tL_stories$PeerStories) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
        putToAllStories(peerDialogId, tL_stories$PeerStories);
        if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            applyToList(tL_stories$PeerStories);
            if (user != null && !user.stories_hidden) {
                preloadUserStories(tL_stories$PeerStories);
            }
        }
        FileLog.d("StoriesController applyNewStories " + peerDialogId);
        updateStoriesInLists(peerDialogId, tL_stories$PeerStories.stories);
    }

    public static TL_stories$StoryItem applyStoryUpdate(TL_stories$StoryItem tL_stories$StoryItem, TL_stories$StoryItem tL_stories$StoryItem2) {
        if (tL_stories$StoryItem2 == null) {
            return tL_stories$StoryItem;
        }
        if (tL_stories$StoryItem == null || !tL_stories$StoryItem2.min) {
            return tL_stories$StoryItem2;
        }
        tL_stories$StoryItem.pinned = tL_stories$StoryItem2.pinned;
        tL_stories$StoryItem.isPublic = tL_stories$StoryItem2.isPublic;
        tL_stories$StoryItem.close_friends = tL_stories$StoryItem2.close_friends;
        int i = tL_stories$StoryItem2.date;
        if (i != 0) {
            tL_stories$StoryItem.date = i;
        }
        int i2 = tL_stories$StoryItem2.expire_date;
        if (i2 != 0) {
            tL_stories$StoryItem.expire_date = i2;
        }
        tL_stories$StoryItem.caption = tL_stories$StoryItem2.caption;
        tL_stories$StoryItem.entities = tL_stories$StoryItem2.entities;
        TLRPC$MessageMedia tLRPC$MessageMedia = tL_stories$StoryItem2.media;
        if (tLRPC$MessageMedia != null) {
            tL_stories$StoryItem.media = tLRPC$MessageMedia;
        }
        return tL_stories$StoryItem;
    }

    private void applyToList(TL_stories$PeerStories tL_stories$PeerStories) {
        TLRPC$Chat chat;
        boolean z;
        boolean z2;
        long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
        TLRPC$User tLRPC$User = null;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (peerDialogId > 0) {
            TLRPC$User user = messagesController.getUser(Long.valueOf(peerDialogId));
            if (user == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                tLRPC$User = user;
                chat = null;
            }
        } else {
            chat = messagesController.getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i = 0;
        while (true) {
            z = true;
            if (i >= this.dialogListStories.size()) {
                z2 = false;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.dialogListStories.get(i)).peer) == peerDialogId) {
                    this.dialogListStories.remove(i);
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.hiddenListStories.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.hiddenListStories.get(i2)).peer) == peerDialogId) {
                this.hiddenListStories.remove(i2);
                z2 = true;
                break;
            }
            i2++;
        }
        if ((tLRPC$User == null || !tLRPC$User.stories_hidden) && (chat == null || !chat.stories_hidden)) {
            z = false;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("StoriesController move user stories to first hidden=" + z + " did=" + peerDialogId);
        }
        (z ? this.hiddenListStories : this.dialogListStories).add(0, tL_stories$PeerStories);
        if (!z2) {
            loadAllStoriesForDialog(peerDialogId);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
    }

    private void checkExpireStories(ArrayList arrayList) {
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) arrayList.get(i);
            long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
            int i2 = 0;
            while (i2 < tL_stories$PeerStories.stories.size()) {
                if (StoriesUtilities.isExpired(this.currentAccount, (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2))) {
                    tL_stories$PeerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (tL_stories$PeerStories.stories.isEmpty() && !hasUploadingStories(peerDialogId)) {
                this.allStoriesMap.remove(peerDialogId);
                arrayList.remove(tL_stories$PeerStories);
                z = true;
            }
        }
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    private void checkExpireStories(TL_stories$PeerStories tL_stories$PeerStories) {
        if (tL_stories$PeerStories == null || tL_stories$PeerStories.stories == null) {
            return;
        }
        int i = 0;
        while (i < tL_stories$PeerStories.stories.size()) {
            if (StoriesUtilities.isExpired(this.currentAccount, (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i))) {
                tL_stories$PeerStories.stories.remove(i);
                i--;
            }
            i++;
        }
        tL_stories$PeerStories.checkedExpired = true;
    }

    private TL_stories$StoryItem findStory(long j, int i) {
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        if (tL_stories$PeerStories == null) {
            return null;
        }
        for (int i2 = 0; i2 < tL_stories$PeerStories.stories.size(); i2++) {
            if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id == i) {
                return (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2);
            }
        }
        return null;
    }

    private void fixDeletedAndNonContactsStories(ArrayList arrayList) {
        boolean z;
        TLRPC$User user;
        int i = 0;
        while (i < arrayList.size()) {
            TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) arrayList.get(i);
            long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
            if (peerDialogId <= 0 || (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) == null || isContactOrService(user)) {
                z = false;
            } else {
                arrayList.remove(i);
                i--;
                z = true;
            }
            int i2 = 0;
            while (i2 < tL_stories$PeerStories.stories.size()) {
                if (tL_stories$PeerStories.stories.get(i2) instanceof TL_stories$TL_storyItemDeleted) {
                    tL_stories$PeerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!z && tL_stories$PeerStories.stories.isEmpty() && !hasUploadingStories(peerDialogId)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    private long getSelfUserId() {
        return UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public StoriesList getStoriesList(long j, int i, boolean z) {
        HashMap[] hashMapArr = this.storiesLists;
        if (hashMapArr[i] == null) {
            hashMapArr[i] = new HashMap();
        }
        StoriesList storiesList = (StoriesList) this.storiesLists[i].get(Long.valueOf(j));
        if (storiesList != null || !z) {
            return storiesList;
        }
        if (i == 4) {
            HashMap hashMap = this.storiesLists[i];
            Long valueOf = Long.valueOf(j);
            BotPreviewsList botPreviewsList = new BotPreviewsList(this.currentAccount, j, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StoriesController.this.destroyStoryList((StoriesController.StoriesList) obj);
                }
            });
            hashMap.put(valueOf, botPreviewsList);
            return botPreviewsList;
        }
        HashMap hashMap2 = this.storiesLists[i];
        Long valueOf2 = Long.valueOf(j);
        StoriesList storiesList2 = new StoriesList(this.currentAccount, j, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoriesController.this.destroyStoryList((StoriesController.StoriesList) obj);
            }
        }, null);
        hashMap2.put(valueOf2, storiesList2);
        return storiesList2;
    }

    private boolean isContactOrService(TLRPC$User tLRPC$User) {
        return tLRPC$User != null && (tLRPC$User.contact || tLRPC$User.id == MessagesController.getInstance(this.currentAccount).storiesChangelogUserId);
    }

    private boolean isPremium(long j) {
        TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        if (user == null) {
            return false;
        }
        return user.premium;
    }

    public void lambda$canSendStoryFor$29(long j) {
        BaseFragment create = StatisticActivity.create(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)));
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            if (!StoryRecorder.isVisible()) {
                lastFragment.presentFragment(create);
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            lastFragment.showAsSheet(create, bottomSheetParams);
        }
    }

    public void lambda$canSendStoryFor$30(Consumer consumer, final long j, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null) {
            LimitReachedBottomSheet.openBoostsForPostingStories(LaunchActivity.getLastFragment(), j, canApplyBoost, tL_stories$TL_premium_boostsStatus, canPostStories(j) ? new Runnable() {
                @Override
                public final void run() {
                    StoriesController.this.lambda$canSendStoryFor$29(j);
                }
            } : null);
        }
        consumer.accept(Boolean.FALSE);
    }

    public void lambda$canSendStoryFor$31(final Consumer consumer, MessagesController messagesController, final long j, final TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        if (tL_stories$TL_premium_boostsStatus != null) {
            messagesController.getBoostsController().userCanBoostChannel(j, tL_stories$TL_premium_boostsStatus, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StoriesController.this.lambda$canSendStoryFor$30(consumer, j, tL_stories$TL_premium_boostsStatus, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
        }
        consumer.accept(Boolean.FALSE);
    }

    public void lambda$canSendStoryFor$32(TLRPC$TL_error tLRPC$TL_error, boolean z, final long j, final Consumer consumer) {
        Boolean bool;
        if (tLRPC$TL_error != null) {
            if (!tLRPC$TL_error.text.contains("BOOSTS_REQUIRED")) {
                BulletinFactory global = BulletinFactory.global();
                if (global != null) {
                    global.createErrorBulletin(tLRPC$TL_error.text);
                }
            } else if (z) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                messagesController.getBoostsController().getBoostsStats(j, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        StoriesController.this.lambda$canSendStoryFor$31(consumer, messagesController, j, (TL_stories$TL_premium_boostsStatus) obj);
                    }
                });
                return;
            }
            bool = Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        consumer.accept(bool);
    }

    public void lambda$canSendStoryFor$33(final boolean z, final long j, final Consumer consumer, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$canSendStoryFor$32(tLRPC$TL_error, z, j, consumer);
            }
        });
    }

    public void lambda$checkStoryLimit$27(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.storyLimitFetched = true;
        if (!(tLObject instanceof TLRPC$TL_boolTrue)) {
            checkStoryError(tLRPC$TL_error);
        } else {
            this.storyLimitCached = null;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
        }
    }

    public void lambda$checkStoryLimit$28(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$checkStoryLimit$27(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$deleteStories$14(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda5(this));
    }

    public void lambda$deleteStory$13(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda5(this));
        }
    }

    public void lambda$loadAllStoriesForDialog$11(long j, TLObject tLObject) {
        this.allStoriesLoading.remove(Long.valueOf(j));
        if (tLObject == null) {
            return;
        }
        TL_stories$TL_stories_peerStories tL_stories$TL_stories_peerStories = (TL_stories$TL_stories_peerStories) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_stories$TL_stories_peerStories.users, false);
        TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        TL_stories$PeerStories tL_stories$PeerStories = tL_stories$TL_stories_peerStories.stories;
        this.allStoriesMap.put(DialogObject.getPeerDialogId(tL_stories$PeerStories.peer), tL_stories$PeerStories);
        if (user != null && (isContactOrService(user) || user.self)) {
            applyToList(tL_stories$PeerStories);
            this.storiesStorage.putPeerStories(tL_stories$PeerStories);
        }
        FileLog.d("StoriesController processAllStoriesResponse dialogId=" + j + " overwrite stories " + tL_stories$TL_stories_peerStories.stories.stories.size());
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void lambda$loadAllStoriesForDialog$12(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$loadAllStoriesForDialog$11(j, tLObject);
            }
        });
    }

    public void lambda$loadBlocklist$23(TLObject tLObject) {
        boolean z = true;
        if (tLObject instanceof TLRPC$TL_contacts_blocked) {
            TLRPC$TL_contacts_blocked tLRPC$TL_contacts_blocked = (TLRPC$TL_contacts_blocked) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_blocked.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_contacts_blocked.chats, false);
            this.blocklist.clear();
            Iterator it = tLRPC$TL_contacts_blocked.blocked.iterator();
            while (it.hasNext()) {
                this.blocklist.add(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC$TL_peerBlocked) it.next()).peer_id)));
            }
            this.blocklistCount = Math.max(this.blocklist.size(), tLRPC$TL_contacts_blocked.count);
        } else {
            if (!(tLObject instanceof TLRPC$TL_contacts_blockedSlice)) {
                return;
            }
            TLRPC$TL_contacts_blockedSlice tLRPC$TL_contacts_blockedSlice = (TLRPC$TL_contacts_blockedSlice) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_blockedSlice.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_contacts_blockedSlice.chats, false);
            Iterator it2 = tLRPC$TL_contacts_blockedSlice.blocked.iterator();
            while (it2.hasNext()) {
                this.blocklist.add(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC$TL_peerBlocked) it2.next()).peer_id)));
            }
            this.blocklistCount = tLRPC$TL_contacts_blockedSlice.count;
            if (this.blocklist.size() < this.blocklistCount) {
                z = false;
            }
        }
        this.blocklistFull = z;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
        this.blocklistLoading = false;
        this.lastBlocklistRequested = System.currentTimeMillis();
    }

    public void lambda$loadBlocklist$24(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$loadBlocklist$23(tLObject);
            }
        });
    }

    public void lambda$loadFromServer$7(boolean z, TL_stories$TL_stories_getAllStories tL_stories$TL_stories_getAllStories, TLObject tLObject, boolean z2) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor putBoolean;
        int i;
        String str;
        if (z) {
            this.loadingFromServerHidden = false;
        } else {
            this.loadingFromServer = false;
        }
        FileLog.d("StoriesController loaded stories from server state=" + tL_stories$TL_stories_getAllStories.state + " more=" + tL_stories$TL_stories_getAllStories.next + "  " + tLObject);
        if (!(tLObject instanceof TL_stories$TL_stories_allStories)) {
            if (tLObject instanceof TL_stories$TL_stories_allStoriesNotModified) {
                SharedPreferences sharedPreferences = this.mainSettings;
                if (z) {
                    this.hasMoreHidden = sharedPreferences.getBoolean("last_stories_has_more_hidden", false);
                    this.stateHidden = ((TL_stories$TL_stories_allStoriesNotModified) tLObject).state;
                    putString = this.mainSettings.edit().putString("last_stories_state_hidden", this.stateHidden);
                } else {
                    this.hasMore = sharedPreferences.getBoolean("last_stories_has_more", false);
                    this.state = ((TL_stories$TL_stories_allStoriesNotModified) tLObject).state;
                    putString = this.mainSettings.edit().putString("last_stories_state", this.state);
                }
                putString.apply();
                if (z ? this.hasMoreHidden : this.hasMore) {
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    return;
                }
                return;
            }
            return;
        }
        TL_stories$TL_stories_allStories tL_stories$TL_stories_allStories = (TL_stories$TL_stories_allStories) tLObject;
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_stories$TL_stories_allStories.users, null, true, true);
        int i2 = tL_stories$TL_stories_allStories.count;
        if (z) {
            this.totalStoriesCountHidden = i2;
            this.hasMoreHidden = tL_stories$TL_stories_allStories.has_more;
            this.stateHidden = tL_stories$TL_stories_allStories.state;
            putBoolean = this.mainSettings.edit().putString("last_stories_state_hidden", this.stateHidden).putBoolean("last_stories_has_more_hidden", this.hasMoreHidden);
            i = this.totalStoriesCountHidden;
            str = "total_stores_hidden";
        } else {
            this.totalStoriesCount = i2;
            this.hasMore = tL_stories$TL_stories_allStories.has_more;
            this.state = tL_stories$TL_stories_allStories.state;
            putBoolean = this.mainSettings.edit().putString("last_stories_state", this.state).putBoolean("last_stories_has_more", this.hasMore);
            i = this.totalStoriesCount;
            str = "total_stores";
        }
        putBoolean.putInt(str, i).apply();
        processAllStoriesResponse(tL_stories$TL_stories_allStories, z, false, z2);
    }

    public void lambda$loadFromServer$8(final boolean z, final TL_stories$TL_stories_getAllStories tL_stories$TL_stories_getAllStories, final boolean z2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$loadFromServer$7(z, tL_stories$TL_stories_getAllStories, tLObject, z2);
            }
        });
    }

    public void lambda$loadSendAs$34(TLObject tLObject) {
        this.sendAs.clear();
        this.sendAs.add(new TLRPC$TL_inputPeerSelf());
        if (tLObject instanceof TLRPC$TL_messages_chats) {
            ArrayList<TLRPC$Chat> arrayList = ((TLRPC$TL_messages_chats) tLObject).chats;
            MessagesController.getInstance(this.currentAccount).putChats(arrayList, false);
            Iterator<TLRPC$Chat> it = arrayList.iterator();
            while (it.hasNext()) {
                this.sendAs.add(MessagesController.getInputPeer(it.next()));
            }
        }
        this.loadingSendAs = false;
        this.loadedSendAs = true;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
    }

    public void lambda$loadSendAs$35(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$loadSendAs$34(tLObject);
            }
        });
    }

    public void lambda$loadSkippedStories$19(long j, boolean z, TL_stories$PeerStories tL_stories$PeerStories, long j2, TLObject tLObject) {
        this.loadingAllStories.remove(Long.valueOf(j));
        if (!z) {
            tL_stories$PeerStories = getStories(j2);
        }
        if (tL_stories$PeerStories == null) {
            return;
        }
        if (tLObject instanceof TL_stories$TL_stories_stories) {
            TL_stories$TL_stories_stories tL_stories$TL_stories_stories = (TL_stories$TL_stories_stories) tLObject;
            for (int i = 0; i < tL_stories$TL_stories_stories.stories.size(); i++) {
                for (int i2 = 0; i2 < tL_stories$PeerStories.stories.size(); i2++) {
                    if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id == ((TL_stories$StoryItem) tL_stories$TL_stories_stories.stories.get(i)).id) {
                        tL_stories$PeerStories.stories.set(i2, (TL_stories$StoryItem) tL_stories$TL_stories_stories.stories.get(i));
                        preloadStory(j2, (TL_stories$StoryItem) tL_stories$TL_stories_stories.stories.get(i));
                    }
                }
            }
            if (!z) {
                this.storiesStorage.updateStories(tL_stories$PeerStories);
            }
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void lambda$loadSkippedStories$20(final long j, final boolean z, final TL_stories$PeerStories tL_stories$PeerStories, final long j2, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$loadSkippedStories$19(j, z, tL_stories$PeerStories, j2, tLObject);
            }
        });
    }

    public void lambda$loadStories$5(TL_stories$TL_stories_allStories tL_stories$TL_stories_allStories) {
        this.loadingFromDatabase = false;
        if (tL_stories$TL_stories_allStories == null) {
            cleanup();
            loadStories();
        } else {
            processAllStoriesResponse(tL_stories$TL_stories_allStories, false, true, false);
            loadFromServer(false);
            loadFromServer(true);
        }
    }

    public void lambda$loadStoriesRead$3() {
        this.storiesReadLoaded = true;
        this.mainSettings.edit().putBoolean("read_loaded", true).apply();
    }

    public void lambda$loadStoriesRead$4(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        if (tLRPC$Updates == null) {
            return;
        }
        MessagesController.getInstance(this.currentAccount).processUpdateArray(tLRPC$Updates.updates, tLRPC$Updates.users, tLRPC$Updates.chats, false, tLRPC$Updates.date);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$loadStoriesRead$3();
            }
        });
    }

    public void lambda$markStoriesAsReadFromServer$18(long j, int i) {
        int max = Math.max(this.dialogIdToMaxReadId.get(j, 0), i);
        this.dialogIdToMaxReadId.put(j, max);
        this.storiesStorage.updateMaxReadId(j, max);
        TL_stories$PeerStories stories = getStories(j);
        if (stories != null && i > stories.max_read_id) {
            stories.max_read_id = i;
            Collections.sort(this.dialogListStories, this.peerStoriesComparator);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public static void lambda$markStoryAsRead$17(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public void lambda$new$1(LongSparseIntArray longSparseIntArray) {
        this.dialogIdToMaxReadId = longSparseIntArray;
    }

    public void lambda$new$2(int i) {
        sortDialogStories(this.dialogListStories);
        sortDialogStories(this.hiddenListStories);
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public int lambda$new$22(TL_stories$PeerStories tL_stories$PeerStories, TL_stories$PeerStories tL_stories$PeerStories2) {
        int i;
        long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_stories$PeerStories2.peer);
        boolean hasUploadingStories = hasUploadingStories(peerDialogId);
        boolean hasUploadingStories2 = hasUploadingStories(peerDialogId2);
        boolean hasUnreadStories = hasUnreadStories(peerDialogId);
        boolean hasUnreadStories2 = hasUnreadStories(peerDialogId2);
        if (hasUploadingStories != hasUploadingStories2) {
            return (hasUploadingStories2 ? 1 : 0) - (hasUploadingStories ? 1 : 0);
        }
        if (hasUnreadStories != hasUnreadStories2) {
            return (hasUnreadStories2 ? 1 : 0) - (hasUnreadStories ? 1 : 0);
        }
        boolean isService = UserObject.isService(peerDialogId);
        boolean isService2 = UserObject.isService(peerDialogId2);
        if (isService != isService2) {
            return (isService2 ? 1 : 0) - (isService ? 1 : 0);
        }
        boolean isPremium = isPremium(peerDialogId);
        boolean isPremium2 = isPremium(peerDialogId2);
        if (isPremium != isPremium2) {
            return (isPremium2 ? 1 : 0) - (isPremium ? 1 : 0);
        }
        int i2 = 0;
        if (tL_stories$PeerStories.stories.isEmpty()) {
            i = 0;
        } else {
            i = ((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(r9.size() - 1)).date;
        }
        if (!tL_stories$PeerStories2.stories.isEmpty()) {
            i2 = ((TL_stories$StoryItem) tL_stories$PeerStories2.stories.get(r10.size() - 1)).date;
        }
        return i2 - i;
    }

    public static void lambda$processAllStoriesResponse$9() {
    }

    public void lambda$processUpdate$10(long j, TL_stories$TL_updateStory tL_stories$TL_updateStory, TLRPC$User tLRPC$User) {
        boolean z;
        boolean z2;
        boolean z3;
        FileLog.d("StoriesController update stories for dialog " + j);
        updateStoriesInLists(j, Collections.singletonList(tL_stories$TL_updateStory.story));
        updateStoriesForFullPeer(j, Collections.singletonList(tL_stories$TL_updateStory.story));
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        ArrayList arrayList = new ArrayList();
        int i = this.totalStoriesCount;
        boolean z4 = true;
        if (tL_stories$PeerStories != null) {
            TL_stories$StoryItem tL_stories$StoryItem = tL_stories$TL_updateStory.story;
            if (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) {
                NotificationsController.getInstance(this.currentAccount).processDeleteStory(j, tL_stories$StoryItem.id);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= tL_stories$PeerStories.stories.size()) {
                    z = false;
                    break;
                }
                if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id != tL_stories$StoryItem.id) {
                    i2++;
                } else if (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) {
                    tL_stories$PeerStories.stories.remove(i2);
                    FileLog.d("StoriesController remove story id=" + tL_stories$StoryItem.id);
                    z = true;
                    z2 = true;
                } else {
                    TL_stories$StoryItem tL_stories$StoryItem2 = (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2);
                    tL_stories$StoryItem = applyStoryUpdate(tL_stories$StoryItem2, tL_stories$StoryItem);
                    arrayList.add(tL_stories$StoryItem);
                    tL_stories$PeerStories.stories.set(i2, tL_stories$StoryItem);
                    if (tL_stories$StoryItem.attachPath == null) {
                        tL_stories$StoryItem.attachPath = tL_stories$StoryItem2.attachPath;
                    }
                    if (tL_stories$StoryItem.firstFramePath == null) {
                        tL_stories$StoryItem.firstFramePath = tL_stories$StoryItem2.firstFramePath;
                    }
                    FileLog.d("StoriesController update story id=" + tL_stories$StoryItem.id);
                    z = true;
                }
            }
            z2 = false;
            if (z) {
                z3 = false;
            } else {
                if (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) {
                    FileLog.d("StoriesController can't add new story DELETED");
                    return;
                }
                if (StoriesUtilities.isExpired(this.currentAccount, tL_stories$StoryItem)) {
                    FileLog.d("StoriesController can't add new story isExpired");
                    return;
                }
                if (j > 0 && (tLRPC$User == null || (!tLRPC$User.self && !isContactOrService(tLRPC$User)))) {
                    FileLog.d("StoriesController can't add new story user is not contact");
                    return;
                }
                arrayList.add(tL_stories$StoryItem);
                tL_stories$PeerStories.stories.add(tL_stories$StoryItem);
                FileLog.d("StoriesController add new story id=" + tL_stories$StoryItem.id + " total stories count " + tL_stories$PeerStories.stories.size());
                preloadStory(j, tL_stories$StoryItem);
                applyToList(tL_stories$PeerStories);
                z3 = true;
                z2 = true;
            }
            if (!z2) {
                z4 = z3;
            } else if (!tL_stories$PeerStories.stories.isEmpty() || hasUploadingStories(j)) {
                Collections.sort(tL_stories$PeerStories.stories, storiesComparator);
            } else {
                this.dialogListStories.remove(tL_stories$PeerStories);
                this.hiddenListStories.remove(tL_stories$PeerStories);
                this.allStoriesMap.remove(DialogObject.getPeerDialogId(tL_stories$PeerStories.peer));
                this.totalStoriesCount--;
            }
        } else {
            TL_stories$StoryItem tL_stories$StoryItem3 = tL_stories$TL_updateStory.story;
            if (tL_stories$StoryItem3 instanceof TL_stories$TL_storyItemDeleted) {
                FileLog.d("StoriesController can't add user " + j + " with new story DELETED");
                return;
            }
            if (StoriesUtilities.isExpired(this.currentAccount, tL_stories$StoryItem3)) {
                FileLog.d("StoriesController can't add user " + j + " with new story isExpired");
                return;
            }
            if (j > 0 && (tLRPC$User == null || (!tLRPC$User.self && !isContactOrService(tLRPC$User)))) {
                FileLog.d("StoriesController can't add user cause is not contact");
                return;
            }
            TL_stories$TL_peerStories tL_stories$TL_peerStories = new TL_stories$TL_peerStories();
            tL_stories$TL_peerStories.peer = tL_stories$TL_updateStory.peer;
            tL_stories$TL_peerStories.stories.add(tL_stories$TL_updateStory.story);
            FileLog.d("StoriesController add new user with story id=" + tL_stories$TL_updateStory.story.id);
            applyNewStories(tL_stories$TL_peerStories);
            this.totalStoriesCount = this.totalStoriesCount + 1;
            loadAllStoriesForDialog(j);
        }
        if (i != this.totalStoriesCount) {
            this.mainSettings.edit().putInt("total_stores", this.totalStoriesCount).apply();
        }
        fixDeletedAndNonContactsStories(this.dialogListStories);
        fixDeletedAndNonContactsStories(this.hiddenListStories);
        if (z4) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
    }

    public static void lambda$setStoryReaction$21(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$toggleHidden$6(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public static void lambda$updateBlockedUsers$25(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$updateBlockedUsers$26(final Runnable runnable, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.lambda$updateBlockedUsers$25(runnable);
            }
        });
    }

    public static void lambda$updateStoriesPinned$15(Utilities.Callback callback, TLRPC$TL_error tLRPC$TL_error) {
        if (callback != null) {
            callback.run(Boolean.valueOf(tLRPC$TL_error == null));
        }
    }

    public static void lambda$updateStoriesPinned$16(final Utilities.Callback callback, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.lambda$updateStoriesPinned$15(Utilities.Callback.this, tLRPC$TL_error);
            }
        });
    }

    private void loadAllStoriesForDialog(final long j) {
        if (this.allStoriesLoading.contains(Long.valueOf(j))) {
            return;
        }
        this.allStoriesLoading.add(Long.valueOf(j));
        FileLog.d("StoriesController loadAllStoriesForDialog " + j);
        TL_stories$TL_stories_getPeerStories tL_stories$TL_stories_getPeerStories = new TL_stories$TL_stories_getPeerStories();
        tL_stories$TL_stories_getPeerStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_getPeerStories, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$loadAllStoriesForDialog$12(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    private void loadFromServer(final boolean z) {
        if (z && this.loadingFromServerHidden) {
            return;
        }
        if ((z || !this.loadingFromServer) && !this.loadingFromDatabase) {
            final boolean z2 = true;
            if (z) {
                this.loadingFromServerHidden = true;
            } else {
                this.loadingFromServer = true;
            }
            final TL_stories$TL_stories_getAllStories tL_stories$TL_stories_getAllStories = new TL_stories$TL_stories_getAllStories();
            String str = z ? this.stateHidden : this.state;
            boolean z3 = z ? this.hasMoreHidden : this.hasMore;
            if (!TextUtils.isEmpty(str)) {
                tL_stories$TL_stories_getAllStories.state = str;
                tL_stories$TL_stories_getAllStories.flags |= 1;
            }
            if (!z3 || TextUtils.isEmpty(str)) {
                z2 = false;
            } else {
                tL_stories$TL_stories_getAllStories.next = true;
            }
            tL_stories$TL_stories_getAllStories.include_hidden = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_getAllStories, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.this.lambda$loadFromServer$8(z, tL_stories$TL_stories_getAllStories, z2, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    private void loadStoriesRead() {
        if (this.storiesReadLoaded) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1688541191);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$loadStoriesRead$4(tLObject, tLRPC$TL_error);
            }
        });
    }

    private void preloadStory(long r9, org.telegram.tgnet.tl.TL_stories$StoryItem r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.preloadStory(long, org.telegram.tgnet.tl.TL_stories$StoryItem):void");
    }

    private void processAllStoriesResponse(org.telegram.tgnet.tl.TL_stories$TL_stories_allStories r18, boolean r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.processAllStoriesResponse(org.telegram.tgnet.tl.TL_stories$TL_stories_allStories, boolean, boolean, boolean):void");
    }

    private void putToAllStories(long j, TL_stories$PeerStories tL_stories$PeerStories) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_stories$PeerStories tL_stories$PeerStories2 = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        if (tL_stories$PeerStories2 != null && (arrayList = tL_stories$PeerStories2.stories) != null && !arrayList.isEmpty() && tL_stories$PeerStories != null && (arrayList2 = tL_stories$PeerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < tL_stories$PeerStories.stories.size(); i++) {
                if (tL_stories$PeerStories.stories.get(i) instanceof TL_stories$TL_storyItemSkipped) {
                    int i2 = ((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i)).id;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= tL_stories$PeerStories2.stories.size()) {
                            break;
                        }
                        if (((TL_stories$StoryItem) tL_stories$PeerStories2.stories.get(i3)).id == i2 && (tL_stories$PeerStories2.stories.get(i3) instanceof TL_stories$TL_storyItem)) {
                            tL_stories$PeerStories.stories.set(i, (TL_stories$StoryItem) tL_stories$PeerStories2.stories.get(i3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        this.allStoriesMap.put(j, tL_stories$PeerStories);
    }

    private TL_stories$TL_storiesStealthMode readStealthMode(String str) {
        if (str == null) {
            return null;
        }
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        try {
            return TL_stories$TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    private void sortDialogStories(ArrayList arrayList) {
        fixDeletedAndNonContactsStories(arrayList);
        Collections.sort(arrayList, this.peerStoriesComparator);
    }

    private void sortUserStories() {
        AndroidUtilities.cancelRunOnUIThread(this.sortStoriesRunnable);
        this.sortStoriesRunnable.run();
    }

    public static String storyItemIds(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories$StoryItem) list.get(i)).id + "@" + ((TL_stories$StoryItem) list.get(i)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static String storyItemMessageIds(List list) {
        StringBuilder sb;
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                TL_stories$StoryItem tL_stories$StoryItem = ((MessageObject) list.get(i)).storyItem;
                if (tL_stories$StoryItem == null) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("null");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(tL_stories$StoryItem.id);
                    sb2.append("@");
                    sb2.append(tL_stories$StoryItem.dialogId);
                    sb = sb2;
                }
                str = sb.toString();
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    private void updateStoriesForFullPeer(long j, List list) {
        TL_stories$PeerStories tL_stories$PeerStories;
        boolean z;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (j > 0) {
            TLRPC$UserFull userFull = messagesController.getUserFull(j);
            if (userFull == null) {
                return;
            }
            if (userFull.stories == null) {
                TL_stories$TL_peerStories tL_stories$TL_peerStories = new TL_stories$TL_peerStories();
                userFull.stories = tL_stories$TL_peerStories;
                tL_stories$TL_peerStories.peer = MessagesController.getInstance(this.currentAccount).getPeer(j);
                userFull.stories.max_read_id = getMaxStoriesReadId(j);
            }
            tL_stories$PeerStories = userFull.stories;
        } else {
            TLRPC$ChatFull chatFull = messagesController.getChatFull(-j);
            if (chatFull == null) {
                return;
            }
            if (chatFull.stories == null) {
                TL_stories$TL_peerStories tL_stories$TL_peerStories2 = new TL_stories$TL_peerStories();
                chatFull.stories = tL_stories$TL_peerStories2;
                tL_stories$TL_peerStories2.peer = MessagesController.getInstance(this.currentAccount).getPeer(j);
                chatFull.stories.max_read_id = getMaxStoriesReadId(j);
            }
            tL_stories$PeerStories = chatFull.stories;
        }
        for (int i = 0; i < list.size(); i++) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) list.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= tL_stories$PeerStories.stories.size()) {
                    z = false;
                    break;
                }
                if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id == tL_stories$StoryItem.id) {
                    z = true;
                    if (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) {
                        tL_stories$PeerStories.stories.remove(i2);
                    } else {
                        TL_stories$StoryItem tL_stories$StoryItem2 = (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2);
                        tL_stories$StoryItem = applyStoryUpdate(tL_stories$StoryItem2, tL_stories$StoryItem);
                        tL_stories$PeerStories.stories.set(i2, tL_stories$StoryItem);
                        if (tL_stories$StoryItem.attachPath == null) {
                            tL_stories$StoryItem.attachPath = tL_stories$StoryItem2.attachPath;
                        }
                        if (tL_stories$StoryItem.firstFramePath == null) {
                            tL_stories$StoryItem.firstFramePath = tL_stories$StoryItem2.firstFramePath;
                        }
                        FileLog.d("StoriesController update story for full peer storyId=" + tL_stories$StoryItem.id);
                    }
                } else {
                    i2++;
                }
            }
            if (!z) {
                if (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted) {
                    FileLog.d("StoriesController story is not found, but already deleted storyId=" + tL_stories$StoryItem.id);
                } else {
                    FileLog.d("StoriesController add new story for full peer storyId=" + tL_stories$StoryItem.id);
                    tL_stories$PeerStories.stories.add(tL_stories$StoryItem);
                }
            }
        }
    }

    private void writeStealthMode(TL_stories$TL_storiesStealthMode tL_stories$TL_storiesStealthMode) {
        SharedPreferences.Editor putString;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        if (tL_stories$TL_storiesStealthMode == null) {
            putString = edit.remove("stories_stealth_mode");
        } else {
            SerializedData serializedData = new SerializedData(tL_stories$TL_storiesStealthMode.getObjectSize());
            tL_stories$TL_storiesStealthMode.serializeToStream(serializedData);
            putString = edit.putString("stories_stealth_mode", Utilities.bytesToHex(serializedData.toByteArray()));
        }
        putString.apply();
    }

    public void applyStoryViewsBlocked(TL_stories$StoryViewsList tL_stories$StoryViewsList) {
        if (tL_stories$StoryViewsList == null || tL_stories$StoryViewsList.views == null) {
            return;
        }
        for (int i = 0; i < tL_stories$StoryViewsList.views.size(); i++) {
            TL_stories$StoryView tL_stories$StoryView = (TL_stories$StoryView) tL_stories$StoryViewsList.views.get(i);
            if (this.blockedOverride.containsKey(tL_stories$StoryView.user_id)) {
                this.blockedOverride.put(tL_stories$StoryView.user_id, Boolean.valueOf(tL_stories$StoryView.blocked_my_stories_from));
            }
        }
    }

    public boolean canDeleteStory(TL_stories$StoryItem tL_stories$StoryItem) {
        TLRPC$Chat chat;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2;
        TLRPC$User user;
        if (tL_stories$StoryItem == null || tL_stories$StoryItem.dialogId == getSelfUserId()) {
            return false;
        }
        if (tL_stories$StoryItem.dialogId > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_stories$StoryItem.dialogId))) != null && user.bot && user.bot_can_edit) {
            return true;
        }
        if (tL_stories$StoryItem.dialogId >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tL_stories$StoryItem.dialogId))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        boolean z = tL_stories$StoryItem.out;
        if (z && (tLRPC$TL_chatAdminRights2 = chat.admin_rights) != null && (tLRPC$TL_chatAdminRights2.post_stories || tLRPC$TL_chatAdminRights2.delete_stories)) {
            return true;
        }
        return (z || (tLRPC$TL_chatAdminRights = chat.admin_rights) == null || !tLRPC$TL_chatAdminRights.delete_stories) ? false : true;
    }

    public boolean canEditStories(long j) {
        TLRPC$Chat chat;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        if (j >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) == null) {
            return false;
        }
        return chat.creator || ((tLRPC$TL_chatAdminRights = chat.admin_rights) != null && tLRPC$TL_chatAdminRights.edit_stories);
    }

    public boolean canEditStory(TL_stories$StoryItem tL_stories$StoryItem) {
        TLRPC$Chat chat;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2;
        TLRPC$User user;
        if (tL_stories$StoryItem == null || tL_stories$StoryItem.dialogId == getSelfUserId()) {
            return false;
        }
        if (tL_stories$StoryItem.dialogId > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_stories$StoryItem.dialogId))) != null && user.bot && user.bot_can_edit) {
            return true;
        }
        if (tL_stories$StoryItem.dialogId >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tL_stories$StoryItem.dialogId))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        boolean z = tL_stories$StoryItem.out;
        if (z && (tLRPC$TL_chatAdminRights2 = chat.admin_rights) != null && (tLRPC$TL_chatAdminRights2.post_stories || tLRPC$TL_chatAdminRights2.edit_stories)) {
            return true;
        }
        return (z || (tLRPC$TL_chatAdminRights = chat.admin_rights) == null || !tLRPC$TL_chatAdminRights.edit_stories) ? false : true;
    }

    public boolean canPostStories(long j) {
        TLRPC$User user;
        if (j >= 0) {
            return j > 0 && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) != null && user.bot && user.bot_can_edit;
        }
        TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = chat.admin_rights;
        return tLRPC$TL_chatAdminRights != null && tLRPC$TL_chatAdminRights.post_stories;
    }

    public void canSendStoryFor(final long j, final Consumer consumer, final boolean z, Theme.ResourcesProvider resourcesProvider) {
        TL_stories$TL_stories_canSendStory tL_stories$TL_stories_canSendStory = new TL_stories$TL_stories_canSendStory();
        tL_stories$TL_stories_canSendStory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_canSendStory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$canSendStoryFor$33(z, j, consumer, tLObject, tLRPC$TL_error);
            }
        }, 1024);
    }

    public void checkExpiredStories() {
        checkExpireStories(this.dialogListStories);
        checkExpireStories(this.hiddenListStories);
    }

    public void checkExpiredStories(long j) {
        TL_stories$PeerStories stories = getStories(j);
        if (stories == null) {
            return;
        }
        int i = 0;
        while (i < stories.stories.size()) {
            if (StoriesUtilities.isExpired(this.currentAccount, (TL_stories$StoryItem) stories.stories.get(i))) {
                stories.stories.remove(i);
                i--;
            }
            i++;
        }
        if (!stories.stories.isEmpty() || hasUnreadStories(j)) {
            return;
        }
        this.dialogListStories.remove(stories);
        this.hiddenListStories.remove(stories);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public boolean checkStoryError(org.telegram.tgnet.TLRPC$TL_error r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.checkStoryError(org.telegram.tgnet.TLRPC$TL_error):boolean");
    }

    public StoryLimit checkStoryLimit() {
        if (getMyStoriesCount() >= (UserConfig.getInstance(this.currentAccount).isPremium() ? MessagesController.getInstance(this.currentAccount).storyExpiringLimitPremium : MessagesController.getInstance(this.currentAccount).storyExpiringLimitDefault)) {
            return new StoryLimit(1, 0L);
        }
        if (this.storyLimitFetched) {
            return this.storyLimitCached;
        }
        TL_stories$TL_stories_canSendStory tL_stories$TL_stories_canSendStory = new TL_stories$TL_stories_canSendStory();
        tL_stories$TL_stories_canSendStory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_canSendStory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$checkStoryLimit$28(tLObject, tLRPC$TL_error);
            }
        }, 1024);
        return null;
    }

    public void cleanup() {
        this.allStoriesLoaded = false;
        this.allHiddenStoriesLoaded = false;
        this.storiesReadLoaded = false;
        this.stateHidden = "";
        this.state = "";
        this.mainSettings.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        final DraftsController draftsController = this.draftsController;
        Objects.requireNonNull(draftsController);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DraftsController.this.cleanup();
            }
        });
        loadStories();
        loadStoriesRead();
    }

    public void deleteStories(long j, ArrayList arrayList) {
        TLRPC$ChatFull chatFull;
        TL_stories$PeerStories tL_stories$PeerStories;
        TLRPC$UserFull userFull;
        if (arrayList == null) {
            return;
        }
        TL_stories$TL_stories_deleteStories tL_stories$TL_stories_deleteStories = new TL_stories$TL_stories_deleteStories();
        TLRPC$InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories$TL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        TL_stories$PeerStories tL_stories$PeerStories2 = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) arrayList.get(i);
            if (!(tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted)) {
                if (tL_stories$PeerStories2 != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= tL_stories$PeerStories2.stories.size()) {
                            break;
                        }
                        if (((TL_stories$StoryItem) tL_stories$PeerStories2.stories.get(i2)).id == tL_stories$StoryItem.id) {
                            tL_stories$PeerStories2.stories.remove(i2);
                            if (tL_stories$PeerStories2.stories.isEmpty()) {
                                this.allStoriesMap.remove(j);
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                tL_stories$TL_stories_deleteStories.id.add(Integer.valueOf(tL_stories$StoryItem.id));
            }
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (j < 0 ? !((chatFull = messagesController.getChatFull(-j)) == null || (tL_stories$PeerStories = chatFull.stories) == null) : !((userFull = messagesController.getUserFull(j)) == null || (tL_stories$PeerStories = userFull.stories) == null)) {
            tL_stories$PeerStories2 = tL_stories$PeerStories;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_stories$StoryItem tL_stories$StoryItem2 = (TL_stories$StoryItem) arrayList.get(i3);
            if (!(tL_stories$StoryItem2 instanceof TL_stories$TL_storyItemDeleted) && tL_stories$PeerStories2 != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= tL_stories$PeerStories2.stories.size()) {
                        break;
                    }
                    if (((TL_stories$StoryItem) tL_stories$PeerStories2.stories.get(i4)).id == tL_stories$StoryItem2.id) {
                        tL_stories$PeerStories2.stories.remove(i4);
                        break;
                    }
                    i4++;
                }
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_deleteStories, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$deleteStories$14(tLObject, tLRPC$TL_error);
            }
        });
        updateDeletedStoriesInLists(j, arrayList);
        this.storiesStorage.deleteStories(j, tL_stories$TL_stories_deleteStories.id);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void deleteStory(long j, TL_stories$StoryItem tL_stories$StoryItem) {
        TLRPC$ChatFull tLRPC$ChatFull;
        TLRPC$UserFull tLRPC$UserFull;
        if (tL_stories$StoryItem == null || (tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted)) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            TL_stories$PeerStories tL_stories$PeerStories = null;
            if (i == 0) {
                tLRPC$ChatFull = null;
                tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
                tLRPC$UserFull = null;
            } else if (j >= 0) {
                tLRPC$UserFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
                if (tLRPC$UserFull != null) {
                    tLRPC$ChatFull = null;
                    tL_stories$PeerStories = tLRPC$UserFull.stories;
                } else {
                    tLRPC$ChatFull = null;
                }
            } else {
                TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-j);
                if (chatFull != null) {
                    TL_stories$PeerStories tL_stories$PeerStories2 = chatFull.stories;
                    tLRPC$UserFull = null;
                    tL_stories$PeerStories = tL_stories$PeerStories2;
                    tLRPC$ChatFull = chatFull;
                } else {
                    tLRPC$ChatFull = chatFull;
                    tLRPC$UserFull = null;
                }
            }
            if (tL_stories$PeerStories != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_stories$PeerStories.stories.size()) {
                        break;
                    }
                    if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id == tL_stories$StoryItem.id) {
                        tL_stories$PeerStories.stories.remove(i2);
                        if (tL_stories$PeerStories.stories.size() == 0) {
                            if (!hasUploadingStories(j)) {
                                this.allStoriesMap.remove(j);
                                this.dialogListStories.remove(tL_stories$PeerStories);
                                this.hiddenListStories.remove(tL_stories$PeerStories);
                            }
                            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                            if (j > 0) {
                                TLRPC$User user = messagesController.getUser(Long.valueOf(j));
                                if (user != null) {
                                    user.stories_unavailable = true;
                                }
                            } else {
                                TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-j));
                                if (chat != null) {
                                    chat.stories_unavailable = true;
                                }
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (tLRPC$ChatFull != null) {
                MessagesStorage.getInstance(this.currentAccount).updateChatInfo(tLRPC$ChatFull, false);
            }
            if (tLRPC$UserFull != null) {
                MessagesStorage.getInstance(this.currentAccount).updateUserInfo(tLRPC$UserFull, false);
            }
        }
        TL_stories$TL_stories_deleteStories tL_stories$TL_stories_deleteStories = new TL_stories$TL_stories_deleteStories();
        tL_stories$TL_stories_deleteStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories$TL_stories_deleteStories.id.add(Integer.valueOf(tL_stories$StoryItem.id));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_deleteStories, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$deleteStory$13(tLObject, tLRPC$TL_error);
            }
        });
        this.storiesStorage.deleteStory(j, tL_stories$StoryItem.id);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
        updateDeletedStoriesInLists(j, Arrays.asList(tL_stories$StoryItem));
    }

    public void destroyStoryList(StoriesList storiesList) {
        HashMap hashMap = this.storiesLists[storiesList.type];
        if (hashMap != null) {
            hashMap.remove(Long.valueOf(storiesList.dialogId));
        }
    }

    public void fillMessagesWithStories(LongSparseArray longSparseArray, Runnable runnable, int i, Timer timer) {
        this.storiesStorage.fillMessagesWithStories(longSparseArray, runnable, i, timer);
    }

    public UploadingStory findEditingStory(long j, TL_stories$StoryItem tL_stories$StoryItem) {
        HashMap hashMap;
        if (tL_stories$StoryItem == null || (hashMap = (HashMap) this.editingStories.get(j)) == null || hashMap.isEmpty()) {
            return null;
        }
        return (UploadingStory) hashMap.get(Integer.valueOf(tL_stories$StoryItem.id));
    }

    public int getBlocklistCount() {
        return this.blocklistCount;
    }

    public ArrayList getDialogListStories() {
        return this.dialogListStories;
    }

    public DraftsController getDraftsController() {
        return this.draftsController;
    }

    public UploadingStory getEditingStory(long j) {
        HashMap hashMap = (HashMap) this.editingStories.get(j);
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        Collection values = hashMap.values();
        if (values.isEmpty()) {
            return null;
        }
        return (UploadingStory) values.iterator().next();
    }

    public ArrayList getHiddenList() {
        return this.hiddenListStories;
    }

    public int getMaxStoriesReadId(long j) {
        TL_stories$PeerStories stories = getStories(j);
        if (stories == null) {
            stories = getStoriesFromFullPeer(j);
        }
        return stories != null ? Math.max(stories.max_read_id, this.dialogIdToMaxReadId.get(j, 0)) : this.dialogIdToMaxReadId.get(j, 0);
    }

    public int getMyStoriesCount() {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.uploadingAndEditingStories.get(getSelfUserId());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories$PeerStories stories = getStories(getSelfUserId());
        return (stories == null || (arrayList = stories.stories) == null) ? size : size + arrayList.size();
    }

    public int getSelfStoriesCount() {
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(UserConfig.getInstance(this.currentAccount).clientUserId);
        return (tL_stories$PeerStories != null ? tL_stories$PeerStories.stories.size() : 0) + this.uploadingStoriesByDialogId.size();
    }

    public TL_stories$TL_storiesStealthMode getStealthMode() {
        return this.stealthMode;
    }

    public TL_stories$PeerStories getStories(long j) {
        return (TL_stories$PeerStories) this.allStoriesMap.get(j);
    }

    public TL_stories$PeerStories getStoriesFromFullPeer(long j) {
        TL_stories$PeerStories tL_stories$PeerStories;
        TL_stories$PeerStories tL_stories$PeerStories2;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (j > 0) {
            TLRPC$UserFull userFull = messagesController.getUserFull(j);
            if (userFull != null && (tL_stories$PeerStories2 = userFull.stories) != null && !tL_stories$PeerStories2.checkedExpired) {
                checkExpireStories(tL_stories$PeerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC$ChatFull chatFull = messagesController.getChatFull(-j);
        if (chatFull != null && (tL_stories$PeerStories = chatFull.stories) != null && !tL_stories$PeerStories.checkedExpired) {
            checkExpireStories(tL_stories$PeerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }

    public StoriesList getStoriesList(long j, int i) {
        return getStoriesList(j, i, true);
    }

    public StoriesStorage getStoriesStorage() {
        return this.storiesStorage;
    }

    public int getTotalStoriesCount(boolean z) {
        return z ? this.hasMoreHidden ? Math.max(1, this.totalStoriesCountHidden) : this.hiddenListStories.size() : this.hasMore ? Math.max(1, this.totalStoriesCount) : this.dialogListStories.size();
    }

    public int getUnreadState(long j) {
        return getUnreadState(j, 0);
    }

    public int getUnreadState(long j, int i) {
        if (j == 0) {
            return 0;
        }
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        if (tL_stories$PeerStories == null) {
            tL_stories$PeerStories = getStoriesFromFullPeer(j);
        }
        if (tL_stories$PeerStories == null) {
            return 0;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return 1;
        }
        int max = Math.max(tL_stories$PeerStories.max_read_id, this.dialogIdToMaxReadId.get(j, 0));
        boolean z = false;
        for (int i2 = 0; i2 < tL_stories$PeerStories.stories.size(); i2++) {
            if ((i == 0 || ((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id == i) && ((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id > max) {
                if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).close_friends) {
                    return 2;
                }
                z = true;
            }
        }
        return (!isLastUploadingFailed(j) && z) ? 1 : 0;
    }

    public int getUnreadStoriesCount(long j) {
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        for (int i = 0; i < tL_stories$PeerStories.stories.size(); i++) {
            if (tL_stories$PeerStories.max_read_id < ((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i)).id) {
                return tL_stories$PeerStories.stories.size() - i;
            }
        }
        return 0;
    }

    public ArrayList getUploadingAndEditingStories(long j) {
        return (ArrayList) this.uploadingAndEditingStories.get(j);
    }

    public ArrayList getUploadingStories(long j) {
        return (ArrayList) this.uploadingStoriesByDialogId.get(j);
    }

    public boolean hasHiddenStories() {
        return !this.hiddenListStories.isEmpty();
    }

    public boolean hasLoadingStories() {
        return this.loadingDialogsStories.size() > 0;
    }

    public boolean hasOnlySelfStories() {
        if (hasSelfStories()) {
            return getDialogListStories().isEmpty() || (getDialogListStories().size() == 1 && DialogObject.getPeerDialogId(((TL_stories$PeerStories) getDialogListStories().get(0)).peer) == UserConfig.getInstance(this.currentAccount).clientUserId);
        }
        return false;
    }

    public boolean hasSelfStories() {
        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        return ((tL_stories$PeerStories == null || tL_stories$PeerStories.stories.isEmpty()) && Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) ? false : true;
    }

    public boolean hasStories() {
        ArrayList arrayList = this.dialogListStories;
        return (arrayList != null && arrayList.size() > 0) || hasSelfStories();
    }

    public boolean hasStories(long j) {
        if (j == 0) {
            return false;
        }
        if (hasUploadingStories(j) || isLastUploadingFailed(j)) {
            return true;
        }
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        if (tL_stories$PeerStories == null) {
            tL_stories$PeerStories = getStoriesFromFullPeer(j);
        }
        return (tL_stories$PeerStories == null || tL_stories$PeerStories.stories.isEmpty()) ? false : true;
    }

    public boolean hasStoryLimit() {
        StoryLimit checkStoryLimit = checkStoryLimit();
        return checkStoryLimit != null && checkStoryLimit.active(this.currentAccount);
    }

    public boolean hasUnreadStories(long j) {
        TL_stories$PeerStories tL_stories$PeerStories = (TL_stories$PeerStories) this.allStoriesMap.get(j);
        if (tL_stories$PeerStories == null) {
            tL_stories$PeerStories = getStoriesFromFullPeer(j);
        }
        if (tL_stories$PeerStories == null) {
            return false;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return true;
        }
        for (int i = 0; i < tL_stories$PeerStories.stories.size(); i++) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i);
            if (tL_stories$StoryItem != null && tL_stories$StoryItem.id > tL_stories$PeerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public boolean hasUploadingStories(long j) {
        ArrayList arrayList = (ArrayList) this.uploadingStoriesByDialogId.get(j);
        HashMap hashMap = (HashMap) this.editingStories.get(j);
        return ((arrayList == null || arrayList.isEmpty()) && (hashMap == null || hashMap.isEmpty())) ? false : true;
    }

    public void invalidateStoryLimit() {
        this.storyLimitFetched = false;
        this.storyLimitCached = null;
    }

    public boolean isBlocked(TL_stories$StoryView tL_stories$StoryView) {
        if (tL_stories$StoryView == null) {
            return false;
        }
        return this.blockedOverride.containsKey(tL_stories$StoryView.user_id) ? ((Boolean) this.blockedOverride.get(tL_stories$StoryView.user_id)).booleanValue() : this.lastBlocklistRequested == 0 ? tL_stories$StoryView.blocked_my_stories_from || tL_stories$StoryView.blocked : this.blocklist.contains(Long.valueOf(tL_stories$StoryView.user_id)) || tL_stories$StoryView.blocked_my_stories_from || tL_stories$StoryView.blocked;
    }

    public boolean isLastUploadingFailed(long j) {
        ArrayList arrayList = (ArrayList) this.uploadingStoriesByDialogId.get(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return ((UploadingStory) arrayList.get(arrayList.size() - 1)).failed;
    }

    public boolean isLoading(long j) {
        return this.loadingDialogsStories.get(j, 0) == 1;
    }

    public void loadAllStories() {
        if (this.firstLoad) {
            return;
        }
        loadStories();
        loadStoriesRead();
    }

    public void loadBlocklist(boolean z) {
        if (this.blocklistLoading) {
            if (!z || this.blocklistLoadingReset) {
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.blocklistReqId, true);
            this.blocklistReqId = 0;
            this.blocklistLoadingReset = false;
            this.blocklistLoading = false;
        }
        if (!z || System.currentTimeMillis() - this.lastBlocklistRequested >= 1800000) {
            if (z || !this.blocklistFull) {
                this.blocklistLoading = true;
                this.blocklistLoadingReset = z;
                TLRPC$TL_contacts_getBlocked tLRPC$TL_contacts_getBlocked = new TLRPC$TL_contacts_getBlocked();
                tLRPC$TL_contacts_getBlocked.my_stories_from = true;
                if (z) {
                    tLRPC$TL_contacts_getBlocked.offset = 0;
                    tLRPC$TL_contacts_getBlocked.limit = 100;
                    this.blocklistFull = false;
                } else {
                    tLRPC$TL_contacts_getBlocked.offset = this.blocklist.size();
                    tLRPC$TL_contacts_getBlocked.limit = 25;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_getBlocked, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StoriesController.this.lambda$loadBlocklist$24(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }
    }

    public void loadBlocklistAtFirst() {
        if (this.lastBlocklistRequested == 0) {
            loadBlocklist(false);
        }
    }

    public void loadHiddenStories() {
        if (this.hasMoreHidden) {
            loadFromServer(true);
        }
    }

    public void loadNextStories(boolean z) {
        if (this.hasMore) {
            loadFromServer(z);
        }
    }

    public void loadSendAs() {
        if (this.loadingSendAs || this.loadedSendAs) {
            return;
        }
        this.loadingSendAs = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$messages_Chats.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1519744160);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.this.lambda$loadSendAs$35(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void loadSkippedStories(long j) {
        boolean z;
        TL_stories$PeerStories stories = getStories(j);
        if (stories == null) {
            stories = getStoriesFromFullPeer(j);
            z = true;
        } else {
            z = false;
        }
        loadSkippedStories(stories, z);
    }

    public void loadSkippedStories(final TL_stories$PeerStories tL_stories$PeerStories, final boolean z) {
        if (tL_stories$PeerStories == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
        final long j = peerDialogId * (z ? -1 : 1);
        if (this.loadingAllStories.contains(Long.valueOf(j))) {
            return;
        }
        ArrayList arrayList = null;
        for (int i = 0; i < tL_stories$PeerStories.stories.size(); i++) {
            if (tL_stories$PeerStories.stories.get(i) instanceof TL_stories$TL_storyItemSkipped) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Integer.valueOf(((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i)).id));
            }
            if (arrayList != null && arrayList.size() > 14) {
                break;
            }
        }
        if (arrayList != null) {
            this.loadingAllStories.add(Long.valueOf(j));
            TL_stories$TL_stories_getStoriesByID tL_stories$TL_stories_getStoriesByID = new TL_stories$TL_stories_getStoriesByID();
            tL_stories$TL_stories_getStoriesByID.id = arrayList;
            tL_stories$TL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(peerDialogId);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.this.lambda$loadSkippedStories$20(j, z, tL_stories$PeerStories, peerDialogId, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void loadStories() {
        if (this.firstLoad) {
            this.loadingFromDatabase = true;
            this.storiesStorage.getAllStories(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    StoriesController.this.lambda$loadStories$5((TL_stories$TL_stories_allStories) obj);
                }
            });
        } else {
            loadFromServer(false);
            loadFromServer(true);
        }
        this.firstLoad = false;
    }

    public void markStoriesAsReadFromServer(final long j, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoriesController.this.lambda$markStoriesAsReadFromServer$18(j, i);
            }
        });
    }

    public boolean markStoryAsRead(long j, TL_stories$StoryItem tL_stories$StoryItem) {
        TL_stories$PeerStories stories = getStories(j);
        if (stories == null) {
            stories = getStoriesFromFullPeer(j);
        }
        return markStoryAsRead(stories, tL_stories$StoryItem, false);
    }

    public boolean markStoryAsRead(TL_stories$PeerStories tL_stories$PeerStories, TL_stories$StoryItem tL_stories$StoryItem, boolean z) {
        if (tL_stories$StoryItem != null && tL_stories$PeerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
            if (tL_stories$StoryItem.justUploaded) {
                tL_stories$StoryItem.justUploaded = false;
            }
            int i = this.dialogIdToMaxReadId.get(peerDialogId);
            int max = Math.max(tL_stories$PeerStories.max_read_id, Math.max(i, tL_stories$StoryItem.id));
            NotificationsController.getInstance(this.currentAccount).processReadStories(peerDialogId, max);
            tL_stories$PeerStories.max_read_id = max;
            this.dialogIdToMaxReadId.put(peerDialogId, max);
            if (max > i) {
                if (!z) {
                    this.storiesStorage.updateMaxReadId(peerDialogId, max);
                }
                TL_stories$TL_stories_readStories tL_stories$TL_stories_readStories = new TL_stories$TL_stories_readStories();
                tL_stories$TL_stories_readStories.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(peerDialogId);
                tL_stories$TL_stories_readStories.max_id = tL_stories$StoryItem.id;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_readStories, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        StoriesController.lambda$markStoryAsRead$17(tLObject, tLRPC$TL_error);
                    }
                });
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public void onPremiumChanged() {
        this.selfViewsModel.clear();
    }

    public void pollViewsForSelfStories(long j, boolean z) {
        ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) this.pollingViewsForSelfStoriesRequester.get(j);
        if (viewsForPeerStoriesRequester == null) {
            viewsForPeerStoriesRequester = new ViewsForPeerStoriesRequester(this, j, this.currentAccount);
            this.pollingViewsForSelfStoriesRequester.put(j, viewsForPeerStoriesRequester);
        }
        viewsForPeerStoriesRequester.start(z);
    }

    public void preloadUserStories(TL_stories$PeerStories tL_stories$PeerStories) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= tL_stories$PeerStories.stories.size()) {
                break;
            }
            if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i2)).id > tL_stories$PeerStories.max_read_id) {
                i = i2;
                break;
            }
            i2++;
        }
        if (tL_stories$PeerStories.stories.isEmpty()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_stories$PeerStories.peer);
        preloadStory(peerDialogId, (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i));
        if (i > 0) {
            preloadStory(peerDialogId, (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i - 1));
        }
        if (i < tL_stories$PeerStories.stories.size() - 1) {
            preloadStory(peerDialogId, (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i + 1));
        }
    }

    public void processUpdate(final org.telegram.tgnet.tl.TL_stories$TL_updateStory r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoriesController.processUpdate(org.telegram.tgnet.tl.TL_stories$TL_updateStory):void");
    }

    public void putStories(long j, TL_stories$PeerStories tL_stories$PeerStories) {
        putToAllStories(j, tL_stories$PeerStories);
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (j > 0) {
            TLRPC$User user = messagesController.getUser(Long.valueOf(j));
            if (!isContactOrService(user) && !user.self) {
                return;
            }
        } else if (!ChatObject.isInChat(messagesController.getChat(Long.valueOf(-j)))) {
            return;
        }
        this.storiesStorage.putPeerStories(tL_stories$PeerStories);
    }

    public void putUploadingDrafts(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UploadingStory uploadingStory = new UploadingStory((StoryEntry) it.next());
            addUploadingStoryToList(uploadingStory.dialogId, uploadingStory, this.uploadingStoriesByDialogId);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void removeContact(long j) {
        int i = 0;
        while (true) {
            if (i >= this.dialogListStories.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.dialogListStories.get(i)).peer) == j) {
                this.dialogListStories.remove(i);
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.hiddenListStories.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.hiddenListStories.get(i2)).peer) == j) {
                this.hiddenListStories.remove(i2);
                break;
            }
            i2++;
        }
        this.storiesStorage.deleteAllUserStories(j);
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void resolveStoryLink(long j, int i, Consumer consumer) {
        TL_stories$PeerStories stories = getStories(j);
        if (stories != null) {
            for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                if (((TL_stories$StoryItem) stories.stories.get(i2)).id == i && !(stories.stories.get(i2) instanceof TL_stories$TL_storyItemSkipped)) {
                    consumer.accept((TL_stories$StoryItem) stories.stories.get(i2));
                    return;
                }
            }
        }
        long j2 = (i + j) << 12;
        TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) this.resolvedStories.get(j2);
        if (tL_stories$StoryItem != null) {
            consumer.accept(tL_stories$StoryItem);
            return;
        }
        TL_stories$TL_stories_getStoriesByID tL_stories$TL_stories_getStoriesByID = new TL_stories$TL_stories_getStoriesByID();
        tL_stories$TL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        tL_stories$TL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_getStoriesByID, new AnonymousClass1(j2, consumer));
    }

    public void scheduleSort() {
        AndroidUtilities.cancelRunOnUIThread(this.sortStoriesRunnable);
        this.sortStoriesRunnable.run();
    }

    public void setLoading(long j, boolean z) {
        if (z) {
            this.loadingDialogsStories.put(j, 1);
        } else {
            this.loadingDialogsStories.delete(j);
        }
    }

    public void setStealthMode(TL_stories$TL_storiesStealthMode tL_stories$TL_storiesStealthMode) {
        this.stealthMode = tL_stories$TL_storiesStealthMode;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stealthModeChanged, new Object[0]);
        writeStealthMode(tL_stories$TL_storiesStealthMode);
    }

    public void setStoryReaction(long j, TL_stories$StoryItem tL_stories$StoryItem, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji;
        if (tL_stories$StoryItem == null) {
            return;
        }
        TL_stories$TL_stories_sendReaction tL_stories$TL_stories_sendReaction = new TL_stories$TL_stories_sendReaction();
        tL_stories$TL_stories_sendReaction.story_id = tL_stories$StoryItem.id;
        tL_stories$TL_stories_sendReaction.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        if (visibleReaction == null) {
            tL_stories$TL_stories_sendReaction.reaction = new TLRPC$TL_reactionEmpty();
            tL_stories$StoryItem.flags &= -32769;
            tL_stories$StoryItem.sent_reaction = null;
        } else {
            if (visibleReaction.documentId != 0) {
                TLRPC$TL_reactionCustomEmoji tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
                tLRPC$TL_reactionCustomEmoji.document_id = visibleReaction.documentId;
                tLRPC$TL_reactionEmoji = tLRPC$TL_reactionCustomEmoji;
            } else if (visibleReaction.emojicon != null) {
                TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji2 = new TLRPC$TL_reactionEmoji();
                tLRPC$TL_reactionEmoji2.emoticon = visibleReaction.emojicon;
                tLRPC$TL_reactionEmoji = tLRPC$TL_reactionEmoji2;
            }
            tL_stories$TL_stories_sendReaction.reaction = tLRPC$TL_reactionEmoji;
            tL_stories$StoryItem.flags |= 32768;
            tL_stories$StoryItem.sent_reaction = tLRPC$TL_reactionEmoji;
        }
        updateStoryItem(j, tL_stories$StoryItem);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_sendReaction, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.lambda$setStoryReaction$21(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void sortHiddenStories() {
        sortDialogStories(this.hiddenListStories);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public void stopAllPollers() {
        for (int i = 0; i < this.pollingViewsForSelfStoriesRequester.size(); i++) {
            ((ViewsForPeerStoriesRequester) this.pollingViewsForSelfStoriesRequester.valueAt(i)).start(false);
        }
    }

    public void toggleHidden(long j, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TL_stories$PeerStories tL_stories$PeerStories;
        if (z) {
            arrayList = this.dialogListStories;
            arrayList2 = this.hiddenListStories;
        } else {
            arrayList = this.hiddenListStories;
            arrayList2 = this.dialogListStories;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                tL_stories$PeerStories = null;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) arrayList.get(i)).peer) == j) {
                    tL_stories$PeerStories = (TL_stories$PeerStories) arrayList.remove(i);
                    break;
                }
                i++;
            }
        }
        if (tL_stories$PeerStories != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    arrayList2.add(0, tL_stories$PeerStories);
                    AndroidUtilities.cancelRunOnUIThread(this.sortStoriesRunnable);
                    this.sortStoriesRunnable.run();
                    break;
                } else if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) arrayList2.get(i2)).peer) == j) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z3) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        MessagesController.getInstance(this.currentAccount).checkArchiveFolder();
        if (z2) {
            MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            if (j >= 0) {
                TLRPC$User user = messagesController.getUser(Long.valueOf(j));
                user.stories_hidden = z;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(this.currentAccount).putUser(user, false);
            } else {
                TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-j));
                chat.stories_hidden = z;
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(this.currentAccount).putChat(chat, false);
            }
            TL_stories$TL_stories_togglePeerStoriesHidden tL_stories$TL_stories_togglePeerStoriesHidden = new TL_stories$TL_stories_togglePeerStoriesHidden();
            tL_stories$TL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            tL_stories$TL_stories_togglePeerStoriesHidden.hidden = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_togglePeerStoriesHidden, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StoriesController.lambda$toggleHidden$6(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void updateBlockUser(long j, boolean z) {
        updateBlockUser(j, z, true);
    }

    public void updateBlockUser(long j, boolean z, boolean z2) {
        TLRPC$TL_contacts_unblock tLRPC$TL_contacts_unblock;
        int i;
        TLRPC$InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        if (inputPeer == null || (inputPeer instanceof TLRPC$TL_inputPeerEmpty)) {
            return;
        }
        this.blockedOverride.put(j, Boolean.valueOf(z));
        if (this.blocklist.contains(Long.valueOf(j)) != z) {
            HashSet hashSet = this.blocklist;
            Long valueOf = Long.valueOf(j);
            if (z) {
                hashSet.add(valueOf);
                i = this.blocklistCount + 1;
            } else {
                hashSet.remove(valueOf);
                i = this.blocklistCount - 1;
            }
            this.blocklistCount = i;
        }
        if (z2) {
            if (z) {
                TLRPC$TL_contacts_block tLRPC$TL_contacts_block = new TLRPC$TL_contacts_block();
                tLRPC$TL_contacts_block.my_stories_from = true;
                tLRPC$TL_contacts_block.id = inputPeer;
                tLRPC$TL_contacts_unblock = tLRPC$TL_contacts_block;
            } else {
                TLRPC$TL_contacts_unblock tLRPC$TL_contacts_unblock2 = new TLRPC$TL_contacts_unblock();
                tLRPC$TL_contacts_unblock2.my_stories_from = true;
                tLRPC$TL_contacts_unblock2.id = inputPeer;
                tLRPC$TL_contacts_unblock = tLRPC$TL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_unblock, null);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
    }

    public void updateBlockedUsers(HashSet hashSet, final Runnable runnable) {
        TLRPC$TL_contacts_setBlocked tLRPC$TL_contacts_setBlocked = new TLRPC$TL_contacts_setBlocked();
        tLRPC$TL_contacts_setBlocked.my_stories_from = true;
        tLRPC$TL_contacts_setBlocked.limit = this.blocklist.size();
        int size = this.blocklistCount - this.blocklist.size();
        this.blocklistCount = size;
        if (size < 0) {
            this.blocklistCount = 0;
        }
        this.blocklist.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            TLRPC$InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(l.longValue());
            if (inputPeer != null && !(inputPeer instanceof TLRPC$TL_inputPeerEmpty)) {
                this.blocklist.add(l);
                tLRPC$TL_contacts_setBlocked.id.add(inputPeer);
            }
        }
        this.blocklistCount += this.blocklist.size();
        tLRPC$TL_contacts_setBlocked.limit = Math.max(tLRPC$TL_contacts_setBlocked.limit, this.blocklist.size());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_contacts_setBlocked, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.lambda$updateBlockedUsers$26(runnable, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void updateDeletedStoriesInLists(long j, List list) {
        FileLog.d("updateDeletedStoriesInLists " + j + " storyItems[" + list.size() + "] {" + storyItemIds(list) + "}");
        StoriesList storiesList = getStoriesList(j, 0, false);
        StoriesList storiesList2 = getStoriesList(j, 1, false);
        if (storiesList != null) {
            storiesList.updateDeletedStories(list);
        }
        if (storiesList2 != null) {
            storiesList2.updateDeletedStories(list);
        }
    }

    public void updateStoriesFromFullPeer(long j, TL_stories$PeerStories tL_stories$PeerStories) {
        TL_stories$PeerStories tL_stories$PeerStories2;
        if (tL_stories$PeerStories == null || (tL_stories$PeerStories2 = (TL_stories$PeerStories) this.allStoriesMap.get(j)) == null) {
            return;
        }
        FileLog.d("StoriesController update stories from full peer " + j);
        for (int i = 0; i < tL_stories$PeerStories2.stories.size(); i++) {
            if (tL_stories$PeerStories2.stories.get(i) instanceof TL_stories$TL_storyItemSkipped) {
                int i2 = ((TL_stories$StoryItem) tL_stories$PeerStories2.stories.get(i)).id;
                int i3 = 0;
                while (true) {
                    if (i3 >= tL_stories$PeerStories.stories.size()) {
                        break;
                    }
                    if (((TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i3)).id == i2 && (tL_stories$PeerStories.stories.get(i3) instanceof TL_stories$TL_storyItem)) {
                        tL_stories$PeerStories2.stories.set(i, (TL_stories$StoryItem) tL_stories$PeerStories.stories.get(i3));
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public void updateStoriesInLists(long j, List list) {
        FileLog.d("updateStoriesInLists " + j + " storyItems[" + list.size() + "] {" + storyItemIds(list) + "}");
        StoriesList storiesList = getStoriesList(j, 0, false);
        StoriesList storiesList2 = getStoriesList(j, 1, false);
        if (storiesList != null) {
            storiesList.updateStories(list);
        }
        if (storiesList2 != null) {
            storiesList2.updateStories(list);
        }
    }

    public void updateStoriesPinned(long j, ArrayList arrayList, boolean z, final Utilities.Callback callback) {
        TL_stories$TL_stories_togglePinned tL_stories$TL_stories_togglePinned = new TL_stories$TL_stories_togglePinned();
        TL_stories$PeerStories stories = getStories(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories$StoryItem tL_stories$StoryItem = (TL_stories$StoryItem) arrayList.get(i);
            if (!(tL_stories$StoryItem instanceof TL_stories$TL_storyItemDeleted)) {
                tL_stories$StoryItem.pinned = z;
                tL_stories$TL_stories_togglePinned.id.add(Integer.valueOf(tL_stories$StoryItem.id));
                if (stories != null) {
                    for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                        if (((TL_stories$StoryItem) stories.stories.get(i2)).id == tL_stories$StoryItem.id) {
                            ((TL_stories$StoryItem) stories.stories.get(i2)).pinned = z;
                            this.storiesStorage.updateStoryItem(j, tL_stories$StoryItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        updateStoriesInLists(j, arrayList);
        updateStoriesForFullPeer(j, arrayList);
        tL_stories$TL_stories_togglePinned.pinned = z;
        tL_stories$TL_stories_togglePinned.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories$TL_stories_togglePinned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StoriesController.lambda$updateStoriesPinned$16(Utilities.Callback.this, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void updateStoryItem(long j, TL_stories$StoryItem tL_stories$StoryItem) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("StoriesController updateStoryItem ");
        sb.append(j);
        sb.append(" ");
        if (tL_stories$StoryItem == null) {
            str = "null";
        } else {
            str = tL_stories$StoryItem.id + "@" + tL_stories$StoryItem.dialogId;
        }
        sb.append(str);
        FileLog.d(sb.toString());
        this.storiesStorage.updateStoryItem(j, tL_stories$StoryItem);
        updateStoriesInLists(j, Collections.singletonList(tL_stories$StoryItem));
        updateStoriesForFullPeer(j, Collections.singletonList(tL_stories$StoryItem));
    }

    public void updateStoryReaction(long j, int i, TLRPC$Reaction tLRPC$Reaction) {
        TL_stories$StoryItem findStory = findStory(j, i);
        if (findStory != null) {
            findStory.sent_reaction = tLRPC$Reaction;
            findStory.flags = tLRPC$Reaction != null ? findStory.flags | 32768 : findStory.flags & (-32769);
            updateStoryItem(j, findStory);
        }
    }

    public void uploadStory(StoryEntry storyEntry, boolean z) {
        boolean z2;
        boolean z3;
        UploadingStory uploadingStory = new UploadingStory(storyEntry);
        if (z) {
            long j = uploadingStory.dialogId;
            if (storyEntry.isEdit) {
                HashMap hashMap = (HashMap) this.editingStories.get(j);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    this.editingStories.put(j, hashMap);
                }
                hashMap.put(Integer.valueOf(storyEntry.editStoryId), uploadingStory);
            } else {
                addUploadingStoryToList(j, uploadingStory, this.uploadingStoriesByDialogId);
            }
            addUploadingStoryToList(j, uploadingStory, this.uploadingAndEditingStories);
            if (j != UserConfig.getInstance(this.currentAccount).clientUserId) {
                int i = 0;
                while (true) {
                    z2 = true;
                    if (i >= this.dialogListStories.size()) {
                        z3 = false;
                        break;
                    } else {
                        if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.dialogListStories.get(i)).peer) == j) {
                            this.dialogListStories.add(0, (TL_stories$PeerStories) this.dialogListStories.remove(i));
                            z3 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (!z3) {
                    for (int i2 = 0; i2 < this.hiddenListStories.size(); i2++) {
                        if (DialogObject.getPeerDialogId(((TL_stories$PeerStories) this.hiddenListStories.get(i2)).peer) == j) {
                            this.hiddenListStories.add(0, (TL_stories$PeerStories) this.hiddenListStories.remove(i2));
                            break;
                        }
                    }
                }
                z2 = z3;
                if (!z2) {
                    TL_stories$TL_peerStories tL_stories$TL_peerStories = new TL_stories$TL_peerStories();
                    tL_stories$TL_peerStories.peer = MessagesController.getInstance(this.currentAccount).getPeer(j);
                    putToAllStories(j, tL_stories$TL_peerStories);
                    this.dialogListStories.add(0, tL_stories$TL_peerStories);
                    loadAllStoriesForDialog(j);
                }
            }
        }
        uploadingStory.start();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }
}
