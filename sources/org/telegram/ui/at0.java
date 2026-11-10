package org.telegram.ui;
public final class at0 implements Runnable {
    public final int f43816a;
    public final PrivacyControlActivity f43817b;

    public at0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f43816a = i7;
        this.f43817b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f43816a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f43817b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f43817b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f43817b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f43817b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
