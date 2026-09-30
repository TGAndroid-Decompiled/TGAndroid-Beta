package org.telegram.ui;
public final class dx0 implements Runnable {
    public final int f33305a;
    public final PrivacyControlActivity f33306b;

    public dx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f33305a = i10;
        this.f33306b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f33305a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f33306b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f33306b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f33306b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f33306b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
