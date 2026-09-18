package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class td0 extends sd0 {
    public final ud0 f28071b0;

    public td0(ud0 ud0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f28071b0 = ud0Var;
    }

    @Override
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.a4 a4Var = launchActivity.f30879z0;
        a4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        a4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void h() {
        ud0.a(this.f28071b0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.a4 a4Var = launchActivity.f30879z0;
        a4Var.setScaleX(1.0f);
        a4Var.setScaleY(1.0f);
    }
}
