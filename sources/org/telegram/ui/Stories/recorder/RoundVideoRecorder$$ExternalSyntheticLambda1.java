package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;

public final class RoundVideoRecorder$$ExternalSyntheticLambda1 implements CameraView.CameraViewDelegate, CameraController.VideoTakeCallback {
    public final CaptionStory.AnonymousClass1 f$0;

    public RoundVideoRecorder$$ExternalSyntheticLambda1(CaptionStory.AnonymousClass1 anonymousClass1) {
        this.f$0 = anonymousClass1;
    }

    @Override
    public void onCameraInit() {
        CaptionStory.AnonymousClass1 anonymousClass1 = this.f$0;
        if (anonymousClass1.recordingStarted > 0) {
            return;
        }
        CameraController.getInstance().recordVideo(anonymousClass1.cameraView.getCameraSessionObject(), anonymousClass1.file, false, new RoundVideoRecorder$$ExternalSyntheticLambda1(anonymousClass1), new RoundVideoRecorder$$ExternalSyntheticLambda0(anonymousClass1, 1), anonymousClass1.cameraView, true);
    }

    @Override
    public void onFinishVideoRecording(String str, long j) {
        CaptionStory.AnonymousClass1 anonymousClass1 = this.f$0;
        anonymousClass1.recordingStopped = System.currentTimeMillis();
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1.stopRunnable);
        if (anonymousClass1.cancelled) {
            return;
        }
        if (j <= 1000) {
            anonymousClass1.destroy(false);
            return;
        }
        anonymousClass1.cameraView.destroy(true, null);
        BotBiometry$$ExternalSyntheticLambda8 botBiometry$$ExternalSyntheticLambda8 = anonymousClass1.onDoneCallback;
        if (botBiometry$$ExternalSyntheticLambda8 != null) {
            botBiometry$$ExternalSyntheticLambda8.run(anonymousClass1.file, str, Long.valueOf(j));
        }
    }
}
