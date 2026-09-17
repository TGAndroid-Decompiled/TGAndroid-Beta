package org.telegram.ui;
public final class ox0 implements Runnable {
    public final int f36452a;
    public final PrivacyControlActivity f36453b;

    public ox0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36452a = i10;
        this.f36453b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f36452a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f36453b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f36453b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f36453b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f36453b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
