package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class cb0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.aj0 f35081a;
    public final org.telegram.ui.Components.xi0 f35082b;
    public final boolean f35083c;
    public final LaunchActivity d;

    public cb0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.f35081a = aj0Var;
        this.f35082b = xi0Var;
        this.f35083c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33499z0.invalidate();
        launchActivity.f33477o0.invalidate();
        launchActivity.f33477o0.setImageDrawable(null);
        launchActivity.f33477o0.setVisibility(8);
        launchActivity.f33479p0.setVisibility(8);
        org.telegram.ui.Components.aj0 aj0Var = this.f35081a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.f35082b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35083c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        uy.f41261x4 = false;
    }
}
