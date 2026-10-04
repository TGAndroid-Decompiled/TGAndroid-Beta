package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class c50 extends AnimatorListenerAdapter {
    public final int f35280a;
    public final h60 f35281b;

    public c50(h60 h60Var, int i10) {
        this.f35280a = i10;
        this.f35281b = h60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f35280a) {
            case 0:
                h60 h60Var = this.f35281b;
                h60Var.V.setVisibility(4);
                h60Var.W.setVisibility(4);
                h60Var.U.setVisibility(4);
                return;
            case 1:
                this.f35281b.f36904h0 = null;
                return;
            default:
                h60 h60Var2 = this.f35281b;
                h60Var2.f36905h1 = null;
                Paint paint = h60Var2.f36901g1;
                if (h60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                h60Var2.f36897f1.invalidate();
                return;
        }
    }
}
