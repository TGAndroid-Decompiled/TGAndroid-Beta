package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ew extends AnimatorListenerAdapter {
    public final int f47635a;
    public final float f47636b;
    public final bx f47637c;

    public ew(bx bxVar, float f10, int i7) {
        this.f47635a = i7;
        this.f47637c = bxVar;
        this.f47636b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f47635a) {
            case 0:
                super.onAnimationEnd(animator);
                bx bxVar = this.f47637c;
                bxVar.f46642x3 = null;
                int i11 = 0;
                bxVar.P = false;
                bxVar.R = true;
                bxVar.S = true;
                bxVar.fragmentView.invalidate();
                if (bxVar.L) {
                    i7 = 81;
                } else {
                    i7 = 0;
                }
                bxVar.A3 = -(org.telegram.messenger.g0.L(i7 + 48) - this.f47636b);
                bxVar.f46549f0[0].setTranslationY(0.0f);
                while (true) {
                    ax[] axVarArr = bxVar.f46549f0;
                    if (i11 < axVarArr.length) {
                        ax axVar = axVarArr[i11];
                        if (axVar != null) {
                            axVar.f45822a.requestLayout();
                        }
                        i11++;
                    } else {
                        bxVar.fragmentView.requestLayout();
                        pw pwVar = bxVar.Y;
                        if (pwVar != null && bxVar.f46526b.f57780f) {
                            pwVar.f33883r.requestFocus();
                            org.telegram.messenger.g0.I3(bxVar.Y.f33883r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                bx bxVar2 = this.f47637c;
                bxVar2.f46642x3 = null;
                bxVar2.Q = 0;
                bxVar2.P = true;
                if (bxVar2.L) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                bxVar2.A3 = org.telegram.messenger.g0.L(i10 + 48) - this.f47636b;
                bxVar2.f46549f0[0].setTranslationY(0.0f);
                int i12 = 0;
                while (true) {
                    ax[] axVarArr2 = bxVar2.f46549f0;
                    if (i12 < axVarArr2.length) {
                        ax axVar2 = axVarArr2[i12];
                        if (axVar2 != null) {
                            axVar2.f45822a.requestLayout();
                        }
                        i12++;
                    } else {
                        bxVar2.F0.l(false, 1.0f);
                        bxVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
