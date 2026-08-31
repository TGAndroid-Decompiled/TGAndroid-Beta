package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f22231a;
    public final ActionBarLayout f22232b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f22231a = i10;
        this.f22232b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22231a;
        ActionBarLayout actionBarLayout = this.f22232b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f21105m1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f21105m1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22231a) {
            case 0:
                this.f22232b.f21144s0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
