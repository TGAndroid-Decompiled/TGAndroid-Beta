package org.telegram.ui.iv;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

public final class RichMediaConverter implements NotificationCenter.NotificationCenterDelegate {
    public boolean cancelled;
    public final int currentAccount;
    public boolean finished;
    public VideoEditedInfo info;
    public final RichEditorListView.AnonymousClass18 listener;
    public MessageObject messageObject;
    public String outPath;
    public boolean started;

    public RichMediaConverter(int i, RichEditorListView.AnonymousClass18 anonymousClass18) {
        this.currentAccount = i;
        this.listener = anonymousClass18;
    }

    public static boolean hasAnimatedMediaEntities(MediaController.PhotoEntry photoEntry) {
        if (photoEntry != null && !photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = photoEntry.croppedMediaEntities;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = (arrayList == null || arrayList.isEmpty()) ? photoEntry.mediaEntities : photoEntry.croppedMediaEntities;
            if (arrayList2 == null) {
                return false;
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = arrayList2.get(i);
                if (mediaEntity != null) {
                    if (mediaEntity.type == 0) {
                        byte b = mediaEntity.subType;
                        if ((b & 1) != 0 || (b & 4) != 0) {
                            return true;
                        }
                    }
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void cancel() {
        if (this.finished || this.cancelled) {
            return;
        }
        this.cancelled = true;
        if (this.messageObject != null && this.info != null) {
            try {
                MediaController.getInstance().cancelVideoConvert(this.messageObject);
            } catch (Throwable unused) {
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (this.cancelled || this.finished || i2 != (i3 = this.currentAccount) || objArr.length == 0 || objArr[0] != this.messageObject) {
            return;
        }
        int i4 = NotificationCenter.fileNewChunkAvailable;
        if (i != i4) {
            if (i == NotificationCenter.filePreparingFailed) {
                fail();
                return;
            }
            return;
        }
        long jLongValue = ((Long) objArr[3]).longValue();
        float fFloatValue = ((Float) objArr[4]).floatValue();
        RichEditorListView.AnonymousClass18 anonymousClass18 = this.listener;
        MediaUploadState mediaUploadState = anonymousClass18.val$media;
        mediaUploadState.progress = fFloatValue;
        RichEditorListView richEditorListView = anonymousClass18.this$0;
        BlockRow blockRow = anonymousClass18.val$row;
        View viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
        if (viewFindViewByItemObject instanceof RichMediaCell) {
            viewFindViewByItemObject.requestLayout();
            viewFindViewByItemObject.invalidate();
        }
        if (jLongValue > 0) {
            this.finished = true;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i3);
            notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
            notificationCenter.removeObserver(this, i4);
            notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
            String str = this.outPath;
            VideoEditedInfo videoEditedInfo = this.info;
            int i5 = videoEditedInfo.resultWidth;
            int i6 = videoEditedInfo.resultHeight;
            int iCeil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
            richEditorListView.converters.remove(mediaUploadState);
            mediaUploadState.isVideo = true;
            mediaUploadState.localPath = str;
            if (i5 > 0) {
                mediaUploadState.width = i5;
            }
            if (i6 > 0) {
                mediaUploadState.height = i6;
            }
            mediaUploadState.orientation = 0;
            mediaUploadState.invert = 0;
            mediaUploadState.progress = 0.0f;
            richEditorListView.refreshMediaCell(blockRow);
            int i7 = mediaUploadState.width;
            int i8 = mediaUploadState.height;
            IdentityHashMap identityHashMap = richEditorListView.uploaders;
            RichMediaUploader richMediaUploader = (RichMediaUploader) identityHashMap.remove(mediaUploadState);
            if (richMediaUploader != null) {
                richMediaUploader.cancel();
            }
            RichMediaUploader richMediaUploader2 = new RichMediaUploader(richEditorListView.currentAccount, str, true, i7, i8, iCeil, new RichEditorListView.AnonymousClass19(blockRow, mediaUploadState, richEditorListView));
            identityHashMap.put(mediaUploadState, richMediaUploader2);
            richMediaUploader2.start();
        }
    }

    public final void fail() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
        RichEditorListView.AnonymousClass18 anonymousClass18 = this.listener;
        RichEditorListView richEditorListView = anonymousClass18.this$0;
        IdentityHashMap identityHashMap = richEditorListView.converters;
        MediaUploadState mediaUploadState = anonymousClass18.val$media;
        identityHashMap.remove(mediaUploadState);
        mediaUploadState.state = 3;
        richEditorListView.removeMediaFromRow(anonymousClass18.val$row, mediaUploadState);
        richEditorListView.delegate.onContentChanged();
    }
}
