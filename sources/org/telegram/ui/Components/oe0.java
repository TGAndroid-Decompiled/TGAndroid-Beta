package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class oe0 extends ne0 {
    public final pe0 f29262j0;

    public oe0(pe0 pe0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f29262j0 = pe0Var;
    }

    @Override
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.f33507z0;
        b4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        b4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void j() {
        pe0.a(this.f29262j0);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.f33507z0;
        b4Var.setScaleX(1.0f);
        b4Var.setScaleY(1.0f);
    }
}
