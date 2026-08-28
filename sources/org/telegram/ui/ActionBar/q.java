package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f23709a;
    public final ActionBarLayout f23710b;

    public q(ActionBarLayout actionBarLayout, int i9) {
        this.f23709a = i9;
        this.f23710b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.f23709a;
        ActionBarLayout actionBarLayout = this.f23710b;
        switch (i9) {
            case 0:
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.l1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23709a) {
            case 0:
                this.f23710b.f22678r0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
