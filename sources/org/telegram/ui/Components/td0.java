package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class td0 extends sd0 {
    public final ud0 f28180b0;

    public td0(ud0 ud0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f28180b0 = ud0Var;
    }

    @Override
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f30833z0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void h() {
        ud0.a(this.f28180b0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.f30833z0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
