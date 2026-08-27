package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class i1 extends AnimatorListenerAdapter {

    public final int f24471a;

    public final s1 f24472b;

    public i1(int i10, s1 s1Var) {
        this.f24471a = i10;
        this.f24472b = s1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24471a) {
            case 0:
                s1 s1Var = this.f24472b;
                s1Var.f25546u7.isMediaSpoilersRevealed = true;
                s1Var.invalidate();
                break;
            default:
                this.f24472b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
