package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class ve0 extends ue0 {
    public final we0 f31833f0;

    public ve0(we0 we0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f31833f0 = we0Var;
    }

    @Override
    public final void g(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f33863z0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void i() {
        we0.a(this.f31833f0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f33863z0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
