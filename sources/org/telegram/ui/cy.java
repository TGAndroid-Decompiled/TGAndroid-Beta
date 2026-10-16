package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class cy extends AnimatorListenerAdapter {
    public final int f34806a;
    public final float f34807b;
    public final yy f34808c;

    public cy(yy yyVar, float f7, int i10) {
        this.f34806a = i10;
        this.f34808c = yyVar;
        this.f34807b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f34806a) {
            case 0:
                super.onAnimationEnd(animator);
                yy yyVar = this.f34808c;
                yyVar.f42093v3 = null;
                int i12 = 0;
                yyVar.O = false;
                yyVar.Q = true;
                yyVar.R = true;
                yyVar.fragmentView.invalidate();
                if (yyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                yyVar.y3 = -(AndroidUtilities.dp(i10 + 48) - this.f34807b);
                yyVar.f42004e0[0].setTranslationY(0.0f);
                while (true) {
                    xy[] xyVarArr = yyVar.f42004e0;
                    if (i12 < xyVarArr.length) {
                        xy xyVar = xyVarArr[i12];
                        if (xyVar != null) {
                            xyVar.f41679a.requestLayout();
                        }
                        i12++;
                    } else {
                        yyVar.fragmentView.requestLayout();
                        oy oyVar = yyVar.X;
                        if (oyVar != null && yyVar.f41987b.f16004f) {
                            oyVar.f27510r.requestFocus();
                            AndroidUtilities.showKeyboard(yyVar.X.f27510r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                yy yyVar2 = this.f34808c;
                yyVar2.f42093v3 = null;
                yyVar2.P = 0;
                yyVar2.O = true;
                if (yyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                yyVar2.y3 = AndroidUtilities.dp(i11 + 48) - this.f34807b;
                yyVar2.f42004e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    xy[] xyVarArr2 = yyVar2.f42004e0;
                    if (i13 < xyVarArr2.length) {
                        xy xyVar2 = xyVarArr2[i13];
                        if (xyVar2 != null) {
                            xyVar2.f41679a.requestLayout();
                        }
                        i13++;
                    } else {
                        yyVar2.E0.l(1.0f, false);
                        yyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
