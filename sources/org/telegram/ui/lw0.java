package org.telegram.ui;
public final class lw0 implements org.telegram.ui.ActionBar.b2 {
    public final int f40319a;
    public final PrivacyControlActivity f40320b;

    public lw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40319a = i10;
        this.f40320b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40319a) {
            case 0:
                this.f40320b.z0();
                return;
            case 1:
                this.f40320b.finishFragment();
                return;
            default:
                this.f40320b.finishFragment();
                return;
        }
    }
}
