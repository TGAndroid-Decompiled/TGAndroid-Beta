package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f38805a;
    public final PrivacyControlActivity f38806b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38805a = i10;
        this.f38806b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f38805a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f38806b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f38806b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f38806b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f38806b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
