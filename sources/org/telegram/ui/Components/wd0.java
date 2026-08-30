package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class wd0 extends vd0 {
    public final xd0 V;

    public wd0(xd0 xd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = xd0Var;
    }

    @Override
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f31656w0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override
    public final void h() {
        xd0.a(this.V);
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f31656w0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
