package org.telegram.ui;
public final class ox0 implements Runnable {
    public final int f36457a;
    public final PrivacyControlActivity f36458b;

    public ox0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36457a = i10;
        this.f36458b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f36457a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f36458b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f36458b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f36458b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f36458b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
