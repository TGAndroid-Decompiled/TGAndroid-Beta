package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f35865a;
    public final PrivacyControlActivity f35866b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f35865a = i10;
        this.f35866b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f35865a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f35866b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f35866b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f35866b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f35866b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
