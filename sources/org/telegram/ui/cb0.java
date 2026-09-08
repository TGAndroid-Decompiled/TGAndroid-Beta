package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.aj0 f35080a;
    public final org.telegram.ui.Components.xi0 f35081b;
    public final boolean f35082c;
    public final LaunchActivity d;

    public cb0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.f35080a = aj0Var;
        this.f35081b = xi0Var;
        this.f35082c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33498z0.invalidate();
        launchActivity.f33476o0.invalidate();
        launchActivity.f33476o0.setImageDrawable(null);
        launchActivity.f33476o0.setVisibility(8);
        launchActivity.f33478p0.setVisibility(8);
        org.telegram.ui.Components.aj0 aj0Var = this.f35080a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.f35081b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35082c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        uy.f41260x4 = false;
    }
}
