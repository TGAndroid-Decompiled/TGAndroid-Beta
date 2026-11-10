package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dw extends AnimatorListenerAdapter {
    public final int f45064a;
    public final float f45065b;
    public final zw f45066c;

    public dw(zw zwVar, float f10, int i7) {
        this.f45064a = i7;
        this.f45066c = zwVar;
        this.f45065b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f45064a) {
            case 0:
                super.onAnimationEnd(animator);
                zw zwVar = this.f45066c;
                zwVar.f52670w3 = null;
                int i11 = 0;
                zwVar.O = false;
                zwVar.Q = true;
                zwVar.R = true;
                zwVar.fragmentView.invalidate();
                if (zwVar.K) {
                    i7 = 81;
                } else {
                    i7 = 0;
                }
                zwVar.f52686z3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f45065b);
                zwVar.f52577e0[0].setTranslationY(0.0f);
                while (true) {
                    yw[] ywVarArr = zwVar.f52577e0;
                    if (i11 < ywVarArr.length) {
                        yw ywVar = ywVarArr[i11];
                        if (ywVar != null) {
                            ywVar.f52125a.requestLayout();
                        }
                        i11++;
                    } else {
                        zwVar.fragmentView.requestLayout();
                        ow owVar = zwVar.X;
                        if (owVar != null && zwVar.f52560b.f55499f) {
                            owVar.f37446r.requestFocus();
                            org.telegram.messenger.g0.K3(zwVar.X.f37446r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                zw zwVar2 = this.f45066c;
                zwVar2.f52670w3 = null;
                zwVar2.P = 0;
                zwVar2.O = true;
                if (zwVar2.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                zwVar2.f52686z3 = org.telegram.messenger.g0.L(i10 + 48) - this.f45065b;
                zwVar2.f52577e0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    yw[] ywVarArr2 = zwVar2.f52577e0;
                    if (i12 < ywVarArr2.length) {
                        yw ywVar2 = ywVarArr2[i12];
                        if (ywVar2 != null) {
                            ywVar2.f52125a.requestLayout();
                        }
                        i12++;
                    } else {
                        zwVar2.E0.l(false, 1.0f);
                        zwVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
