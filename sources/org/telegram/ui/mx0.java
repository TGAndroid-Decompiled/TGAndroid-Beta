package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f35769a;
    public final PrivacyControlActivity f35770b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f35769a = i10;
        this.f35770b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f35769a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f35770b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f35770b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f35770b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f35770b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
