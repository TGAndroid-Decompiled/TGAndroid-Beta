package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class fa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.yj0 f36957a;
    public final org.telegram.ui.Components.vj0 f36958b;
    public final boolean f36959c;
    public final LaunchActivity d;

    public fa0(LaunchActivity launchActivity, org.telegram.ui.Components.yj0 yj0Var, org.telegram.ui.Components.vj0 vj0Var, boolean z10) {
        this.d = launchActivity;
        this.f36957a = yj0Var;
        this.f36958b = vj0Var;
        this.f36959c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33204z0.invalidate();
        launchActivity.f33182o0.invalidate();
        launchActivity.f33182o0.setImageDrawable(null);
        launchActivity.f33182o0.setVisibility(8);
        launchActivity.f33184p0.setVisibility(8);
        org.telegram.ui.Components.yj0 yj0Var = this.f36957a;
        if (yj0Var != null) {
            yj0Var.setImageDrawable(this.f36958b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f36959c && yj0Var != null) {
            yj0Var.setVisibility(0);
        }
        cy.f36067x4 = false;
    }
}
