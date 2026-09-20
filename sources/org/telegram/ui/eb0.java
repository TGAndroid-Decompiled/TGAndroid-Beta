package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class eb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.kj0 f33299a;
    public final org.telegram.ui.Components.hj0 f33300b;
    public final boolean f33301c;
    public final LaunchActivity d;

    public eb0(LaunchActivity launchActivity, org.telegram.ui.Components.kj0 kj0Var, org.telegram.ui.Components.hj0 hj0Var, boolean z10) {
        this.d = launchActivity;
        this.f33299a = kj0Var;
        this.f33300b = hj0Var;
        this.f33301c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31146z0.invalidate();
        launchActivity.f31124o0.invalidate();
        launchActivity.f31124o0.setImageDrawable(null);
        launchActivity.f31124o0.setVisibility(8);
        launchActivity.f31126p0.setVisibility(8);
        org.telegram.ui.Components.kj0 kj0Var = this.f33299a;
        if (kj0Var != null) {
            kj0Var.setImageDrawable(this.f33300b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f33301c && kj0Var != null) {
            kj0Var.setVisibility(0);
        }
        uy.f38230w4 = false;
    }
}
