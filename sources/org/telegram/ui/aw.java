package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aw extends AnimatorListenerAdapter {
    public final int f44103a;
    public final float f44104b;
    public final ww f44105c;

    public aw(ww wwVar, float f10, int i7) {
        this.f44103a = i7;
        this.f44105c = wwVar;
        this.f44104b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f44103a) {
            case 0:
                super.onAnimationEnd(animator);
                ww wwVar = this.f44105c;
                wwVar.f51636v3 = null;
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
                wwVar.f51653y3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f44104b);
                wwVar.f51549e0[0].setTranslationY(0.0f);
                while (true) {
                    vw[] vwVarArr = wwVar.f51549e0;
                    if (i11 < vwVarArr.length) {
                        vw vwVar = vwVarArr[i11];
                        if (vwVar != null) {
                            vwVar.f50838a.requestLayout();
                        }
                        i11++;
                    } else {
                        wwVar.fragmentView.requestLayout();
                        lw lwVar = wwVar.X;
                        if (lwVar != null && wwVar.f51532b.f55395f) {
                            lwVar.f37441r.requestFocus();
                            org.telegram.messenger.g0.K3(wwVar.X.f37441r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ww wwVar2 = this.f44105c;
                wwVar2.f51636v3 = null;
                wwVar2.P = 0;
                wwVar2.O = true;
                if (wwVar2.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                wwVar2.f51653y3 = org.telegram.messenger.g0.L(i10 + 48) - this.f44104b;
                wwVar2.f51549e0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    vw[] vwVarArr2 = wwVar2.f51549e0;
                    if (i12 < vwVarArr2.length) {
                        vw vwVar2 = vwVarArr2[i12];
                        if (vwVar2 != null) {
                            vwVar2.f50838a.requestLayout();
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
