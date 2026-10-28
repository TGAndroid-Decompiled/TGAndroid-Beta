package org.telegram.ui;
public final class ex0 implements org.telegram.ui.ActionBar.b2 {
    public final int f38972a;
    public final PrivacyControlActivity f38973b;

    public ex0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38972a = i10;
        this.f38973b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f38972a) {
            case 0:
                this.f38973b.A0();
                return;
            case 1:
                this.f38973b.finishFragment();
                return;
            default:
                this.f38973b.finishFragment();
                return;
        }
    }
}
