package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class ue0 extends te0 {
    public final ve0 f31479f0;

    public ue0(ve0 ve0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f31479f0 = ve0Var;
    }

    @Override
    public final void g(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f33825z0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void i() {
        ve0.a(this.f31479f0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f33825z0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
