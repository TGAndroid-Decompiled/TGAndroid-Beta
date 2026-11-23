package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fw extends AnimatorListenerAdapter {
    public final int f47867a;
    public final float f47868b;
    public final cx f47869c;

    public fw(cx cxVar, float f10, int i7) {
        this.f47867a = i7;
        this.f47869c = cxVar;
        this.f47868b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f47867a) {
            case 0:
                super.onAnimationEnd(animator);
                cx cxVar = this.f47869c;
                cxVar.f46815x3 = null;
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
                cxVar.A3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f47868b);
                cxVar.f46722f0[0].setTranslationY(0.0f);
                while (true) {
                    bx[] bxVarArr = cxVar.f46722f0;
                    if (i11 < bxVarArr.length) {
                        bx bxVar = bxVarArr[i11];
                        if (bxVar != null) {
                            bxVar.f46325a.requestLayout();
                        }
                        i11++;
                    } else {
                        cxVar.fragmentView.requestLayout();
                        qw qwVar = cxVar.Y;
                        if (qwVar != null && cxVar.f46699b.f57701f) {
                            qwVar.f34642r.requestFocus();
                            org.telegram.messenger.g0.I3(cxVar.Y.f34642r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cx cxVar2 = this.f47869c;
                cxVar2.f46815x3 = null;
                cxVar2.Q = 0;
                cxVar2.P = true;
                if (cxVar2.L) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                cxVar2.A3 = org.telegram.messenger.g0.L(i10 + 48) - this.f47868b;
                cxVar2.f46722f0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    bx[] bxVarArr2 = cxVar2.f46722f0;
                    if (i12 < bxVarArr2.length) {
                        bx bxVar2 = bxVarArr2[i12];
                        if (bxVar2 != null) {
                            bxVar2.f46325a.requestLayout();
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
