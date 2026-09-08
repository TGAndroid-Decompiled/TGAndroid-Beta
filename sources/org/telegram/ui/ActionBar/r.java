package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f21341a;
    public final ActionBarLayout f21342b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f21341a = i10;
        this.f21342b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21341a;
        ActionBarLayout actionBarLayout = this.f21342b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f20161p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f20161p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21341a) {
            case 0:
                this.f21342b.f20206v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
