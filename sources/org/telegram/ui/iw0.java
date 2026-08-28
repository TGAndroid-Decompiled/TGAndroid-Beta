package org.telegram.ui;
public final class iw0 implements Runnable {
    public final int f39310a;
    public final PrivacyControlActivity f39311b;

    public iw0(PrivacyControlActivity privacyControlActivity, int i9) {
        this.f39310a = i9;
        this.f39311b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f39310a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f39311b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.T(this.f39311b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f39311b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f39311b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
