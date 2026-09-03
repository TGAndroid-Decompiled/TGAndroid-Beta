package org.telegram.ui;
public final class cx0 implements org.telegram.ui.ActionBar.c2 {
    public final int f33253a;
    public final PrivacyControlActivity f33254b;

    public cx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f33253a = i10;
        this.f33254b = privacyControlActivity;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33253a) {
            case 0:
                this.f33254b.z0();
                return;
            case 1:
                this.f33254b.finishFragment();
                return;
            default:
                this.f33254b.finishFragment();
                return;
        }
    }
}
