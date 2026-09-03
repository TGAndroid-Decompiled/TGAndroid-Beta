package org.telegram.ui;
public final class cx0 implements org.telegram.ui.ActionBar.c2 {
    public final int f35891a;
    public final PrivacyControlActivity f35892b;

    public cx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f35891a = i10;
        this.f35892b = privacyControlActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35891a) {
            case 0:
                this.f35892b.z0();
                return;
            case 1:
                this.f35892b.finishFragment();
                return;
            default:
                this.f35892b.finishFragment();
                return;
        }
    }
}
