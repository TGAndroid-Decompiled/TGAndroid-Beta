package org.telegram.ui;

public final class PassportActivity$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda11(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createPhoneInterface$27();
                break;
            case 1:
                this.f$0.lambda$checkNativeFields$58();
                break;
            case 2:
                this.f$0.lambda$onResume$2();
                break;
            case 3:
                this.f$0.needHideProgress();
                break;
            case 4:
                this.f$0.lambda$createManageInterface$18();
                break;
            case 5:
                this.f$0.lambda$onTransitionAnimationEnd$67();
                break;
            default:
                this.f$0.finishFragment();
                break;
        }
    }
}
