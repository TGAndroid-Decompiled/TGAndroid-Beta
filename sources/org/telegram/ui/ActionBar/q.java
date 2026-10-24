package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21782a;
    public final ActionBarLayout f21783b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21782a = i10;
        this.f21783b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21782a;
        ActionBarLayout actionBarLayout = this.f21783b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20611v1;
                actionBarLayout.G(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20611v1;
                actionBarLayout.G(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21782a) {
            case 0:
                this.f21783b.B0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
