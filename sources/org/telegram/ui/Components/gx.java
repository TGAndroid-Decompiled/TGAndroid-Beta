package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gx extends AnimatorListenerAdapter {
    public final int f26542a;
    public final boolean f26543b;
    public final kz f26544c;

    public gx(kz kzVar, boolean z10, int i10) {
        this.f26542a = i10;
        this.f26544c = kzVar;
        this.f26543b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26542a) {
            case 0:
                if (!this.f26543b) {
                    this.f26544c.f28025x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f26543b) {
                    this.f26544c.f28029y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
