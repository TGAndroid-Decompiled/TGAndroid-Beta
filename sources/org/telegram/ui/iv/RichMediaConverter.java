package org.telegram.ui.iv;

import android.graphics.BitmapFactory;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public class RichMediaConverter implements NotificationCenter.NotificationCenterDelegate {
    private boolean cancelled;
    private final int currentAccount;
    private final MediaController.PhotoEntry entry;
    private boolean finished;
    private VideoEditedInfo info;
    private final Listener listener;
    private MessageObject messageObject;
    private String outPath;
    private boolean started;

    public interface Listener {
        void onDone(String str, int i, int i2, int i3);

        void onError();

        void onProgress(float f);
    }

    public RichMediaConverter(int i, MediaController.PhotoEntry photoEntry, Listener listener) {
        this.currentAccount = i;
        this.entry = photoEntry;
        this.listener = listener;
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

    private static VideoEditedInfo buildVideoEditedInfo(MediaController.PhotoEntry photoEntry) {
        long j;
        int i = photoEntry.width;
        int i2 = photoEntry.height;
        if (i <= 0 || i2 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(photoEntry.path, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        int i3 = photoEntry.orientation;
        if (i3 == 90 || i3 == 270) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        videoEditedInfo.startTime = 0L;
        videoEditedInfo.start = 0L;
        videoEditedInfo.endTime = Math.min(3000L, photoEntry.averageDuration);
        while (true) {
            j = videoEditedInfo.endTime;
            if (j <= 0 || j >= 1000) {
                break;
            }
            videoEditedInfo.endTime = j * 2;
        }
        if (j <= 0) {
            videoEditedInfo.endTime = 3000L;
        }
        long j2 = videoEditedInfo.endTime;
        videoEditedInfo.end = j2;
        videoEditedInfo.compressQuality = 1;
        videoEditedInfo.rotationValue = 0;
        videoEditedInfo.originalPath = photoEntry.path;
        videoEditedInfo.estimatedSize = (int) ((r12 / 1000.0f) * 115200.0f);
        videoEditedInfo.estimatedDuration = j2;
        videoEditedInfo.framerate = 30;
        videoEditedInfo.originalDuration = j2;
        videoEditedInfo.filterState = photoEntry.savedFilterState;
        String str = photoEntry.croppedPaintPath;
        if (str != null) {
            videoEditedInfo.paintPath = str;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = photoEntry.croppedMediaEntities;
            }
            videoEditedInfo.mediaEntities = arrayList;
        } else {
            videoEditedInfo.paintPath = photoEntry.paintPath;
            videoEditedInfo.mediaEntities = photoEntry.mediaEntities;
        }
        videoEditedInfo.isPhoto = true;
        MediaController.CropState cropState = photoEntry.cropState;
        if (cropState != null) {
            int i5 = cropState.transformRotation;
            if (i5 != 90 && i5 != 270) {
                int i6 = i2;
                i2 = i;
                i = i6;
            }
            int i7 = (int) (i2 * cropState.cropPw);
            int i8 = (int) (i * cropState.cropPh);
            i = i7;
            i2 = i8;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(f / 854.0f, f2 / 854.0f);
        if (fMax < 1.0f) {
            fMax = 1.0f;
        }
        int iMax = (int) (f / fMax);
        int iMax2 = (int) (f2 / fMax);
        if (iMax % 16 != 0) {
            iMax = Math.max(1, Math.round(iMax / 16.0f)) * 16;
        }
        if (iMax2 % 16 != 0) {
            iMax2 = Math.max(1, Math.round(iMax2 / 16.0f)) * 16;
        }
        videoEditedInfo.resultWidth = iMax;
        videoEditedInfo.originalWidth = iMax;
        videoEditedInfo.resultHeight = iMax2;
        videoEditedInfo.originalHeight = iMax2;
        videoEditedInfo.bitrate = -1;
        videoEditedInfo.muted = true;
        videoEditedInfo.avatarStartTime = 0L;
        return videoEditedInfo;
    }

    public void start() {
        if (this.started || this.cancelled || this.finished) {
            return;
        }
        this.started = true;
        VideoEditedInfo videoEditedInfoBuildVideoEditedInfo = buildVideoEditedInfo(this.entry);
        this.info = videoEditedInfoBuildVideoEditedInfo;
        if (videoEditedInfoBuildVideoEditedInfo == null || !videoEditedInfoBuildVideoEditedInfo.needConvert()) {
            fail();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        this.outPath = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        this.messageObject = messageObject;
        messageObject.videoEditedInfo = this.info;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.addObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(this, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(this.messageObject, false, false, false);
    }

    public void cancel() {
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
        teardown();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.cancelled || this.finished || i2 != this.currentAccount || objArr.length == 0 || objArr[0] != this.messageObject) {
            return;
        }
        if (i == NotificationCenter.fileNewChunkAvailable) {
            long jLongValue = ((Long) objArr[3]).longValue();
            float fFloatValue = ((Float) objArr[4]).floatValue();
            Listener listener = this.listener;
            if (listener != null) {
                listener.onProgress(fFloatValue);
            }
            if (jLongValue > 0) {
                this.finished = true;
                teardown();
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    String str = this.outPath;
                    VideoEditedInfo videoEditedInfo = this.info;
                    listener2.onDone(str, videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d));
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.filePreparingFailed) {
            fail();
        }
    }

    private void fail() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        teardown();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onError();
        }
    }

    private void teardown() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }
}
