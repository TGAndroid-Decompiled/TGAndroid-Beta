package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class bb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.ik0 f36125a;
    public final org.telegram.ui.Components.fk0 f36126b;
    public final boolean f36127c;
    public final LaunchActivity d;

    public bb0(LaunchActivity launchActivity, org.telegram.ui.Components.ik0 ik0Var, org.telegram.ui.Components.fk0 fk0Var, boolean z10) {
        this.d = launchActivity;
        this.f36125a = ik0Var;
        this.f36126b = fk0Var;
        this.f36127c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33664z0.invalidate();
        launchActivity.f33642o0.invalidate();
        launchActivity.f33642o0.setImageDrawable(null);
        launchActivity.f33642o0.setVisibility(8);
        launchActivity.f33644p0.setVisibility(8);
        org.telegram.ui.Components.ik0 ik0Var = this.f36125a;
        if (ik0Var != null) {
            ik0Var.setImageDrawable(this.f36126b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f36127c && ik0Var != null) {
            ik0Var.setVisibility(0);
        }
        vy.f42878w4 = false;
    }
}
