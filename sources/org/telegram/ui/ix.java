package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ix extends AnimatorListenerAdapter {
    public final int f39360a;
    public final float f39361b;
    public final fy f39362c;

    public ix(fy fyVar, float f9, int i10) {
        this.f39360a = i10;
        this.f39362c = fyVar;
        this.f39361b = f9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f39360a) {
            case 0:
                super.onAnimationEnd(animator);
                fy fyVar = this.f39362c;
                fyVar.f38340q3 = null;
                int i12 = 0;
                fyVar.K = false;
                fyVar.M = true;
                fyVar.N = true;
                fyVar.fragmentView.invalidate();
                if (fyVar.G) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                fyVar.f38357t3 = -(AndroidUtilities.dp(i10 + 48) - this.f39361b);
                fyVar.f38256a0[0].setTranslationY(0.0f);
                while (true) {
                    ey[] eyVarArr = fyVar.f38256a0;
                    if (i12 < eyVarArr.length) {
                        ey eyVar = eyVarArr[i12];
                        if (eyVar != null) {
                            eyVar.f37921a.requestLayout();
                        }
                        i12++;
                    } else {
                        fyVar.fragmentView.requestLayout();
                        ux uxVar = fyVar.T;
                        if (uxVar != null && fyVar.f38260b.f49506f) {
                            uxVar.f34546r.requestFocus();
                            AndroidUtilities.showKeyboard(fyVar.T.f34546r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                fy fyVar2 = this.f39362c;
                fyVar2.f38340q3 = null;
                fyVar2.L = 0;
                fyVar2.K = true;
                if (fyVar2.G) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                fyVar2.f38357t3 = AndroidUtilities.dp(i11 + 48) - this.f39361b;
                fyVar2.f38256a0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ey[] eyVarArr2 = fyVar2.f38256a0;
                    if (i13 < eyVarArr2.length) {
                        ey eyVar2 = eyVarArr2[i13];
                        if (eyVar2 != null) {
                            eyVar2.f37921a.requestLayout();
                        }
                        i13++;
                    } else {
                        fyVar2.A0.l(1.0f, false);
                        fyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
