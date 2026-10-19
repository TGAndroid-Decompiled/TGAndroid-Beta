package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21668a;
    public final ActionBarLayout f21669b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21668a = i10;
        this.f21669b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21668a;
        ActionBarLayout actionBarLayout = this.f21669b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20540p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20540p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21668a) {
            case 0:
                this.f21669b.f20584v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
