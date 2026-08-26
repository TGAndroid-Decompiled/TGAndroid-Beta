package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.camera.CameraController;

public final class StoryRecorder$13$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StoryRecorder.AnonymousClass13 f$0;

    public StoryRecorder$13$$ExternalSyntheticLambda0(StoryRecorder.AnonymousClass13 anonymousClass13, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass13;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = StoryRecorder.this;
                QRScanner qRScanner = storyRecorder.qrScanner;
                if (qRScanner != null) {
                    qRScanner.setPaused(false);
                }
                if (storyRecorder.takingVideo && storyRecorder.stoppingTakingVideo && storyRecorder.cameraView != null) {
                    storyRecorder.showZoomControls$1(false);
                    CameraController.getInstance().stopVideoRecording(storyRecorder.cameraView.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                StoryRecorder.this.navigateTo(1, true);
                break;
            case 2:
                StoryRecorder.this.navigateTo(1, true);
                break;
            default:
                StoryRecorder.this.navigateTo(1, true);
                break;
        }
    }
}
