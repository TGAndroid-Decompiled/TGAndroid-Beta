package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f19693a;
    public final ActionBarLayout f19694b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f19693a = i10;
        this.f19694b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19693a;
        ActionBarLayout actionBarLayout = this.f19694b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18585p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18585p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19693a) {
            case 0:
                this.f19694b.f18629v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
