package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f29912a;
    public final ActionBarLayout f29913b;

    public r(ActionBarLayout actionBarLayout, int i7) {
        this.f29912a = i7;
        this.f29913b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29912a;
        ActionBarLayout actionBarLayout = this.f29913b;
        switch (i7) {
            case 0:
                Drawable drawable = ActionBarLayout.f28674w1;
                actionBarLayout.H(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f28674w1;
                actionBarLayout.H(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29912a) {
            case 0:
                this.f29913b.C0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
