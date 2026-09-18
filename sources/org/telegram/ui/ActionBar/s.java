package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class s extends AnimatorListenerAdapter {
    public final int f19546a;
    public final ActionBarLayout f19547b;

    public s(ActionBarLayout actionBarLayout, int i10) {
        this.f19546a = i10;
        this.f19547b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19546a;
        ActionBarLayout actionBarLayout = this.f19547b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18385p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18385p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19546a) {
            case 0:
                this.f19547b.f18429v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
