package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f40021a;
    public final PrivacyControlActivity f40022b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40021a = i10;
        this.f40022b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40021a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40022b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40022b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40022b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40022b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
