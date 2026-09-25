package org.telegram.ui;
public final class hx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34322a;
    public final PrivacyControlActivity f34323b;

    public hx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f34322a = i10;
        this.f34323b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34322a) {
            case 0:
                this.f34323b.z0();
                return;
            case 1:
                this.f34323b.finishFragment();
                return;
            default:
                this.f34323b.finishFragment();
                return;
        }
    }
}
