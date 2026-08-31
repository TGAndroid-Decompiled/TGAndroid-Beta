package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f27307a;
    public final boolean f27308b;
    public final mz f27309c;

    public gx(mz mzVar, boolean z4, int i10) {
        this.f27307a = i10;
        this.f27309c = mzVar;
        this.f27308b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27307a) {
            case 0:
                if (!this.f27308b) {
                    this.f27309c.f29338x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f27308b) {
                    this.f27309c.f29342y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
