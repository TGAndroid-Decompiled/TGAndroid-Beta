package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f26515a;
    public final boolean f26516b;
    public final kz f26517c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f26515a = i10;
        this.f26517c = kzVar;
        this.f26516b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26515a) {
            case 0:
                if (!this.f26516b) {
                    this.f26517c.f27998x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f26516b) {
                    this.f26517c.f28002y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
