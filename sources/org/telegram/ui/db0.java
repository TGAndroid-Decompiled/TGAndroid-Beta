package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class db0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lj0 f32923a;
    public final org.telegram.ui.Components.ij0 f32924b;
    public final boolean f32925c;
    public final LaunchActivity d;

    public db0(LaunchActivity launchActivity, org.telegram.ui.Components.lj0 lj0Var, org.telegram.ui.Components.ij0 ij0Var, boolean z10) {
        this.d = launchActivity;
        this.f32923a = lj0Var;
        this.f32924b = ij0Var;
        this.f32925c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31106z0.invalidate();
        launchActivity.f31084o0.invalidate();
        launchActivity.f31084o0.setImageDrawable(null);
        launchActivity.f31084o0.setVisibility(8);
        launchActivity.f31086p0.setVisibility(8);
        org.telegram.ui.Components.lj0 lj0Var = this.f32923a;
        if (lj0Var != null) {
            lj0Var.setImageDrawable(this.f32924b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f32925c && lj0Var != null) {
            lj0Var.setVisibility(0);
        }
        uy.f38123w4 = false;
    }
}
