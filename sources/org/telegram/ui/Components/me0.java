package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class me0 extends le0 {
    public final ne0 f30567j0;

    public me0(ne0 ne0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f30567j0 = ne0Var;
    }

    @Override
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.f35571z0;
        d4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        d4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override
    public final void j() {
        ne0.a(this.f30567j0);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.f35571z0;
        d4Var.setScaleX(1.0f);
        d4Var.setScaleY(1.0f);
    }
}
