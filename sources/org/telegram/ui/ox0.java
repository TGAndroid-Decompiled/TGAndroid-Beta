package org.telegram.ui;
public final class ox0 implements Runnable {
    public final int f35640a;
    public final PrivacyControlActivity f35641b;

    public ox0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f35640a = i10;
        this.f35641b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f35640a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f35641b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f35641b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f35641b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f35641b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
