package org.telegram.ui;
public final class px0 implements org.telegram.ui.ActionBar.z1 {
    public final int f41029a;
    public final PrivacyControlActivity f41030b;

    public px0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41029a = i10;
        this.f41030b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41029a) {
            case 0:
                this.f41030b.z0();
                return;
            case 1:
                this.f41030b.finishFragment();
                return;
            default:
                this.f41030b.finishFragment();
                return;
        }
    }
}
