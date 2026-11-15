package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jh extends AnimatorListenerAdapter {
    public final int f36007a;
    public final boolean f36008b;
    public final qh f36009c;

    public jh(qh qhVar, boolean z10, int i7) {
        this.f36007a = i7;
        this.f36009c = qhVar;
        this.f36008b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f36007a) {
            case 0:
                qh qhVar = this.f36009c;
                ki kiVar = qhVar.f38655e;
                boolean z10 = this.f36008b;
                if (!z10) {
                    kiVar.C3.setVisibility(8);
                } else {
                    kiVar.f36506v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < kiVar.f36505v2.size(); i10++) {
                    ((ki.y3) kiVar.f36505v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (qhVar.f38652a == animator) {
                    qhVar.f38652a = null;
                    return;
                }
                return;
            default:
                ki kiVar2 = this.f36009c.f38655e;
                boolean z11 = this.f36008b;
                kiVar2.f36522z3 = z11;
                if (!z11) {
                    kiVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f36007a) {
            case 0:
                ki kiVar = this.f36009c.f38655e;
                if (this.f36008b) {
                    kiVar.C3.setAlpha(0.0f);
                    kiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < kiVar.f36505v2.size(); i7++) {
                        ((ki.y3) kiVar.f36505v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                kiVar.f36506v3.setAlpha(0.0f);
                kiVar.f36506v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
