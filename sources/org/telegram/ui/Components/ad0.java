package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class ad0 extends zc0 {
    public final bd0 f24403j0;

    public ad0(bd0 bd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f24403j0 = bd0Var;
    }

    @Override
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.s3 s3Var = launchActivity.f33395z0;
        s3Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 1.25f, f7));
        s3Var.setScaleY(org.telegram.messenger.i0.T1(1.0f, 1.25f, f7));
    }

    @Override
    public final void j() {
        bd0.a(this.f24403j0);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.s3 s3Var = launchActivity.f33395z0;
        s3Var.setScaleX(1.0f);
        s3Var.setScaleY(1.0f);
    }
}
