package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class eb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bk0 f35242a;
    public final org.telegram.ui.Components.yj0 f35243b;
    public final boolean f35244c;
    public final LaunchActivity d;

    public eb0(LaunchActivity launchActivity, org.telegram.ui.Components.bk0 bk0Var, org.telegram.ui.Components.yj0 yj0Var, boolean z10) {
        this.d = launchActivity;
        this.f35242a = bk0Var;
        this.f35243b = yj0Var;
        this.f35244c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f31853z0.invalidate();
        launchActivity.f31831o0.invalidate();
        launchActivity.f31831o0.setImageDrawable(null);
        launchActivity.f31831o0.setVisibility(8);
        launchActivity.f31833p0.setVisibility(8);
        org.telegram.ui.Components.bk0 bk0Var = this.f35242a;
        if (bk0Var != null) {
            bk0Var.setImageDrawable(this.f35243b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35244c && bk0Var != null) {
            bk0Var.setVisibility(0);
        }
        yy.f41979x4 = false;
    }
}
