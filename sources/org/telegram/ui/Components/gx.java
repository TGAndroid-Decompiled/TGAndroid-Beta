package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f26516a;
    public final boolean f26517b;
    public final kz f26518c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f26516a = i10;
        this.f26518c = kzVar;
        this.f26517b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26516a) {
            case 0:
                if (!this.f26517b) {
                    this.f26518c.f27999x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f26517b) {
                    this.f26518c.f28003y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
