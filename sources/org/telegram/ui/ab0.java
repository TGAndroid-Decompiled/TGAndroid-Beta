package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class ab0 extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nj0 f34771a;
    public final org.telegram.ui.Components.kj0 f34772b;
    public final boolean f34773c;
    public final LaunchActivity d;

    public ab0(LaunchActivity launchActivity, org.telegram.ui.Components.nj0 nj0Var, org.telegram.ui.Components.kj0 kj0Var, boolean z10) {
        this.d = launchActivity;
        this.f34771a = nj0Var;
        this.f34772b = kj0Var;
        this.f34773c = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.f33815z0.invalidate();
        launchActivity.f33793o0.invalidate();
        launchActivity.f33793o0.setImageDrawable(null);
        launchActivity.f33793o0.setVisibility(8);
        launchActivity.f33795p0.setVisibility(8);
        org.telegram.ui.Components.nj0 nj0Var = this.f34771a;
        if (nj0Var != null) {
            nj0Var.setImageDrawable(this.f34772b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.f34773c && nj0Var != null) {
            nj0Var.setVisibility(0);
        }
        uy.f41365v4 = false;
    }
}
