package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f23001a;
    public final ActionBarLayout f23002b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f23001a = i10;
        this.f23002b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f23001a;
        ActionBarLayout actionBarLayout = this.f23002b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f22301v1;
                actionBarLayout.G(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f22301v1;
                actionBarLayout.G(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23001a) {
            case 0:
                this.f23002b.B0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
