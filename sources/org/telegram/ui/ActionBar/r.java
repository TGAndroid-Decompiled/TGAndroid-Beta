package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f19752a;
    public final ActionBarLayout f19753b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f19752a = i10;
        this.f19753b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19752a;
        ActionBarLayout actionBarLayout = this.f19753b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18607p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18607p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19752a) {
            case 0:
                this.f19753b.f18651v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
