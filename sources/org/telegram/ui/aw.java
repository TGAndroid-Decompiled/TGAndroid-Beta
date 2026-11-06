package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aw extends AnimatorListenerAdapter {
    public final int f44104a;
    public final float f44105b;
    public final ww f44106c;

    public aw(ww wwVar, float f10, int i7) {
        this.f44104a = i7;
        this.f44106c = wwVar;
        this.f44105b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f44104a) {
            case 0:
                super.onAnimationEnd(animator);
                ww wwVar = this.f44106c;
                wwVar.f51638v3 = null;
                int i11 = 0;
                wwVar.O = false;
                wwVar.Q = true;
                wwVar.R = true;
                wwVar.fragmentView.invalidate();
                if (wwVar.K) {
                    i7 = 81;
                } else {
                    i7 = 0;
                }
                wwVar.f51655y3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f44105b);
                wwVar.f51551e0[0].setTranslationY(0.0f);
                while (true) {
                    vw[] vwVarArr = wwVar.f51551e0;
                    if (i11 < vwVarArr.length) {
                        vw vwVar = vwVarArr[i11];
                        if (vwVar != null) {
                            vwVar.f50839a.requestLayout();
                        }
                        i11++;
                    } else {
                        wwVar.fragmentView.requestLayout();
                        lw lwVar = wwVar.X;
                        if (lwVar != null && wwVar.f51534b.f55396f) {
                            lwVar.f37447r.requestFocus();
                            org.telegram.messenger.g0.K3(wwVar.X.f37447r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ww wwVar2 = this.f44106c;
                wwVar2.f51638v3 = null;
                wwVar2.P = 0;
                wwVar2.O = true;
                if (wwVar2.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                wwVar2.f51655y3 = org.telegram.messenger.g0.L(i10 + 48) - this.f44105b;
                wwVar2.f51551e0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    vw[] vwVarArr2 = wwVar2.f51551e0;
                    if (i12 < vwVarArr2.length) {
                        vw vwVar2 = vwVarArr2[i12];
                        if (vwVar2 != null) {
                            vwVar2.f50839a.requestLayout();
                        }
                        i12++;
                    } else {
                        wwVar2.E0.l(false, 1.0f);
                        wwVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
