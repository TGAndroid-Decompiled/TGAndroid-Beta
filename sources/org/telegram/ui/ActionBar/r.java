package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f19480a;
    public final ActionBarLayout f19481b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f19480a = i10;
        this.f19481b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19480a;
        ActionBarLayout actionBarLayout = this.f19481b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18347p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18347p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19480a) {
            case 0:
                this.f19481b.f18391v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
