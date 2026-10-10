package org.telegram.ui;
public final class mx0 implements Runnable {
    public final int f40065a;
    public final PrivacyControlActivity f40066b;

    public mx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40065a = i10;
        this.f40066b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40065a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40066b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40066b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40066b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40066b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
