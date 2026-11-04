package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class ac0 extends zb0 {
    public final bc0 f31804k0;

    public ac0(bc0 bc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f31804k0 = bc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.A0;
        l3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        l3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        bc0.a(this.f31804k0);
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.A0;
        l3Var.setScaleX(1.0f);
        l3Var.setScaleY(1.0f);
    }
}
