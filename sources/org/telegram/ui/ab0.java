package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ab0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.fk0 f35896a;
    public final org.telegram.ui.Components.ck0 f35897b;
    public final boolean f35898c;
    public final LaunchActivity d;

    public ab0(LaunchActivity launchActivity, org.telegram.ui.Components.fk0 fk0Var, org.telegram.ui.Components.ck0 ck0Var, boolean z10) {
        this.d = launchActivity;
        this.f35896a = fk0Var;
        this.f35897b = ck0Var;
        this.f35898c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33825z0.invalidate();
        launchActivity.f33803o0.invalidate();
        launchActivity.f33803o0.setImageDrawable(null);
        launchActivity.f33803o0.setVisibility(8);
        launchActivity.f33805p0.setVisibility(8);
        org.telegram.ui.Components.fk0 fk0Var = this.f35896a;
        if (fk0Var != null) {
            fk0Var.setImageDrawable(this.f35897b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f35898c && fk0Var != null) {
            fk0Var.setVisibility(0);
        }
        ty.f42147w4 = false;
    }
}
