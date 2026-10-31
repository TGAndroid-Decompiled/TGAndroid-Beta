package org.telegram.ui;
public final class ku0 implements org.telegram.ui.ActionBar.u1 {
    public final int f38954a;
    public final PrivacyControlActivity f38955b;

    public ku0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38954a = i10;
        this.f38955b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38954a) {
            case 0:
                this.f38955b.D0();
                return;
            case 1:
                this.f38955b.finishFragment();
                return;
            default:
                this.f38955b.finishFragment();
                return;
        }
    }
}
