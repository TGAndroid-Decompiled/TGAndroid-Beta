package org.telegram.ui;
public final class gx0 implements Runnable {
    public final int f36793a;
    public final PrivacyControlActivity f36794b;

    public gx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36793a = i10;
        this.f36794b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f36793a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f36794b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.S(this.f36794b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f36794b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f36794b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
