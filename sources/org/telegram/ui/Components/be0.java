package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class be0 extends ae0 {
    public final ce0 f22993b0;

    public be0(ce0 ce0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f22993b0 = ce0Var;
    }

    @Override
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.f31146z0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void h() {
        ce0.a(this.f22993b0);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.f31146z0;
        z3Var.setScaleX(1.0f);
        z3Var.setScaleY(1.0f);
    }
}
