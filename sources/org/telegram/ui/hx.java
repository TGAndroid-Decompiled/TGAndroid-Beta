package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hx extends AnimatorListenerAdapter {
    public final int f37977a;
    public final float f37978b;
    public final ey f37979c;

    public hx(ey eyVar, float f7, int i10) {
        this.f37977a = i10;
        this.f37979c = eyVar;
        this.f37978b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f37977a) {
            case 0:
                super.onAnimationEnd(animator);
                ey eyVar = this.f37979c;
                eyVar.f37148v3 = null;
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
                eyVar.y3 = -(AndroidUtilities.dp(i10 + 48) - this.f37978b);
                eyVar.f37059e0[0].setTranslationY(0.0f);
                while (true) {
                    dy[] dyVarArr = eyVar.f37059e0;
                    if (i12 < dyVarArr.length) {
                        dy dyVar = dyVarArr[i12];
                        if (dyVar != null) {
                            dyVar.f36750a.requestLayout();
                        }
                        i12++;
                    } else {
                        eyVar.fragmentView.requestLayout();
                        tx txVar = eyVar.X;
                        if (txVar != null && eyVar.f37042b.f17447f) {
                            txVar.f27836r.requestFocus();
                            AndroidUtilities.showKeyboard(eyVar.X.f27836r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ey eyVar2 = this.f37979c;
                eyVar2.f37148v3 = null;
                eyVar2.P = 0;
                eyVar2.O = true;
                if (eyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                eyVar2.y3 = AndroidUtilities.dp(i11 + 48) - this.f37978b;
                eyVar2.f37059e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    dy[] dyVarArr2 = eyVar2.f37059e0;
                    if (i13 < dyVarArr2.length) {
                        dy dyVar2 = dyVarArr2[i13];
                        if (dyVar2 != null) {
                            dyVar2.f36750a.requestLayout();
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
