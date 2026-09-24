package org.telegram.ui;
public final class dx0 implements Runnable {
    public final int f33195a;
    public final PrivacyControlActivity f33196b;

    public dx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f33195a = i10;
        this.f33196b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f33195a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f33196b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f33196b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f33196b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f33196b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
