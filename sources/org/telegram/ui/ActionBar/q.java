package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f22233a;
    public final ActionBarLayout f22234b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f22233a = i10;
        this.f22234b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22233a;
        ActionBarLayout actionBarLayout = this.f22234b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f21107m1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f21107m1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22233a) {
            case 0:
                this.f22234b.f21146s0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
