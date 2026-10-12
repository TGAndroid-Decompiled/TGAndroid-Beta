package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rx extends AnimatorListenerAdapter {
    public final int f28956a;
    public final boolean f28957b;
    public final wz f28958c;

    public rx(wz wzVar, boolean z10, int i10) {
        this.f28956a = i10;
        this.f28958c = wzVar;
        this.f28957b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28956a) {
            case 0:
                if (!this.f28957b) {
                    this.f28958c.f31079x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28957b) {
                    this.f28958c.f31083y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
