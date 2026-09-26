package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix extends AnimatorListenerAdapter {
    public final int f25200a;
    public final boolean f25201b;
    public final mz f25202c;

    public ix(mz mzVar, boolean z10, int i10) {
        this.f25200a = i10;
        this.f25202c = mzVar;
        this.f25201b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25200a) {
            case 0:
                if (!this.f25201b) {
                    this.f25202c.f26613x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f25201b) {
                    this.f25202c.f26617y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
