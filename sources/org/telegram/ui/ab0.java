package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ab0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nj0 f34772a;
    public final org.telegram.ui.Components.kj0 f34773b;
    public final boolean f34774c;
    public final LaunchActivity d;

    public ab0(LaunchActivity launchActivity, org.telegram.ui.Components.nj0 nj0Var, org.telegram.ui.Components.kj0 kj0Var, boolean z10) {
        this.d = launchActivity;
        this.f34772a = nj0Var;
        this.f34773b = kj0Var;
        this.f34774c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33816z0.invalidate();
        launchActivity.f33794o0.invalidate();
        launchActivity.f33794o0.setImageDrawable(null);
        launchActivity.f33794o0.setVisibility(8);
        launchActivity.f33796p0.setVisibility(8);
        org.telegram.ui.Components.nj0 nj0Var = this.f34772a;
        if (nj0Var != null) {
            nj0Var.setImageDrawable(this.f34773b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f34774c && nj0Var != null) {
            nj0Var.setVisibility(0);
        }
        uy.f41366v4 = false;
    }
}
