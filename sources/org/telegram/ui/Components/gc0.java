package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class gc0 extends fc0 {
    public final hc0 f33928j0;

    public gc0(hc0 hc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f33928j0 = hc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.f41304x0;
        n3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        n3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        hc0.a(this.f33928j0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.f41304x0;
        n3Var.setScaleX(1.0f);
        n3Var.setScaleY(1.0f);
    }
}
