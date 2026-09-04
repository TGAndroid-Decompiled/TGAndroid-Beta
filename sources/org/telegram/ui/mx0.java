package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f38778a;
    public final PrivacyControlActivity f38779b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38778a = i10;
        this.f38779b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f38778a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f38779b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f38779b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f38779b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f38779b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
