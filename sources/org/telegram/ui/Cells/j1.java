package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j1 extends AnimatorListenerAdapter {
    public final int f24541a;
    public final t1 f24542b;

    public j1(int i9, t1 t1Var) {
        this.f24541a = i9;
        this.f24542b = t1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24541a) {
            case 0:
                t1 t1Var = this.f24542b;
                t1Var.f25593u7.isMediaSpoilersRevealed = true;
                t1Var.invalidate();
                return;
            default:
                this.f24542b.setSelectedBackgroundProgress(0.0f);
                return;
        }
    }
}
