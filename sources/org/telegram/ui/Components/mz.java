package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mz extends AnimatorListenerAdapter {
    public final int f37666a;
    public final rz f37667b;

    public mz(rz rzVar, int i7) {
        this.f37666a = i7;
        this.f37667b = rzVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37666a) {
            case 0:
                rz rzVar = this.f37667b;
                if (rzVar.C0 == animator) {
                    rzVar.C0 = null;
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f37667b;
                rzVar2.V = rzVar2.f39397d0;
                rzVar2.f39396c0 = rzVar2.f39402g0;
                rzVar2.W = rzVar2.f39399e0;
                rzVar2.f39392a0 = rzVar2.f39401f0;
                rzVar2.f39397d0 = -1;
                rzVar2.f39399e0 = -1;
                rzVar2.f39401f0 = -1;
                rzVar2.f39402g0 = -1;
                return;
        }
    }
}
