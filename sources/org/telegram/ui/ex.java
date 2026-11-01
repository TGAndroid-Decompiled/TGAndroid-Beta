package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ex extends AnimatorListenerAdapter {
    public final int f36919a;
    public final float f36920b;
    public final zx f36921c;

    public ex(zx zxVar, float f7, int i10) {
        this.f36919a = i10;
        this.f36921c = zxVar;
        this.f36920b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f36919a) {
            case 0:
                super.onAnimationEnd(animator);
                zx zxVar = this.f36921c;
                zxVar.f44226v3 = null;
                int i12 = 0;
                zxVar.O = false;
                zxVar.Q = true;
                zxVar.R = true;
                zxVar.fragmentView.invalidate();
                if (zxVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                zxVar.y3 = -(org.telegram.messenger.i0.L(i10 + 48) - this.f36920b);
                zxVar.f44137e0[0].setTranslationY(0.0f);
                while (true) {
                    yx[] yxVarArr = zxVar.f44137e0;
                    if (i12 < yxVarArr.length) {
                        yx yxVar = yxVarArr[i12];
                        if (yxVar != null) {
                            yxVar.f43733a.requestLayout();
                        }
                        i12++;
                    } else {
                        zxVar.fragmentView.requestLayout();
                        ox oxVar = zxVar.X;
                        if (oxVar != null && zxVar.f44120b.f7022f) {
                            oxVar.f26635r.requestFocus();
                            org.telegram.messenger.i0.J3(zxVar.X.f26635r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                zx zxVar2 = this.f36921c;
                zxVar2.f44226v3 = null;
                zxVar2.P = 0;
                zxVar2.O = true;
                if (zxVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                zxVar2.y3 = org.telegram.messenger.i0.L(i11 + 48) - this.f36920b;
                zxVar2.f44137e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    yx[] yxVarArr2 = zxVar2.f44137e0;
                    if (i13 < yxVarArr2.length) {
                        yx yxVar2 = yxVarArr2[i13];
                        if (yxVar2 != null) {
                            yxVar2.f43733a.requestLayout();
                        }
                        i13++;
                    } else {
                        zxVar2.E0.l(false, 1.0f);
                        zxVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
