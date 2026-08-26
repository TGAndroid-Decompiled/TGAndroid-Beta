package org.telegram.ui.Components;

import java.util.concurrent.CountDownLatch;

public final class InstantCameraView$VideoRecorder$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final InstantCameraView.VideoRecorder f$0;
    public final CountDownLatch f$1;

    public InstantCameraView$VideoRecorder$$ExternalSyntheticLambda4(InstantCameraView.VideoRecorder videoRecorder, CountDownLatch countDownLatch, int i) {
        this.$r8$classId = i;
        this.f$0 = videoRecorder;
        this.f$1 = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handlePauseRecording$4(this.f$1);
                break;
            default:
                this.f$0.lambda$handleStopRecording$7(this.f$1);
                break;
        }
    }
}
