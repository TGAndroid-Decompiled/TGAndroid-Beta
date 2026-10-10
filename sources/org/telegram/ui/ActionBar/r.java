package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f21499a;
    public final ActionBarLayout f21500b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f21499a = i10;
        this.f21500b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21499a;
        ActionBarLayout actionBarLayout = this.f21500b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20314p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20314p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21499a) {
            case 0:
                this.f21500b.f20359v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
