package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class fb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bk0 f35778a;
    public final org.telegram.ui.Components.yj0 f35779b;
    public final boolean f35780c;
    public final LaunchActivity d;

    public fb0(LaunchActivity launchActivity, org.telegram.ui.Components.bk0 bk0Var, org.telegram.ui.Components.yj0 yj0Var, boolean z10) {
        this.d = launchActivity;
        this.f35778a = bk0Var;
        this.f35779b = yj0Var;
        this.f35780c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f32151z0.invalidate();
        launchActivity.f32129o0.invalidate();
        launchActivity.f32129o0.setImageDrawable(null);
        launchActivity.f32129o0.setVisibility(8);
        launchActivity.f32131p0.setVisibility(8);
        org.telegram.ui.Components.bk0 bk0Var = this.f35778a;
        if (bk0Var != null) {
            bk0Var.setImageDrawable(this.f35779b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35780c && bk0Var != null) {
            bk0Var.setVisibility(0);
        }
        yy.f42299w4 = false;
    }
}
