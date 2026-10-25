package org.telegram.ui;
public final class cx0 implements org.telegram.ui.ActionBar.b2 {
    public final int f38557a;
    public final PrivacyControlActivity f38558b;

    public cx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38557a = i10;
        this.f38558b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f38557a) {
            case 0:
                this.f38558b.A0();
                return;
            case 1:
                this.f38558b.finishFragment();
                return;
            default:
                this.f38558b.finishFragment();
                return;
        }
    }
}
