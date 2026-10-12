package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class cy extends AnimatorListenerAdapter {
    public final int f35086a;
    public final float f35087b;
    public final yy f35088c;

    public cy(yy yyVar, float f7, int i10) {
        this.f35086a = i10;
        this.f35088c = yyVar;
        this.f35087b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f35086a) {
            case 0:
                super.onAnimationEnd(animator);
                yy yyVar = this.f35088c;
                yyVar.f42409u3 = null;
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
                yyVar.f42425x3 = -(AndroidUtilities.dp(i10 + 48) - this.f35087b);
                yyVar.f42325e0[0].setTranslationY(0.0f);
                while (true) {
                    xy[] xyVarArr = yyVar.f42325e0;
                    if (i12 < xyVarArr.length) {
                        xy xyVar = xyVarArr[i12];
                        if (xyVar != null) {
                            xyVar.f41980a.requestLayout();
                        }
                        i12++;
                    } else {
                        yyVar.fragmentView.requestLayout();
                        oy oyVar = yyVar.X;
                        if (oyVar != null && yyVar.f42308b.f16293f) {
                            oyVar.f27815r.requestFocus();
                            AndroidUtilities.showKeyboard(yyVar.X.f27815r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                yy yyVar2 = this.f35088c;
                yyVar2.f42409u3 = null;
                yyVar2.P = 0;
                yyVar2.O = true;
                if (yyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                yyVar2.f42425x3 = AndroidUtilities.dp(i11 + 48) - this.f35087b;
                yyVar2.f42325e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    xy[] xyVarArr2 = yyVar2.f42325e0;
                    if (i13 < xyVarArr2.length) {
                        xy xyVar2 = xyVarArr2[i13];
                        if (xyVar2 != null) {
                            xyVar2.f41980a.requestLayout();
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
