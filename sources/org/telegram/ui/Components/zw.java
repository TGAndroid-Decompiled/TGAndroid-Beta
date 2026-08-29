package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zw extends AnimatorListenerAdapter {
    public final int f35435a;
    public final boolean f35436b;
    public final fz f35437c;

    public zw(fz fzVar, boolean z10, int i10) {
        this.f35435a = i10;
        this.f35437c = fzVar;
        this.f35436b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35435a) {
            case 0:
                if (!this.f35436b) {
                    this.f35437c.f28649x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f35436b) {
                    this.f35437c.f28653y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
