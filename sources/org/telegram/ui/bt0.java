package org.telegram.ui;
public final class bt0 implements org.telegram.ui.ActionBar.r1 {
    public final int f44484a;
    public final PrivacyControlActivity f44485b;

    public bt0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f44484a = i7;
        this.f44485b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44484a) {
            case 0:
                this.f44485b.K0();
                return;
            case 1:
                this.f44485b.finishFragment();
                return;
            default:
                this.f44485b.finishFragment();
                return;
        }
    }
}
