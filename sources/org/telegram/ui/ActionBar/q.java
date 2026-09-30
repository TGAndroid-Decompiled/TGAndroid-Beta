package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f19709a;
    public final ActionBarLayout f19710b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f19709a = i10;
        this.f19710b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19709a;
        ActionBarLayout actionBarLayout = this.f19710b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18601p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18601p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19709a) {
            case 0:
                this.f19710b.f18645v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
