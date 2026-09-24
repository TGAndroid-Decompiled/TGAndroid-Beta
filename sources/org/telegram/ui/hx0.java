package org.telegram.ui;
public final class hx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34308a;
    public final PrivacyControlActivity f34309b;

    public hx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f34308a = i10;
        this.f34309b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34308a) {
            case 0:
                this.f34309b.z0();
                return;
            case 1:
                this.f34309b.finishFragment();
                return;
            default:
                this.f34309b.finishFragment();
                return;
        }
    }
}
