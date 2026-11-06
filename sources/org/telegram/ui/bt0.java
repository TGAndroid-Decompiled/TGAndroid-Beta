package org.telegram.ui;
public final class bt0 implements org.telegram.ui.ActionBar.r1 {
    public final int f44485a;
    public final PrivacyControlActivity f44486b;

    public bt0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f44485a = i7;
        this.f44486b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44485a) {
            case 0:
                this.f44486b.K0();
                return;
            case 1:
                this.f44486b.finishFragment();
                return;
            default:
                this.f44486b.finishFragment();
                return;
        }
    }
}
