package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.kj0 f31599a;
    public final org.telegram.ui.Components.hj0 f31600b;
    public final boolean f31601c;
    public final LaunchActivity d;

    public cb0(LaunchActivity launchActivity, org.telegram.ui.Components.kj0 kj0Var, org.telegram.ui.Components.hj0 hj0Var, boolean z10) {
        this.d = launchActivity;
        this.f31599a = kj0Var;
        this.f31600b = hj0Var;
        this.f31601c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f29975z0.invalidate();
        launchActivity.f29953o0.invalidate();
        launchActivity.f29953o0.setImageDrawable(null);
        launchActivity.f29953o0.setVisibility(8);
        launchActivity.f29955p0.setVisibility(8);
        org.telegram.ui.Components.kj0 kj0Var = this.f31599a;
        if (kj0Var != null) {
            kj0Var.setImageDrawable(this.f31600b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f31601c && kj0Var != null) {
            kj0Var.setVisibility(0);
        }
        wy.f38406x4 = false;
    }
}
