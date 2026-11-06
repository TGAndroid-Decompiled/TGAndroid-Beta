package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aw extends AnimatorListenerAdapter {
    public final int f44088a;
    public final float f44089b;
    public final ww f44090c;

    public aw(ww wwVar, float f10, int i7) {
        this.f44088a = i7;
        this.f44090c = wwVar;
        this.f44089b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f44088a) {
            case 0:
                super.onAnimationEnd(animator);
                ww wwVar = this.f44090c;
                wwVar.f51621v3 = null;
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
                wwVar.f51638y3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f44089b);
                wwVar.f51534e0[0].setTranslationY(0.0f);
                while (true) {
                    vw[] vwVarArr = wwVar.f51534e0;
                    if (i11 < vwVarArr.length) {
                        vw vwVar = vwVarArr[i11];
                        if (vwVar != null) {
                            vwVar.f50833a.requestLayout();
                        }
                        i11++;
                    } else {
                        wwVar.fragmentView.requestLayout();
                        lw lwVar = wwVar.X;
                        if (lwVar != null && wwVar.f51517b.f55371f) {
                            lwVar.f37557r.requestFocus();
                            org.telegram.messenger.g0.K3(wwVar.X.f37557r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ww wwVar2 = this.f44090c;
                wwVar2.f51621v3 = null;
                wwVar2.P = 0;
                wwVar2.O = true;
                if (wwVar2.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                wwVar2.f51638y3 = org.telegram.messenger.g0.L(i10 + 48) - this.f44089b;
                wwVar2.f51534e0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    vw[] vwVarArr2 = wwVar2.f51534e0;
                    if (i12 < vwVarArr2.length) {
                        vw vwVar2 = vwVarArr2[i12];
                        if (vwVar2 != null) {
                            vwVar2.f50833a.requestLayout();
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
