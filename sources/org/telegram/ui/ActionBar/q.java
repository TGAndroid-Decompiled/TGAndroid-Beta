package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f20528a;
    public final ActionBarLayout f20529b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f20528a = i10;
        this.f20529b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20528a;
        ActionBarLayout actionBarLayout = this.f20529b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f19444m1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f19444m1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20528a) {
            case 0:
                this.f20529b.f19482s0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
