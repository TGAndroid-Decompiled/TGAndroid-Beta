package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ab0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.gk0 f35940a;
    public final org.telegram.ui.Components.dk0 f35941b;
    public final boolean f35942c;
    public final LaunchActivity d;

    public ab0(LaunchActivity launchActivity, org.telegram.ui.Components.gk0 gk0Var, org.telegram.ui.Components.dk0 dk0Var, boolean z10) {
        this.d = launchActivity;
        this.f35940a = gk0Var;
        this.f35941b = dk0Var;
        this.f35942c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33863z0.invalidate();
        launchActivity.f33841o0.invalidate();
        launchActivity.f33841o0.setImageDrawable(null);
        launchActivity.f33841o0.setVisibility(8);
        launchActivity.f33843p0.setVisibility(8);
        org.telegram.ui.Components.gk0 gk0Var = this.f35940a;
        if (gk0Var != null) {
            gk0Var.setImageDrawable(this.f35941b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35942c && gk0Var != null) {
            gk0Var.setVisibility(0);
        }
        ty.f42191w4 = false;
    }
}
