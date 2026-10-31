package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fx extends AnimatorListenerAdapter {
    public final int f37357a;
    public final float f37358b;
    public final ay f37359c;

    public fx(ay ayVar, float f7, int i10) {
        this.f37357a = i10;
        this.f37359c = ayVar;
        this.f37358b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f37357a) {
            case 0:
                super.onAnimationEnd(animator);
                ay ayVar = this.f37359c;
                ayVar.f35883v3 = null;
                int i12 = 0;
                ayVar.O = false;
                ayVar.Q = true;
                ayVar.R = true;
                ayVar.fragmentView.invalidate();
                if (ayVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                ayVar.y3 = -(org.telegram.messenger.i0.L(i10 + 48) - this.f37358b);
                ayVar.f35794e0[0].setTranslationY(0.0f);
                while (true) {
                    zx[] zxVarArr = ayVar.f35794e0;
                    if (i12 < zxVarArr.length) {
                        zx zxVar = zxVarArr[i12];
                        if (zxVar != null) {
                            zxVar.f44239a.requestLayout();
                        }
                        i12++;
                    } else {
                        ayVar.fragmentView.requestLayout();
                        px pxVar = ayVar.X;
                        if (pxVar != null && ayVar.f35777b.f7021f) {
                            pxVar.f26588r.requestFocus();
                            org.telegram.messenger.i0.J3(ayVar.X.f26588r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ay ayVar2 = this.f37359c;
                ayVar2.f35883v3 = null;
                ayVar2.P = 0;
                ayVar2.O = true;
                if (ayVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                ayVar2.y3 = org.telegram.messenger.i0.L(i11 + 48) - this.f37358b;
                ayVar2.f35794e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    zx[] zxVarArr2 = ayVar2.f35794e0;
                    if (i13 < zxVarArr2.length) {
                        zx zxVar2 = zxVarArr2[i13];
                        if (zxVar2 != null) {
                            zxVar2.f44239a.requestLayout();
                        }
                        i13++;
                    } else {
                        ayVar2.E0.l(false, 1.0f);
                        ayVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
