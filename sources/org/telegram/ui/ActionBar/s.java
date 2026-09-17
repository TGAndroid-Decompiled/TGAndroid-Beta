package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class s extends AnimatorListenerAdapter {
    public final int f19545a;
    public final ActionBarLayout f19546b;

    public s(ActionBarLayout actionBarLayout, int i10) {
        this.f19545a = i10;
        this.f19546b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19545a;
        ActionBarLayout actionBarLayout = this.f19546b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18384p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18384p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19545a) {
            case 0:
                this.f19546b.f18428v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
