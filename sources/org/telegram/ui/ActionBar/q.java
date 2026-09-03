package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f20503a;
    public final ActionBarLayout f20504b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f20503a = i10;
        this.f20504b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20503a;
        ActionBarLayout actionBarLayout = this.f20504b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f19419m1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f19419m1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20503a) {
            case 0:
                this.f20504b.f19457s0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
