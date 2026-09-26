package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f19707a;
    public final ActionBarLayout f19708b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f19707a = i10;
        this.f19708b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19707a;
        ActionBarLayout actionBarLayout = this.f19708b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18599p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18599p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19707a) {
            case 0:
                this.f19708b.f18643v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
