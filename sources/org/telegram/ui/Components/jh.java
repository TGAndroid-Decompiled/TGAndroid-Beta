package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jh extends AnimatorListenerAdapter {
    public final int f35997a;
    public final boolean f35998b;
    public final qh f35999c;

    public jh(qh qhVar, boolean z10, int i7) {
        this.f35997a = i7;
        this.f35999c = qhVar;
        this.f35998b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f35997a) {
            case 0:
                qh qhVar = this.f35999c;
                ki kiVar = qhVar.f38653e;
                boolean z10 = this.f35998b;
                if (!z10) {
                    kiVar.C3.setVisibility(8);
                } else {
                    kiVar.f36494v3.setVisibility(8);
                }
                if (z10) {
                    i7 = org.telegram.messenger.g0.L(36.0f);
                } else {
                    i7 = 0;
                }
                for (int i10 = 0; i10 < kiVar.f36493v2.size(); i10++) {
                    ((ki.y3) kiVar.f36493v2.valueAt(i10)).setMeasureOffsetY(i7);
                }
                if (qhVar.f38650a == animator) {
                    qhVar.f38650a = null;
                    return;
                }
                return;
            default:
                ki kiVar2 = this.f35999c.f38653e;
                boolean z11 = this.f35998b;
                kiVar2.f36510z3 = z11;
                if (!z11) {
                    kiVar2.A3.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35997a) {
            case 0:
                ki kiVar = this.f35999c.f38653e;
                if (this.f35998b) {
                    kiVar.C3.setAlpha(0.0f);
                    kiVar.C3.setVisibility(0);
                    int L = org.telegram.messenger.g0.L(36.0f);
                    for (int i7 = 0; i7 < kiVar.f36493v2.size(); i7++) {
                        ((ki.y3) kiVar.f36493v2.valueAt(i7)).setMeasureOffsetY(L);
                    }
                    return;
                }
                kiVar.f36494v3.setAlpha(0.0f);
                kiVar.f36494v3.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
