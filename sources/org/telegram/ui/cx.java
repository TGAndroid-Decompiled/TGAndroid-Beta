package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class cx extends AnimatorListenerAdapter {
    public final int f38554a;
    public final float f38555b;
    public final cy f38556c;

    public cx(cy cyVar, float f7, int i10) {
        this.f38554a = i10;
        this.f38556c = cyVar;
        this.f38555b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38554a) {
            case 0:
                super.onAnimationEnd(animator);
                cy cyVar = this.f38556c;
                cyVar.f38672v3 = null;
                int i12 = 0;
                cyVar.O = false;
                cyVar.Q = true;
                cyVar.R = true;
                cyVar.fragmentView.invalidate();
                if (cyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                cyVar.y3 = -(AndroidUtilities.dp(i10 + 48) - this.f38555b);
                cyVar.f38583e0[0].setTranslationY(0.0f);
                while (true) {
                    ay[] ayVarArr = cyVar.f38583e0;
                    if (i12 < ayVarArr.length) {
                        ay ayVar = ayVarArr[i12];
                        if (ayVar != null) {
                            ayVar.f37910a.requestLayout();
                        }
                        i12++;
                    } else {
                        cyVar.fragmentView.requestLayout();
                        ox oxVar = cyVar.X;
                        if (oxVar != null && cyVar.f38566b.f19327f) {
                            oxVar.f30365r.requestFocus();
                            AndroidUtilities.showKeyboard(cyVar.X.f30365r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cy cyVar2 = this.f38556c;
                cyVar2.f38672v3 = null;
                cyVar2.P = 0;
                cyVar2.O = true;
                if (cyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                cyVar2.y3 = AndroidUtilities.dp(i11 + 48) - this.f38555b;
                cyVar2.f38583e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ay[] ayVarArr2 = cyVar2.f38583e0;
                    if (i13 < ayVarArr2.length) {
                        ay ayVar2 = ayVarArr2[i13];
                        if (ayVar2 != null) {
                            ayVar2.f37910a.requestLayout();
                        }
                        i13++;
                    } else {
                        cyVar2.E0.l(1.0f, false);
                        cyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
