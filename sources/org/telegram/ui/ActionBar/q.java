package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f19724a;
    public final ActionBarLayout f19725b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f19724a = i10;
        this.f19725b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19724a;
        ActionBarLayout actionBarLayout = this.f19725b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18616p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18616p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19724a) {
            case 0:
                this.f19725b.f18660v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
