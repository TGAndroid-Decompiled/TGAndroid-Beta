package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw extends AnimatorListenerAdapter {
    public final int f44766a;
    public final float f44767b;
    public final yw f44768c;

    public cw(yw ywVar, float f10, int i7) {
        this.f44766a = i7;
        this.f44768c = ywVar;
        this.f44767b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f44766a) {
            case 0:
                super.onAnimationEnd(animator);
                yw ywVar = this.f44768c;
                ywVar.f52324w3 = null;
                int i11 = 0;
                ywVar.O = false;
                ywVar.Q = true;
                ywVar.R = true;
                ywVar.fragmentView.invalidate();
                if (ywVar.K) {
                    i7 = 81;
                } else {
                    i7 = 0;
                }
                ywVar.f52340z3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f44767b);
                ywVar.f52231e0[0].setTranslationY(0.0f);
                while (true) {
                    xw[] xwVarArr = ywVar.f52231e0;
                    if (i11 < xwVarArr.length) {
                        xw xwVar = xwVarArr[i11];
                        if (xwVar != null) {
                            xwVar.f51772a.requestLayout();
                        }
                        i11++;
                    } else {
                        ywVar.fragmentView.requestLayout();
                        nw nwVar = ywVar.X;
                        if (nwVar != null && ywVar.f52214b.f55500f) {
                            nwVar.f37857r.requestFocus();
                            org.telegram.messenger.g0.K3(ywVar.X.f37857r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                yw ywVar2 = this.f44768c;
                ywVar2.f52324w3 = null;
                ywVar2.P = 0;
                ywVar2.O = true;
                if (ywVar2.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                ywVar2.f52340z3 = org.telegram.messenger.g0.L(i10 + 48) - this.f44767b;
                ywVar2.f52231e0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    xw[] xwVarArr2 = ywVar2.f52231e0;
                    if (i12 < xwVarArr2.length) {
                        xw xwVar2 = xwVarArr2[i12];
                        if (xwVar2 != null) {
                            xwVar2.f51772a.requestLayout();
                        }
                        i12++;
                    } else {
                        ywVar2.E0.l(false, 1.0f);
                        ywVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
