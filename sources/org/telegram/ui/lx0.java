package org.telegram.ui;
public final class lx0 implements Runnable {
    public final int f39797a;
    public final PrivacyControlActivity f39798b;

    public lx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39797a = i10;
        this.f39798b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f39797a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f39798b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f39798b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f39798b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f39798b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
