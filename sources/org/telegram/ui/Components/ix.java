package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix extends AnimatorListenerAdapter {
    public final int f25221a;
    public final boolean f25222b;
    public final mz f25223c;

    public ix(mz mzVar, boolean z10, int i10) {
        this.f25221a = i10;
        this.f25223c = mzVar;
        this.f25222b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25221a) {
            case 0:
                if (!this.f25222b) {
                    this.f25223c.f26597x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f25222b) {
                    this.f25223c.f26601y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
