package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f23764a;
    public final ActionBarLayout f23765b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f23764a = i10;
        this.f23765b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f23764a;
        ActionBarLayout actionBarLayout = this.f23765b;
        switch (i10) {
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
        switch (this.f23764a) {
            case 0:
                this.f23765b.f22690r0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
