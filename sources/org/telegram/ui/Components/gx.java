package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f26543a;
    public final boolean f26544b;
    public final kz f26545c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f26543a = i10;
        this.f26545c = kzVar;
        this.f26544b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26543a) {
            case 0:
                if (!this.f26544b) {
                    this.f26545c.f28026x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f26544b) {
                    this.f26545c.f28030y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
