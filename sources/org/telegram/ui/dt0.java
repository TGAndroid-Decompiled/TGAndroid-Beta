package org.telegram.ui;
public final class dt0 implements org.telegram.ui.ActionBar.q1 {
    public final int f47011a;
    public final PrivacyControlActivity f47012b;

    public dt0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f47011a = i7;
        this.f47012b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47011a) {
            case 0:
                this.f47012b.K0();
                return;
            case 1:
                this.f47012b.finishFragment();
                return;
            default:
                this.f47012b.finishFragment();
                return;
        }
    }
}
