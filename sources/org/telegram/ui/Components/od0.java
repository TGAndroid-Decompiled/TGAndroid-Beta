package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class od0 extends nd0 {
    public final pd0 U;

    public od0(pd0 pd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = pd0Var;
    }

    @Override
    public final void f(float f9) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f35603v0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f9));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f9));
    }

    @Override
    public final void h() {
        pd0.a(this.U);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f35603v0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
