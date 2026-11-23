package org.telegram.ui;
public final class bt0 implements org.telegram.ui.ActionBar.q1 {
    public final int f46501a;
    public final PrivacyControlActivity f46502b;

    public bt0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f46501a = i7;
        this.f46502b = privacyControlActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46501a) {
            case 0:
                this.f46502b.K0();
                return;
            case 1:
                this.f46502b.finishFragment();
                return;
            default:
                this.f46502b.finishFragment();
                return;
        }
    }
}
