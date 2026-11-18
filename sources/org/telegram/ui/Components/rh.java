package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rh extends AnimatorListenerAdapter {
    public final int f39143a;
    public final boolean f39144b;
    public final yh f39145c;

    public rh(yh yhVar, boolean z10, int i7) {
        this.f39143a = i7;
        this.f39145c = yhVar;
        this.f39144b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f39143a) {
            case 0:
                yh yhVar = this.f39145c;
                si siVar = yhVar.f42500e;
                boolean z10 = this.f39144b;
                if (!z10) {
                    siVar.C3.setVisibility(8);
                } else {
                    siVar.f39729v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < siVar.f39728v2.size(); i10++) {
                    ((ki.t3) siVar.f39728v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (yhVar.f42497a == animator) {
                    yhVar.f42497a = null;
                    return;
                }
                return;
            default:
                si siVar2 = this.f39145c.f42500e;
                boolean z11 = this.f39144b;
                siVar2.f39745z3 = z11;
                if (!z11) {
                    siVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39143a) {
            case 0:
                si siVar = this.f39145c.f42500e;
                if (this.f39144b) {
                    siVar.C3.setAlpha(0.0f);
                    siVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < siVar.f39728v2.size(); i7++) {
                        ((ki.t3) siVar.f39728v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                siVar.f39729v3.setAlpha(0.0f);
                siVar.f39729v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
