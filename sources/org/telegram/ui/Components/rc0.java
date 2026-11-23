package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class rc0 extends qc0 {
    public final sc0 f39114k0;

    public rc0(sc0 sc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f39114k0 = sc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.f43122y0;
        o3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        o3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        sc0.a(this.f39114k0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.f43122y0;
        o3Var.setScaleX(1.0f);
        o3Var.setScaleY(1.0f);
    }
}
