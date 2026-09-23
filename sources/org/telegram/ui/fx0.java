package org.telegram.ui;
public final class fx0 implements Runnable {
    public final int f33391a;
    public final PrivacyControlActivity f33392b;

    public fx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f33391a = i10;
        this.f33392b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f33391a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f33392b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f33392b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f33392b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f33392b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
