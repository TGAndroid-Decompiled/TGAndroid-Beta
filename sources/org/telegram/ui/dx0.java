package org.telegram.ui;
public final class dx0 implements Runnable {
    public final int f33223a;
    public final PrivacyControlActivity f33224b;

    public dx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f33223a = i10;
        this.f33224b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f33223a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f33224b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f33224b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f33224b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f33224b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
