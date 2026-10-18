package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21667a;
    public final ActionBarLayout f21668b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21667a = i10;
        this.f21668b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21667a;
        ActionBarLayout actionBarLayout = this.f21668b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20539p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20539p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21667a) {
            case 0:
                this.f21668b.f20583v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
