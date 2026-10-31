package org.telegram.ui;
public final class gu0 implements Runnable {
    public final int f37649a;
    public final PrivacyControlActivity f37650b;

    public gu0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f37649a = i10;
        this.f37650b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f37649a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f37650b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Y(this.f37650b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f37650b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f37650b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
