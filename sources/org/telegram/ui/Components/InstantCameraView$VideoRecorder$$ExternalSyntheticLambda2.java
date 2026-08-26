package org.telegram.ui.Components;

public final class InstantCameraView$VideoRecorder$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final InstantCameraView.VideoRecorder f$0;

    public InstantCameraView$VideoRecorder$$ExternalSyntheticLambda2(InstantCameraView.VideoRecorder videoRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = videoRecorder;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleStopRecording$9();
                break;
            case 1:
                this.f$0.lambda$handleStopRecording$12();
                break;
            case 2:
                this.f$0.lambda$stopRecording$1();
                break;
            case 3:
                this.f$0.lambda$handleVideoFrameAvailable$2();
                break;
            case 4:
                this.f$0.lambda$handleVideoFrameAvailable$3();
                break;
            case 5:
                this.f$0.lambda$startRecording$0();
                break;
            case 6:
                this.f$0.lambda$handlePauseRecording$5();
                break;
            default:
                this.f$0.lambda$handleStopRecording$11();
                break;
        }
    }
}
