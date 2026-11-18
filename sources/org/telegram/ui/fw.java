package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fw extends AnimatorListenerAdapter {
    public final int f47832a;
    public final float f47833b;
    public final cx f47834c;

    public fw(cx cxVar, float f10, int i7) {
        this.f47832a = i7;
        this.f47834c = cxVar;
        this.f47833b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f47832a) {
            case 0:
                super.onAnimationEnd(animator);
                cx cxVar = this.f47834c;
                cxVar.f46776x3 = null;
                int i11 = 0;
                cxVar.P = false;
                cxVar.R = true;
                cxVar.S = true;
                cxVar.fragmentView.invalidate();
                if (cxVar.L) {
                    i7 = 81;
                } else {
                    i7 = 0;
                }
                cxVar.A3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f47833b);
                cxVar.f46683f0[0].setTranslationY(0.0f);
                while (true) {
                    bx[] bxVarArr = cxVar.f46683f0;
                    if (i11 < bxVarArr.length) {
                        bx bxVar = bxVarArr[i11];
                        if (bxVar != null) {
                            bxVar.f46307a.requestLayout();
                        }
                        i11++;
                    } else {
                        cxVar.fragmentView.requestLayout();
                        qw qwVar = cxVar.Y;
                        if (qwVar != null && cxVar.f46660b.f57658f) {
                            qwVar.f33845r.requestFocus();
                            org.telegram.messenger.g0.I3(cxVar.Y.f33845r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cx cxVar2 = this.f47834c;
                cxVar2.f46776x3 = null;
                cxVar2.Q = 0;
                cxVar2.P = true;
                if (cxVar2.L) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                cxVar2.A3 = org.telegram.messenger.g0.L(i10 + 48) - this.f47833b;
                cxVar2.f46683f0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    bx[] bxVarArr2 = cxVar2.f46683f0;
                    if (i12 < bxVarArr2.length) {
                        bx bxVar2 = bxVarArr2[i12];
                        if (bxVar2 != null) {
                            bxVar2.f46307a.requestLayout();
                        }
                        i12++;
                    } else {
                        cxVar2.F0.l(false, 1.0f);
                        cxVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
