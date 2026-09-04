package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class td0 extends sd0 {
    public final ud0 f30592b0;

    public td0(ud0 ud0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f30592b0 = ud0Var;
    }

    @Override
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.f33471z0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void h() {
        ud0.a(this.f30592b0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.f33471z0;
        z3Var.setScaleX(1.0f);
        z3Var.setScaleY(1.0f);
    }
}
