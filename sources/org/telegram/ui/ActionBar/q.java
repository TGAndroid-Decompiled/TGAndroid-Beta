package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f21221a;
    public final ActionBarLayout f21222b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f21221a = i10;
        this.f21222b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21221a;
        ActionBarLayout actionBarLayout = this.f21222b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20077p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20077p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21221a) {
            case 0:
                this.f21222b.f20122v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
