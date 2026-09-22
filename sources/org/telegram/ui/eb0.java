package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class eb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nj0 f33319a;
    public final org.telegram.ui.Components.kj0 f33320b;
    public final boolean f33321c;
    public final LaunchActivity d;

    public eb0(LaunchActivity launchActivity, org.telegram.ui.Components.nj0 nj0Var, org.telegram.ui.Components.kj0 kj0Var, boolean z10) {
        this.d = launchActivity;
        this.f33319a = nj0Var;
        this.f33320b = kj0Var;
        this.f33321c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31167z0.invalidate();
        launchActivity.f31145o0.invalidate();
        launchActivity.f31145o0.setImageDrawable(null);
        launchActivity.f31145o0.setVisibility(8);
        launchActivity.f31147p0.setVisibility(8);
        org.telegram.ui.Components.nj0 nj0Var = this.f33319a;
        if (nj0Var != null) {
            nj0Var.setImageDrawable(this.f33320b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f33321c && nj0Var != null) {
            nj0Var.setVisibility(0);
        }
        uy.f38251w4 = false;
    }
}
