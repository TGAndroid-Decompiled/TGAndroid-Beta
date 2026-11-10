package org.telegram.ui;
public final class et0 implements org.telegram.ui.ActionBar.r1 {
    public final int f45442a;
    public final PrivacyControlActivity f45443b;

    public et0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f45442a = i7;
        this.f45443b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45442a) {
            case 0:
                this.f45443b.K0();
                return;
            case 1:
                this.f45443b.finishFragment();
                return;
            default:
                this.f45443b.finishFragment();
                return;
        }
    }
}
