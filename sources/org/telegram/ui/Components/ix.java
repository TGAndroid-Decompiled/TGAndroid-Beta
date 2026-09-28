package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix extends AnimatorListenerAdapter {
    public final int f25222a;
    public final boolean f25223b;
    public final mz f25224c;

    public ix(mz mzVar, boolean z10, int i10) {
        this.f25222a = i10;
        this.f25224c = mzVar;
        this.f25223b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25222a) {
            case 0:
                if (!this.f25223b) {
                    this.f25224c.f26598x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f25223b) {
                    this.f25224c.f26602y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
