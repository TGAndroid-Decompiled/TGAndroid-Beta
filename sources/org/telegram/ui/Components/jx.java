package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx extends AnimatorListenerAdapter {
    public final int f27906a;
    public final boolean f27907b;
    public final nz f27908c;

    public jx(nz nzVar, boolean z10, int i10) {
        this.f27906a = i10;
        this.f27908c = nzVar;
        this.f27907b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27906a) {
            case 0:
                if (!this.f27907b) {
                    this.f27908c.f29158x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f27907b) {
                    this.f27908c.f29162y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
