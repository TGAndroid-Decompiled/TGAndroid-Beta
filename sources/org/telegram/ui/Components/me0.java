package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class me0 extends le0 {
    public final ne0 f28506j0;

    public me0(ne0 ne0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f28506j0 = ne0Var;
    }

    @Override
    public final void g(float f7) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f33191z0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void i() {
        ne0.a(this.f28506j0);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f33191z0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
