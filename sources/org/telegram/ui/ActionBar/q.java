package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21671a;
    public final ActionBarLayout f21672b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21671a = i10;
        this.f21672b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21671a;
        ActionBarLayout actionBarLayout = this.f21672b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20543p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20543p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21671a) {
            case 0:
                this.f21672b.f20587v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
