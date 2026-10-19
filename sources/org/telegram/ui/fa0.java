package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class fa0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.xj0 f36950a;
    public final org.telegram.ui.Components.uj0 f36951b;
    public final boolean f36952c;
    public final LaunchActivity d;

    public fa0(LaunchActivity launchActivity, org.telegram.ui.Components.xj0 xj0Var, org.telegram.ui.Components.uj0 uj0Var, boolean z10) {
        this.d = launchActivity;
        this.f36950a = xj0Var;
        this.f36951b = uj0Var;
        this.f36952c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33197z0.invalidate();
        launchActivity.f33175o0.invalidate();
        launchActivity.f33175o0.setImageDrawable(null);
        launchActivity.f33175o0.setVisibility(8);
        launchActivity.f33177p0.setVisibility(8);
        org.telegram.ui.Components.xj0 xj0Var = this.f36950a;
        if (xj0Var != null) {
            xj0Var.setImageDrawable(this.f36951b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f36952c && xj0Var != null) {
            xj0Var.setVisibility(0);
        }
        cy.f36060x4 = false;
    }
}
