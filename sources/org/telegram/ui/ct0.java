package org.telegram.ui;
public final class ct0 implements org.telegram.ui.ActionBar.q1 {
    public final int f46672a;
    public final PrivacyControlActivity f46673b;

    public ct0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f46672a = i7;
        this.f46673b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46672a) {
            case 0:
                this.f46673b.K0();
                return;
            case 1:
                this.f46673b.finishFragment();
                return;
            default:
                this.f46673b.finishFragment();
                return;
        }
    }
}
