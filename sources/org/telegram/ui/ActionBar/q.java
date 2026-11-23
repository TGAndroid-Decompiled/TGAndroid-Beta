package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f29898a;
    public final ActionBarLayout f29899b;

    public q(ActionBarLayout actionBarLayout, int i7) {
        this.f29898a = i7;
        this.f29899b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29898a;
        ActionBarLayout actionBarLayout = this.f29899b;
        switch (i7) {
            case 0:
                Drawable drawable = ActionBarLayout.f28707w1;
                actionBarLayout.H(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f28707w1;
                actionBarLayout.H(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29898a) {
            case 0:
                this.f29899b.C0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
