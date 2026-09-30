package org.telegram.ui;
public final class dx0 implements Runnable {
    public final int f33211a;
    public final PrivacyControlActivity f33212b;

    public dx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f33211a = i10;
        this.f33212b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f33211a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f33212b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f33212b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f33212b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f33212b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
