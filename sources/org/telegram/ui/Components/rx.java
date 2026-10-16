package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rx extends AnimatorListenerAdapter {
    public final int f28656a;
    public final boolean f28657b;
    public final wz f28658c;

    public rx(wz wzVar, boolean z10, int i10) {
        this.f28656a = i10;
        this.f28658c = wzVar;
        this.f28657b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28656a) {
            case 0:
                if (!this.f28657b) {
                    this.f28658c.f30772x.setVisibility(4);
                    return;
                }
                return;
            default:
                if (!this.f28657b) {
                    this.f28658c.f30776y.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
