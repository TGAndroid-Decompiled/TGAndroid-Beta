package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
public final class r extends AnimatorListenerAdapter {
    public final int f19737a;
    public final ActionBarLayout f19738b;

    public r(ActionBarLayout actionBarLayout, int i10) {
        this.f19737a = i10;
        this.f19738b = actionBarLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19737a;
        ActionBarLayout actionBarLayout = this.f19738b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.f18592p1;
                actionBarLayout.F(false);
                return;
            default:
                Drawable drawable2 = ActionBarLayout.f18592p1;
                actionBarLayout.F(false);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19737a) {
            case 0:
                this.f19738b.f18636v0 = System.currentTimeMillis();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
