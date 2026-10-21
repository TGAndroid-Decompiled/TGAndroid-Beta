package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fx extends AnimatorListenerAdapter {
    public final int f37135a;
    public final float f37136b;
    public final cy f37137c;

    public fx(cy cyVar, float f7, int i10) {
        this.f37135a = i10;
        this.f37137c = cyVar;
        this.f37136b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f37135a) {
            case 0:
                super.onAnimationEnd(animator);
                cy cyVar = this.f37137c;
                cyVar.f36181v3 = null;
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
                cyVar.y3 = -(AndroidUtilities.dp(i10 + 48) - this.f37136b);
                cyVar.f36092e0[0].setTranslationY(0.0f);
                while (true) {
                    ay[] ayVarArr = cyVar.f36092e0;
                    if (i12 < ayVarArr.length) {
                        ay ayVar = ayVarArr[i12];
                        if (ayVar != null) {
                            ayVar.f35443a.requestLayout();
                        }
                        i12++;
                    } else {
                        cyVar.fragmentView.requestLayout();
                        rx rxVar = cyVar.X;
                        if (rxVar != null && cyVar.f36075b.f17384f) {
                            rxVar.f27726r.requestFocus();
                            AndroidUtilities.showKeyboard(cyVar.X.f27726r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cy cyVar2 = this.f37137c;
                cyVar2.f36181v3 = null;
                cyVar2.P = 0;
                cyVar2.O = true;
                if (cyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                cyVar2.y3 = AndroidUtilities.dp(i11 + 48) - this.f37136b;
                cyVar2.f36092e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ay[] ayVarArr2 = cyVar2.f36092e0;
                    if (i13 < ayVarArr2.length) {
                        ay ayVar2 = ayVarArr2[i13];
                        if (ayVar2 != null) {
                            ayVar2.f35443a.requestLayout();
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
