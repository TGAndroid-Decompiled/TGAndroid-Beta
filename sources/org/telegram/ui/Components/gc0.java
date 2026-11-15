package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
public final class gc0 extends fc0 {
    public final hc0 f34903k0;

    public gc0(hc0 hc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f34903k0 = hc0Var;
    }

    @Override
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.f42667y0;
        l3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        l3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override
    public final void j() {
        hc0.a(this.f34903k0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.f42667y0;
        l3Var.setScaleX(1.0f);
        l3Var.setScaleY(1.0f);
    }
}
