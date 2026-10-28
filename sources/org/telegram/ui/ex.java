package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ex extends AnimatorListenerAdapter {
    public final int f38969a;
    public final float f38970b;
    public final ey f38971c;

    public ex(ey eyVar, float f7, int i10) {
        this.f38969a = i10;
        this.f38971c = eyVar;
        this.f38970b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38969a) {
            case 0:
                super.onAnimationEnd(animator);
                ey eyVar = this.f38971c;
                eyVar.f39087v3 = null;
                int i12 = 0;
                eyVar.O = false;
                eyVar.Q = true;
                eyVar.R = true;
                eyVar.fragmentView.invalidate();
                if (eyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                eyVar.y3 = -(AndroidUtilities.dp(i10 + 48) - this.f38970b);
                eyVar.f38998e0[0].setTranslationY(0.0f);
                while (true) {
                    dy[] dyVarArr = eyVar.f38998e0;
                    if (i12 < dyVarArr.length) {
                        dy dyVar = dyVarArr[i12];
                        if (dyVar != null) {
                            dyVar.f38702a.requestLayout();
                        }
                        i12++;
                    } else {
                        eyVar.fragmentView.requestLayout();
                        rx rxVar = eyVar.X;
                        if (rxVar != null && eyVar.f38981b.f19326f) {
                            rxVar.f30347r.requestFocus();
                            AndroidUtilities.showKeyboard(eyVar.X.f30347r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ey eyVar2 = this.f38971c;
                eyVar2.f39087v3 = null;
                eyVar2.P = 0;
                eyVar2.O = true;
                if (eyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                eyVar2.y3 = AndroidUtilities.dp(i11 + 48) - this.f38970b;
                eyVar2.f38998e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    dy[] dyVarArr2 = eyVar2.f38998e0;
                    if (i13 < dyVarArr2.length) {
                        dy dyVar2 = dyVarArr2[i13];
                        if (dyVar2 != null) {
                            dyVar2.f38702a.requestLayout();
                        }
                        i13++;
                    } else {
                        eyVar2.E0.l(1.0f, false);
                        eyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
