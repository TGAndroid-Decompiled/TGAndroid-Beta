package org.telegram.ui;

public final class PrivacyControlActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final PrivacyControlActivity f$0;

    public PrivacyControlActivity$$ExternalSyntheticLambda0(PrivacyControlActivity privacyControlActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPremiumBulletin$10();
                break;
            case 1:
                this.f$0.lambda$createView$3();
                break;
            case 2:
                this.f$0.lambda$createView$6();
                break;
            default:
                this.f$0.lambda$createView$7();
                break;
        }
    }
}
