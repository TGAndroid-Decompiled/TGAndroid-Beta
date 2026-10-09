package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f40019a;
    public final PrivacyControlActivity f40020b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40019a = i10;
        this.f40020b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40019a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40020b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40020b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40020b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40020b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
