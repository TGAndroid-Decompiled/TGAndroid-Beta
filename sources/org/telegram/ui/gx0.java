package org.telegram.ui;
public final class gx0 implements Runnable {
    public final int f34067a;
    public final PrivacyControlActivity f34068b;

    public gx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f34067a = i10;
        this.f34068b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f34067a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f34068b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f34068b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f34068b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f34068b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
