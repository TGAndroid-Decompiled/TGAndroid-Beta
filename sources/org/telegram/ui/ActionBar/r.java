package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f18587a;
    public final ActionBarLayout f18588b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f18587a = i10;
        this.f18588b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f18587a;
        ActionBarLayout actionBarLayout = this.f18588b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f17466p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f17466p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18587a) {
            case 0:
                this.f18588b.f17510v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
