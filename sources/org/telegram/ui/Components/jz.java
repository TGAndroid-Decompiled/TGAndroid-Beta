package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jz extends AnimatorListenerAdapter {
    public final int f36566a;
    public final oz f36567b;

    public jz(oz ozVar, int i7) {
        this.f36566a = i7;
        this.f36567b = ozVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36566a) {
            case 0:
                oz ozVar = this.f36567b;
                if (ozVar.C0 == animator) {
                    ozVar.C0 = null;
                    return;
                }
                return;
            default:
                oz ozVar2 = this.f36567b;
                ozVar2.V = ozVar2.f38295d0;
                ozVar2.f38294c0 = ozVar2.f38300g0;
                ozVar2.W = ozVar2.f38297e0;
                ozVar2.f38290a0 = ozVar2.f38299f0;
                ozVar2.f38295d0 = -1;
                ozVar2.f38297e0 = -1;
                ozVar2.f38299f0 = -1;
                ozVar2.f38300g0 = -1;
                return;
        }
    }
}
