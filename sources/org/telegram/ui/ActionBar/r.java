package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f20708a;
    public final ActionBarLayout f20709b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f20708a = i10;
        this.f20709b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20708a;
        ActionBarLayout actionBarLayout = this.f20709b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20067v1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20067v1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20708a) {
            case 0:
                this.f20709b.B0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
