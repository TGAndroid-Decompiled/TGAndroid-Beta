package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cw extends AnimatorListenerAdapter {
    public final int f46234a;
    public final float f46235b;
    public final yw f46236c;

    public cw(yw ywVar, float f10, int i7) {
        this.f46234a = i7;
        this.f46236c = ywVar;
        this.f46235b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f46234a) {
            case 0:
                super.onAnimationEnd(animator);
                yw ywVar = this.f46236c;
                ywVar.f53731x3 = null;
                int i11 = 0;
                ywVar.P = false;
                ywVar.R = true;
                ywVar.S = true;
                ywVar.fragmentView.invalidate();
                if (ywVar.L) {
                    i7 = 81;
                } else {
                    i7 = 0;
                }
                ywVar.A3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f46235b);
                ywVar.f53638f0[0].setTranslationY(0.0f);
                while (true) {
                    xw[] xwVarArr = ywVar.f53638f0;
                    if (i11 < xwVarArr.length) {
                        xw xwVar = xwVarArr[i11];
                        if (xwVar != null) {
                            xwVar.f53335a.requestLayout();
                        }
                        i11++;
                    } else {
                        ywVar.fragmentView.requestLayout();
                        nw nwVar = ywVar.Y;
                        if (nwVar != null && ywVar.f53615b.f57086f) {
                            nwVar.f40202r.requestFocus();
                            org.telegram.messenger.g0.J3(ywVar.Y.f40202r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                yw ywVar2 = this.f46236c;
                ywVar2.f53731x3 = null;
                ywVar2.Q = 0;
                ywVar2.P = true;
                if (ywVar2.L) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                ywVar2.A3 = org.telegram.messenger.g0.L(i10 + 48) - this.f46235b;
                ywVar2.f53638f0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    xw[] xwVarArr2 = ywVar2.f53638f0;
                    if (i12 < xwVarArr2.length) {
                        xw xwVar2 = xwVarArr2[i12];
                        if (xwVar2 != null) {
                            xwVar2.f53335a.requestLayout();
                        }
                        i12++;
                    } else {
                        ywVar2.F0.l(false, 1.0f);
                        ywVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
