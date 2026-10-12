package org.telegram.ui;
public final class ox0 implements Runnable {
    public final int f40806a;
    public final PrivacyControlActivity f40807b;

    public ox0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40806a = i10;
        this.f40807b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40806a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40807b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40807b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40807b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40807b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
