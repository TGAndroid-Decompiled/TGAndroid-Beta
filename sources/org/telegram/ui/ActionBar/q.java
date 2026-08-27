package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

public final class q extends AnimatorListenerAdapter {

    public final int f23732a;

    public final ActionBarLayout f23733b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f23732a = i10;
        this.f23733b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f23732a;
        ActionBarLayout actionBarLayout = this.f23733b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.F(false);
                break;
            default:
                Drawable drawable2 = ActionBarLayout.l1;
                actionBarLayout.F(false);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23732a) {
            case 0:
                this.f23733b.f22678r0 = System.currentTimeMillis();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
