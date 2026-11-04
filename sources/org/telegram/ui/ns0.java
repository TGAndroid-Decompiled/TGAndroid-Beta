package org.telegram.ui;
public final class ns0 implements Runnable {
    public final int f48122a;
    public final PrivacyControlActivity f48123b;

    public ns0(PrivacyControlActivity privacyControlActivity, int i3) {
        this.f48122a = i3;
        this.f48123b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f48122a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f48123b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f48123b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f48123b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f48123b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
