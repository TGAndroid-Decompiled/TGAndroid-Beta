package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class eb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bj0 f33348a;
    public final org.telegram.ui.Components.yi0 f33349b;
    public final boolean f33350c;
    public final LaunchActivity d;

    public eb0(LaunchActivity launchActivity, org.telegram.ui.Components.bj0 bj0Var, org.telegram.ui.Components.yi0 yi0Var, boolean z10) {
        this.d = launchActivity;
        this.f33348a = bj0Var;
        this.f33349b = yi0Var;
        this.f33350c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f30876z0.invalidate();
        launchActivity.f30854o0.invalidate();
        launchActivity.f30854o0.setImageDrawable(null);
        launchActivity.f30854o0.setVisibility(8);
        launchActivity.f30856p0.setVisibility(8);
        org.telegram.ui.Components.bj0 bj0Var = this.f33348a;
        if (bj0Var != null) {
            bj0Var.setImageDrawable(this.f33349b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f33350c && bj0Var != null) {
            bj0Var.setVisibility(0);
        }
        wy.f39190x4 = false;
    }
}
