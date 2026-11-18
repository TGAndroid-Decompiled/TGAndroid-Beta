package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kz extends AnimatorListenerAdapter {
    public final int f36919a;
    public final pz f36920b;

    public kz(pz pzVar, int i7) {
        this.f36919a = i7;
        this.f36920b = pzVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36919a) {
            case 0:
                pz pzVar = this.f36920b;
                if (pzVar.C0 == animator) {
                    pzVar.C0 = null;
                    return;
                }
                return;
            default:
                pz pzVar2 = this.f36920b;
                pzVar2.V = pzVar2.f38620d0;
                pzVar2.f38619c0 = pzVar2.f38625g0;
                pzVar2.W = pzVar2.f38622e0;
                pzVar2.f38615a0 = pzVar2.f38624f0;
                pzVar2.f38620d0 = -1;
                pzVar2.f38622e0 = -1;
                pzVar2.f38624f0 = -1;
                pzVar2.f38625g0 = -1;
                return;
        }
    }
}
