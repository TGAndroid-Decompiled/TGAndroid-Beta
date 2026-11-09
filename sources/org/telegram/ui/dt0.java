package org.telegram.ui;
public final class dt0 implements org.telegram.ui.ActionBar.r1 {
    public final int f45114a;
    public final PrivacyControlActivity f45115b;

    public dt0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f45114a = i7;
        this.f45115b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45114a) {
            case 0:
                this.f45115b.K0();
                return;
            case 1:
                this.f45115b.finishFragment();
                return;
            default:
                this.f45115b.finishFragment();
                return;
        }
    }
}
