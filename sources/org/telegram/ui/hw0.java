package org.telegram.ui;
public final class hw0 implements Runnable {
    public final int f39054a;
    public final PrivacyControlActivity f39055b;

    public hw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39054a = i10;
        this.f39055b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f39054a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f39055b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f39055b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f39055b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f39055b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
