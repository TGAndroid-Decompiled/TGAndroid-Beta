package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sh extends AnimatorListenerAdapter {
    public final int f39617a;
    public final boolean f39618b;
    public final zh f39619c;

    public sh(zh zhVar, boolean z10, int i7) {
        this.f39617a = i7;
        this.f39619c = zhVar;
        this.f39618b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f39617a) {
            case 0:
                zh zhVar = this.f39619c;
                ti tiVar = zhVar.f42862e;
                boolean z10 = this.f39618b;
                if (!z10) {
                    tiVar.C3.setVisibility(8);
                } else {
                    tiVar.f40026v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < tiVar.f40025v2.size(); i10++) {
                    ((ki.t3) tiVar.f40025v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (zhVar.f42859a == animator) {
                    zhVar.f42859a = null;
                    return;
                }
                return;
            default:
                ti tiVar2 = this.f39619c.f42862e;
                boolean z11 = this.f39618b;
                tiVar2.f40042z3 = z11;
                if (!z11) {
                    tiVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39617a) {
            case 0:
                ti tiVar = this.f39619c.f42862e;
                if (this.f39618b) {
                    tiVar.C3.setAlpha(0.0f);
                    tiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < tiVar.f40025v2.size(); i7++) {
                        ((ki.t3) tiVar.f40025v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                tiVar.f40026v3.setAlpha(0.0f);
                tiVar.f40026v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
