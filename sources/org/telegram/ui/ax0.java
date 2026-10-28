package org.telegram.ui;
public final class ax0 implements Runnable {
    public final int f37839a;
    public final PrivacyControlActivity f37840b;

    public ax0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f37839a = i10;
        this.f37840b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f37839a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f37840b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.V(this.f37840b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f37840b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f37840b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
