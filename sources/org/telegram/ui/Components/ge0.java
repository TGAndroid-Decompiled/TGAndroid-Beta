package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class ge0 extends fe0 {
    public final he0 f24560b0;

    public ge0(he0 he0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f24560b0 = he0Var;
    }

    @Override
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f31222z0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void h() {
        he0.a(this.f24560b0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f31222z0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
