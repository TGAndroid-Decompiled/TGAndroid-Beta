package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class ne0 extends me0 {
    public final oe0 f30901j0;

    public ne0(oe0 oe0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f30901j0 = oe0Var;
    }

    @Override
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.f35595z0;
        d4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        d4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void j() {
        oe0.a(this.f30901j0);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.f35595z0;
        d4Var.setScaleX(1.0f);
        d4Var.setScaleY(1.0f);
    }
}
