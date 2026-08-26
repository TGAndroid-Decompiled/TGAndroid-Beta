package org.telegram.ui;

public final class CameraScanActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda1(CameraScanActivity cameraScanActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processShot$13();
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            case 2:
                this.f$0.finishFragment();
                break;
            case 3:
                this.f$0.lambda$processShot$12();
                break;
            case 4:
                this.f$0.lambda$onNoQrFound$10();
                break;
            case 5:
                this.f$0.updateRecognized();
                break;
            case 6:
                this.f$0.lambda$processShot$16();
                break;
            case 7:
                this.f$0.lambda$processShot$17();
                break;
            default:
                this.f$0.initCameraView();
                break;
        }
    }
}
