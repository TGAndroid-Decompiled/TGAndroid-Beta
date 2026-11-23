package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mz extends AnimatorListenerAdapter {
    public final int f37665a;
    public final rz f37666b;

    public mz(rz rzVar, int i7) {
        this.f37665a = i7;
        this.f37666b = rzVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37665a) {
            case 0:
                rz rzVar = this.f37666b;
                if (rzVar.C0 == animator) {
                    rzVar.C0 = null;
                    return;
                }
                return;
            default:
                rz rzVar2 = this.f37666b;
                rzVar2.V = rzVar2.f39396d0;
                rzVar2.f39395c0 = rzVar2.f39401g0;
                rzVar2.W = rzVar2.f39398e0;
                rzVar2.f39391a0 = rzVar2.f39400f0;
                rzVar2.f39396d0 = -1;
                rzVar2.f39398e0 = -1;
                rzVar2.f39400f0 = -1;
                rzVar2.f39401g0 = -1;
                return;
        }
    }
}
