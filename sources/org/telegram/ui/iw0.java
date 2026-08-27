package org.telegram.ui;

public final class iw0 implements Runnable {

    public final int f39168a;

    public final PrivacyControlActivity f39169b;

    public iw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39168a = i10;
        this.f39169b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f39168a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f39169b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            case 1:
                PrivacyControlActivity.U(this.f39169b);
                break;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f39169b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f39169b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
        }
    }
}
