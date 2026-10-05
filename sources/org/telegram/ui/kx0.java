package org.telegram.ui;
public final class kx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f38196a;
    public final PrivacyControlActivity f38197b;

    public kx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38196a = i10;
        this.f38197b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38196a) {
            case 0:
                this.f38197b.z0();
                return;
            case 1:
                this.f38197b.finishFragment();
                return;
            default:
                this.f38197b.finishFragment();
                return;
        }
    }
}
