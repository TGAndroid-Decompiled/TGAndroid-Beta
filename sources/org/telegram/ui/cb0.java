package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.aj0 f35053a;
    public final org.telegram.ui.Components.xi0 f35054b;
    public final boolean f35055c;
    public final LaunchActivity d;

    public cb0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.f35053a = aj0Var;
        this.f35054b = xi0Var;
        this.f35055c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33471z0.invalidate();
        launchActivity.f33449o0.invalidate();
        launchActivity.f33449o0.setImageDrawable(null);
        launchActivity.f33449o0.setVisibility(8);
        launchActivity.f33451p0.setVisibility(8);
        org.telegram.ui.Components.aj0 aj0Var = this.f35053a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.f35054b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35055c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        uy.f41233x4 = false;
    }
}
