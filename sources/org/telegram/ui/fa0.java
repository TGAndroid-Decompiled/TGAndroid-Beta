package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class fa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.yj0 f36961a;
    public final org.telegram.ui.Components.vj0 f36962b;
    public final boolean f36963c;
    public final LaunchActivity d;

    public fa0(LaunchActivity launchActivity, org.telegram.ui.Components.yj0 yj0Var, org.telegram.ui.Components.vj0 vj0Var, boolean z10) {
        this.d = launchActivity;
        this.f36961a = yj0Var;
        this.f36962b = vj0Var;
        this.f36963c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33208z0.invalidate();
        launchActivity.f33186o0.invalidate();
        launchActivity.f33186o0.setImageDrawable(null);
        launchActivity.f33186o0.setVisibility(8);
        launchActivity.f33188p0.setVisibility(8);
        org.telegram.ui.Components.yj0 yj0Var = this.f36961a;
        if (yj0Var != null) {
            yj0Var.setImageDrawable(this.f36962b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f36963c && yj0Var != null) {
            yj0Var.setVisibility(0);
        }
        cy.f36071x4 = false;
    }
}
