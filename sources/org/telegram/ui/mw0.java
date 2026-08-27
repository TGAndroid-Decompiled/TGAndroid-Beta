package org.telegram.ui;

public final class mw0 implements org.telegram.ui.ActionBar.a2 {

    public final int f40605a;

    public final PrivacyControlActivity f40606b;

    public mw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40605a = i10;
        this.f40606b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40605a) {
            case 0:
                this.f40606b.z0();
                break;
            case 1:
                this.f40606b.finishFragment();
                break;
            default:
                this.f40606b.finishFragment();
                break;
        }
    }
}
