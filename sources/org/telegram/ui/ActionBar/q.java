package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f28436a;
    public final ActionBarLayout f28437b;

    public q(ActionBarLayout actionBarLayout, int i3) {
        this.f28436a = i3;
        this.f28437b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f28436a;
        ActionBarLayout actionBarLayout = this.f28437b;
        switch (i3) {
            case 0:
                Drawable drawable = ActionBarLayout.f27273w1;
                actionBarLayout.H(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f27273w1;
                actionBarLayout.H(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28436a) {
            case 0:
                this.f28437b.C0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
