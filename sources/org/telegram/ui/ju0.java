package org.telegram.ui;
public final class ju0 implements org.telegram.ui.ActionBar.u1 {
    public final int f38560a;
    public final PrivacyControlActivity f38561b;

    public ju0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38560a = i10;
        this.f38561b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38560a) {
            case 0:
                this.f38561b.E0();
                return;
            case 1:
                this.f38561b.finishFragment();
                return;
            default:
                this.f38561b.finishFragment();
                return;
        }
    }
}
