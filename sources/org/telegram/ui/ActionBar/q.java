package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f20593a;
    public final ActionBarLayout f20594b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f20593a = i10;
        this.f20594b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20593a;
        ActionBarLayout actionBarLayout = this.f20594b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f19486p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f19486p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20593a) {
            case 0:
                this.f20594b.f19530v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
