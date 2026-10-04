package org.telegram.ui;
public final class gx0 implements Runnable {
    public final int f36769a;
    public final PrivacyControlActivity f36770b;

    public gx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36769a = i10;
        this.f36770b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f36769a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f36770b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.S(this.f36770b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f36770b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f36770b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
