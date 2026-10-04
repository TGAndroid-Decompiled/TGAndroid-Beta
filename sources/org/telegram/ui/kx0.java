package org.telegram.ui;
public final class kx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38122a;
    public final PrivacyControlActivity f38123b;

    public kx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38122a = i10;
        this.f38123b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38122a) {
            case 0:
                this.f38123b.z0();
                return;
            case 1:
                this.f38123b.finishFragment();
                return;
            default:
                this.f38123b.finishFragment();
                return;
        }
    }
}
