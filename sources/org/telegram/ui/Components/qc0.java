package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class qc0 extends pc0 {
    public final rc0 f38760k0;

    public qc0(rc0 rc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38760k0 = rc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.p3 p3Var = launchActivity.f43112y0;
        p3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        p3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        rc0.a(this.f38760k0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.p3 p3Var = launchActivity.f43112y0;
        p3Var.setScaleX(1.0f);
        p3Var.setScaleY(1.0f);
    }
}
