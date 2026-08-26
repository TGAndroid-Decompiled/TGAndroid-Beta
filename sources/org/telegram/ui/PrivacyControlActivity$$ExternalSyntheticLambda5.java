package org.telegram.ui;

public final class PrivacyControlActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final PrivacyControlActivity f$0;

    public PrivacyControlActivity$$ExternalSyntheticLambda5(PrivacyControlActivity privacyControlActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$3$4$2();
                break;
            case 1:
                PrivacyControlActivity privacyControlActivity = this.f$0;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f$0;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f$0;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
        }
    }
}
