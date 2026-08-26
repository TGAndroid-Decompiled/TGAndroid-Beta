package org.telegram.ui;

public final class LaunchActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final int f$1;

    public LaunchActivity$$ExternalSyntheticLambda15(LaunchActivity launchActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = launchActivity;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkAppUpdate$140(this.f$1);
                break;
            case 1:
                this.f$0.lambda$openMessage$41(this.f$1);
                break;
            default:
                this.f$0.lambda$checkFreeDiscSpace$169(this.f$1);
                break;
        }
    }
}
