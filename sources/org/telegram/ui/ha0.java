package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ha0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.xj0 f37521a;
    public final org.telegram.ui.Components.uj0 f37522b;
    public final boolean f37523c;
    public final LaunchActivity d;

    public ha0(LaunchActivity launchActivity, org.telegram.ui.Components.xj0 xj0Var, org.telegram.ui.Components.uj0 uj0Var, boolean z10) {
        this.d = launchActivity;
        this.f37521a = xj0Var;
        this.f37522b = uj0Var;
        this.f37523c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33198z0.invalidate();
        launchActivity.f33176o0.invalidate();
        launchActivity.f33176o0.setImageDrawable(null);
        launchActivity.f33176o0.setVisibility(8);
        launchActivity.f33178p0.setVisibility(8);
        org.telegram.ui.Components.xj0 xj0Var = this.f37521a;
        if (xj0Var != null) {
            xj0Var.setImageDrawable(this.f37522b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f37523c && xj0Var != null) {
            xj0Var.setVisibility(0);
        }
        ey.f36628x4 = false;
    }
}
