package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mz extends AnimatorListenerAdapter {
    public final int f37621a;
    public final rz f37622b;

    public mz(rz rzVar, int i7) {
        this.f37621a = i7;
        this.f37622b = rzVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37621a) {
            case 0:
                rz rzVar = this.f37622b;
                if (rzVar.C0 == animator) {
                    rzVar.C0 = null;
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f37622b;
                rzVar2.V = rzVar2.f39352d0;
                rzVar2.f39351c0 = rzVar2.f39357g0;
                rzVar2.W = rzVar2.f39354e0;
                rzVar2.f39347a0 = rzVar2.f39356f0;
                rzVar2.f39352d0 = -1;
                rzVar2.f39354e0 = -1;
                rzVar2.f39356f0 = -1;
                rzVar2.f39357g0 = -1;
                return;
        }
    }
}
