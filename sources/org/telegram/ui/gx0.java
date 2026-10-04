package org.telegram.ui;
public final class gx0 implements Runnable {
    public final int f36763a;
    public final PrivacyControlActivity f36764b;

    public gx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36763a = i10;
        this.f36764b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f36763a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f36764b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.S(this.f36764b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f36764b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f36764b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
