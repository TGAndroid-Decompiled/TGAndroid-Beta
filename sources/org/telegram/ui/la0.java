package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

public final class la0 extends AnimatorListenerAdapter {

    public final org.telegram.ui.Components.ri0 f40031a;

    public final org.telegram.ui.Components.oi0 f40032b;

    public final boolean f40033c;
    public final LaunchActivity d;

    public la0(LaunchActivity launchActivity, org.telegram.ui.Components.ri0 ri0Var, org.telegram.ui.Components.oi0 oi0Var, boolean z10) {
        this.d = launchActivity;
        this.f40031a = ri0Var;
        this.f40032b = oi0Var;
        this.f40033c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.C0 = null;
        launchActivity.f35539v0.invalidate();
        launchActivity.f35519k0.invalidate();
        launchActivity.f35519k0.setImageDrawable(null);
        launchActivity.f35519k0.setVisibility(8);
        launchActivity.f35521l0.setVisibility(8);
        org.telegram.ui.Components.ri0 ri0Var = this.f40031a;
        if (ri0Var != null) {
            ri0Var.setImageDrawable(this.f40032b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f40033c && ri0Var != null) {
            ri0Var.setVisibility(0);
        }
        gy.f38494t4 = false;
    }
}
