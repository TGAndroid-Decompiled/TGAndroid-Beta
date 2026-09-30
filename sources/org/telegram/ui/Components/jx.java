package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx extends AnimatorListenerAdapter {
    public final int f25561a;
    public final boolean f25562b;
    public final nz f25563c;

    public jx(nz nzVar, boolean z10, int i10) {
        this.f25561a = i10;
        this.f25563c = nzVar;
        this.f25562b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25561a) {
            case 0:
                if (!this.f25562b) {
                    this.f25563c.f26883x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f25562b) {
                    this.f25563c.f26887y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
