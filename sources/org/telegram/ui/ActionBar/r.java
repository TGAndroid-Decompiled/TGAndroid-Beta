package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f28421a;
    public final ActionBarLayout f28422b;

    public r(ActionBarLayout actionBarLayout, int i7) {
        this.f28421a = i7;
        this.f28422b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28421a;
        ActionBarLayout actionBarLayout = this.f28422b;
        switch (i7) {
            case 0:
                Drawable drawable = ActionBarLayout.f27227v1;
                actionBarLayout.H(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f27227v1;
                actionBarLayout.H(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28421a) {
            case 0:
                this.f28422b.B0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
