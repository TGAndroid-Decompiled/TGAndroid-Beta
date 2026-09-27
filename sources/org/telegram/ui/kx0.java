package org.telegram.ui;
public final class kx0 implements org.telegram.ui.ActionBar.b2 {
    public final int f35190a;
    public final PrivacyControlActivity f35191b;

    public kx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f35190a = i10;
        this.f35191b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35190a) {
            case 0:
                this.f35191b.z0();
                return;
            case 1:
                this.f35191b.finishFragment();
                return;
            default:
                this.f35191b.finishFragment();
                return;
        }
    }
}
