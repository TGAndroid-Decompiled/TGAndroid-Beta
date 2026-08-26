package org.telegram.ui;

public final class LaunchActivity$$ExternalSyntheticLambda34 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda34(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$156();
                break;
            case 1:
                this.f$0.lambda$onActivityResult$145();
                break;
            case 2:
                this.f$0.lambda$didReceivedNotification$159();
                break;
            case 3:
                this.f$0.lambda$openEmailSettings$28();
                break;
            case 4:
                this.f$0.lambda$onPowerSaver$144();
                break;
            case 5:
                this.f$0.lambda$didReceivedNotification$162();
                break;
            case 6:
                this.f$0.lambda$didReceivedNotification$164();
                break;
            case 7:
                this.f$0.lambda$updateCurrentConnectionState$177();
                break;
            case 8:
                this.f$0.lambda$onCreate$1();
                break;
            case 9:
                this.f$0.lambda$checkFreeDiscSpace$168();
                break;
            default:
                this.f$0.lambda$handleIntent$18();
                break;
        }
    }
}
