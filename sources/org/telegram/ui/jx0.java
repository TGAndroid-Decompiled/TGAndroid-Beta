package org.telegram.ui;
public final class jx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f34524a;
    public final PrivacyControlActivity f34525b;

    public jx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f34524a = i10;
        this.f34525b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34524a) {
            case 0:
                this.f34525b.z0();
                return;
            case 1:
                this.f34525b.finishFragment();
                return;
            default:
                this.f34525b.finishFragment();
                return;
        }
    }
}
