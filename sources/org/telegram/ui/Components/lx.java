package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lx extends AnimatorListenerAdapter {
    public final int f25127a;
    public final boolean f25128b;
    public final rz f25129c;

    public lx(rz rzVar, boolean z10, int i10) {
        this.f25127a = i10;
        this.f25129c = rzVar;
        this.f25128b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25127a) {
            case 0:
                if (!this.f25128b) {
                    this.f25129c.f26870x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f25128b) {
                    this.f25129c.f26874y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
