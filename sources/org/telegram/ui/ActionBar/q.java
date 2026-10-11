package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21447a;
    public final ActionBarLayout f21448b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21447a = i10;
        this.f21448b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21447a;
        ActionBarLayout actionBarLayout = this.f21448b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20304p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20304p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21447a) {
            case 0:
                this.f21448b.f20349v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
