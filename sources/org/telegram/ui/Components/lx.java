package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lx extends AnimatorListenerAdapter {
    public final int f28462a;
    public final boolean f28463b;
    public final rz f28464c;

    public lx(rz rzVar, boolean z10, int i10) {
        this.f28462a = i10;
        this.f28464c = rzVar;
        this.f28463b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28462a) {
            case 0:
                if (!this.f28463b) {
                    this.f28464c.f30375x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28463b) {
                    this.f28464c.f30379y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
