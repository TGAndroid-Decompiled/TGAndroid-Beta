package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mz extends AnimatorListenerAdapter {
    public final int f37668a;
    public final rz f37669b;

    public mz(rz rzVar, int i7) {
        this.f37668a = i7;
        this.f37669b = rzVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37668a) {
            case 0:
                rz rzVar = this.f37669b;
                if (rzVar.C0 == animator) {
                    rzVar.C0 = null;
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f37669b;
                rzVar2.V = rzVar2.f39387d0;
                rzVar2.f39386c0 = rzVar2.f39392g0;
                rzVar2.W = rzVar2.f39389e0;
                rzVar2.f39382a0 = rzVar2.f39391f0;
                rzVar2.f39387d0 = -1;
                rzVar2.f39389e0 = -1;
                rzVar2.f39391f0 = -1;
                rzVar2.f39392g0 = -1;
                return;
        }
    }
}
