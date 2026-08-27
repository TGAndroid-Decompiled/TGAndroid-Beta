package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

public final class ed0 extends dd0 {
    public final fd0 U;

    public ed0(fd0 fd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = fd0Var;
    }

    @Override
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f35539v0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.f35539v0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
