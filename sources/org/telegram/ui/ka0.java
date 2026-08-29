package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ka0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.aj0 f39820a;
    public final org.telegram.ui.Components.xi0 f39821b;
    public final boolean f39822c;
    public final LaunchActivity d;

    public ka0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.f39820a = aj0Var;
        this.f39821b = xi0Var;
        this.f39822c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.C0 = null;
        launchActivity.f35603v0.invalidate();
        launchActivity.f35583k0.invalidate();
        launchActivity.f35583k0.setImageDrawable(null);
        launchActivity.f35583k0.setVisibility(8);
        launchActivity.f35585l0.setVisibility(8);
        org.telegram.ui.Components.aj0 aj0Var = this.f39820a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.f39821b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f39822c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        fy.f38251t4 = false;
    }
}
