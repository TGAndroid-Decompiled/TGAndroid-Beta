package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f20293a;
    public final ActionBarLayout f20294b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f20293a = i10;
        this.f20294b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20293a;
        ActionBarLayout actionBarLayout = this.f20294b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f19186p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f19186p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20293a) {
            case 0:
                this.f20294b.f19230v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
