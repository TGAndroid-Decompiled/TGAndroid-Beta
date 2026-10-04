package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx extends AnimatorListenerAdapter {
    public final int f27905a;
    public final boolean f27906b;
    public final nz f27907c;

    public jx(nz nzVar, boolean z10, int i10) {
        this.f27905a = i10;
        this.f27907c = nzVar;
        this.f27906b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27905a) {
            case 0:
                if (!this.f27906b) {
                    this.f27907c.f29157x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f27906b) {
                    this.f27907c.f29161y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
