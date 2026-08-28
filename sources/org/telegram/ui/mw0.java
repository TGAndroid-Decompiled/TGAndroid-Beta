package org.telegram.ui;
public final class mw0 implements org.telegram.ui.ActionBar.b2 {
    public final int f40541a;
    public final PrivacyControlActivity f40542b;

    public mw0(PrivacyControlActivity privacyControlActivity, int i9) {
        this.f40541a = i9;
        this.f40542b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f40541a) {
            case 0:
                this.f40542b.y0();
                return;
            case 1:
                this.f40542b.finishFragment();
                return;
            default:
                this.f40542b.finishFragment();
                return;
        }
    }
}
