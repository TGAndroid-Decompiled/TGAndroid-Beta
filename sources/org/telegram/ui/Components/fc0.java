package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class fc0 extends ec0 {
    public final gc0 f33511j0;

    public fc0(gc0 gc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33511j0 = gc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.f41293x0;
        n3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        n3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        gc0.a(this.f33511j0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.f41293x0;
        n3Var.setScaleX(1.0f);
        n3Var.setScaleY(1.0f);
    }
}
