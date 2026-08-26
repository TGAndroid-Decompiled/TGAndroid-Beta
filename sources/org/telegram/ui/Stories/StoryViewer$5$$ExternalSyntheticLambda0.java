package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.PhotoUtilities$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Charts.ChartPickerDelegate$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.FlashViews;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.QRScanner;
import org.telegram.ui.Stories.recorder.QRScanner$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.RoundVideoRecorder;
import org.telegram.ui.Stories.recorder.RoundVideoRecorder$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public final class StoryViewer$5$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public StoryViewer$5$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        PeerStoriesView.AnonymousClass4 anonymousClass4;
        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope;
        boolean z;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        String str;
        String str2;
        TLRPC.Peer peer;
        ArrayList<Long> arrayList;
        long j;
        int i;
        String str3;
        long j2;
        String str4 = "SELECT data, custom_params FROM stories WHERE dialog_id = ";
        int i2 = 7;
        int i3 = 2;
        switch (this.$r8$classId) {
            case 0:
                StoryViewer storyViewer = StoryViewer.this;
                PeerStoriesView currentPeerView = storyViewer.storiesViewPager.getCurrentPeerView();
                if (currentPeerView == null || (anonymousClass4 = currentPeerView.storyContainer) == null || (videoPlayerSharedScope = storyViewer.currentPlayerScope) == null || videoPlayerSharedScope.player != ((StoryViewer.VideoPlayerHolder) this.f$1)) {
                    return;
                }
                anonymousClass4.invalidate();
                return;
            case 1:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                storiesCollections.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                boolean z2 = tLObject instanceof TL_stories.TL_albums;
                ArrayList arrayList2 = storiesCollections.lastCollections;
                ArrayList arrayList3 = storiesCollections.collections;
                if (!z2) {
                    if (tLObject instanceof TL_stories.TL_albumsNotModified) {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList2);
                        storiesCollections.loaded = true;
                        storiesCollections.loading = false;
                        NotificationCenter.getInstance(storiesCollections.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(storiesCollections.dialogId), storiesCollections);
                        return;
                    }
                    return;
                }
                TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject;
                ArrayList arrayList4 = new ArrayList(tL_albums.albums.size());
                ArrayList<TL_stories.TL_storyAlbum> arrayList5 = tL_albums.albums;
                int size = arrayList5.size();
                int i4 = 0;
                while (i4 < size) {
                    TL_stories.TL_storyAlbum tL_storyAlbum = arrayList5.get(i4);
                    i4++;
                    TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                    StoriesController.StoryAlbum storyAlbum = new StoriesController.StoryAlbum();
                    storyAlbum.album_id = tL_storyAlbum2.album_id;
                    storyAlbum.title = tL_storyAlbum2.title;
                    storyAlbum.icon_photo = tL_storyAlbum2.icon_photo;
                    storyAlbum.icon_video = tL_storyAlbum2.icon_video;
                    arrayList4.add(storyAlbum);
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList4);
                arrayList2.clear();
                arrayList2.addAll(arrayList4);
                storiesCollections.loaded = true;
                storiesCollections.loading = false;
                storiesCollections.updateAlbumsListCache(true);
                return;
            case 2:
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) this.f$0;
                storiesList.getClass();
                ((Utilities.Callback) this.f$1).run(storiesList);
                return;
            case 3:
                MessagesController.getInstance(StoriesController.this.currentAccount).getStoriesController().processUpdate((TL_stories.TL_updateStory) this.f$1);
                return;
            case 4:
                StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) this.f$0;
                StoryEntry storyEntry = uploadingStory.entry;
                storyEntry.isError = true;
                StoriesController storiesController = StoriesController.this;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$1;
                if (storiesController.checkStoryError(tL_error)) {
                    storyEntry.error = null;
                } else {
                    storyEntry.error = tL_error;
                }
                uploadingStory.entryDestroyed = true;
                uploadingStory.failed = true;
                uploadingStory.hadFailed = true;
                storiesController.draftsController.edit(storyEntry);
                return;
            case 5:
                StoriesController.UploadingStory uploadingStory2 = (StoriesController.UploadingStory) this.f$0;
                uploadingStory2.entry.buildPhoto((File) this.f$1);
                AndroidUtilities.runOnUIThread(new StoriesController$UploadingStory$$ExternalSyntheticLambda1(uploadingStory2, 1));
                return;
            case 6:
                ((StoriesController$$ExternalSyntheticLambda2) this.f$0).f$0.dialogIdToMaxReadId = (LongSparseIntArray) this.f$1;
                return;
            case 7:
                ((StoriesController$$ExternalSyntheticLambda2) this.f$0).accept((TL_stories.TL_stories_allStories) this.f$1);
                return;
            case 8:
                int i5 = -1;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.f$1;
                StoriesStorage storiesStorage = (StoriesStorage) this.f$0;
                MessagesStorage messagesStorage = storiesStorage.storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i6 = storyItem.id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i6, new Object[0]);
                        if (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(1);
                            if (nativeByteBufferByteBufferValue != null) {
                                StoryCustomParamsHelper.readLocalParams(TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true), nativeByteBufferByteBufferValue2);
                                nativeByteBufferByteBufferValue.reuse();
                            }
                            if (nativeByteBufferByteBufferValue2 != null) {
                                nativeByteBufferByteBufferValue2.reuse();
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i6).stepThis().dispose();
                        if (!z) {
                            i5 = 0;
                        }
                    } else if (storyItem instanceof TL_stories.TL_storyItem) {
                        storiesStorage.updateStoryItemInternal(peerDialogId, storyItem);
                        Locale locale2 = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i6, new Object[0]);
                        boolean next = sQLiteCursorQueryFinalized2.next();
                        sQLiteCursorQueryFinalized2.dispose();
                        if (next) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                    } else {
                        i5 = 0;
                    }
                    SQLiteCursor sQLiteCursorQueryFinalized3 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    int iIntValue = sQLiteCursorQueryFinalized3.next() ? sQLiteCursorQueryFinalized3.intValue(1) : 0;
                    sQLiteCursorQueryFinalized3.dispose();
                    Locale locale3 = Locale.US;
                    database.executeFast("UPDATE stories_counter SET count = " + (iIntValue + i5) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 9:
                MessagesStorage messagesStorage2 = ((StoriesStorage) this.f$0).storage;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                int i7 = 0;
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (sQLiteCursorQueryFinalized4.next()) {
                        longSparseIntArray.put(sQLiteCursorQueryFinalized4.longValue(i7), sQLiteCursorQueryFinalized4.intValue(1));
                        i7 = 0;
                    }
                } catch (Exception e) {
                    messagesStorage2.checkSQLException(e);
                }
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(6, (StoriesController$$ExternalSyntheticLambda2) this.f$1, longSparseIntArray));
                return;
            case 10:
                StoriesController$$ExternalSyntheticLambda2 storiesController$$ExternalSyntheticLambda2 = (StoriesController$$ExternalSyntheticLambda2) this.f$1;
                StoriesStorage storiesStorage2 = (StoriesStorage) this.f$0;
                MessagesStorage messagesStorage3 = storiesStorage2.storage;
                SQLiteDatabase database3 = messagesStorage3.getDatabase();
                ArrayList<TL_stories.PeerStories> arrayList6 = new ArrayList<>();
                ArrayList<Long> arrayList7 = new ArrayList<>();
                ArrayList<Long> arrayList8 = new ArrayList<>();
                int i8 = storiesStorage2.currentAccount;
                ConnectionsManager.getInstance(i8).getCurrentTime();
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized5 = database3.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    try {
                        LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray();
                        while (sQLiteCursorQueryFinalized5.next()) {
                            ArrayList<Long> arrayList9 = arrayList7;
                            long jLongValue = sQLiteCursorQueryFinalized5.longValue(0);
                            longSparseIntArray2.put(jLongValue, sQLiteCursorQueryFinalized5.intValue(1));
                            if (jLongValue > 0) {
                                arrayList = arrayList9;
                                arrayList.add(Long.valueOf(jLongValue));
                            } else {
                                arrayList = arrayList9;
                                arrayList8.add(Long.valueOf(jLongValue));
                            }
                            arrayList7 = arrayList;
                        }
                        ArrayList<Long> arrayList10 = arrayList7;
                        sQLiteCursorQueryFinalized5.dispose();
                        int i9 = 0;
                        while (i9 < longSparseIntArray2.size()) {
                            long jKeyAt = longSparseIntArray2.keyAt(i9);
                            int iValueAt = longSparseIntArray2.valueAt(i9);
                            Locale locale4 = Locale.US;
                            int i10 = i9;
                            LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
                            SQLiteCursor sQLiteCursorQueryFinalized6 = database3.queryFinalized(str4 + jKeyAt, new Object[0]);
                            try {
                                ArrayList<TL_stories.StoryItem> arrayList11 = new ArrayList<>();
                                while (sQLiteCursorQueryFinalized6.next()) {
                                    int i11 = i8;
                                    NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized6.byteBufferValue(0);
                                    SQLiteDatabase sQLiteDatabase = database3;
                                    NativeByteBuffer nativeByteBufferByteBufferValue4 = sQLiteCursorQueryFinalized6.byteBufferValue(1);
                                    if (nativeByteBufferByteBufferValue3 != null) {
                                        sQLiteCursor2 = sQLiteCursorQueryFinalized6;
                                        try {
                                            TL_stories.StoryItem storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue3, nativeByteBufferByteBufferValue3.readInt32(true), true);
                                            storyItemTLdeserialize.dialogId = jKeyAt;
                                            TL_stories.StoryFwdHeader storyFwdHeader = storyItemTLdeserialize.fwd_from;
                                            if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                                MessagesStorage.addLoadPeerInfo(peer, arrayList10, arrayList8);
                                            }
                                            int i12 = 0;
                                            while (i12 < storyItemTLdeserialize.media_areas.size()) {
                                                if (storyItemTLdeserialize.media_areas.get(i12) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                                    str2 = str4;
                                                    long j3 = ((TL_stories.TL_mediaAreaChannelPost) storyItemTLdeserialize.media_areas.get(i12)).channel_id;
                                                    if (!arrayList8.contains(Long.valueOf(j3))) {
                                                        arrayList8.add(Long.valueOf(j3));
                                                    }
                                                } else {
                                                    str2 = str4;
                                                }
                                                i12++;
                                                str4 = str2;
                                            }
                                            str = str4;
                                            TLRPC.Peer peer2 = storyItemTLdeserialize.from_id;
                                            if (peer2 != null) {
                                                MessagesStorage.addLoadPeerInfo(peer2, arrayList10, arrayList8);
                                            }
                                            StoryCustomParamsHelper.readLocalParams(storyItemTLdeserialize, nativeByteBufferByteBufferValue4);
                                            arrayList11.add(storyItemTLdeserialize);
                                            nativeByteBufferByteBufferValue3.reuse();
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor = sQLiteCursor2;
                                            try {
                                                FileLog.e(th);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0(storiesController$$ExternalSyntheticLambda2, 4));
                                                return;
                                            } catch (Throwable th3) {
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                }
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        str = str4;
                                        sQLiteCursor2 = sQLiteCursorQueryFinalized6;
                                    }
                                    if (nativeByteBufferByteBufferValue4 != null) {
                                        nativeByteBufferByteBufferValue4.reuse();
                                    }
                                    i8 = i11;
                                    database3 = sQLiteDatabase;
                                    sQLiteCursorQueryFinalized6 = sQLiteCursor2;
                                    str4 = str;
                                }
                                String str5 = str4;
                                int i13 = i8;
                                SQLiteDatabase sQLiteDatabase2 = database3;
                                sQLiteCursorQueryFinalized6.dispose();
                                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                                tL_peerStories.stories = arrayList11;
                                tL_peerStories.max_read_id = iValueAt;
                                tL_peerStories.peer = MessagesController.getInstance(i13).getPeer(jKeyAt);
                                arrayList6.add(tL_peerStories);
                                i9 = i10 + 1;
                                longSparseIntArray2 = longSparseIntArray3;
                                i8 = i13;
                                database3 = sQLiteDatabase2;
                                str4 = str5;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor2 = sQLiteCursorQueryFinalized6;
                            }
                        }
                        int i14 = i8;
                        TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                        tL_stories_allStories.peer_stories = arrayList6;
                        tL_stories_allStories.users = messagesStorage3.getUsers(arrayList10);
                        tL_stories_allStories.chats = messagesStorage3.getChats(arrayList8);
                        int i15 = 0;
                        while (i15 < tL_stories_allStories.peer_stories.size()) {
                            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i15);
                            long peerDialogId2 = DialogObject.getPeerDialogId(peerStories.peer);
                            ArrayList<TL_stories.StoryItem> arrayList12 = peerStories.stories;
                            int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                            SQLiteDatabase database4 = messagesStorage3.getDatabase();
                            int i16 = 0;
                            ArrayList arrayList13 = null;
                            ArrayList arrayList14 = null;
                            while (i16 < arrayList12.size()) {
                                TL_stories.StoryItem storyItem2 = arrayList12.get(i16);
                                if (currentTime > arrayList12.get(i16).expire_date) {
                                    if (arrayList14 == null) {
                                        arrayList14 = new ArrayList();
                                        arrayList13 = new ArrayList();
                                    }
                                    arrayList14.add(Integer.valueOf(storyItem2.id));
                                    arrayList13.add(storyItem2);
                                    arrayList12.remove(i16);
                                    i16--;
                                }
                                i16++;
                            }
                            if (arrayList13 != null) {
                                String strJoin = TextUtils.join(", ", arrayList14);
                                try {
                                    Locale locale5 = Locale.US;
                                    database4.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId2 + " AND story_id IN (" + strJoin + ")").stepThis().dispose();
                                } catch (SQLiteException e2) {
                                    FileLog.e(e2);
                                }
                            }
                            if (peerStories.stories.isEmpty()) {
                                tL_stories_allStories.peer_stories.remove(i15);
                                i15--;
                            }
                            Collections.sort(peerStories.stories, StoriesController.storiesComparator);
                            i15++;
                            break;
                        }
                        Collections.sort(tL_stories_allStories.peer_stories, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(14)));
                        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(7, storiesController$$ExternalSyntheticLambda2, tL_stories_allStories));
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor = sQLiteCursorQueryFinalized5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                break;
            case 11:
                ((StoriesStorage) this.f$0).updateMessagesWithStories((ArrayList) this.f$1);
                return;
            case 12:
                if (((StoriesUtilities.EnsureStoryFileLoadedObject) this.f$0).cancelled) {
                    return;
                }
                ((Runnable) this.f$1).run();
                return;
            case 13:
                ((Runnable[]) this.f$0)[0] = null;
                StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = (StoriesUtilities.EnsureStoryFileLoadedObject) this.f$1;
                ensureStoryFileLoadedObject.runnable.run();
                StoriesUtilities.AnonymousClass2 anonymousClass2 = ensureStoryFileLoadedObject.imageReceiver;
                if (anonymousClass2 != null) {
                    anonymousClass2.onDetachedFromWindow();
                    return;
                }
                return;
            case 14:
                ((StoriesUtilities.AvatarStoryParams) this.f$0).lambda$checkOnTouchEvent$0((View) this.f$1);
                return;
            case 15:
                StoryCaptionView.StoryCaptionTextView.TextState textState = (StoryCaptionView.StoryCaptionTextView.TextState) this.f$0;
                LinkSpanDrawable linkSpanDrawable = textState.pressedLink;
                if (((LinkSpanDrawable) this.f$1) == linkSpanDrawable && linkSpanDrawable != null && (linkSpanDrawable.getSpan() instanceof URLSpan)) {
                    StoryCaptionView.StoryCaptionTextView storyCaptionTextView = StoryCaptionView.StoryCaptionTextView.this;
                    StoryCaptionView storyCaptionView = StoryCaptionView.this;
                    URLSpan uRLSpan = (URLSpan) textState.pressedLink.getSpan();
                    LinkSpanDrawable.LinkCollector linkCollector = textState.links;
                    Objects.requireNonNull(linkCollector);
                    storyCaptionView.onLinkLongPress(uRLSpan, storyCaptionTextView, new BotSensors$1$$ExternalSyntheticLambda0(linkCollector, i2));
                    textState.pressedLink = null;
                    return;
                }
                return;
            case 16:
                StoryMediaAreasView storyMediaAreasView = (StoryMediaAreasView) this.f$0;
                FrameLayout frameLayout = storyMediaAreasView.hintsContainer;
                HintView2 hintView2 = (HintView2) this.f$1;
                frameLayout.removeView(hintView2);
                if (hintView2 == storyMediaAreasView.hintView) {
                    storyMediaAreasView.selectedArea = null;
                    storyMediaAreasView.invalidate();
                    storyMediaAreasView.onHintVisible(false);
                    return;
                }
                return;
            case 17:
                ((BotPreviewsEditContainer) this.f$0).lambda$addTranslation$1((String) this.f$1);
                return;
            case 18:
                ((Utilities.Callback) this.f$0).run((ArrayList) this.f$1);
                return;
            case 19:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                gifAdapter.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    EmojiBottomSheet.GifPage gifPage = EmojiBottomSheet.GifPage.this;
                    MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
                    EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                    MessagesController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                gifAdapter.requestedBot = true;
                gifAdapter.request();
                return;
            case 20:
                ((FlashViews) this.f$0).flashTo(0.0f, 240L, (Runnable) this.f$1);
                return;
            case 21:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                View view = (View) this.f$1;
                if (view instanceof EntityView) {
                    EntityView entityView = (EntityView) view;
                    EntityView.SelectionView selectionView = entityView.selectionView;
                    if (selectionView != null) {
                        selectionView.updatePosition();
                    }
                    paintView.selectEntity$1(entityView, true);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.f$0;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f$1;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(tL_messageMediaVenue.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((Utilities.Callback) this.f$0).run((Bitmap) this.f$1);
                return;
            case 24:
                PreviewView previewView = (PreviewView) this.f$0;
                Bitmap[] bitmapArr = new Bitmap[1];
                boolean[] zArr = {true};
                StoryEntry storyEntry2 = (StoryEntry) this.f$1;
                if (storyEntry2 != null) {
                    int measuredWidth = previewView.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : previewView.getMeasuredWidth();
                    int i17 = (int) ((measuredWidth * 16) / 9.0f);
                    if (storyEntry2.isVideo) {
                        Bitmap bitmap = storyEntry2.blurredVideoThumb;
                        if (bitmap != null) {
                            bitmapArr[0] = bitmap;
                        }
                        if (bitmapArr[0] == null && (str3 = storyEntry2.thumbPath) != null && str3.startsWith("vthumb://")) {
                            j = Long.parseLong(storyEntry2.thumbPath.substring(9));
                            if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                                try {
                                    bitmapArr[0] = previewView.getContext().getContentResolver().loadThumbnail(storyEntry2.isVideo ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j), new Size(measuredWidth, i17), null);
                                    break;
                                } catch (Exception unused2) {
                                }
                            }
                        } else {
                            j = -1;
                        }
                    } else {
                        j = -1;
                    }
                    long j4 = j;
                    if (j4 < 0 && storyEntry2.isVideo && storyEntry2.thumbPath == null) {
                        previewView.invalidate();
                        return;
                    }
                    if (bitmapArr[0] == null) {
                        File file = storyEntry2.filterFile;
                        if (file == null) {
                            file = storyEntry2.file;
                        }
                        if (file == null) {
                            return;
                        }
                        PhotoUtilities$$ExternalSyntheticLambda0 photoUtilities$$ExternalSyntheticLambda0 = new PhotoUtilities$$ExternalSyntheticLambda0(previewView, storyEntry2, j4, file.getPath(), 4);
                        boolean z3 = storyEntry2.isVideo;
                        if (z3) {
                            previewView = previewView;
                            i = 0;
                        } else {
                            previewView = previewView;
                            i = storyEntry2.orientation;
                        }
                        bitmapArr[0] = StoryEntry.getScaledBitmap(photoUtilities$$ExternalSyntheticLambda0, measuredWidth, i17, i, !z3);
                        zArr[0] = false;
                    }
                }
                AndroidUtilities.runOnUIThread(new BotVerifySheet$$ExternalSyntheticLambda7(2, previewView, bitmapArr, storyEntry2, zArr));
                return;
            case 25:
                PreviewView previewView2 = PreviewView.this;
                Bitmap bitmap2 = previewView2.bitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    StoryEntry storyEntry3 = (StoryEntry) this.f$1;
                    if (storyEntry3.blurredVideoThumb == previewView2.bitmap) {
                        storyEntry3.blurredVideoThumb = null;
                    }
                    previewView2.bitmap = null;
                    previewView2.invalidate();
                    return;
                }
                return;
            case 26:
                QRScanner qRScanner = (QRScanner) this.f$0;
                Context context = (Context) this.f$1;
                AtomicReference atomicReference = qRScanner.detector;
                zzk zzkVar = new zzk();
                zzkVar.zza = 256;
                atomicReference.set(new BarcodeDetector(new zzm(context, zzkVar)));
                qRScanner.cameraView = qRScanner.cameraView;
                if (qRScanner.detector.get() == null || qRScanner.paused.get()) {
                    return;
                }
                Utilities.globalQueue.cancelRunnable(qRScanner.process);
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                QRScanner$$ExternalSyntheticLambda0 qRScanner$$ExternalSyntheticLambda0 = qRScanner.process;
                if (qRScanner.lastDetected == null) {
                    j2 = 750;
                } else {
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    j2 = devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 800L : 80L : 400L;
                }
                dispatchQueue.postRunnable(qRScanner$$ExternalSyntheticLambda0, j2);
                return;
            case 27:
                ((QRScanner) this.f$0).listener.run((QRScanner.Detected) this.f$1);
                return;
            case 28:
                CaptionStory.AnonymousClass1 anonymousClass1 = (CaptionStory.AnonymousClass1) this.f$0;
                RoundView roundView = (RoundView) this.f$1;
                int width = roundView.getWidth();
                RoundVideoRecorder.AnonymousClass1 anonymousClass3 = anonymousClass1.cameraView;
                if (width <= 0) {
                    anonymousClass3.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new RoundVideoRecorder$$ExternalSyntheticLambda0(anonymousClass1, i3)).start();
                    return;
                }
                float width2 = roundView.getWidth() / anonymousClass3.getWidth();
                ValueAnimator valueAnimator = anonymousClass1.cameraViewAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                anonymousClass1.cameraViewAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                anonymousClass1.cameraViewAnimator.addUpdateListener(new ChartPickerDelegate$$ExternalSyntheticLambda0(anonymousClass1, anonymousClass3.getScaleX(), width2, ((roundView.getWidth() / 2.0f) + roundView.getX()) - ((anonymousClass3.getWidth() / 2.0f) + anonymousClass3.getX()), ((roundView.getHeight() / 2.0f) + roundView.getY()) - ((anonymousClass3.getHeight() / 2.0f) + anonymousClass3.getY()), 3));
                anonymousClass1.cameraViewAnimator.addListener(new RichEditor.AnonymousClass1(19, anonymousClass1, roundView));
                anonymousClass1.cameraViewAnimator.setDuration(320L);
                anonymousClass1.cameraViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                anonymousClass1.roundView = roundView;
                anonymousClass1.cameraViewAnimator.start();
                return;
            default:
                SelectAudioAlert selectAudioAlert = (SelectAudioAlert) this.f$0;
                selectAudioAlert.loadingLocalAudio = false;
                selectAudioAlert.localAudio.addAll((ArrayList) this.f$1);
                selectAudioAlert.adapter.update(true);
                return;
        }
    }
}
