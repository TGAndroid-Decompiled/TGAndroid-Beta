package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix extends AnimatorListenerAdapter {
    public final int f25201a;
    public final boolean f25202b;
    public final mz f25203c;

    public ix(mz mzVar, boolean z10, int i10) {
        this.f25201a = i10;
        this.f25203c = mzVar;
        this.f25202b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25201a) {
            case 0:
                if (!this.f25202b) {
                    this.f25203c.f26596x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f25202b) {
                    this.f25203c.f26600y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
