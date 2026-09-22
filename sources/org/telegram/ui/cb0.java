package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.aj0 f32736a;
    public final org.telegram.ui.Components.xi0 f32737b;
    public final boolean f32738c;
    public final LaunchActivity d;

    public cb0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.f32736a = aj0Var;
        this.f32737b = xi0Var;
        this.f32738c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f30859z0.invalidate();
        launchActivity.f30837o0.invalidate();
        launchActivity.f30837o0.setImageDrawable(null);
        launchActivity.f30837o0.setVisibility(8);
        launchActivity.f30839p0.setVisibility(8);
        org.telegram.ui.Components.aj0 aj0Var = this.f32736a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.f32737b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f32738c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        uy.f38196w4 = false;
    }
}
