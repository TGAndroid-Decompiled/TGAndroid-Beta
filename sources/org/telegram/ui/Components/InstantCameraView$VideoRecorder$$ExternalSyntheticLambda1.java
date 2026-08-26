package org.telegram.ui.Components;

import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;

public final class InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final InstantCameraView.VideoRecorder f$0;

    public InstantCameraView$VideoRecorder$$ExternalSyntheticLambda1(InstantCameraView.VideoRecorder videoRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = videoRecorder;
    }

    @Override
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        InstantCameraView.VideoRecorder videoRecorder = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                videoRecorder.getClass();
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                InstantCameraView instantCameraView = InstantCameraView.this;
                instantCameraView.videoEditedInfo = videoEditedInfo2;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.startTime = -1L;
                videoEditedInfo2.endTime = -1L;
                videoEditedInfo2.file = instantCameraView.file;
                videoEditedInfo2.encryptedFile = instantCameraView.encryptedFile;
                videoEditedInfo2.key = instantCameraView.key;
                videoEditedInfo2.iv = instantCameraView.iv;
                videoEditedInfo2.estimatedSize = Math.max(1L, instantCameraView.size);
                VideoEditedInfo videoEditedInfo3 = instantCameraView.videoEditedInfo;
                videoEditedInfo3.framerate = 25;
                videoEditedInfo3.originalWidth = 360;
                videoEditedInfo3.resultWidth = 360;
                videoEditedInfo3.originalHeight = 360;
                videoEditedInfo3.resultHeight = 360;
                videoEditedInfo3.originalPath = instantCameraView.previewFile.getAbsolutePath();
                videoRecorder.setupVideoPlayer(instantCameraView.previewFile);
                instantCameraView.videoEditedInfo.estimatedDuration = instantCameraView.recordedTime;
                NotificationCenter.getInstance(instantCameraView.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(instantCameraView.recordingGuid), instantCameraView.videoEditedInfo, instantCameraView.previewFile.getAbsolutePath(), videoRecorder.keyframeThumbs);
                break;
            case 1:
                InstantCameraView.this.startAnimation(false, false);
                break;
            case 2:
                NotificationCenter.getInstance(InstantCameraView.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 3:
                if (videoRecorder.sentMedia && (videoEditedInfo = InstantCameraView.this.videoEditedInfo) != null) {
                    videoEditedInfo.notReadyYet = false;
                }
                videoRecorder.didWriteData(videoRecorder.videoFile, 0L, true);
                MediaController.getInstance().requestRecordAudioFocus(false);
                break;
            case 4:
                InstantCameraView.this.videoEncoder = null;
                break;
            case 5:
                NotificationCenter.getInstance(InstantCameraView.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                break;
            case 6:
                InstantCameraView.this.textureOverlayView.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
            default:
                InstantCameraView.this.textureOverlayView.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                break;
        }
    }
}
