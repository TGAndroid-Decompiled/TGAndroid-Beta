package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ab0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nj0 f34827a;
    public final org.telegram.ui.Components.kj0 f34828b;
    public final boolean f34829c;
    public final LaunchActivity d;

    public ab0(LaunchActivity launchActivity, org.telegram.ui.Components.nj0 nj0Var, org.telegram.ui.Components.kj0 kj0Var, boolean z10) {
        this.d = launchActivity;
        this.f34827a = nj0Var;
        this.f34828b = kj0Var;
        this.f34829c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33835z0.invalidate();
        launchActivity.f33813o0.invalidate();
        launchActivity.f33813o0.setImageDrawable(null);
        launchActivity.f33813o0.setVisibility(8);
        launchActivity.f33815p0.setVisibility(8);
        org.telegram.ui.Components.nj0 nj0Var = this.f34827a;
        if (nj0Var != null) {
            nj0Var.setImageDrawable(this.f34828b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f34829c && nj0Var != null) {
            nj0Var.setVisibility(0);
        }
        uy.f41408v4 = false;
    }
}
