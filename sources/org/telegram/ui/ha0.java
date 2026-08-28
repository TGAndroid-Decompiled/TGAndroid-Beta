package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ha0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.pi0 f38736a;
    public final org.telegram.ui.Components.mi0 f38737b;
    public final boolean f38738c;
    public final LaunchActivity d;

    public ha0(LaunchActivity launchActivity, org.telegram.ui.Components.pi0 pi0Var, org.telegram.ui.Components.mi0 mi0Var, boolean z10) {
        this.d = launchActivity;
        this.f38736a = pi0Var;
        this.f38737b = mi0Var;
        this.f38738c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.C0 = null;
        launchActivity.f35536v0.invalidate();
        launchActivity.f35516k0.invalidate();
        launchActivity.f35516k0.setImageDrawable(null);
        launchActivity.f35516k0.setVisibility(8);
        launchActivity.f35518l0.setVisibility(8);
        org.telegram.ui.Components.pi0 pi0Var = this.f38736a;
        if (pi0Var != null) {
            pi0Var.setImageDrawable(this.f38737b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f38738c && pi0Var != null) {
            pi0Var.setVisibility(0);
        }
        dy.f37625t4 = false;
    }
}
