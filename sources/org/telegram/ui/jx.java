package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class jx extends AnimatorListenerAdapter {

    public final int f39532a;

    public final float f39533b;

    public final gy f39534c;

    public jx(gy gyVar, float f10, int i10) {
        this.f39532a = i10;
        this.f39534c = gyVar;
        this.f39533b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39532a) {
            case 0:
                super.onAnimationEnd(animator);
                gy gyVar = this.f39534c;
                gyVar.f38582q3 = null;
                int i10 = 0;
                gyVar.K = false;
                gyVar.M = true;
                gyVar.N = true;
                gyVar.fragmentView.invalidate();
                gyVar.f38599t3 = -(AndroidUtilities.dp((gyVar.G ? 81 : 0) + 48) - this.f39533b);
                gyVar.f38498a0[0].setTranslationY(0.0f);
                while (true) {
                    fy[] fyVarArr = gyVar.f38498a0;
                    if (i10 >= fyVarArr.length) {
                        gyVar.fragmentView.requestLayout();
                        vx vxVar = gyVar.T;
                        if (vxVar != null && gyVar.f38501b.f48498f) {
                            vxVar.f31468r.requestFocus();
                            AndroidUtilities.showKeyboard(gyVar.T.f31468r);
                            break;
                        }
                    } else {
                        fy fyVar = fyVarArr[i10];
                        if (fyVar != null) {
                            fyVar.f38225a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                gy gyVar2 = this.f39534c;
                gyVar2.f38582q3 = null;
                gyVar2.L = 0;
                gyVar2.K = true;
                gyVar2.f38599t3 = AndroidUtilities.dp((gyVar2.G ? 81 : 0) + 48) - this.f39533b;
                gyVar2.f38498a0[0].setTranslationY(0.0f);
                int i11 = 0;
                while (true) {
                    fy[] fyVarArr2 = gyVar2.f38498a0;
                    if (i11 >= fyVarArr2.length) {
                        gyVar2.A0.l(1.0f, false);
                        gyVar2.fragmentView.requestLayout();
                    } else {
                        fy fyVar2 = fyVarArr2[i11];
                        if (fyVar2 != null) {
                            fyVar2.f38225a.requestLayout();
                        }
                        i11++;
                    }
                    break;
                }
                break;
        }
    }
}
