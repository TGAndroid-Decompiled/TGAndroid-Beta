package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class q extends AnimatorListenerAdapter {
    public final int f19708a;
    public final ActionBarLayout f19709b;

    public q(ActionBarLayout actionBarLayout, int i10) {
        this.f19708a = i10;
        this.f19709b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19708a;
        ActionBarLayout actionBarLayout = this.f19709b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18600p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18600p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19708a) {
            case 0:
                this.f19709b.f18644v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
