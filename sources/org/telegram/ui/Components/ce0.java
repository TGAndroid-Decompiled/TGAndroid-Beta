package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class ce0 extends be0 {
    public final de0 f22121b0;

    public ce0(de0 de0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f22121b0 = de0Var;
    }

    @Override
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.f29975z0;
        b4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        b4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void h() {
        de0.a(this.f22121b0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.f29975z0;
        b4Var.setScaleX(1.0f);
        b4Var.setScaleY(1.0f);
    }
}
