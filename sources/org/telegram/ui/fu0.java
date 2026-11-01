package org.telegram.ui;
public final class fu0 implements Runnable {
    public final int f37235a;
    public final PrivacyControlActivity f37236b;

    public fu0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f37235a = i10;
        this.f37236b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f37235a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f37236b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f37236b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f37236b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f37236b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
