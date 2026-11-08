package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aw extends AnimatorListenerAdapter {
    public final int f44109a;
    public final float f44110b;
    public final ww f44111c;

    public aw(ww wwVar, float f10, int i7) {
        this.f44109a = i7;
        this.f44111c = wwVar;
        this.f44110b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f44109a) {
            case 0:
                super.onAnimationEnd(animator);
                ww wwVar = this.f44111c;
                wwVar.f51643v3 = null;
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
                wwVar.f51660y3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f44110b);
                wwVar.f51556e0[0].setTranslationY(0.0f);
                while (true) {
                    vw[] vwVarArr = wwVar.f51556e0;
                    if (i11 < vwVarArr.length) {
                        vw vwVar = vwVarArr[i11];
                        if (vwVar != null) {
                            vwVar.f50782a.requestLayout();
                        }
                        i11++;
                    } else {
                        wwVar.fragmentView.requestLayout();
                        lw lwVar = wwVar.X;
                        if (lwVar != null && wwVar.f51539b.f55487f) {
                            lwVar.f37824r.requestFocus();
                            org.telegram.messenger.g0.K3(wwVar.X.f37824r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ww wwVar2 = this.f44111c;
                wwVar2.f51643v3 = null;
                wwVar2.P = 0;
                wwVar2.O = true;
                if (wwVar2.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                wwVar2.f51660y3 = org.telegram.messenger.g0.L(i10 + 48) - this.f44110b;
                wwVar2.f51556e0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    vw[] vwVarArr2 = wwVar2.f51556e0;
                    if (i12 < vwVarArr2.length) {
                        vw vwVar2 = vwVarArr2[i12];
                        if (vwVar2 != null) {
                            vwVar2.f50782a.requestLayout();
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
