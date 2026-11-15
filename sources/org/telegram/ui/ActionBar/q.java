package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f29493a;
    public final ActionBarLayout f29494b;

    public q(ActionBarLayout actionBarLayout, int i7) {
        this.f29493a = i7;
        this.f29494b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29493a;
        ActionBarLayout actionBarLayout = this.f29494b;
        switch (i7) {
            case 0:
                Drawable drawable = ActionBarLayout.f28322w1;
                actionBarLayout.H(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f28322w1;
                actionBarLayout.H(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29493a) {
            case 0:
                this.f29494b.C0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
