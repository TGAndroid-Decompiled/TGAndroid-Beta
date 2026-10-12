package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class se0 extends re0 {
    public final te0 f29125f0;

    public se0(te0 te0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f29125f0 = te0Var;
    }

    @Override
    public final void g(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f32151z0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void i() {
        te0.a(this.f29125f0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f32151z0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
