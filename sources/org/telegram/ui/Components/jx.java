package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx extends AnimatorListenerAdapter {
    public final int f27911a;
    public final boolean f27912b;
    public final nz f27913c;

    public jx(nz nzVar, boolean z10, int i10) {
        this.f27911a = i10;
        this.f27913c = nzVar;
        this.f27912b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27911a) {
            case 0:
                if (!this.f27912b) {
                    this.f27913c.f29163x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f27912b) {
                    this.f27913c.f29167y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
