package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gx extends AnimatorListenerAdapter {
    public final int f38614a;
    public final float f38615b;
    public final dy f38616c;

    public gx(dy dyVar, float f10, int i9) {
        this.f38614a = i9;
        this.f38616c = dyVar;
        this.f38615b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10;
        switch (this.f38614a) {
            case 0:
                super.onAnimationEnd(animator);
                dy dyVar = this.f38616c;
                dyVar.f37713q3 = null;
                int i11 = 0;
                dyVar.K = false;
                dyVar.M = true;
                dyVar.N = true;
                dyVar.fragmentView.invalidate();
                if (dyVar.G) {
                    i9 = 81;
                } else {
                    i9 = 0;
                }
                dyVar.f37730t3 = -(AndroidUtilities.dp(i9 + 48) - this.f38615b);
                dyVar.f37629a0[0].setTranslationY(0.0f);
                while (true) {
                    cy[] cyVarArr = dyVar.f37629a0;
                    if (i11 < cyVarArr.length) {
                        cy cyVar = cyVarArr[i11];
                        if (cyVar != null) {
                            cyVar.f37350a.requestLayout();
                        }
                        i11++;
                    } else {
                        dyVar.fragmentView.requestLayout();
                        sx sxVar = dyVar.T;
                        if (sxVar != null && dyVar.f37632b.f47776f) {
                            sxVar.f30664r.requestFocus();
                            AndroidUtilities.showKeyboard(dyVar.T.f30664r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                dy dyVar2 = this.f38616c;
                dyVar2.f37713q3 = null;
                dyVar2.L = 0;
                dyVar2.K = true;
                if (dyVar2.G) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                dyVar2.f37730t3 = AndroidUtilities.dp(i10 + 48) - this.f38615b;
                dyVar2.f37629a0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    cy[] cyVarArr2 = dyVar2.f37629a0;
                    if (i12 < cyVarArr2.length) {
                        cy cyVar2 = cyVarArr2[i12];
                        if (cyVar2 != null) {
                            cyVar2.f37350a.requestLayout();
                        }
                        i12++;
                    } else {
                        dyVar2.A0.l(1.0f, false);
                        dyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
