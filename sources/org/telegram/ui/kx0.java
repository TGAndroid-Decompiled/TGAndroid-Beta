package org.telegram.ui;
public final class kx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38123a;
    public final PrivacyControlActivity f38124b;

    public kx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38123a = i10;
        this.f38124b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38123a) {
            case 0:
                this.f38124b.z0();
                return;
            case 1:
                this.f38124b.finishFragment();
                return;
            default:
                this.f38124b.finishFragment();
                return;
        }
    }
}
