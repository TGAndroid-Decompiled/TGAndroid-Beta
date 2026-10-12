package org.telegram.ui;
public final class ox0 implements Runnable {
    public final int f40804a;
    public final PrivacyControlActivity f40805b;

    public ox0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40804a = i10;
        this.f40805b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40804a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40805b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40805b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40805b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40805b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
