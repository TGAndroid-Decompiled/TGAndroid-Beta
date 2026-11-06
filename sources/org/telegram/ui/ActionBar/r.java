package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f28416a;
    public final ActionBarLayout f28417b;

    public r(ActionBarLayout actionBarLayout, int i7) {
        this.f28416a = i7;
        this.f28417b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28416a;
        ActionBarLayout actionBarLayout = this.f28417b;
        switch (i7) {
            case 0:
                Drawable drawable = ActionBarLayout.f27223v1;
                actionBarLayout.H(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f27223v1;
                actionBarLayout.H(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28416a) {
            case 0:
                this.f28417b.B0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
