package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ha0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.xj0 f37503a;
    public final org.telegram.ui.Components.uj0 f37504b;
    public final boolean f37505c;
    public final LaunchActivity d;

    public ha0(LaunchActivity launchActivity, org.telegram.ui.Components.xj0 xj0Var, org.telegram.ui.Components.uj0 uj0Var, boolean z10) {
        this.d = launchActivity;
        this.f37503a = xj0Var;
        this.f37504b = uj0Var;
        this.f37505c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33191z0.invalidate();
        launchActivity.f33169o0.invalidate();
        launchActivity.f33169o0.setImageDrawable(null);
        launchActivity.f33169o0.setVisibility(8);
        launchActivity.f33171p0.setVisibility(8);
        org.telegram.ui.Components.xj0 xj0Var = this.f37503a;
        if (xj0Var != null) {
            xj0Var.setImageDrawable(this.f37504b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f37505c && xj0Var != null) {
            xj0Var.setVisibility(0);
        }
        ey.f36605x4 = false;
    }
}
