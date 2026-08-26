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
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Charts.ChartPickerDelegate$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda299;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.QrActivity;
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
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
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
        StoriesController$$ExternalSyntheticLambda2 storiesController$$ExternalSyntheticLambda2;
        SQLiteCursor sQLiteCursor2;
        String str;
        String str2;
        TLRPC.Peer peer;
        BotPreviewsEditContainer botPreviewsEditContainer;
        String str3;
        int i;
        long j;
        String str4;
        long j2;
        String str5 = "SELECT data, custom_params FROM stories WHERE dialog_id = ";
        int i2 = 19;
        int i3 = 2;
        int i4 = 0;
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
            case 2:
                StoriesController.UploadingStory uploadingStory2 = (StoriesController.UploadingStory) this.f$0;
                uploadingStory2.entry.buildPhoto((File) this.f$1);
                AndroidUtilities.runOnUIThread(new StoriesController$UploadingStory$$ExternalSyntheticLambda1(uploadingStory2, 1));
                return;
            case 3:
                ((StoriesController$$ExternalSyntheticLambda2) this.f$0).accept((TL_stories.TL_stories_allStories) this.f$1);
                return;
            case 4:
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
            case 5:
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
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(8, (StoriesController$$ExternalSyntheticLambda2) this.f$1, longSparseIntArray));
                return;
            case 6:
                StoriesController$$ExternalSyntheticLambda2 storiesController$$ExternalSyntheticLambda3 = (StoriesController$$ExternalSyntheticLambda2) this.f$1;
                StoriesStorage storiesStorage2 = (StoriesStorage) this.f$0;
                MessagesStorage messagesStorage3 = storiesStorage2.storage;
                SQLiteDatabase database3 = messagesStorage3.getDatabase();
                ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                ArrayList<Long> arrayList3 = new ArrayList<>();
                int i8 = storiesStorage2.currentAccount;
                ConnectionsManager.getInstance(i8).getCurrentTime();
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized5 = database3.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    try {
                        LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray();
                        while (sQLiteCursorQueryFinalized5.next()) {
                            storiesController$$ExternalSyntheticLambda2 = storiesController$$ExternalSyntheticLambda3;
                            try {
                                long jLongValue = sQLiteCursorQueryFinalized5.longValue(0);
                                longSparseIntArray2.put(jLongValue, sQLiteCursorQueryFinalized5.intValue(1));
                                if (jLongValue > 0) {
                                    arrayList2.add(Long.valueOf(jLongValue));
                                } else {
                                    arrayList3.add(Long.valueOf(jLongValue));
                                }
                                storiesController$$ExternalSyntheticLambda3 = storiesController$$ExternalSyntheticLambda2;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursorQueryFinalized5;
                                storiesController$$ExternalSyntheticLambda3 = storiesController$$ExternalSyntheticLambda2;
                                try {
                                    FileLog.e(th);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(storiesController$$ExternalSyntheticLambda3, 17));
                                    return;
                                } catch (Throwable th3) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th3;
                                }
                            }
                            break;
                        }
                        storiesController$$ExternalSyntheticLambda2 = storiesController$$ExternalSyntheticLambda3;
                        try {
                            sQLiteCursorQueryFinalized5.dispose();
                            int i9 = 0;
                            while (i9 < longSparseIntArray2.size()) {
                                try {
                                    long jKeyAt = longSparseIntArray2.keyAt(i9);
                                    int iValueAt = longSparseIntArray2.valueAt(i9);
                                    Locale locale4 = Locale.US;
                                    int i10 = i9;
                                    SQLiteCursor sQLiteCursorQueryFinalized6 = database3.queryFinalized(str5 + jKeyAt, new Object[i4]);
                                    try {
                                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                                        while (sQLiteCursorQueryFinalized6.next()) {
                                            int i11 = i8;
                                            NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized6.byteBufferValue(i4);
                                            LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
                                            NativeByteBuffer nativeByteBufferByteBufferValue4 = sQLiteCursorQueryFinalized6.byteBufferValue(1);
                                            if (nativeByteBufferByteBufferValue3 != null) {
                                                sQLiteCursor2 = sQLiteCursorQueryFinalized6;
                                                try {
                                                    TL_stories.StoryItem storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue3, nativeByteBufferByteBufferValue3.readInt32(true), true);
                                                    storyItemTLdeserialize.dialogId = jKeyAt;
                                                    TL_stories.StoryFwdHeader storyFwdHeader = storyItemTLdeserialize.fwd_from;
                                                    if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                                        MessagesStorage.addLoadPeerInfo(peer, arrayList2, arrayList3);
                                                    }
                                                    int i12 = 0;
                                                    while (i12 < storyItemTLdeserialize.media_areas.size()) {
                                                        if (storyItemTLdeserialize.media_areas.get(i12) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                                            str2 = str5;
                                                            long j3 = ((TL_stories.TL_mediaAreaChannelPost) storyItemTLdeserialize.media_areas.get(i12)).channel_id;
                                                            if (!arrayList3.contains(Long.valueOf(j3))) {
                                                                arrayList3.add(Long.valueOf(j3));
                                                            }
                                                        } else {
                                                            str2 = str5;
                                                        }
                                                        i12++;
                                                        str5 = str2;
                                                    }
                                                    str = str5;
                                                    TLRPC.Peer peer2 = storyItemTLdeserialize.from_id;
                                                    if (peer2 != null) {
                                                        MessagesStorage.addLoadPeerInfo(peer2, arrayList2, arrayList3);
                                                    }
                                                    StoryCustomParamsHelper.readLocalParams(storyItemTLdeserialize, nativeByteBufferByteBufferValue4);
                                                    arrayList4.add(storyItemTLdeserialize);
                                                    nativeByteBufferByteBufferValue3.reuse();
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    sQLiteCursor = sQLiteCursor2;
                                                    storiesController$$ExternalSyntheticLambda3 = storiesController$$ExternalSyntheticLambda2;
                                                    FileLog.e(th);
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                    }
                                                    AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(storiesController$$ExternalSyntheticLambda3, 17));
                                                    return;
                                                }
                                            } else {
                                                str = str5;
                                                sQLiteCursor2 = sQLiteCursorQueryFinalized6;
                                            }
                                            if (nativeByteBufferByteBufferValue4 != null) {
                                                nativeByteBufferByteBufferValue4.reuse();
                                            }
                                            i8 = i11;
                                            longSparseIntArray2 = longSparseIntArray3;
                                            sQLiteCursorQueryFinalized6 = sQLiteCursor2;
                                            str5 = str;
                                            i4 = 0;
                                        }
                                        String str6 = str5;
                                        int i13 = i8;
                                        LongSparseIntArray longSparseIntArray4 = longSparseIntArray2;
                                        sQLiteCursorQueryFinalized6.dispose();
                                        try {
                                            TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                                            tL_peerStories.stories = arrayList4;
                                            tL_peerStories.max_read_id = iValueAt;
                                            tL_peerStories.peer = MessagesController.getInstance(i13).getPeer(jKeyAt);
                                            arrayList.add(tL_peerStories);
                                            i9 = i10 + 1;
                                            i8 = i13;
                                            longSparseIntArray2 = longSparseIntArray4;
                                            str5 = str6;
                                            i4 = 0;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sQLiteCursor = null;
                                            storiesController$$ExternalSyntheticLambda3 = storiesController$$ExternalSyntheticLambda2;
                                            FileLog.e(th);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(storiesController$$ExternalSyntheticLambda3, 17));
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteCursor2 = sQLiteCursorQueryFinalized6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    storiesController$$ExternalSyntheticLambda3 = storiesController$$ExternalSyntheticLambda2;
                                    sQLiteCursor = null;
                                    FileLog.e(th);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(storiesController$$ExternalSyntheticLambda3, 17));
                                    return;
                                }
                            }
                            int i14 = i8;
                            TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                            tL_stories_allStories.peer_stories = arrayList;
                            tL_stories_allStories.users = messagesStorage3.getUsers(arrayList2);
                            tL_stories_allStories.chats = messagesStorage3.getChats(arrayList3);
                            int i15 = 0;
                            while (i15 < tL_stories_allStories.peer_stories.size()) {
                                TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i15);
                                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories.peer);
                                ArrayList<TL_stories.StoryItem> arrayList5 = peerStories.stories;
                                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                                SQLiteDatabase database4 = messagesStorage3.getDatabase();
                                int i16 = 0;
                                ArrayList arrayList6 = null;
                                ArrayList arrayList7 = null;
                                while (i16 < arrayList5.size()) {
                                    TL_stories.StoryItem storyItem2 = arrayList5.get(i16);
                                    if (currentTime > arrayList5.get(i16).expire_date) {
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList7.add(Integer.valueOf(storyItem2.id));
                                        arrayList6.add(storyItem2);
                                        arrayList5.remove(i16);
                                        i16--;
                                    }
                                    i16++;
                                }
                                if (arrayList6 != null) {
                                    String strJoin = TextUtils.join(", ", arrayList7);
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
                            Collections.sort(tL_stories_allStories.peer_stories, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(19)));
                            AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(3, storiesController$$ExternalSyntheticLambda2, tL_stories_allStories));
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            storiesController$$ExternalSyntheticLambda3 = storiesController$$ExternalSyntheticLambda2;
                            sQLiteCursor = sQLiteCursorQueryFinalized5;
                            FileLog.e(th);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(storiesController$$ExternalSyntheticLambda3, 17));
                            return;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
                break;
            case 7:
                ((StoriesStorage) this.f$0).updateMessagesWithStories((ArrayList) this.f$1);
                return;
            case 8:
                ((StoriesController$$ExternalSyntheticLambda2) this.f$0).f$0.dialogIdToMaxReadId = (LongSparseIntArray) this.f$1;
                return;
            case 9:
                if (((StoriesUtilities.EnsureStoryFileLoadedObject) this.f$0).cancelled) {
                    return;
                }
                ((Runnable) this.f$1).run();
                return;
            case 10:
                ((Runnable[]) this.f$0)[0] = null;
                StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = (StoriesUtilities.EnsureStoryFileLoadedObject) this.f$1;
                ensureStoryFileLoadedObject.runnable.run();
                StoriesUtilities.AnonymousClass2 anonymousClass2 = ensureStoryFileLoadedObject.imageReceiver;
                if (anonymousClass2 != null) {
                    anonymousClass2.onDetachedFromWindow();
                    return;
                }
                return;
            case 11:
                View view = (View) this.f$1;
                StoriesUtilities.AvatarStoryParams avatarStoryParams = (StoriesUtilities.AvatarStoryParams) this.f$0;
                avatarStoryParams.getClass();
                try {
                    view.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                }
                ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
                if (buttonBounce != null) {
                    buttonBounce.setPressed(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                avatarStoryParams.pressed = false;
                avatarStoryParams.onLongPress();
                return;
            case 12:
                StoryCaptionView.StoryCaptionTextView.TextState textState = (StoryCaptionView.StoryCaptionTextView.TextState) this.f$0;
                LinkSpanDrawable linkSpanDrawable = textState.pressedLink;
                if (((LinkSpanDrawable) this.f$1) != linkSpanDrawable || linkSpanDrawable == null) {
                    return;
                }
                CharacterStyle characterStyle = linkSpanDrawable.mSpan;
                if (characterStyle instanceof URLSpan) {
                    StoryCaptionView.StoryCaptionTextView storyCaptionTextView = StoryCaptionView.StoryCaptionTextView.this;
                    LinkSpanDrawable.LinkCollector linkCollector = textState.links;
                    Objects.requireNonNull(linkCollector);
                    StoryCaptionView.this.onLinkLongPress((URLSpan) characterStyle, storyCaptionTextView, new LivePlayer$1$$ExternalSyntheticLambda0(linkCollector, 20));
                    textState.pressedLink = null;
                    return;
                }
                return;
            case 13:
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
            case 14:
                break;
            case 15:
                ((Utilities.Callback) this.f$0).run((ArrayList) this.f$1);
                return;
            case 16:
                EmojiBottomSheet.GifPage.GifAdapter gifAdapter = (EmojiBottomSheet.GifPage.GifAdapter) this.f$0;
                gifAdapter.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    EmojiBottomSheet.GifPage gifPage = EmojiBottomSheet.GifPage.this;
                    MessagesController.getInstance(((BottomSheet) EmojiBottomSheet.this).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
                    EmojiBottomSheet emojiBottomSheet = EmojiBottomSheet.this;
                    MessagesController.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(((BottomSheet) emojiBottomSheet).currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                gifAdapter.requestedBot = true;
                gifAdapter.request$1();
                return;
            case 17:
                ((FlashViews) this.f$0).flashTo(0.0f, 240L, (Runnable) this.f$1);
                return;
            case 18:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                View view2 = (View) this.f$1;
                if (view2 instanceof EntityView) {
                    EntityView entityView = (EntityView) view2;
                    EntityView.SelectionView selectionView = entityView.selectionView;
                    if (selectionView != null) {
                        selectionView.updatePosition();
                    }
                    paintView.selectEntity$1(entityView, true);
                    return;
                }
                return;
            case 19:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f$0;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f$1;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 20:
                ((Utilities.Callback) this.f$0).run((Bitmap) this.f$1);
                return;
            case 21:
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
                        if (bitmapArr[0] == null && (str4 = storyEntry2.thumbPath) != null && str4.startsWith("vthumb://")) {
                            j = Long.parseLong(storyEntry2.thumbPath.substring(9));
                            if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                                try {
                                    bitmapArr[0] = previewView.getContext().getContentResolver().loadThumbnail(storyEntry2.isVideo ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j), new Size(measuredWidth, i17), null);
                                    break;
                                } catch (Exception unused3) {
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
                        ChatActivity$$ExternalSyntheticLambda299 chatActivity$$ExternalSyntheticLambda299 = new ChatActivity$$ExternalSyntheticLambda299(previewView, storyEntry2, j4, file.getPath(), 7);
                        boolean z2 = storyEntry2.isVideo;
                        bitmapArr[0] = StoryEntry.getScaledBitmap(chatActivity$$ExternalSyntheticLambda299, measuredWidth, i17, !z2 ? storyEntry2.orientation : 0, !z2);
                        zArr[0] = false;
                    }
                }
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149(previewView, bitmapArr, storyEntry2, zArr, 22));
                return;
            case 22:
                PreviewView previewView2 = (PreviewView) ((ChatActivity.AnonymousClass117) this.f$0).this$0;
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
            case 23:
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
            case 24:
                ((QRScanner) this.f$0).listener.run((QRScanner.Detected) this.f$1);
                return;
            case 25:
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
                anonymousClass1.cameraViewAnimator.addListener(new QrActivity.AnonymousClass4(i2, anonymousClass1, roundView));
                anonymousClass1.cameraViewAnimator.setDuration(320L);
                anonymousClass1.cameraViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                anonymousClass1.roundView = roundView;
                anonymousClass1.cameraViewAnimator.start();
                return;
            case 26:
                SelectAudioAlert selectAudioAlert = (SelectAudioAlert) this.f$0;
                selectAudioAlert.loadingLocalAudio = false;
                selectAudioAlert.localAudio.addAll((ArrayList) this.f$1);
                selectAudioAlert.adapter.update(true);
                return;
            case 27:
                ((SelectAudioAlert) this.f$0).lambda$loadSharedAudio$2((TLObject) this.f$1);
                return;
            case 28:
                StoryEntry storyEntry4 = (StoryEntry) this.f$0;
                storyEntry4.checkStickersReqId = 0;
                TLObject tLObject2 = (TLObject) this.f$1;
                if (tLObject2 instanceof Vector) {
                    storyEntry4.editStickers = new ArrayList();
                    Vector vector = (Vector) tLObject2;
                    for (int i18 = 0; i18 < vector.objects.size(); i18++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i18);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            storyEntry4.editStickers.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            default:
                ((StoryLinkSheet) this.f$0).lambda$new$5((TLObject) this.f$1);
                return;
        }
        while (true) {
            botPreviewsEditContainer = (BotPreviewsEditContainer) this.f$0;
            ArrayList arrayList8 = botPreviewsEditContainer.langLists;
            int size = arrayList8.size();
            str3 = (String) this.f$1;
            if (i4 >= size) {
                i = -1;
            } else if (TextUtils.equals(((StoriesController.BotPreviewsList) arrayList8.get(i4)).lang_code, str3)) {
                i = i4;
            } else {
                i4++;
            }
        }
        if (i >= 0) {
            botPreviewsEditContainer.tabsView.scrollToTab(str3.hashCode(), i + 1);
        }
    }
}
