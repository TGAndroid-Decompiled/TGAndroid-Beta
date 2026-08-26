package org.telegram.ui.Stories;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.File;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda9;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MediaDataController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda103;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda63;
import org.telegram.ui.LocationActivity$$ExternalSyntheticLambda44;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda0;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda126;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda116;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda65;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda70;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda24;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class StoriesController {
    public static final Comparator storiesComparator = Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(18));
    public int blocklistCount;
    public final int currentAccount;
    public final DraftsController draftsController;
    public boolean hasMore;
    public boolean loadedSendAs;
    public boolean loadingFromDatabase;
    public boolean loadingFromServer;
    public boolean loadingFromServerHidden;
    public boolean loadingSendAs;
    public final SharedPreferences mainSettings;
    public final HashSet requestingUnsupportedStories;
    public final ArrayList sendAs;
    public final OAuthSheet$$ExternalSyntheticLambda17 sortStoriesRunnable;
    public String state;
    public String stateHidden;
    public TL_stories.TL_storiesStealthMode stealthMode;
    public boolean storiesReadLoaded;
    public final StoriesStorage storiesStorage;
    public StoryLimit storyLimitCached;
    public boolean storyLimitFetched;
    public int totalStoriesCount;
    public int totalStoriesCountHidden;
    public final HashSet unsupportedStoriesChecked;
    public final LongSparseArray uploadingStoriesByDialogId = new LongSparseArray();
    public final LongSparseArray uploadingAndEditingStories = new LongSparseArray();
    public int uploadedStories = 0;
    public final LongSparseArray editingStories = new LongSparseArray();
    public LongSparseIntArray dialogIdToMaxReadId = new LongSparseIntArray();
    public final ArrayList dialogListStories = new ArrayList();
    public final ArrayList hiddenListStories = new ArrayList();
    public final LongSparseArray allStoriesMap = new LongSparseArray();
    public final LongSparseIntArray loadingDialogsStories = new LongSparseIntArray();
    public final LongSparseArray pollingViewsForSelfStoriesRequester = new LongSparseArray();
    public final LongSparseArray selfViewsModel = new LongSparseArray();
    public boolean hasMoreHidden = true;
    public boolean firstLoad = true;
    public final HashSet allStoriesLoading = new HashSet();
    public final HashSet loadingAllStories = new HashSet();
    public final LongSparseArray resolvedStories = new LongSparseArray();
    public final LongSparseArray storiesCollections = new LongSparseArray();
    public final HashMap[] storiesLists = new HashMap[5];
    public final HashMap storiesAlbumsLists = new HashMap();
    public final ArrayList attachedSearchLists = new ArrayList();
    public final TableModel$$ExternalSyntheticLambda0 peerStoriesComparator = new TableModel$$ExternalSyntheticLambda0(this, 13);
    public final HashSet blocklist = new HashSet();
    public final LongSparseArray blockedOverride = new LongSparseArray();
    public boolean blocklistFull = false;
    public boolean blocklistLoading = false;
    public long lastBlocklistRequested = 0;

    public final class AnonymousClass1 implements RequestDelegate {
        public final LaunchActivity$$ExternalSyntheticLambda103 val$consumer;
        public final long val$hash;

        public AnonymousClass1(long j, LaunchActivity$$ExternalSyntheticLambda103 launchActivity$$ExternalSyntheticLambda103) {
            this.val$hash = j;
            this.val$consumer = launchActivity$$ExternalSyntheticLambda103;
        }

        @Override
        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda126(this, tLObject, this.val$hash, this.val$consumer, 11));
        }
    }

    public final class AnonymousClass2 implements RequestDelegate {
        public final Consumer val$consumer;
        public final long val$hash;

        public AnonymousClass2(long j, Consumer consumer) {
            this.val$hash = j;
            this.val$consumer = consumer;
        }

        @Override
        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda126(this, tLObject, this.val$hash, this.val$consumer, 12));
        }
    }

    public final class BotPreview extends TL_stories.StoryItem {
        public final BotPreviewsList list;

        public BotPreview(BotPreviewsList botPreviewsList, long j, TL_bots.botPreviewMedia botpreviewmedia) {
            this.list = botPreviewsList;
            this.dialogId = j;
            TLRPC.MessageMedia messageMedia = botpreviewmedia.media;
            this.media = messageMedia;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                document.date = botpreviewmedia.date;
                return;
            }
            TLRPC.Photo photo = messageMedia.photo;
            if (photo != null) {
                photo.date = botpreviewmedia.date;
            }
        }
    }

    public final class BotPreviewsList extends StoriesList {
        public final ArrayList fakeDays;
        public final String lang_code;
        public final ArrayList lang_codes;
        public int lastId;
        public boolean loaded;
        public boolean loading;
        public int reqId;

        public BotPreviewsList(int i, long j, String str, VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7) {
            super(i, j, 4, -1, voIPFragment$$ExternalSyntheticLambda7);
            this.lang_codes = new ArrayList();
            this.fakeDays = new ArrayList();
            this.lastId = 0;
            this.lang_code = str;
        }

        public final void delete(ArrayList arrayList) {
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.messageObjects;
                if (i >= arrayList2.size()) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (MessagesController.equals(messageObject.storyItem.media, (TLRPC.MessageMedia) arrayList.get(i2))) {
                        arrayList2.remove(i);
                        ArrayList arrayList3 = this.fakeDays;
                        if (!arrayList3.isEmpty() && messageObject.getId() < ((ArrayList) arrayList3.get(0)).size()) {
                            ((ArrayList) arrayList3.get(0)).remove(messageObject.getId());
                        }
                        i--;
                        break;
                    }
                }
                i++;
            }
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i3 = this.currentAccount;
            deletepreviewmedia.bot = MessagesController.getInstance(i3).getInputUser(this.dialogId);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                deletepreviewmedia.media.add(MessagesController.toInputMedia((TLRPC.MessageMedia) arrayList.get(i4)));
            }
            ConnectionsManager.getInstance(i3).sendRequest(deletepreviewmedia, null);
            StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = this.notify;
            AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
        }

        public final void edit(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
            ArrayList arrayList;
            MessageObject messageObject;
            int id;
            TL_stories.StoryItem storyItem;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            int i = 0;
            while (true) {
                arrayList = this.messageObjects;
                if (i >= arrayList.size()) {
                    messageObject = null;
                    i = 0;
                    break;
                }
                messageObject = (MessageObject) arrayList.get(i);
                if (inputMedia != null && (storyItem = messageObject.storyItem) != null && (messageMedia = storyItem.media) != null) {
                    if (!(inputMedia instanceof TLRPC.TL_inputMediaPhoto)) {
                        if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.id == ((TLRPC.TL_inputMediaDocument) inputMedia).id.id) {
                            break;
                        }
                    } else {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null && photo.id == ((TLRPC.TL_inputMediaPhoto) inputMedia).id.id) {
                            break;
                        }
                    }
                }
                i++;
            }
            ArrayList arrayList2 = this.fakeDays;
            if (messageObject != null) {
                arrayList.remove(messageObject);
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new ArrayList());
                }
                if (i > 0 && i < ((ArrayList) arrayList2.get(0)).size()) {
                    ((ArrayList) arrayList2.get(0)).remove(i);
                }
            }
            MessageObject messageObject2 = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, botpreviewmedia));
            TL_stories.StoryItem storyItem2 = messageObject2.storyItem;
            TLRPC.Message message = messageObject2.messageOwner;
            if (messageObject == null) {
                id = this.lastId;
                this.lastId = id + 1;
            } else {
                id = messageObject.getId();
            }
            message.id = id;
            storyItem2.id = id;
            messageObject2.parentStoriesList = this;
            messageObject2.generateThumbs(false);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            ((ArrayList) arrayList2.get(0)).add(i, Integer.valueOf(messageObject2.getId()));
            arrayList.add(i, messageObject2);
            StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = this.notify;
            AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
        }

        @Override
        public final MessageObject findMessageObject(int i) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.messageObjects;
                if (i2 >= arrayList.size()) {
                    return null;
                }
                if (((MessageObject) arrayList.get(i2)).getId() == i) {
                    return (MessageObject) arrayList.get(i2);
                }
                i2++;
            }
        }

        @Override
        public final int getCount() {
            return this.messageObjects.size();
        }

        @Override
        public final ArrayList getDays() {
            return this.fakeDays;
        }

        @Override
        public final int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override
        public final void invalidateCache() {
        }

        @Override
        public final boolean isLoading() {
            return this.loading;
        }

        @Override
        public final boolean isOnlyCache() {
            return false;
        }

        @Override
        public final boolean load(int i, List list, boolean z) {
            return loadInternal(null);
        }

        public final boolean loadInternal(Runnable runnable) {
            TLObject tLObject;
            if (this.loading || this.loaded) {
                return false;
            }
            long j = this.dialogId;
            String str = this.lang_code;
            int i = this.currentAccount;
            if (str != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = MessagesController.getInstance(i).getInputUser(j);
                getpreviewinfo.lang_code = str;
                tLObject = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias = new TL_bots.getPreviewMedias();
                getpreviewmedias.bot = MessagesController.getInstance(i).getInputUser(j);
                tLObject = getpreviewmedias;
            }
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(i).sendRequest(tLObject, new ProfileActivity$$ExternalSyntheticLambda65(28, this, runnable));
            return true;
        }

        @Override
        public final boolean markAsRead(int i) {
            return false;
        }

        @Override
        public final void preloadCache() {
        }

        public final void push(TL_bots.botPreviewMedia botpreviewmedia) {
            MessageObject messageObject = new MessageObject(this.currentAccount, new BotPreview(this, this.dialogId, botpreviewmedia));
            TL_stories.StoryItem storyItem = messageObject.storyItem;
            TLRPC.Message message = messageObject.messageOwner;
            int i = this.lastId;
            this.lastId = i + 1;
            message.id = i;
            storyItem.id = i;
            messageObject.parentStoriesList = this;
            messageObject.generateThumbs(false);
            ArrayList arrayList = this.fakeDays;
            if (arrayList.isEmpty()) {
                arrayList.add(new ArrayList());
            }
            ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(messageObject.getId()));
            this.messageObjects.add(0, messageObject);
            StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = this.notify;
            AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
        }

        @Override
        public final void saveCache() {
        }

        @Override
        public final void updatePinnedOrder(ArrayList arrayList, boolean z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
            int i = this.currentAccount;
            reorderpreviewmedias.bot = MessagesController.getInstance(i).getInputUser(this.dialogId);
            reorderpreviewmedias.lang_code = this.lang_code;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Integer num = (Integer) obj;
                MessageObject messageObjectFindMessageObject = findMessageObject(num.intValue());
                if (messageObjectFindMessageObject != null) {
                    reorderpreviewmedias.order.add(MessagesController.toInputMedia(messageObjectFindMessageObject.storyItem.media));
                    arrayList2.add(messageObjectFindMessageObject);
                    arrayList3.add(num);
                }
            }
            ConnectionsManager.getInstance(i).sendRequest(reorderpreviewmedias, null);
            ArrayList arrayList4 = this.fakeDays;
            if (arrayList4.isEmpty()) {
                arrayList4.add(new ArrayList());
            }
            ((ArrayList) arrayList4.get(0)).clear();
            ((ArrayList) arrayList4.get(0)).addAll(arrayList3);
            ArrayList arrayList5 = this.messageObjects;
            arrayList5.clear();
            arrayList5.addAll(arrayList2);
        }
    }

    public final class StoriesCollections {
        public boolean creating;
        public final int currentAccount;
        public final long dialogId;
        public final boolean isSelf;
        public boolean loaded;
        public boolean loadedCache;
        public boolean loading;
        public final StoriesController this$0;
        public final ArrayList lastCollections = new ArrayList();
        public final ArrayList collections = new ArrayList();

        public StoriesCollections(int i, long j, StoriesController storiesController) {
            this.this$0 = storiesController;
            this.currentAccount = i;
            this.dialogId = j;
            this.isSelf = j == UserConfig.getInstance(i).getClientUserId();
            load();
        }

        public final boolean canCreateNewAlbum() {
            if (!this.isSelf) {
                StoriesController storiesController = this.this$0;
                long clientUserId = UserConfig.getInstance(storiesController.currentAccount).getClientUserId();
                long j = this.dialogId;
                if (clientUserId != j && !storiesController.canEditStories(j)) {
                    return false;
                }
            }
            return this.loaded && this.collections.size() < MessagesController.getInstance(this.currentAccount).config.storiesAlbumsLimit.get();
        }

        public final void createCollection(String str, Utilities.Callback callback) {
            if (this.creating) {
                return;
            }
            this.creating = true;
            TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
            int i = this.currentAccount;
            tL_createAlbum.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
            tL_createAlbum.title = str;
            ConnectionsManager.getInstance(i).sendRequest(tL_createAlbum, new ProfileActivity$$ExternalSyntheticLambda65(29, this, callback));
        }

        public final StoryAlbum findById(int i) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.collections;
                if (i2 >= arrayList.size()) {
                    return null;
                }
                StoryAlbum storyAlbum = (StoryAlbum) arrayList.get(i2);
                if (i == storyAlbum.album_id) {
                    return storyAlbum;
                }
                i2++;
            }
        }

        public final int indexOf(int i) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.collections;
                if (i2 >= arrayList.size()) {
                    return -1;
                }
                if (i == ((StoryAlbum) arrayList.get(i2)).album_id) {
                    return i2;
                }
                i2++;
            }
        }

        public final void load() {
            if (this.loading || this.loaded) {
                return;
            }
            this.loading = true;
            boolean z = this.loadedCache;
            long j = this.dialogId;
            int i = this.currentAccount;
            if (!z) {
                MessagesStorage.getInstance(i).loadStoryAlbumsCache(j, new ProfileActivity$$ExternalSyntheticLambda70(this, 1));
                return;
            }
            TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
            tL_getAlbums.peer = MessagesController.getInstance(i).getInputPeer(j);
            ConnectionsManager.getInstance(i).sendRequest(tL_getAlbums, new RichMediaUploader$$ExternalSyntheticLambda0(this, 4));
        }

        public final void sendOrder() {
            TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
            int i = this.currentAccount;
            tL_reorderAlbums.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
            tL_reorderAlbums.order = new ArrayList<>();
            ArrayList arrayList = this.collections;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                tL_reorderAlbums.order.add(Integer.valueOf(((StoryAlbum) obj).album_id));
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_reorderAlbums, null);
        }

        public final void updateAlbumsListCache(boolean z) {
            int i = this.currentAccount;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
            ArrayList arrayList = this.collections;
            long j = this.dialogId;
            messagesStorage.saveStoryAlbumsCache(j, arrayList);
            if (z) {
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j), this);
            }
        }
    }

    public final class StoryAlbum {
        public int album_id;
        public TLRPC.Photo icon_photo;
        public TLRPC.Document icon_video;
        public String title;
    }

    public final class StoryLimit {
        public final int remains_count;
        public final int type;
        public final long until;

        public StoryLimit(int i, int i2, long j) {
            this.type = i;
            this.until = j;
            this.remains_count = i2;
        }

        public final boolean active(int i, int i2) {
            int i3 = this.type;
            if (i3 != 1) {
                if ((i3 == 2 || i3 == 3) && ConnectionsManager.getInstance(i).getCurrentTime() >= this.until) {
                    return false;
                }
            } else if (this.remains_count >= i2) {
                return false;
            }
            return true;
        }

        public final int getLimitReachedType() {
            int i = this.type;
            if (i != 2) {
                return i != 3 ? 14 : 16;
            }
            return 15;
        }
    }

    public final class StoryRepostsList extends StoriesList {
        public final ArrayList fakeDays;

        public StoryRepostsList(int i, ArrayList arrayList) {
            super(i, 0L, 3, -1, null);
            this.fakeDays = new ArrayList();
            append(arrayList);
        }

        public final void append(ArrayList arrayList) {
            int i;
            ArrayList arrayList2 = this.messageObjects;
            arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = arrayList.size();
                i = this.currentAccount;
                if (i2 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
                if (storyItem != null) {
                    storyItem.messageId = arrayList2.size();
                    MessageObject messageObject = new MessageObject(i, storyItem);
                    messageObject.generateThumbs(false);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(Integer.valueOf(arrayList2.size()));
                    this.fakeDays.add(arrayList3);
                    arrayList2.add(messageObject);
                    i3++;
                }
                i2++;
            }
            if (i3 > 0) {
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, this);
            }
        }

        @Override
        public final MessageObject findMessageObject(int i) {
            if (i < 0) {
                return null;
            }
            ArrayList arrayList = this.messageObjects;
            if (i >= arrayList.size()) {
                return null;
            }
            return (MessageObject) arrayList.get(i);
        }

        @Override
        public final int getCount() {
            return this.messageObjects.size();
        }

        @Override
        public final ArrayList getDays() {
            return new ArrayList(this.fakeDays);
        }

        @Override
        public final int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override
        public final void invalidateCache() {
        }

        @Override
        public final boolean isLoading() {
            return false;
        }

        @Override
        public final boolean isOnlyCache() {
            return false;
        }

        @Override
        public final boolean load(int i, List list, boolean z) {
            return false;
        }

        @Override
        public final boolean markAsRead(int i) {
            return false;
        }

        @Override
        public final void preloadCache() {
        }

        @Override
        public final void saveCache() {
        }
    }

    public final class UploadingStory implements NotificationCenter.NotificationCenterDelegate {
        public boolean canceled;
        public float convertingProgress;
        public int currentRequest;
        public final long dialogId;
        public long duration;
        public final boolean edit;
        public final StoryEntry entry;
        public boolean entryDestroyed;
        public boolean failed;
        public final String firstFramePath;
        public boolean hadFailed;
        public VideoEditedInfo info;
        public boolean isCloseFriends;
        public boolean isVideo;
        public MessageObject messageObject;
        public String path;
        public TL_bots.botPreviewMedia previewMedia;
        public float progress;
        public MessageObject sharedMessageObject;
        public float uploadProgress;
        public long firstSecondSize = -1;
        public final long random_id = Utilities.random.nextLong();

        public UploadingStory(StoryEntry storyEntry) {
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
                this.dialogId = storyEntry.editStoryPeerId;
                return;
            }
            TLRPC.InputPeer inputPeer = storyEntry.peer;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.dialogId = UserConfig.getInstance(StoriesController.this.currentAccount).clientUserId;
            } else {
                this.dialogId = DialogObject.getPeerDialogId(inputPeer);
            }
        }

        public final void cancel() {
            boolean z = this.failed;
            StoryEntry storyEntry = this.entry;
            StoriesController storiesController = StoriesController.this;
            if (z) {
                DraftsController draftsController = storiesController.draftsController;
                draftsController.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(storyEntry);
                draftsController.delete(arrayList);
                ((ArrayList) storiesController.uploadingStoriesByDialogId.get(this.dialogId)).remove(this);
            }
            this.canceled = true;
            if (storyEntry.wouldBeVideo()) {
                MediaController.getInstance().cancelVideoConvert(this.messageObject);
            }
            FileLoader.getInstance(storiesController.currentAccount).cancelFileUpload(this.path, false);
            if (this.currentRequest >= 0) {
                ConnectionsManager.getInstance(storiesController.currentAccount).cancelRequest(this.currentRequest, true);
            }
            cleanup();
        }

        public final void cleanup() {
            android.util.LongSparseArray longSparseArray;
            BotPreviewsEditContainer botPreviewsEditContainer;
            android.util.LongSparseArray longSparseArray2;
            android.util.LongSparseArray longSparseArray3;
            BotPreviewsEditContainer botPreviewsEditContainer2;
            android.util.LongSparseArray longSparseArray4;
            HashMap map;
            ArrayList arrayList;
            StoriesController storiesController = StoriesController.this;
            int i = storiesController.currentAccount;
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            boolean z = this.failed;
            long j = this.dialogId;
            if (!z && (arrayList = (ArrayList) storiesController.uploadingStoriesByDialogId.get(j)) != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = (ArrayList) storiesController.uploadingAndEditingStories.get(j);
            if (arrayList2 != null) {
                arrayList2.remove(this);
                if (arrayList2.isEmpty()) {
                    storiesController.uploadedStories = 0;
                } else {
                    storiesController.uploadedStories++;
                }
            }
            boolean z2 = this.edit;
            StoryEntry storyEntry = this.entry;
            if (z2 && (map = (HashMap) storiesController.editingStories.get(j)) != null) {
                map.remove(Integer.valueOf(storyEntry.editStoryId));
            }
            if (this.previewMedia != null) {
                StoriesList storiesList = storiesController.getStoriesList(this.dialogId, 4, -1, false);
                if (storyEntry != null && storyEntry.isEdit) {
                    if (storiesList instanceof BotPreviewsList) {
                        ((BotPreviewsList) storiesList).edit(storyEntry.editingBotPreview, this.previewMedia);
                    }
                    String str = storyEntry.botLang;
                    TLRPC.InputMedia inputMedia = storyEntry.editingBotPreview;
                    TL_bots.botPreviewMedia botpreviewmedia = this.previewMedia;
                    android.util.LongSparseArray longSparseArray5 = BotPreviewsEditContainer.cachedLists;
                    if (longSparseArray5 != null && (longSparseArray4 = (android.util.LongSparseArray) longSparseArray5.get(i)) != null) {
                        BotPreviewsList botPreviewsList = (BotPreviewsList) longSparseArray4.get(j);
                        if (botPreviewsList.currentAccount == i) {
                            if (TextUtils.equals(botPreviewsList.lang_code, str)) {
                                botPreviewsList.edit(inputMedia, botpreviewmedia);
                            } else if (!TextUtils.isEmpty(str)) {
                                ArrayList arrayList3 = botPreviewsList.lang_codes;
                                if (!arrayList3.contains(str)) {
                                    arrayList3.add(str);
                                    StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = botPreviewsList.notify;
                                    AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                                    AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                                }
                            }
                        }
                    }
                    android.util.LongSparseArray longSparseArray6 = BotPreviewsEditContainer.attachedContainers;
                    if (longSparseArray6 != null && (longSparseArray3 = (android.util.LongSparseArray) longSparseArray6.get(i)) != null && (botPreviewsEditContainer2 = (BotPreviewsEditContainer) longSparseArray3.get(j)) != null) {
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList4 = botPreviewsEditContainer2.langLists;
                            if (i2 >= arrayList4.size()) {
                                break;
                            }
                            BotPreviewsList botPreviewsList2 = (BotPreviewsList) arrayList4.get(i2);
                            if (botPreviewsList2.currentAccount == i && TextUtils.equals(botPreviewsList2.lang_code, str)) {
                                botPreviewsList2.edit(inputMedia, botpreviewmedia);
                            }
                            i2++;
                        }
                    }
                } else {
                    if (storiesList instanceof BotPreviewsList) {
                        ((BotPreviewsList) storiesList).push(this.previewMedia);
                    }
                    String str2 = storyEntry.botLang;
                    TL_bots.botPreviewMedia botpreviewmedia2 = this.previewMedia;
                    android.util.LongSparseArray longSparseArray7 = BotPreviewsEditContainer.cachedLists;
                    if (longSparseArray7 != null && (longSparseArray2 = (android.util.LongSparseArray) longSparseArray7.get(i)) != null) {
                        BotPreviewsList botPreviewsList3 = (BotPreviewsList) longSparseArray2.get(j);
                        if (botPreviewsList3.currentAccount == i) {
                            if (TextUtils.equals(botPreviewsList3.lang_code, str2)) {
                                botPreviewsList3.push(botpreviewmedia2);
                            } else if (!TextUtils.isEmpty(str2)) {
                                ArrayList arrayList5 = botPreviewsList3.lang_codes;
                                if (!arrayList5.contains(str2)) {
                                    arrayList5.add(str2);
                                    StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda1 = botPreviewsList3.notify;
                                    AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                                    AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                                }
                            }
                        }
                    }
                    android.util.LongSparseArray longSparseArray8 = BotPreviewsEditContainer.attachedContainers;
                    if (longSparseArray8 != null && (longSparseArray = (android.util.LongSparseArray) longSparseArray8.get(i)) != null && (botPreviewsEditContainer = (BotPreviewsEditContainer) longSparseArray.get(j)) != null) {
                        int i3 = 0;
                        while (true) {
                            ArrayList arrayList6 = botPreviewsEditContainer.langLists;
                            if (i3 >= arrayList6.size()) {
                                break;
                            }
                            BotPreviewsList botPreviewsList4 = (BotPreviewsList) arrayList6.get(i3);
                            if (botPreviewsList4.currentAccount == i && TextUtils.equals(botPreviewsList4.lang_code, str2)) {
                                botPreviewsList4.push(botpreviewmedia2);
                            }
                            i3++;
                        }
                    }
                }
                this.previewMedia = null;
            }
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            if (storyEntry != null && !storyEntry.isEditSaved && !this.entryDestroyed) {
                storyEntry.destroy(false);
                this.entryDestroyed = true;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.path);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) throws Throwable {
            if (i == NotificationCenter.filePreparingStarted) {
                if (objArr[0] == this.messageObject) {
                    this.path = (String) objArr[1];
                    upload();
                    return;
                }
                return;
            }
            int i3 = NotificationCenter.fileNewChunkAvailable;
            StoriesController storiesController = StoriesController.this;
            if (i == i3) {
                if (objArr[0] == this.messageObject) {
                    String str = (String) objArr[1];
                    long jLongValue = ((Long) objArr[2]).longValue();
                    long jLongValue2 = ((Long) objArr[3]).longValue();
                    float fFloatValue = ((Float) objArr[4]).floatValue();
                    this.convertingProgress = fFloatValue;
                    this.progress = (this.uploadProgress * 0.7f) + (fFloatValue * 0.3f);
                    NotificationCenter.getInstance(storiesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.path, Float.valueOf(this.progress));
                    if (this.firstSecondSize < 0 && this.convertingProgress * this.duration >= 1000.0f) {
                        this.firstSecondSize = jLongValue;
                    }
                    FileLoader.getInstance(storiesController.currentAccount).checkUploadNewDataAvailable(str, false, Math.max(1L, jLongValue), jLongValue2, Float.valueOf(this.convertingProgress));
                    if (jLongValue2 <= 0 || this.firstSecondSize >= 0) {
                        return;
                    }
                    this.firstSecondSize = jLongValue2;
                    return;
                }
                return;
            }
            if (i == NotificationCenter.filePreparingFailed) {
                if (objArr[0] == this.messageObject) {
                    if (!this.edit) {
                        StoryEntry storyEntry = this.entry;
                        storyEntry.isError = true;
                        storyEntry.error = new TLRPC.TL_error();
                        TLRPC.TL_error tL_error = storyEntry.error;
                        tL_error.code = 400;
                        tL_error.text = "FILE_PREPARE_FAILED";
                        this.entryDestroyed = true;
                        this.failed = true;
                        this.hadFailed = true;
                        storiesController.draftsController.edit(storyEntry);
                    }
                    cleanup();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.fileUploaded) {
                String str2 = (String) objArr[0];
                String str3 = this.path;
                if (str3 == null || !str2.equals(str3)) {
                    return;
                }
                sendUploadedRequest((TLRPC.InputFile) objArr[1]);
                return;
            }
            if (i == NotificationCenter.fileUploadFailed) {
                String str4 = (String) objArr[0];
                String str5 = this.path;
                if (str5 == null || !str4.equals(str5)) {
                    return;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                cleanup();
                return;
            }
            if (i == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.path)) {
                float fMin = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
                this.uploadProgress = fMin;
                this.progress = (fMin * 0.7f) + (this.convertingProgress * 0.3f);
                NotificationCenter.getInstance(storiesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.path, Float.valueOf(this.progress));
            }
        }

        public final void sendUploadedRequest(TLRPC.InputFile inputFile) throws Throwable {
            TLRPC.InputMedia inputMedia;
            boolean z;
            int i;
            TLObject tLObject;
            CharSequence charSequence;
            CharSequence charSequence2;
            TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto;
            ArrayList arrayList;
            ArrayList arrayList2;
            TLRPC.MessageMedia messageMedia;
            TLRPC.InputMedia inputMedia2;
            if (this.canceled) {
                return;
            }
            StoryEntry storyEntry = this.entry;
            storyEntry.getClass();
            if (!storyEntry.isRepost || storyEntry.editedMedia || (messageMedia = storyEntry.repostMedia) == null) {
                inputMedia = null;
                z = false;
            } else {
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.MessageMedia messageMedia2 = storyEntry.repostMedia;
                    TLRPC.Document document = messageMedia2.document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_inputMediaDocument.spoiler = messageMedia2.spoiler;
                    inputMedia2 = tL_inputMediaDocument;
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    TLRPC.Photo photo = storyEntry.repostMedia.photo;
                    tL_inputPhoto.id = photo.id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    tL_inputMediaPhoto.id = tL_inputPhoto;
                    inputMedia2 = tL_inputMediaPhoto;
                } else {
                    inputMedia = null;
                    z = false;
                }
                z = true;
                inputMedia = inputMedia2;
            }
            TLRPC.InputMedia inputMedia3 = inputMedia;
            inputMedia3 = inputMedia;
            if (inputMedia == null && inputFile != null) {
                if (storyEntry.wouldBeVideo()) {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (storyEntry.editingCoverDocument != null) {
                        for (int i2 = 0; i2 < storyEntry.editingCoverDocument.attributes.size(); i2++) {
                            if (storyEntry.editingCoverDocument.attributes.get(i2) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) storyEntry.editingCoverDocument.attributes.get(i2);
                                break;
                            }
                        }
                    } else {
                        SendMessagesHelper.fillVideoAttribute(this.path, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i3 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i3 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.firstSecondSize;
                    long j = storyEntry.cover;
                    if (j >= 0) {
                        tL_documentAttributeVideo.flags = i3 | 20;
                        tL_documentAttributeVideo.video_start_ts = ((double) (j - (storyEntry.left * storyEntry.duration))) / 1000.0d;
                    }
                    ArrayList arrayList3 = storyEntry.stickers;
                    if (arrayList3 != null && (!arrayList3.isEmpty() || ((arrayList2 = storyEntry.editStickers) != null && !arrayList2.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList4 = new ArrayList<>(storyEntry.stickers);
                        tL_inputMediaUploadedDocument.stickers = arrayList4;
                        ArrayList arrayList5 = storyEntry.editStickers;
                        if (arrayList5 != null) {
                            arrayList4.addAll(arrayList5);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = storyEntry.audioPath == null && (storyEntry.muted || !storyEntry.isVideo);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia3 = tL_inputMediaUploadedDocument;
                } else {
                    tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int iLastIndexOf = this.path.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(iLastIndexOf != -1 ? this.path.substring(iLastIndexOf + 1).toLowerCase() : "txt");
                    ArrayList arrayList6 = storyEntry.stickers;
                    inputMedia3 = tL_inputMediaUploadedPhoto;
                    if (arrayList6 != null && (!arrayList6.isEmpty() || ((arrayList = storyEntry.editStickers) != null && !arrayList.isEmpty()))) {
                        inputMedia3 = tL_inputMediaUploadedPhoto;
                        inputMedia3 = tL_inputMediaUploadedPhoto;
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList7 = storyEntry.editStickers;
                        if (arrayList7 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList7);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(storyEntry.stickers);
                        inputMedia3 = tL_inputMediaUploadedPhoto;
                    }
                }
            }
            inputMedia3 = tL_inputMediaUploadedPhoto;
            inputMedia3 = tL_inputMediaUploadedPhoto;
            inputMedia3 = tL_inputMediaUploadedPhoto;
            int i4 = StoriesController.this.currentAccount;
            int i5 = UserConfig.getInstance(i4).isPremium() ? MessagesController.getInstance(i4).storyCaptionLengthLimitPremium : MessagesController.getInstance(i4).storyCaptionLengthLimitDefault;
            ArrayList arrayList8 = storyEntry.privacyRules;
            long j2 = this.dialogId;
            boolean z2 = this.edit;
            if (z2) {
                if (storyEntry.botId != 0) {
                    TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                    editpreviewmedia.bot = MessagesController.getInstance(i4).getInputUser(storyEntry.botId);
                    editpreviewmedia.media = storyEntry.editingBotPreview;
                    editpreviewmedia.new_media = inputMedia3;
                    editpreviewmedia.lang_code = storyEntry.botLang;
                    tLObject = editpreviewmedia;
                } else {
                    TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                    tL_stories_editStory.id = storyEntry.editStoryId;
                    tL_stories_editStory.peer = MessagesController.getInstance(i4).getInputPeer(j2);
                    tL_stories_editStory.flags |= 16;
                    TLRPC.InputDocument inputDocument = storyEntry.audioDocument;
                    if (inputDocument != null) {
                        tL_stories_editStory.music = inputDocument;
                    } else {
                        tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                    }
                    if (inputMedia3 != null && storyEntry.editedMedia) {
                        tL_stories_editStory.flags |= 1;
                        tL_stories_editStory.media = inputMedia3;
                    }
                    if (storyEntry.editedCaption && (charSequence2 = storyEntry.caption) != null) {
                        tL_stories_editStory.flags |= 2;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > i5) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i5);
                        }
                        if (MessagesController.getInstance(i4).storyEntitiesAllowed()) {
                            tL_stories_editStory.entities = MediaDataController.getInstance(i4).getEntities(charSequenceArr, true);
                        } else {
                            tL_stories_editStory.entities.clear();
                        }
                        if (charSequenceArr[0].length() > i5) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i5);
                        }
                        tL_stories_editStory.caption = charSequenceArr[0].toString();
                    }
                    if (storyEntry.editedPrivacy) {
                        tL_stories_editStory.flags |= 4;
                        tL_stories_editStory.privacy_rules.addAll(arrayList8);
                    }
                    ArrayList arrayList9 = storyEntry.editedMediaAreas;
                    if (arrayList9 != null) {
                        tL_stories_editStory.media_areas.addAll(arrayList9);
                    }
                    if (storyEntry.mediaEntities != null) {
                        for (int i6 = 0; i6 < storyEntry.mediaEntities.size(); i6++) {
                            TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) storyEntry.mediaEntities.get(i6)).mediaArea;
                            if (mediaArea != null) {
                                tL_stories_editStory.media_areas.add(mediaArea);
                            }
                        }
                    }
                    if (!tL_stories_editStory.media_areas.isEmpty()) {
                        tL_stories_editStory.flags |= 8;
                    }
                    tLObject = tL_stories_editStory;
                }
            } else if (storyEntry.botId != 0) {
                TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                addpreviewmedia.bot = MessagesController.getInstance(i4).getInputUser(storyEntry.botId);
                addpreviewmedia.media = inputMedia3;
                addpreviewmedia.lang_code = storyEntry.botLang;
                tLObject = addpreviewmedia;
            } else {
                TL_stories.TL_stories_sendStory tL_stories_sendStory = new TL_stories.TL_stories_sendStory();
                tL_stories_sendStory.random_id = this.random_id;
                tL_stories_sendStory.peer = MessagesController.getInstance(i4).getInputPeer(j2);
                tL_stories_sendStory.media = inputMedia3;
                tL_stories_sendStory.privacy_rules.addAll(arrayList8);
                tL_stories_sendStory.pinned = storyEntry.pinned;
                tL_stories_sendStory.noforwards = !storyEntry.allowScreenshots;
                tL_stories_sendStory.albums = storyEntry.albums != null ? new ArrayList<>(storyEntry.albums) : null;
                TLRPC.InputDocument inputDocument2 = storyEntry.audioDocument;
                if (inputDocument2 != null) {
                    tL_stories_sendStory.flags |= 512;
                    tL_stories_sendStory.music = inputDocument2;
                }
                CharSequence charSequence3 = storyEntry.caption;
                if (charSequence3 != null) {
                    tL_stories_sendStory.flags |= 3;
                    CharSequence[] charSequenceArr2 = {charSequence3};
                    if (charSequence3.length() > i5) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i5);
                    }
                    if (MessagesController.getInstance(i4).storyEntitiesAllowed()) {
                        tL_stories_sendStory.entities = MediaDataController.getInstance(i4).getEntities(charSequenceArr2, true);
                    } else {
                        tL_stories_sendStory.entities.clear();
                    }
                    i = 0;
                    if (charSequenceArr2[0].length() > i5) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i5);
                    }
                    tL_stories_sendStory.caption = charSequenceArr2[0].toString();
                } else {
                    i = 0;
                }
                if (storyEntry.isRepost) {
                    tL_stories_sendStory.flags |= 64;
                    tL_stories_sendStory.fwd_from_id = MessagesController.getInstance(i4).getInputPeer(storyEntry.repostPeer);
                    tL_stories_sendStory.fwd_from_story = storyEntry.repostStoryId;
                    tL_stories_sendStory.fwd_modified = !z;
                }
                int i7 = storyEntry.period;
                if (i7 == Integer.MAX_VALUE) {
                    tL_stories_sendStory.pinned = true;
                } else {
                    tL_stories_sendStory.flags |= 8;
                    tL_stories_sendStory.period = i7;
                }
                if (storyEntry.mediaEntities != null) {
                    while (i < storyEntry.mediaEntities.size()) {
                        TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) storyEntry.mediaEntities.get(i)).mediaArea;
                        if (mediaArea2 != null) {
                            tL_stories_sendStory.media_areas.add(mediaArea2);
                        }
                        i++;
                    }
                    if (!tL_stories_sendStory.media_areas.isEmpty()) {
                        tL_stories_sendStory.flags |= 32;
                    }
                }
                tLObject = tL_stories_sendStory;
            }
            StoriesController$UploadingStory$$ExternalSyntheticLambda0 storiesController$UploadingStory$$ExternalSyntheticLambda0 = new StoriesController$UploadingStory$$ExternalSyntheticLambda0(this, 0);
            if (!BuildVars.DEBUG_PRIVATE_VERSION || z2 || (charSequence = storyEntry.caption) == null || !charSequence.toString().contains("#failtest") || this.hadFailed) {
                this.currentRequest = ConnectionsManager.getInstance(i4).sendRequest(tLObject, storiesController$UploadingStory$$ExternalSyntheticLambda0, 64);
                return;
            }
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "FORCED_TO_FAIL";
            storiesController$UploadingStory$$ExternalSyntheticLambda0.run(null, tL_error);
        }

        public final void start() throws Throwable {
            StoryEntry storyEntry = this.entry;
            if (storyEntry.isEditingCover) {
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.entry.editingCoverDocument);
                sendUploadedRequest(tL_inputFileStoryDocument);
            } else if ((storyEntry.isEdit || (storyEntry.isRepost && storyEntry.repostMedia != null)) && !storyEntry.editedMedia && storyEntry.round == null) {
                sendUploadedRequest(null);
                return;
            }
            StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = this.entry.privacy;
            this.isCloseFriends = storyPrivacy != null && storyPrivacy.type == 1;
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(StoriesController.this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            boolean zWouldBeVideo = this.entry.wouldBeVideo();
            this.isVideo = zWouldBeVideo;
            if (zWouldBeVideo) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 1;
                String absolutePath = StoryEntry.makeCacheFile(StoriesController.this.currentAccount, "mp4").getAbsolutePath();
                tL_message.attachPath = absolutePath;
                this.path = absolutePath;
                this.messageObject = new MessageObject(StoriesController.this.currentAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                this.entry.getVideoEditedInfo(new StoriesController$UploadingStory$$ExternalSyntheticLambda5(this, 1));
            } else {
                File fileMakeCacheFile = StoryEntry.makeCacheFile(StoriesController.this.currentAccount, "jpg");
                this.path = fileMakeCacheFile.getAbsolutePath();
                Utilities.themeQueue.postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(2, this, fileMakeCacheFile));
            }
            Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
            intent.putExtra("path", this.path);
            intent.putExtra("currentAccount", StoriesController.this.currentAccount);
            try {
                ApplicationLoader.applicationContext.startService(intent);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public final void upload() {
            StoryEntry storyEntry = this.entry;
            storyEntry.getClass();
            FileLoader fileLoader = FileLoader.getInstance(StoriesController.this.currentAccount);
            String str = this.path;
            boolean z = !storyEntry.isVideo;
            long jMax = 0;
            if (this.isVideo) {
                VideoEditedInfo videoEditedInfo = this.info;
                jMax = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
            }
            fileLoader.uploadFile(str, false, z, jMax, storyEntry.isVideo ? 33554432 : 16777216, true);
        }
    }

    public StoriesController(int i) {
        this.state = "";
        ArrayList arrayList = new ArrayList();
        this.sendAs = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.loadingSendAs = false;
        this.loadedSendAs = false;
        this.requestingUnsupportedStories = new HashSet();
        this.currentAccount = i;
        this.storiesStorage = new StoriesStorage(i);
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        this.mainSettings = mainSettings;
        this.state = mainSettings.getString("last_stories_state", "");
        this.stateHidden = mainSettings.getString("last_stories_state_hidden", "");
        this.totalStoriesCountHidden = mainSettings.getInt("total_stores_hidden", 0);
        this.totalStoriesCount = mainSettings.getInt("total_stores", 0);
        this.storiesReadLoaded = mainSettings.getBoolean("read_loaded", false);
        this.unsupportedStoriesChecked = new HashSet(mainSettings.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthModeTLdeserialize = null;
        String string = mainSettings.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_storiesStealthModeTLdeserialize = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.stealthMode = tL_storiesStealthModeTLdeserialize;
        StoriesStorage storiesStorage = this.storiesStorage;
        storiesStorage.storage.getStorageQueue().postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(5, storiesStorage, new StoriesController$$ExternalSyntheticLambda2(this, 0)));
        this.sortStoriesRunnable = new OAuthSheet$$ExternalSyntheticLambda17(this, i, 27);
        this.draftsController = new DraftsController(i);
    }

    public static String access$900(ArrayList arrayList) {
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList.get(i)).storyItem;
                str = storyItem == null ? str + "null" : str + storyItem.id + "@" + storyItem.dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static TL_stories.StoryItem applyStoryUpdate(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem == null || !storyItem2.min) {
            return storyItem2;
        }
        storyItem.pinned = storyItem2.pinned;
        storyItem.isPublic = storyItem2.isPublic;
        storyItem.close_friends = storyItem2.close_friends;
        int i = storyItem2.date;
        if (i != 0) {
            storyItem.date = i;
        }
        int i2 = storyItem2.expire_date;
        if (i2 != 0) {
            storyItem.expire_date = i2;
        }
        storyItem.caption = storyItem2.caption;
        storyItem.entities = storyItem2.entities;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia != null) {
            storyItem.media = messageMedia;
        }
        return storyItem;
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
                str = str + ((TL_stories.StoryItem) list.get(i)).id + "@" + ((TL_stories.StoryItem) list.get(i)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final void addStoriesToAlbum(int i, long j, ArrayList arrayList) {
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, true);
        storyAlbumsList.getClass();
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = storyAlbumsList.currentAccount;
        tL_updateAlbum.peer = MessagesController.getInstance(i2).getInputPeer(storyAlbumsList.dialogId);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i));
            } else if (!arrayList2.contains(Integer.valueOf(i))) {
                storyItem.albums.add(Integer.valueOf(i));
            }
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        StoriesList storiesList = storyAlbumsList.this$0.getStoriesList(storyAlbumsList.dialogId, 0, i, false);
        if (storiesList != null) {
            storiesList.updateStories(arrayList, true);
        }
        ArrayList arrayList4 = storyAlbumsList.collections;
        int size3 = arrayList4.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList4.get(i5);
            i5++;
            StoriesList storiesList2 = storyAlbumsList.this$0.getStoriesList(storyAlbumsList.dialogId, 0, ((StoryAlbum) obj3).album_id, false);
            if (storiesList2 != null) {
                storiesList2.updateStoryItemsAlbums(i, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void addUploadingStoryToList(long j, UploadingStory uploadingStory, LongSparseArray longSparseArray, boolean z) {
        ArrayList arrayListM = (ArrayList) longSparseArray.get(j);
        if (z && (arrayListM == null || arrayListM.isEmpty())) {
            this.uploadedStories = 0;
        }
        if (arrayListM == null) {
            arrayListM = MediaDataController$$ExternalSyntheticOutline0.m(j, longSparseArray);
        }
        arrayListM.add(uploadingStory);
    }

    public final void addUserToHiddenList(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i = this.currentAccount;
        if (peerDialogId == UserConfig.getInstance(i).getClientUserId()) {
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.hiddenListStories;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i2)).peer) == peerDialogId) {
                z = true;
            }
            i2++;
        }
        if (!z) {
            arrayList.add(peerStories);
        }
        MessagesController.getInstance(i).checkArchiveFolder();
    }

    public final void applyToList(TL_stories.PeerStories peerStories) {
        TLRPC.Chat chat;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        ArrayList arrayList2;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i = this.currentAccount;
        TLRPC.User user = null;
        if (peerDialogId > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
            if (user2 == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                user = user2;
                chat = null;
            }
        } else {
            chat = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i2 = 0;
        while (true) {
            arrayList = this.dialogListStories;
            z = true;
            if (i2 >= arrayList.size()) {
                z2 = false;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i2)).peer) == peerDialogId) {
                    arrayList.remove(i2);
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        int i3 = 0;
        while (true) {
            arrayList2 = this.hiddenListStories;
            if (i3 >= arrayList2.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i3)).peer) == peerDialogId) {
                arrayList2.remove(i3);
                z2 = true;
                break;
            }
            i3++;
        }
        if ((user == null || !user.stories_hidden) && (chat == null || !chat.stories_hidden)) {
            z = false;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("StoriesController move user stories to first hidden=" + z + " did=" + peerDialogId);
        }
        if (z) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z2) {
            loadAllStoriesForDialog(peerDialogId);
        }
        MessagesController.getInstance(i).checkArchiveFolder();
    }

    public final boolean canEditStories(long j) {
        TLRPC.Chat chat;
        if (j >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.edit_stories;
    }

    public final boolean canPostStories(long j) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i = this.currentAccount;
        if (j >= 0) {
            return j > 0 && (user = MessagesController.getInstance(i).getUser(Long.valueOf(j))) != null && user.bot && user.bot_can_edit;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        return chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories);
    }

    public final void canSendStoryFor(long j, Consumer consumer, boolean z, Theme.ResourcesProvider resourcesProvider) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i = this.currentAccount;
        tL_stories_canSendStory.peer = MessagesController.getInstance(i).getInputPeer(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_canSendStory, new BotStarsActivity$$ExternalSyntheticLambda24(this, z, j, consumer, resourcesProvider), 1024);
    }

    public final void checkExpireStories(ArrayList arrayList) {
        int i;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int size = arrayList.size();
            i = this.currentAccount;
            if (i2 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i2);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i3 = 0;
            while (i3 < peerStories.stories.size()) {
                if (StoriesUtilities.isExpired(i, peerStories.stories.get(i3))) {
                    peerStories.stories.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (peerStories.stories.isEmpty() && !hasUploadingStories(peerDialogId)) {
                this.allStoriesMap.remove(peerDialogId);
                arrayList.remove(peerStories);
                z = true;
            }
            i2++;
        }
        if (z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public final boolean checkStoryError(TLRPC.TL_error tL_error) {
        boolean z;
        String str;
        int i = this.currentAccount;
        if (tL_error == null || (str = tL_error.text) == null) {
            z = false;
        } else {
            long j = 0;
            z = true;
            if (str.startsWith("STORY_SEND_FLOOD_WEEKLY_")) {
                try {
                    j = Long.parseLong(tL_error.text.substring(24));
                } catch (Exception unused) {
                }
                this.storyLimitCached = new StoryLimit(2, 0, j);
            } else if (tL_error.text.startsWith("STORY_SEND_FLOOD_MONTHLY_")) {
                try {
                    j = Long.parseLong(tL_error.text.substring(25));
                } catch (Exception unused2) {
                }
                this.storyLimitCached = new StoryLimit(3, 0, j);
            } else if (tL_error.text.equals("STORIES_TOO_MUCH")) {
                this.storyLimitCached = new StoryLimit(1, 0, 0L);
            } else if (tL_error.text.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                MessagesController messagesController = MessagesController.getInstance(i);
                if ("enabled".equals(messagesController.storiesPosting)) {
                    SharedPreferences.Editor editorEdit = messagesController.getMainSettings().edit();
                    messagesController.storiesPosting = "premium";
                    editorEdit.putString("storiesPosting", "premium").apply();
                    NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesEnabledUpdate, new Object[0]);
                }
            } else {
                z = false;
            }
        }
        if (z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
        }
        return z;
    }

    public final StoryLimit checkStoryLimit() {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i = this.currentAccount;
        int i2 = UserConfig.getInstance(i).isPremium() ? MessagesController.getInstance(i).storyExpiringLimitPremium : MessagesController.getInstance(i).storyExpiringLimitDefault;
        ArrayList arrayList2 = (ArrayList) this.uploadingAndEditingStories.get(UserConfig.getInstance(i).getClientUserId());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(UserConfig.getInstance(i).getClientUserId());
        if (peerStories != null && (arrayList = peerStories.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i2) {
            return new StoryLimit(1, 0, 0L);
        }
        if (this.storyLimitFetched) {
            return this.storyLimitCached;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(i).getInputPeer(UserConfig.getInstance(i).getClientUserId());
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_canSendStory, new StoriesController$$ExternalSyntheticLambda0(this, 1), 1024);
        return null;
    }

    public final void checkUnsupportedStory(int i, long j) {
        String str = "229:" + j + ":" + i;
        HashSet hashSet = this.requestingUnsupportedStories;
        if (hashSet.contains(str) || this.unsupportedStoriesChecked.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i2 = this.currentAccount;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i2).getInputPeer(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new MessageSeenView$$ExternalSyntheticLambda0(this, i, str, j, 7));
    }

    public final void cleanup() {
        this.storiesReadLoaded = false;
        this.stateHidden = "";
        this.state = "";
        this.mainSettings.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        DraftsController draftsController = this.draftsController;
        Objects.requireNonNull(draftsController);
        AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(draftsController, 15));
        loadStories();
        if (this.storiesReadLoaded) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new StoriesController$$ExternalSyntheticLambda0(this, 0));
    }

    public final void deleteStories(long j, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i = this.currentAccount;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(j);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        LongSparseArray longSparseArray = this.allStoriesMap;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) longSparseArray.get(j);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    for (int i3 = 0; i3 < peerStories2.stories.size(); i3++) {
                        if (peerStories2.stories.get(i3).id == storyItem.id) {
                            peerStories2.stories.remove(i3);
                            if (!peerStories2.stories.isEmpty()) {
                                break;
                            }
                            longSparseArray.remove(j);
                            break;
                        }
                    }
                }
                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
            }
        }
        if (j < 0 ? !((chatFull = MessagesController.getInstance(i).getChatFull(-j)) == null || (peerStories = chatFull.stories) == null) : !((userFull = MessagesController.getInstance(i).getUserFull(j)) == null || (peerStories = userFull.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i4);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                for (int i5 = 0; i5 < peerStories2.stories.size(); i5++) {
                    if (peerStories2.stories.get(i5).id == storyItem2.id) {
                        peerStories2.stories.remove(i5);
                        break;
                    }
                }
            }
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_deleteStories, new StoriesController$$ExternalSyntheticLambda0(this, 4));
        updateDeletedStoriesInLists(j, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.id;
        StoriesStorage storiesStorage = this.storiesStorage;
        storiesStorage.storage.getStorageQueue().postRunnable(new PollItemMenu$$ExternalSyntheticLambda12(storiesStorage, arrayList2, j, 28));
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public final TL_stories.StoryItem findStory(int i, long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories == null) {
            return null;
        }
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).id == i) {
                return peerStories.stories.get(i2);
            }
        }
        return null;
    }

    public final void fixDeletedAndNonContactsStories(ArrayList arrayList) {
        boolean z;
        TLRPC.User user;
        int i = 0;
        while (i < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (peerDialogId <= 0 || (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) == null || isContactOrService(user)) {
                z = false;
            } else {
                arrayList.remove(i);
                i--;
                z = true;
            }
            int i2 = 0;
            while (i2 < peerStories.stories.size()) {
                if (peerStories.stories.get(i2) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!z && peerStories.stories.isEmpty() && !hasUploadingStories(peerDialogId)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public final int getMaxStoriesReadId(long j) {
        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (storiesFromFullPeer == null) {
            storiesFromFullPeer = getStoriesFromFullPeer(j);
        }
        return storiesFromFullPeer != null ? Math.max(storiesFromFullPeer.max_read_id, this.dialogIdToMaxReadId.get(j, 0)) : this.dialogIdToMaxReadId.get(j, 0);
    }

    public final TL_stories.PeerStories getStoriesFromFullPeer(long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i = this.currentAccount;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                checkExpireStories(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(-j);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            checkExpireStories(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }

    public final StoriesList getStoriesList(long j, int i, int i2, boolean z) {
        if (i == 0 && i2 > 0) {
            HashMap map = this.storiesAlbumsLists;
            HashMap map2 = (HashMap) map.get(Long.valueOf(j));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Long.valueOf(j), map2);
            }
            HashMap map3 = map2;
            StoriesList storiesList = (StoriesList) map3.get(Integer.valueOf(i2));
            if (storiesList != null || !z) {
                return storiesList;
            }
            StoriesList storiesList2 = new StoriesList(this.currentAccount, j, i, i2, new VoIPFragment$$ExternalSyntheticLambda7(this, 9));
            map3.put(Integer.valueOf(i2), storiesList2);
            return storiesList2;
        }
        HashMap[] mapArr = this.storiesLists;
        if (mapArr[i] == null) {
            mapArr[i] = new HashMap();
        }
        StoriesList storiesList3 = (StoriesList) mapArr[i].get(Long.valueOf(j));
        if (storiesList3 != null || !z) {
            return storiesList3;
        }
        if (i == 4) {
            HashMap map4 = mapArr[i];
            Long lValueOf = Long.valueOf(j);
            BotPreviewsList botPreviewsList = new BotPreviewsList(this.currentAccount, j, null, new VoIPFragment$$ExternalSyntheticLambda7(this, 9));
            map4.put(lValueOf, botPreviewsList);
            return botPreviewsList;
        }
        HashMap map5 = mapArr[i];
        Long lValueOf2 = Long.valueOf(j);
        StoriesList storiesList4 = new StoriesList(this.currentAccount, j, i, i2, new VoIPFragment$$ExternalSyntheticLambda7(this, 9));
        map5.put(lValueOf2, storiesList4);
        return storiesList4;
    }

    public final StoriesCollections getStoryAlbumsList(long j, boolean z) {
        LongSparseArray longSparseArray = this.storiesCollections;
        StoriesCollections storiesCollections = (StoriesCollections) longSparseArray.get(j);
        if (storiesCollections != null || !z) {
            return storiesCollections;
        }
        StoriesCollections storiesCollections2 = new StoriesCollections(this.currentAccount, j, this);
        longSparseArray.put(storiesCollections2, j);
        return storiesCollections2;
    }

    public final int getTotalStoriesCount(boolean z) {
        if (z) {
            return this.hasMoreHidden ? Math.max(1, this.totalStoriesCountHidden) : this.hiddenListStories.size();
        }
        return this.hasMore ? Math.max(1, this.totalStoriesCount) : this.dialogListStories.size();
    }

    public final int getUnreadState(int i, long j) {
        if (j == 0) {
            return 0;
        }
        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (storiesFromFullPeer == null) {
            storiesFromFullPeer = getStoriesFromFullPeer(j);
        }
        if (storiesFromFullPeer == null) {
            return 0;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return 1;
        }
        int iMax = Math.max(storiesFromFullPeer.max_read_id, this.dialogIdToMaxReadId.get(j, 0));
        boolean z = false;
        for (int i2 = 0; i2 < storiesFromFullPeer.stories.size(); i2++) {
            if (storiesFromFullPeer.stories.get(i2).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i == 0 || storiesFromFullPeer.stories.get(i2).id == i) && storiesFromFullPeer.stories.get(i2).id > iMax) {
                if (storiesFromFullPeer.stories.get(i2).close_friends) {
                    return 2;
                }
                z = true;
            }
        }
        return (!isLastUploadingFailed(j) && z) ? 1 : 0;
    }

    public final boolean hasLiveStory(long j) {
        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (storiesFromFullPeer == null) {
            storiesFromFullPeer = getStoriesFromFullPeer(j);
        }
        if (storiesFromFullPeer == null) {
            return false;
        }
        for (int size = storiesFromFullPeer.stories.size() - 1; size >= 0; size--) {
            TL_stories.StoryItem storyItem = storiesFromFullPeer.stories.get(size);
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasOnlySelfStories() {
        if (hasSelfStories()) {
            ArrayList arrayList = this.dialogListStories;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer) == UserConfig.getInstance(this.currentAccount).clientUserId)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasSelfStories() {
        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        return ((peerStories == null || peerStories.stories.isEmpty()) && Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) ? false : true;
    }

    public final boolean hasStories(long j) {
        if (j == 0) {
            return false;
        }
        if (hasUploadingStories(j) || isLastUploadingFailed(j)) {
            return true;
        }
        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (storiesFromFullPeer == null) {
            storiesFromFullPeer = getStoriesFromFullPeer(j);
        }
        return (storiesFromFullPeer == null || storiesFromFullPeer.stories.isEmpty()) ? false : true;
    }

    public final boolean hasUnreadStories(long j) {
        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (storiesFromFullPeer == null) {
            storiesFromFullPeer = getStoriesFromFullPeer(j);
        }
        if (storiesFromFullPeer == null) {
            return false;
        }
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.uploadingStoriesByDialogId.get(j))) {
            return true;
        }
        for (int i = 0; i < storiesFromFullPeer.stories.size(); i++) {
            TL_stories.StoryItem storyItem = storiesFromFullPeer.stories.get(i);
            if (storyItem != null && storyItem.id > storiesFromFullPeer.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasUploadingStories(long j) {
        ArrayList arrayList = (ArrayList) this.uploadingStoriesByDialogId.get(j);
        HashMap map = (HashMap) this.editingStories.get(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return (map == null || map.isEmpty()) ? false : true;
        }
        return true;
    }

    public final boolean isBlocked(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j = storyView.user_id;
        LongSparseArray longSparseArray = this.blockedOverride;
        if (longSparseArray.containsKey(j)) {
            return ((Boolean) longSparseArray.get(storyView.user_id)).booleanValue();
        }
        if (this.lastBlocklistRequested == 0) {
            return storyView.blocked_my_stories_from || storyView.blocked;
        }
        return this.blocklist.contains(Long.valueOf(storyView.user_id)) || storyView.blocked_my_stories_from || storyView.blocked;
    }

    public final boolean isContactOrService(TLRPC.User user) {
        if (user != null) {
            return user.contact || user.id == MessagesController.getInstance(this.currentAccount).storiesChangelogUserId;
        }
        return false;
    }

    public final boolean isLastUploadingFailed(long j) {
        ArrayList arrayList = (ArrayList) this.uploadingStoriesByDialogId.get(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return ((UploadingStory) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).failed;
    }

    public final void loadAllStoriesForDialog(long j) {
        HashSet hashSet = this.allStoriesLoading;
        if (hashSet.contains(Long.valueOf(j))) {
            return;
        }
        hashSet.add(Long.valueOf(j));
        FileLog.d("StoriesController loadAllStoriesForDialog " + j);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i = this.currentAccount;
        tL_stories_getPeerStories.peer = MessagesController.getInstance(i).getInputPeer(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_getPeerStories, new LocationActivity$$ExternalSyntheticLambda44(this, j, 6));
    }

    public final void loadBlocklist() {
        if (this.blocklistLoading || this.blocklistFull) {
            return;
        }
        this.blocklistLoading = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.blocklist.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_getBlocked, new StoriesController$$ExternalSyntheticLambda0(this, 2));
    }

    public final void loadFromServer(boolean z) {
        if (z && this.loadingFromServerHidden) {
            return;
        }
        if ((z || !this.loadingFromServer) && !this.loadingFromDatabase) {
            boolean z2 = true;
            if (z) {
                this.loadingFromServerHidden = true;
            } else {
                this.loadingFromServer = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            String str = z ? this.stateHidden : this.state;
            boolean z3 = z ? this.hasMoreHidden : this.hasMore;
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (!z3 || TextUtils.isEmpty(str)) {
                z2 = false;
            } else {
                tL_stories_getAllStories.next = true;
            }
            tL_stories_getAllStories.include_hidden = z;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getAllStories, new StoriesController$$ExternalSyntheticLambda5(this, z, tL_stories_getAllStories, z2));
        }
    }

    public final void loadSendAs() {
        if (this.loadingSendAs || this.loadedSendAs) {
            return;
        }
        this.loadingSendAs = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new StoriesController$$ExternalSyntheticLambda0(this, 3));
    }

    public final void loadSkippedStories(final TL_stories.PeerStories peerStories, final boolean z) {
        if (peerStories == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        final long j = peerDialogId * ((long) (z ? -1 : 1));
        HashSet hashSet = this.loadingAllStories;
        if (hashSet.contains(Long.valueOf(j))) {
            return;
        }
        ArrayList<Integer> arrayList = null;
        for (int i = 0; i < peerStories.stories.size(); i++) {
            if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(Integer.valueOf(peerStories.stories.get(i).id));
            }
            if (arrayList != null && arrayList.size() > 14) {
                break;
            }
        }
        if (arrayList != null) {
            hashSet.add(Long.valueOf(j));
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.id = arrayList;
            int i2 = this.currentAccount;
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i2).getInputPeer(peerDialogId);
            ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StoriesController storiesController = this.f$0;
                    storiesController.getClass();
                    AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda9(storiesController, j, z, peerStories, peerDialogId, tLObject));
                }
            });
        }
    }

    public final void loadStories() {
        if (this.firstLoad) {
            this.loadingFromDatabase = true;
            StoriesController$$ExternalSyntheticLambda2 storiesController$$ExternalSyntheticLambda2 = new StoriesController$$ExternalSyntheticLambda2(this, 1);
            StoriesStorage storiesStorage = this.storiesStorage;
            storiesStorage.storage.getStorageQueue().postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(6, storiesStorage, storiesController$$ExternalSyntheticLambda2));
        } else {
            loadFromServer(false);
            loadFromServer(true);
        }
        this.firstLoad = false;
    }

    public final void markStoriesAsReadFromServer(int i, long j) {
        AndroidUtilities.runOnUIThread(new ChatMessageCell$$ExternalSyntheticLambda5(this, j, i, 8));
    }

    public final boolean markStoryAsRead(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i = this.dialogIdToMaxReadId.get(peerDialogId);
            int iMax = Math.max(peerStories.max_read_id, Math.max(i, storyItem.id));
            int i2 = this.currentAccount;
            NotificationsController.getInstance(i2).processReadStories(peerDialogId, iMax);
            peerStories.max_read_id = iMax;
            this.dialogIdToMaxReadId.put(peerDialogId, iMax);
            if (iMax > i) {
                if (!z) {
                    this.storiesStorage.updateMaxReadId(iMax, peerDialogId);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(i2).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(i2).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void preloadStory(long j, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath != null) {
            return;
        }
        int i = this.currentAccount;
        if (DownloadController.getInstance(i).canPreloadStories()) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            boolean z = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
            storyItem.dialogId = j;
            if (z) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000);
                FileLoader.getInstance(i).loadFile(storyItem.media.getDocument(), storyItem, 0, 1);
                FileLoader.getInstance(i).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
            } else {
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                TLRPC.Photo photo = messageMedia2 == null ? null : messageMedia2.photo;
                if (photo != null && (arrayList = photo.sizes) != null) {
                    FileLoader.getInstance(i).loadFile(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), storyItem, "jpg", 0, 1);
                }
            }
            if (storyItem.media_areas != null) {
                for (int i2 = 0; i2 < Math.min(2, storyItem.media_areas.size()); i2++) {
                    if (storyItem.media_areas.get(i2) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i2)).reaction);
                        if (visibleReactionFromTL.emojicon != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(visibleReactionFromTL.emojicon);
                            if (tL_availableReaction != null) {
                                FileLoader.getInstance(i).loadFile(tL_availableReaction.select_animation, visibleReactionFromTL, 0, 0);
                            }
                        } else {
                            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(1, i, visibleReactionFromTL.documentId);
                            animatedEmojiDrawable.preloading = true;
                            animatedEmojiDrawable.updateAttachState();
                        }
                    }
                }
            }
        }
    }

    public final void preloadUserStories(TL_stories.PeerStories peerStories) {
        int i = 0;
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).id > peerStories.max_read_id) {
                i = i2;
                break;
            }
        }
        if (peerStories.stories.isEmpty()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        preloadStory(peerDialogId, peerStories.stories.get(i));
        if (i > 0) {
            preloadStory(peerDialogId, peerStories.stories.get(i - 1));
        }
        if (i < peerStories.stories.size() - 1) {
            preloadStory(peerDialogId, peerStories.stories.get(i + 1));
        }
    }

    public final void processAllStoriesResponse(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = this.hiddenListStories;
        ArrayList arrayList2 = this.dialogListStories;
        if (!z3) {
            if (z) {
                arrayList.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tL_stories_allStories.peer_stories.size(); i++) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(DialogObject.getPeerDialogId(tL_stories_allStories.peer_stories.get(i).peer));
            }
            FileLog.d("StoriesController cache=" + z2 + " hidden=" + z + " processAllStoriesResponse {" + ((Object) sb) + "}");
        }
        int i2 = this.currentAccount;
        MessagesController.getInstance(i2).putUsers(tL_stories_allStories.users, z2);
        MessagesController.getInstance(i2).putChats(tL_stories_allStories.chats, z2);
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        for (int i3 = 0; i3 < tL_stories_allStories.peer_stories.size(); i3++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i3);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i4 = 0;
            while (i4 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i4);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    NotificationsController.getInstance(i2).processDeleteStory(peerDialogId, storyItem.id);
                    peerStories.stories.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (peerStories.stories.isEmpty()) {
                this.allStoriesMap.remove(peerDialogId);
            } else {
                putToAllStories(peerDialogId, peerStories);
                int i5 = 0;
                while (i5 < 2) {
                    ArrayList arrayList3 = i5 == 0 ? arrayList : arrayList2;
                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                        if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList3.get(i6)).peer) == peerDialogId) {
                            arrayList3.remove(i6);
                            break;
                        }
                    }
                    i5++;
                }
                if (peerDialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        if (user.stories_hidden) {
                            addUserToHiddenList(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            preloadUserStories(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        if (chat.stories_hidden) {
                            addUserToHiddenList(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            preloadUserStories(peerStories);
                        }
                    }
                }
            }
        }
        if (!z2) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            VoIPFragment$$ExternalSyntheticLambda31 voIPFragment$$ExternalSyntheticLambda31 = new VoIPFragment$$ExternalSyntheticLambda31(5);
            StoriesStorage storiesStorage = this.storiesStorage;
            storiesStorage.storage.getStorageQueue().postRunnable(new ProfileActivity$$ExternalSyntheticLambda116(storiesStorage, arrayList4, z3, z, voIPFragment$$ExternalSyntheticLambda31, 6));
        }
        OAuthSheet$$ExternalSyntheticLambda17 oAuthSheet$$ExternalSyntheticLambda17 = this.sortStoriesRunnable;
        AndroidUtilities.cancelRunOnUIThread(oAuthSheet$$ExternalSyntheticLambda17);
        oAuthSheet$$ExternalSyntheticLambda17.run();
    }

    public final void processUpdate(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
        if (peerDialogId == 0) {
            FileLog.d("StoriesController can't update story dialogId == 0");
            return;
        }
        StoriesStorage storiesStorage = this.storiesStorage;
        if (peerDialogId > 0) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user != null && (isContactOrService(user) || user.self)) {
                storiesStorage.storage.getStorageQueue().postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(4, storiesStorage, tL_updateStory));
            }
        } else {
            storiesStorage.storage.getStorageQueue().postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(4, storiesStorage, tL_updateStory));
            user = null;
        }
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda126(this, peerDialogId, tL_updateStory, user, 10));
    }

    public final void putStories(long j, TL_stories.PeerStories peerStories) {
        putToAllStories(j, peerStories);
        StoriesStorage storiesStorage = this.storiesStorage;
        int i = this.currentAccount;
        if (j <= 0) {
            if (ChatObject.isInChat(MessagesController.getInstance(i).getChat(Long.valueOf(-j)))) {
                storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda13(storiesStorage, peerStories, 0));
            }
        } else {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            if (isContactOrService(user) || user.self) {
                storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda13(storiesStorage, peerStories, 0));
            }
        }
    }

    public final void putToAllStories(long j, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        LongSparseArray longSparseArray = this.allStoriesMap;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) longSparseArray.get(j);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < peerStories.stories.size(); i++) {
                if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                    int i2 = peerStories.stories.get(i).id;
                    for (int i3 = 0; i3 < peerStories2.stories.size(); i3++) {
                        if (peerStories2.stories.get(i3).id == i2 && (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i, peerStories2.stories.get(i3));
                            break;
                        }
                    }
                }
            }
        }
        longSparseArray.put(peerStories, j);
    }

    public final void removeStoriesFromAlbum(int i, long j, ArrayList arrayList) {
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, true);
        storyAlbumsList.getClass();
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = storyAlbumsList.currentAccount;
        tL_updateAlbum.peer = MessagesController.getInstance(i2).getInputPeer(storyAlbumsList.dialogId);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        StoriesList storiesList = storyAlbumsList.this$0.getStoriesList(storyAlbumsList.dialogId, 0, i, false);
        if (storiesList != null) {
            storiesList.updateDeletedStories(arrayList);
        }
        ArrayList arrayList3 = storyAlbumsList.collections;
        int size3 = arrayList3.size();
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            int i6 = ((StoryAlbum) obj3).album_id;
            StoriesList storiesList2 = storyAlbumsList.this$0.getStoriesList(storyAlbumsList.dialogId, 0, i6, false);
            if (storiesList2 != null) {
                storiesList2.updateStoryItemsAlbums(i, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void resolveStoryLink(long j, int i, Consumer consumer) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        if (peerStories != null) {
            for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                if (peerStories.stories.get(i2).id == i && !(peerStories.stories.get(i2) instanceof TL_stories.TL_storyItemSkipped)) {
                    consumer.accept(peerStories.stories.get(i2));
                    return;
                }
            }
        }
        long j2 = (((long) i) + j) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.resolvedStories.get(j2);
        if (storyItem != null) {
            consumer.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        int i3 = this.currentAccount;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i3).getInputPeer(j);
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getStoriesByID, new AnonymousClass2(j2, consumer));
    }

    public final void setLoading(long j, boolean z) {
        LongSparseIntArray longSparseIntArray = this.loadingDialogsStories;
        if (z) {
            longSparseIntArray.put(j, 1);
        } else {
            longSparseIntArray.delete(j);
        }
    }

    public final void setStealthMode(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.stealthMode = tL_storiesStealthMode;
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stealthModeChanged, new Object[0]);
        SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(i);
        if (tL_storiesStealthMode == null) {
            editorM.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        editorM.putString("stories_stealth_mode", Utilities.bytesToHex(serializedData.toByteArray())).apply();
    }

    public final void setStoryReaction(long j, TL_stories.StoryItem storyItem, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        int i = this.currentAccount;
        tL_stories_sendReaction.peer = MessagesController.getInstance(i).getInputPeer(j);
        if (visibleReaction == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (visibleReaction.documentId != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = visibleReaction.documentId;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (visibleReaction.emojicon != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = visibleReaction.emojicon;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        updateStoryItem(j, storyItem, false);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendReaction, new PassportActivity$$ExternalSyntheticLambda1(18));
    }

    public final void toggleHidden(long j, boolean z, boolean z2) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.hiddenListStories;
        ArrayList arrayList2 = this.dialogListStories;
        if (z) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                peerStories = null;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i)).peer) == j) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i);
                    break;
                }
                i++;
            }
        }
        if (peerStories != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    arrayList2.add(0, peerStories);
                    OAuthSheet$$ExternalSyntheticLambda17 oAuthSheet$$ExternalSyntheticLambda17 = this.sortStoriesRunnable;
                    AndroidUtilities.cancelRunOnUIThread(oAuthSheet$$ExternalSyntheticLambda17);
                    oAuthSheet$$ExternalSyntheticLambda17.run();
                    break;
                }
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i2)).peer) == j) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = this.currentAccount;
        NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(i3).checkArchiveFolder();
        if (z2) {
            if (j >= 0) {
                TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(j));
                user.stories_hidden = z;
                MessagesStorage.getInstance(i3).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(i3).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-j));
                chat.stories_hidden = z;
                MessagesStorage.getInstance(i3).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(i3).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(i3).getInputPeer(j);
            tL_stories_togglePeerStoriesHidden.hidden = z;
            ConnectionsManager.getInstance(i3).sendRequest(tL_stories_togglePeerStoriesHidden, new PassportActivity$$ExternalSyntheticLambda1(18));
        }
    }

    public final void updateBlockUser(long j, boolean z, boolean z2) {
        TLObject tLObject;
        int i = this.currentAccount;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(j);
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
            return;
        }
        this.blockedOverride.put(Boolean.valueOf(z), j);
        HashSet hashSet = this.blocklist;
        if (hashSet.contains(Long.valueOf(j)) != z) {
            if (z) {
                hashSet.add(Long.valueOf(j));
                this.blocklistCount++;
            } else {
                hashSet.remove(Long.valueOf(j));
                this.blocklistCount--;
            }
        }
        if (z2) {
            if (z) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.id = inputPeer;
                tLObject = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock.my_stories_from = true;
                tL_contacts_unblock.id = inputPeer;
                tLObject = tL_contacts_unblock;
            }
            ConnectionsManager.getInstance(i).sendRequest(tLObject, null);
        }
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
    }

    public final void updateDeletedStoriesInLists(long j, List list) {
        ArrayList arrayList;
        StringBuilder sbM = AacUtil.m(j, "updateDeletedStoriesInLists ", " storyItems[");
        sbM.append(list.size());
        sbM.append("] {");
        sbM.append(storyItemIds(list));
        sbM.append("}");
        FileLog.d(sbM.toString());
        StoriesList storiesList = getStoriesList(j, 0, -1, false);
        StoriesController storiesController = this;
        StoriesList storiesList2 = storiesController.getStoriesList(j, 1, -1, false);
        if (storiesList != null) {
            storiesList.updateDeletedStories(list);
        }
        if (storiesList2 != null) {
            storiesList2.updateDeletedStories(list);
        }
        int i = 0;
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        if (storyAlbumsList == null || (arrayList = storyAlbumsList.collections) == null) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            StoriesList storiesList3 = storiesController.getStoriesList(j, 0, ((StoryAlbum) obj).album_id, false);
            if (storiesList3 != null) {
                storiesList3.updateDeletedStories(list);
            }
            storiesController = this;
        }
    }

    public final void updateStoriesForFullPeer(long j, List list, boolean z) {
        TL_stories.PeerStories peerStories;
        boolean z2;
        int i = this.currentAccount;
        if (j > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
            if (userFull == null) {
                return;
            }
            if (userFull.stories == null) {
                if (!z) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                userFull.stories = tL_peerStories;
                tL_peerStories.peer = MessagesController.getInstance(i).getPeer(j);
                userFull.stories.max_read_id = getMaxStoriesReadId(j);
            }
            peerStories = userFull.stories;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(-j);
            if (chatFull == null) {
                return;
            }
            if (chatFull.stories == null) {
                if (!z) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                chatFull.stories = tL_peerStories2;
                tL_peerStories2.peer = MessagesController.getInstance(i).getPeer(j);
                chatFull.stories.max_read_id = getMaxStoriesReadId(j);
            }
            peerStories = chatFull.stories;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            TL_stories.StoryItem storyItemApplyStoryUpdate = (TL_stories.StoryItem) list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= peerStories.stories.size()) {
                    z2 = false;
                    break;
                }
                if (peerStories.stories.get(i3).id == storyItemApplyStoryUpdate.id) {
                    z2 = true;
                    if (!(storyItemApplyStoryUpdate instanceof TL_stories.TL_storyItemDeleted)) {
                        TL_stories.StoryItem storyItem = peerStories.stories.get(i3);
                        storyItemApplyStoryUpdate = applyStoryUpdate(storyItem, storyItemApplyStoryUpdate);
                        peerStories.stories.set(i3, storyItemApplyStoryUpdate);
                        if (storyItemApplyStoryUpdate.attachPath == null) {
                            storyItemApplyStoryUpdate.attachPath = storyItem.attachPath;
                        }
                        if (storyItemApplyStoryUpdate.firstFramePath == null) {
                            storyItemApplyStoryUpdate.firstFramePath = storyItem.firstFramePath;
                        }
                        ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesController update story for full peer storyId="), storyItemApplyStoryUpdate.id);
                        break;
                    }
                    peerStories.stories.remove(i3);
                    break;
                }
                i3++;
            }
            if (!z2) {
                if (storyItemApplyStoryUpdate instanceof TL_stories.TL_storyItemDeleted) {
                    ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesController story is not found, but already deleted storyId="), storyItemApplyStoryUpdate.id);
                } else if (z) {
                    ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesController add new story for full peer storyId="), storyItemApplyStoryUpdate.id);
                    peerStories.stories.add(storyItemApplyStoryUpdate);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void updateStoriesFromFullPeer(long j, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories == null || (peerStories2 = (TL_stories.PeerStories) this.allStoriesMap.get(j)) == null) {
            return;
        }
        FileLog.d("StoriesController update stories from full peer " + j);
        for (int i = 0; i < peerStories2.stories.size(); i++) {
            if (peerStories2.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                int i2 = peerStories2.stories.get(i).id;
                for (int i3 = 0; i3 < peerStories.stories.size(); i3++) {
                    if (peerStories.stories.get(i3).id == i2 && (peerStories.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                        peerStories2.stories.set(i, peerStories.stories.get(i3));
                        break;
                    }
                }
            }
        }
    }

    public final void updateStoriesInLists(long j, List list, boolean z) {
        ArrayList arrayList;
        StringBuilder sbM = AacUtil.m(j, "updateStoriesInLists ", " storyItems[");
        sbM.append(list.size());
        sbM.append("] {");
        sbM.append(storyItemIds(list));
        sbM.append("}");
        FileLog.d(sbM.toString());
        StoriesList storiesList = getStoriesList(j, 0, -1, false);
        StoriesController storiesController = this;
        StoriesList storiesList2 = storiesController.getStoriesList(j, 1, -1, false);
        if (storiesList != null) {
            storiesList.updateStories(list, z);
        }
        if (storiesList2 != null) {
            storiesList2.updateStories(list, z);
        }
        ArrayList arrayList2 = storiesController.attachedSearchLists;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((SearchStoriesList) obj).updateStories(list, z);
        }
        StoriesCollections storyAlbumsList = getStoryAlbumsList(j, false);
        if (storyAlbumsList == null || (arrayList = storyAlbumsList.collections) == null) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            int i3 = i + 1;
            StoriesList storiesList3 = storiesController.getStoriesList(j, 0, ((StoryAlbum) arrayList.get(i)).album_id, false);
            if (storiesList3 != null) {
                storiesList3.updateStories(list, z);
            }
            storiesController = this;
            i = i3;
        }
    }

    public final void updateStoriesPinned(long j, ArrayList arrayList, boolean z, PeerStoriesView$38$$ExternalSyntheticLambda1 peerStoriesView$38$$ExternalSyntheticLambda1) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.allStoriesMap.get(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (peerStories != null) {
                    for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                        if (peerStories.stories.get(i2).id == storyItem.id) {
                            peerStories.stories.get(i2).pinned = z;
                            this.storiesStorage.updateStoryItem(j, storyItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        updateStoriesInLists(j, arrayList, false);
        updateStoriesForFullPeer(j, arrayList, false);
        togglepinned.pinned = z;
        int i3 = this.currentAccount;
        togglepinned.peer = MessagesController.getInstance(i3).getInputPeer(j);
        ConnectionsManager.getInstance(i3).sendRequest(togglepinned, new RichMediaUploader$$ExternalSyntheticLambda0(peerStoriesView$38$$ExternalSyntheticLambda1, 1));
    }

    public final void updateStoryItem(long j, TL_stories.StoryItem storyItem, boolean z) {
        String str;
        StringBuilder sbM = AacUtil.m(j, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        sbM.append(str);
        FileLog.d(sbM.toString());
        updateStoriesInLists(j, Collections.singletonList(storyItem), z);
        this.storiesStorage.updateStoryItem(j, storyItem);
        updateStoriesForFullPeer(j, Collections.singletonList(storyItem), false);
    }

    public final void updateStoryReaction(long j, int i, TLRPC.Reaction reaction) {
        TL_stories.StoryItem storyItemFindStory = findStory(i, j);
        if (storyItemFindStory != null) {
            storyItemFindStory.sent_reaction = reaction;
            if (reaction != null) {
                storyItemFindStory.flags |= 32768;
            } else {
                storyItemFindStory.flags &= -32769;
            }
            updateStoryItem(j, storyItemFindStory, false);
        }
    }

    public class StoriesList {
        public static HashMap lastLoadTime;
        public final int albumId;
        public final AbstractSet cachedObjects;
        public final int currentAccount;
        public final StickersActivity$$ExternalSyntheticLambda18 destroyRunnable;
        public final long dialogId;
        public boolean done;
        public boolean error;
        public boolean invalidateAfterPreload;
        public final AbstractSet loadedObjects;
        public boolean loading;
        public boolean preloading;
        public boolean saving;
        public StoriesController$StoriesList$$ExternalSyntheticLambda5 toLoad;
        public final int type;
        public int maxLinkId = 0;
        public final ArrayList links = new ArrayList();
        public final ArrayList pinnedIds = new ArrayList();
        public final HashMap groupedByDay = new HashMap();
        public final ArrayList messageObjects = new ArrayList();
        public final HashMap messageObjectsMap = new HashMap();
        public final HashSet seenStories = new HashSet();
        public boolean showPhotos = true;
        public boolean showVideos = true;
        public final ArrayList tempArr = new ArrayList();
        public final StoriesController$StoriesList$$ExternalSyntheticLambda0 notify = new StoriesController$StoriesList$$ExternalSyntheticLambda0(this, 0);
        public int totalCount = -1;
        public int reqId = -1;

        public StoriesList(int i, long j, int i2, int i3, Utilities.Callback callback) {
            this.currentAccount = i;
            this.dialogId = j;
            this.type = i2;
            this.albumId = i3;
            this.destroyRunnable = new StickersActivity$$ExternalSyntheticLambda18(28, this, callback);
            if (i2 != 0 || i3 <= 0) {
                this.cachedObjects = new TreeSet(Comparator$CC.reverseOrder());
                this.loadedObjects = new TreeSet(Comparator$CC.reverseOrder());
            } else {
                this.cachedObjects = new LinkedHashSet();
                this.loadedObjects = new LinkedHashSet();
            }
            preloadCache();
        }

        public static long day(MessageObject messageObject) {
            if (messageObject == null) {
                return 0L;
            }
            long j = messageObject.messageOwner.date;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j * 1000);
            return (((long) calendar.get(2)) * 100) + (((long) calendar.get(1)) * 10000) + ((long) calendar.get(5));
        }

        public static boolean filter(MessageObject messageObject, boolean z, boolean z2) {
            if (messageObject == null || !messageObject.isStory()) {
                return false;
            }
            if (z && messageObject.isPhoto()) {
                return true;
            }
            return (z2 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported);
        }

        public static void reorder(AbstractSet abstractSet, ArrayList arrayList) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) obj;
                if (abstractSet.contains(num)) {
                    linkedHashSet.add(num);
                }
            }
            Iterator it = abstractSet.iterator();
            while (it.hasNext()) {
                Integer num2 = (Integer) it.next();
                if (!linkedHashSet.contains(num2)) {
                    linkedHashSet.add(num2);
                }
            }
            abstractSet.clear();
            abstractSet.addAll(linkedHashSet);
        }

        public final boolean canLoad() {
            Long l;
            return lastLoadTime == null || (l = (Long) lastLoadTime.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.currentAccount), Integer.valueOf(this.type), Long.valueOf(this.dialogId), Integer.valueOf(this.albumId))))) == null || System.currentTimeMillis() - l.longValue() > 120000;
        }

        public final void fill(boolean z) {
            fill(this.messageObjects, this.showPhotos, this.showVideos);
            if (z) {
                StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = this.notify;
                AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
            }
        }

        public MessageObject findMessageObject(int i) {
            return (MessageObject) this.messageObjectsMap.get(Integer.valueOf(i));
        }

        public int getCount() {
            boolean z = this.showVideos;
            ArrayList arrayList = this.messageObjects;
            if (z && this.showPhotos) {
                return this.totalCount < 0 ? arrayList.size() : Math.max(arrayList.size(), this.totalCount);
            }
            return arrayList.size();
        }

        public ArrayList getDays() {
            HashMap map = this.groupedByDay;
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(16));
            ArrayList arrayList2 = new ArrayList();
            int i = this.type;
            int i2 = 0;
            if (i == 0 && this.albumId > 0) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.messageObjects;
                int size = arrayList4.size();
                while (i2 < size) {
                    Object obj = arrayList4.get(i2);
                    i2++;
                    arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.id));
                }
                arrayList2.add(arrayList3);
                return arrayList2;
            }
            ArrayList arrayList5 = this.pinnedIds;
            if (i == 0 && !arrayList5.isEmpty()) {
                arrayList2.add(new ArrayList(arrayList5));
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                TreeSet treeSet = (TreeSet) map.get((Long) obj2);
                if (treeSet != null) {
                    ArrayList arrayList6 = new ArrayList(treeSet);
                    if (i == 0 && !arrayList5.isEmpty()) {
                        int size3 = arrayList5.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj3 = arrayList5.get(i4);
                            i4++;
                            Integer num = (Integer) obj3;
                            num.getClass();
                            arrayList6.remove(num);
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList2.add(arrayList6);
                    }
                }
            }
            return arrayList2;
        }

        public int getLoadedCount() {
            return this.loadedObjects.size();
        }

        public void invalidateCache() {
            int i = 1;
            if (this.preloading) {
                this.invalidateAfterPreload = true;
                return;
            }
            HashMap map = lastLoadTime;
            int i2 = this.currentAccount;
            if (map != null) {
                map.remove(Integer.valueOf(Objects.hash(Integer.valueOf(i2), Integer.valueOf(this.type), Long.valueOf(this.dialogId), Integer.valueOf(this.albumId))));
            }
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i2);
            messagesStorage.getStorageQueue().postRunnable(new StoriesController$StoriesList$$ExternalSyntheticLambda4(this, messagesStorage, i));
        }

        public boolean isLoading() {
            return this.preloading || this.loading;
        }

        public boolean isOnlyCache() {
            return this.loadedObjects.isEmpty() && canLoad();
        }

        public final boolean isPinned(int i) {
            if (this.type != 0 || this.albumId > 0) {
                return false;
            }
            return this.pinnedIds.contains(Integer.valueOf(i));
        }

        public final int lastLoadedId() {
            AbstractSet abstractSet = this.loadedObjects;
            if (abstractSet.isEmpty()) {
                return -1;
            }
            ArrayList arrayList = new ArrayList(abstractSet);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                int iIntValue = num.intValue();
                if (!this.pinnedIds.contains(num)) {
                    return iIntValue;
                }
            }
            return -1;
        }

        public boolean load(int i, List list, boolean z) {
            int iLastLoadedId;
            TLObject tLObject;
            int i2;
            if (this.loading || ((this.done || this.error || !canLoad()) && !z)) {
                return false;
            }
            if (this.preloading) {
                this.toLoad = new StoriesController$StoriesList$$ExternalSyntheticLambda5(this, z, i, list);
                return false;
            }
            int i3 = this.type;
            long j = this.dialogId;
            int i4 = this.currentAccount;
            if (i3 == 0 && (i2 = this.albumId) > 0) {
                TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
                tL_stories_getAlbumStories.album_id = i2;
                tL_stories_getAlbumStories.peer = MessagesController.getInstance(i4).getInputPeer(j);
                iLastLoadedId = this.loadedObjects.size();
                tL_stories_getAlbumStories.offset = iLastLoadedId;
                tL_stories_getAlbumStories.limit = i;
                tLObject = tL_stories_getAlbumStories;
            } else if (i3 == 0) {
                TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
                tL_stories_getPinnedStories.peer = MessagesController.getInstance(i4).getInputPeer(j);
                iLastLoadedId = lastLoadedId();
                tL_stories_getPinnedStories.offset_id = iLastLoadedId;
                tL_stories_getPinnedStories.limit = i;
                tLObject = tL_stories_getPinnedStories;
            } else if (i3 == 2) {
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(i4).getInputPeer(j);
                tL_stories_getStoriesByID.id.addAll(list);
                iLastLoadedId = -1;
                tLObject = tL_stories_getStoriesByID;
            } else {
                TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive = new TL_stories.TL_stories_getStoriesArchive();
                tL_stories_getStoriesArchive.peer = MessagesController.getInstance(i4).getInputPeer(j);
                iLastLoadedId = lastLoadedId();
                tL_stories_getStoriesArchive.offset_id = iLastLoadedId;
                tL_stories_getStoriesArchive.limit = i;
                tLObject = tL_stories_getStoriesArchive;
            }
            FileLog.d("StoriesList " + i3 + "{" + j + "} load");
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(i4).sendRequest(tLObject, new LaunchActivity$$ExternalSyntheticLambda63(this, iLastLoadedId, 7));
            return true;
        }

        public boolean markAsRead(int i) {
            HashSet hashSet = this.seenStories;
            if (hashSet.contains(Integer.valueOf(i))) {
                return false;
            }
            hashSet.add(Integer.valueOf(i));
            saveCache();
            TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
            int i2 = this.currentAccount;
            tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i2).getInputPeer(this.dialogId);
            tL_stories_incrementStoryViews.id.add(Integer.valueOf(i));
            ConnectionsManager.getInstance(i2).sendRequest(tL_stories_incrementStoryViews, new PassportActivity$$ExternalSyntheticLambda1(1));
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
            return true;
        }

        public void preloadCache() {
            if (this.preloading || this.loading || this.error) {
                return;
            }
            this.preloading = true;
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new StoriesController$StoriesList$$ExternalSyntheticLambda4(this, messagesStorage, 0));
        }

        public final void pushObject(MessageObject messageObject, boolean z) {
            if (messageObject == null) {
                return;
            }
            this.messageObjectsMap.put(Integer.valueOf(messageObject.getId()), messageObject);
            (z ? this.cachedObjects : this.loadedObjects).add(Integer.valueOf(messageObject.getId()));
            long jDay = day(messageObject);
            HashMap map = this.groupedByDay;
            TreeSet treeSet = (TreeSet) map.get(Long.valueOf(jDay));
            if (treeSet == null) {
                Long lValueOf = Long.valueOf(jDay);
                treeSet = new TreeSet(Comparator$CC.reverseOrder());
                map.put(lValueOf, treeSet);
            }
            treeSet.add(Integer.valueOf(messageObject.getId()));
        }

        public final void removeObject(int i, boolean z) {
            MessageObject messageObject = (MessageObject) this.messageObjectsMap.remove(Integer.valueOf(i));
            if (z) {
                this.cachedObjects.remove(Integer.valueOf(i));
            }
            this.loadedObjects.remove(Integer.valueOf(i));
            this.pinnedIds.remove(Integer.valueOf(i));
            if (messageObject != null) {
                long jDay = day(messageObject);
                HashMap map = this.groupedByDay;
                Collection collection = (Collection) map.get(Long.valueOf(jDay));
                if (collection != null) {
                    collection.remove(Integer.valueOf(i));
                    if (collection.isEmpty()) {
                        map.remove(Long.valueOf(jDay));
                    }
                }
            }
        }

        public void saveCache() {
            if (this.saving) {
                return;
            }
            this.saving = true;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(this.pinnedIds);
            fill(arrayList, true, true);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
            messagesStorage.getStorageQueue().postRunnable(new ProfileActivity$$ExternalSyntheticLambda149(this, arrayList, messagesStorage, arrayList2, 21));
        }

        public final void updateDeletedStories(List list) {
            FileLog.d("StoriesList " + this.type + "{" + this.dialogId + "} updateDeletedStories {" + StoriesController.storyItemIds(list) + "}");
            if (list == null) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i);
                if (storyItem != null) {
                    AbstractSet abstractSet = this.loadedObjects;
                    boolean zContains = abstractSet.contains(Integer.valueOf(storyItem.id));
                    AbstractSet abstractSet2 = this.cachedObjects;
                    if (zContains || abstractSet2.contains(Integer.valueOf(storyItem.id))) {
                        abstractSet.remove(Integer.valueOf(storyItem.id));
                        abstractSet2.remove(Integer.valueOf(storyItem.id));
                        int i2 = this.totalCount;
                        if (i2 != -1) {
                            this.totalCount = i2 - 1;
                        }
                        z = true;
                    }
                    removeObject(storyItem.id, true);
                }
            }
            if (z) {
                fill(true);
                saveCache();
            }
        }

        public void updatePinnedOrder(ArrayList arrayList, boolean z) {
            long j = this.dialogId;
            int i = this.currentAccount;
            int i2 = this.albumId;
            if (i2 > 0) {
                reorder(this.cachedObjects, arrayList);
                reorder(this.loadedObjects, arrayList);
                fill(false);
                if (z) {
                    TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
                    tL_updateAlbum.peer = MessagesController.getInstance(i).getInputPeer(j);
                    tL_updateAlbum.album_id = i2;
                    tL_updateAlbum.order = new ArrayList<>(arrayList);
                    ConnectionsManager.getInstance(i).sendRequest(tL_updateAlbum, null);
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i3 = MessagesController.getInstance(i).storiesPinnedToTopCountMax;
            if (arrayList2.size() > i3) {
                arrayList2.subList(i3, arrayList2.size()).clear();
            }
            ArrayList arrayList3 = this.pinnedIds;
            if (arrayList3.size() == arrayList2.size()) {
                for (int i4 = 0; i4 < arrayList3.size() && arrayList3.get(i4) == arrayList2.get(i4); i4++) {
                }
            }
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            fill(false);
            if (z) {
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList3);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i).getInputPeer(j);
                ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new PassportActivity$$ExternalSyntheticLambda1(20));
            }
        }

        public final void updateStories(List list, boolean z) {
            AbstractSet abstractSet;
            AbstractSet abstractSet2;
            int i;
            MessageObject messageObject;
            TL_stories.StoryItem storyItem;
            int i2 = 1;
            StringBuilder sb = new StringBuilder("StoriesList ");
            int i3 = this.type;
            sb.append(i3);
            sb.append("{");
            long j = this.dialogId;
            sb.append(j);
            sb.append("} updateStories {");
            sb.append(StoriesController.storyItemIds(list));
            sb.append("}");
            FileLog.d(sb.toString());
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                int size = list.size();
                abstractSet = this.cachedObjects;
                abstractSet2 = this.loadedObjects;
                i = this.albumId;
                if (i4 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i4);
                if (storyItem2 != null) {
                    boolean z3 = abstractSet2.contains(Integer.valueOf(storyItem2.id)) || abstractSet.contains(Integer.valueOf(storyItem2.id));
                    boolean z4 = i3 == i2 || storyItem2.pinned;
                    if (i > 0) {
                        ArrayList<Integer> arrayList2 = storyItem2.albums;
                        z4 = arrayList2 != null && arrayList2.contains(Integer.valueOf(i));
                    }
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        z4 = false;
                    }
                    HashMap map = this.messageObjectsMap;
                    int i5 = this.currentAccount;
                    if (z3 != z4) {
                        if (!z4) {
                            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesList remove story "), storyItem2.id);
                            removeObject(storyItem2.id, true);
                            int i6 = this.totalCount;
                            if (i6 != -1) {
                                this.totalCount = i6 - 1;
                            }
                        } else if (this.done) {
                            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesList put story "), storyItem2.id);
                            storyItem2.dialogId = j;
                            storyItem2.messageId = storyItem2.id;
                            MessageObject messageObject2 = new MessageObject(i5, storyItem2);
                            messageObject2.generateThumbs(false);
                            pushObject(messageObject2, false);
                            arrayList.add(Integer.valueOf(storyItem2.id));
                            int i7 = this.totalCount;
                            if (i7 != -1) {
                                this.totalCount = i7 + 1;
                            }
                        } else if (!this.loading) {
                            FileLog.d("StoriesList cannot put story " + storyItem2.id + " -> reload");
                            if (this.reqId != -1) {
                                ConnectionsManager.getInstance(i5).cancelRequest(this.reqId, true);
                                this.reqId = -1;
                            }
                            HashMap map2 = lastLoadTime;
                            if (map2 != null) {
                                map2.remove(Integer.valueOf(Objects.hash(Integer.valueOf(i5), Integer.valueOf(i3), Long.valueOf(j), Integer.valueOf(i))));
                            }
                            int size2 = this.messageObjects.size();
                            map.clear();
                            abstractSet2.clear();
                            abstractSet.clear();
                            invalidateCache();
                            this.done = false;
                            this.error = false;
                            load(Utilities.clamp(size2, 50, 10), Collections.EMPTY_LIST, true);
                        }
                    } else if (z3 && z4 && ((messageObject = (MessageObject) map.get(Integer.valueOf(storyItem2.id))) == null || z || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.id != storyItem2.id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                        ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesList update story "), storyItem2.id);
                        Integer numValueOf = Integer.valueOf(storyItem2.id);
                        storyItem2.dialogId = j;
                        storyItem2.messageId = storyItem2.id;
                        MessageObject messageObject3 = new MessageObject(i5, storyItem2);
                        messageObject3.generateThumbs(false);
                        map.put(numValueOf, messageObject3);
                    }
                    z2 = true;
                }
                i4++;
                i2 = 1;
            }
            if (i > 0 && !arrayList.isEmpty()) {
                reorder(abstractSet, arrayList);
                reorder(abstractSet2, arrayList);
                fill(false);
            }
            if (z2) {
                fill(true);
                saveCache();
            }
        }

        public final void updateStoryItemsAlbums(int i, ArrayList arrayList, boolean z) {
            TL_stories.StoryItem storyItem;
            int size = arrayList.size();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Integer num = (Integer) obj;
                num.getClass();
                MessageObject messageObject = (MessageObject) this.messageObjectsMap.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                    boolean zRemove = z ? hashSet.remove(Integer.valueOf(i)) : hashSet.add(Integer.valueOf(i));
                    storyItem.albums = !hashSet.isEmpty() ? new ArrayList<>(hashSet) : null;
                    z2 |= zRemove;
                }
            }
            if (z2) {
                fill(true);
                saveCache();
            }
        }

        public final void fill(ArrayList arrayList, boolean z, boolean z2) {
            ArrayList arrayList2 = this.tempArr;
            arrayList2.clear();
            HashMap map = this.messageObjectsMap;
            ArrayList arrayList3 = this.pinnedIds;
            int i = this.albumId;
            int i2 = this.type;
            if (i2 == 0 && i <= 0) {
                int size = arrayList3.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList3.get(i3);
                    i3++;
                    Integer num = (Integer) obj;
                    num.getClass();
                    MessageObject messageObject = (MessageObject) map.get(num);
                    if (filter(messageObject, z, z2)) {
                        arrayList2.add(messageObject);
                    }
                }
            }
            int i4 = Integer.MAX_VALUE;
            for (Integer num2 : this.loadedObjects) {
                int iIntValue = num2.intValue();
                MessageObject messageObject2 = (MessageObject) map.get(num2);
                if (i2 != 0 || i > 0 || !arrayList3.contains(num2)) {
                    if (filter(messageObject2, z, z2)) {
                        arrayList2.add(messageObject2);
                    }
                    if (iIntValue < i4) {
                        i4 = iIntValue;
                    }
                }
            }
            if (!this.done) {
                Iterator it = this.cachedObjects.iterator();
                while (it.hasNext() && (this.totalCount == -1 || arrayList2.size() < this.totalCount)) {
                    Integer num3 = (Integer) it.next();
                    int iIntValue2 = num3.intValue();
                    if (i2 != 0 || i > 0 || !arrayList3.contains(num3)) {
                        if (i4 == Integer.MAX_VALUE || iIntValue2 < i4) {
                            MessageObject messageObject3 = (MessageObject) map.get(num3);
                            if (filter(messageObject3, z, z2)) {
                                arrayList2.add(messageObject3);
                            }
                        }
                    }
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
    }

    public final class SearchStoriesList extends StoriesList {
        public int count;
        public final ArrayList fakeDays;
        public String last_offset;
        public boolean loading;
        public final String query;
        public final TL_stories.MediaArea queryArea;
        public int reqId;
        public final String username;

        public SearchStoriesList(int i, String str, String str2) {
            super(i, 0L, 3, -1, null);
            this.fakeDays = new ArrayList();
            this.last_offset = "";
            this.query = str2;
            this.username = str;
            this.queryArea = null;
        }

        @Override
        public final MessageObject findMessageObject(int i) {
            if (i < 0) {
                return null;
            }
            ArrayList arrayList = this.messageObjects;
            if (i >= arrayList.size()) {
                return null;
            }
            return (MessageObject) arrayList.get(i);
        }

        @Override
        public final int getCount() {
            return this.count;
        }

        @Override
        public final ArrayList getDays() {
            return this.fakeDays;
        }

        @Override
        public final int getLoadedCount() {
            return this.messageObjects.size();
        }

        @Override
        public final void invalidateCache() {
        }

        @Override
        public final boolean isLoading() {
            return this.loading;
        }

        @Override
        public final boolean isOnlyCache() {
            return false;
        }

        @Override
        public final boolean load(final int i, final List list, final boolean z) {
            TLObject userOrChat;
            if (this.loading || this.last_offset == null) {
                return false;
            }
            TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
            tL_stories_searchPosts.offset = this.last_offset;
            tL_stories_searchPosts.limit = i;
            String str = this.query;
            if (str != null) {
                tL_stories_searchPosts.flags |= 1;
                tL_stories_searchPosts.hashtag = str;
            }
            TL_stories.MediaArea mediaArea = this.queryArea;
            if (mediaArea != null) {
                tL_stories_searchPosts.flags |= 2;
                tL_stories_searchPosts.area = mediaArea;
            }
            this.loading = true;
            String str2 = this.username;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            int i2 = this.currentAccount;
            if (zIsEmpty) {
                userOrChat = null;
            } else {
                userOrChat = MessagesController.getInstance(i2).getUserOrChat(str2);
                if (userOrChat == null) {
                    MessagesController.getInstance(i2).getUserNameResolver().resolve(str2, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            StoriesController.SearchStoriesList searchStoriesList = this.f$0;
                            TLObject userOrChat2 = MessagesController.getInstance(searchStoriesList.currentAccount).getUserOrChat(searchStoriesList.username);
                            searchStoriesList.loading = false;
                            if (userOrChat2 != null) {
                                searchStoriesList.load(i, list, z);
                            } else {
                                searchStoriesList.count = 0;
                                searchStoriesList.last_offset = "";
                                StoriesController$StoriesList$$ExternalSyntheticLambda0 storiesController$StoriesList$$ExternalSyntheticLambda0 = searchStoriesList.notify;
                                AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                                AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda0);
                            }
                        }
                    });
                    return true;
                }
            }
            if (userOrChat != null) {
                tL_stories_searchPosts.flags |= 4;
                tL_stories_searchPosts.peer = MessagesController.getInputPeer(userOrChat);
            }
            this.reqId = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_searchPosts, new RichMediaUploader$$ExternalSyntheticLambda0(this, 3));
            return true;
        }

        @Override
        public final boolean markAsRead(int i) {
            return false;
        }

        @Override
        public final void preloadCache() {
        }

        @Override
        public final void saveCache() {
        }

        public SearchStoriesList(int i, TL_stories.MediaArea mediaArea) {
            super(i, 0L, 3, -1, null);
            this.fakeDays = new ArrayList();
            this.last_offset = "";
            this.query = null;
            this.username = null;
            this.queryArea = mediaArea;
        }
    }

    public final void checkExpireStories(TL_stories.PeerStories peerStories) {
        if (peerStories.stories == null) {
            return;
        }
        int i = 0;
        while (i < peerStories.stories.size()) {
            if (StoriesUtilities.isExpired(this.currentAccount, peerStories.stories.get(i))) {
                peerStories.stories.remove(i);
                i--;
            }
            i++;
        }
        peerStories.checkedExpired = true;
    }
}
