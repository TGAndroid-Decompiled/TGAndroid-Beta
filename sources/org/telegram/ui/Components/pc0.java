package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class pc0 extends oc0 {
    public final qc0 f38450k0;

    public pc0(qc0 qc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38450k0 = qc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.f43232y0;
        o3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        o3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        qc0.a(this.f38450k0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.f43232y0;
        o3Var.setScaleX(1.0f);
        o3Var.setScaleY(1.0f);
    }
}
