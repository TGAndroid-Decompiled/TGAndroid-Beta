package org.telegram.ui;
public final class hx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f34324a;
    public final PrivacyControlActivity f34325b;

    public hx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f34324a = i10;
        this.f34325b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f34324a) {
            case 0:
                this.f34325b.z0();
                return;
            case 1:
                this.f34325b.finishFragment();
                return;
            default:
                this.f34325b.finishFragment();
                return;
        }
    }
}
