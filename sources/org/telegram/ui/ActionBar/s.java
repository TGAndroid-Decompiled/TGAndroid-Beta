package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class s extends AnimatorListenerAdapter {
    public final int f19757a;
    public final ActionBarLayout f19758b;

    public s(ActionBarLayout actionBarLayout, int i10) {
        this.f19757a = i10;
        this.f19758b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19757a;
        ActionBarLayout actionBarLayout = this.f19758b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18593p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18593p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19757a) {
            case 0:
                this.f19758b.f18637v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
