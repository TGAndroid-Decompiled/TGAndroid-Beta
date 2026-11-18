package org.telegram.ui;
public final class ct0 implements org.telegram.ui.ActionBar.r1 {
    public final int f46633a;
    public final PrivacyControlActivity f46634b;

    public ct0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f46633a = i7;
        this.f46634b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46633a) {
            case 0:
                this.f46634b.K0();
                return;
            case 1:
                this.f46634b.finishFragment();
                return;
            default:
                this.f46634b.finishFragment();
                return;
        }
    }
}
