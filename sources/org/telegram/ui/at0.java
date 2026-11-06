package org.telegram.ui;
public final class at0 implements org.telegram.ui.ActionBar.r1 {
    public final int f44071a;
    public final PrivacyControlActivity f44072b;

    public at0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f44071a = i7;
        this.f44072b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44071a) {
            case 0:
                this.f44072b.K0();
                return;
            case 1:
                this.f44072b.finishFragment();
                return;
            default:
                this.f44072b.finishFragment();
                return;
        }
    }
}
