package org.telegram.ui;
public final class px0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40995a;
    public final PrivacyControlActivity f40996b;

    public px0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40995a = i10;
        this.f40996b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40995a) {
            case 0:
                this.f40996b.z0();
                return;
            case 1:
                this.f40996b.finishFragment();
                return;
            default:
                this.f40996b.finishFragment();
                return;
        }
    }
}
