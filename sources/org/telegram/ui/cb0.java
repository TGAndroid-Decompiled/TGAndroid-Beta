package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.aj0 f32735a;
    public final org.telegram.ui.Components.xi0 f32736b;
    public final boolean f32737c;
    public final LaunchActivity d;

    public cb0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.f32735a = aj0Var;
        this.f32736b = xi0Var;
        this.f32737c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f30862z0.invalidate();
        launchActivity.f30840o0.invalidate();
        launchActivity.f30840o0.setImageDrawable(null);
        launchActivity.f30840o0.setVisibility(8);
        launchActivity.f30842p0.setVisibility(8);
        org.telegram.ui.Components.aj0 aj0Var = this.f32735a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.f32736b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f32737c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        uy.f38182x4 = false;
    }
}
