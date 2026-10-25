package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f22998a;
    public final ActionBarLayout f22999b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f22998a = i10;
        this.f22999b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22998a;
        ActionBarLayout actionBarLayout = this.f22999b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f22298v1;
                actionBarLayout.G(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f22298v1;
                actionBarLayout.G(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22998a) {
            case 0:
                this.f22999b.B0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
