package org.telegram.ui.Components;

public final class InstantCameraView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final InstantCameraView f$0;

    public InstantCameraView$$ExternalSyntheticLambda0(InstantCameraView instantCameraView, int i) {
        this.$r8$classId = i;
        this.f$0 = instantCameraView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createCamera$5();
                break;
            case 1:
                this.f$0.lambda$createCamera$6();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
