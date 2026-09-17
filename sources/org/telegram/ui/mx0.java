package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f38779a;
    public final PrivacyControlActivity f38780b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38779a = i10;
        this.f38780b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f38779a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f38780b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f38780b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f38780b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f38780b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
