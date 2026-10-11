package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21483a;
    public final ActionBarLayout f21484b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21483a = i10;
        this.f21484b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21483a;
        ActionBarLayout actionBarLayout = this.f21484b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20340p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20340p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21483a) {
            case 0:
                this.f21484b.f20385v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
