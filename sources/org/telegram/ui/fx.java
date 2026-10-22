package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fx extends AnimatorListenerAdapter {
    public final int f37138a;
    public final float f37139b;
    public final cy f37140c;

    public fx(cy cyVar, float f7, int i10) {
        this.f37138a = i10;
        this.f37140c = cyVar;
        this.f37139b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f37138a) {
            case 0:
                super.onAnimationEnd(animator);
                cy cyVar = this.f37140c;
                cyVar.f36184v3 = null;
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
                cyVar.y3 = -(AndroidUtilities.dp(i10 + 48) - this.f37139b);
                cyVar.f36095e0[0].setTranslationY(0.0f);
                while (true) {
                    ay[] ayVarArr = cyVar.f36095e0;
                    if (i12 < ayVarArr.length) {
                        ay ayVar = ayVarArr[i12];
                        if (ayVar != null) {
                            ayVar.f35446a.requestLayout();
                        }
                        i12++;
                    } else {
                        cyVar.fragmentView.requestLayout();
                        rx rxVar = cyVar.X;
                        if (rxVar != null && cyVar.f36078b.f17384f) {
                            rxVar.f27729r.requestFocus();
                            AndroidUtilities.showKeyboard(cyVar.X.f27729r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cy cyVar2 = this.f37140c;
                cyVar2.f36184v3 = null;
                cyVar2.P = 0;
                cyVar2.O = true;
                if (cyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                cyVar2.y3 = AndroidUtilities.dp(i11 + 48) - this.f37139b;
                cyVar2.f36095e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ay[] ayVarArr2 = cyVar2.f36095e0;
                    if (i13 < ayVarArr2.length) {
                        ay ayVar2 = ayVarArr2[i13];
                        if (ayVar2 != null) {
                            ayVar2.f35446a.requestLayout();
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
