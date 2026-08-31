package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class yd0 extends xd0 {
    public final zd0 V;

    public yd0(zd0 zd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = zd0Var;
    }

    @Override
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.f34178w0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override
    public final void h() {
        zd0.a(this.V);
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.f34178w0;
        z3Var.setScaleX(1.0f);
        z3Var.setScaleY(1.0f);
    }
}
