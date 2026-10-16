package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class g50 extends AnimatorListenerAdapter {
    public final int f36071a;
    public final n60 f36072b;

    public g50(n60 n60Var, int i10) {
        this.f36071a = i10;
        this.f36072b = n60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f36071a) {
            case 0:
                n60 n60Var = this.f36072b;
                n60Var.V.setVisibility(4);
                n60Var.W.setVisibility(4);
                n60Var.U.setVisibility(4);
                return;
            case 1:
                this.f36072b.f38186h0 = null;
                return;
            default:
                n60 n60Var2 = this.f36072b;
                n60Var2.f38187h1 = null;
                Paint paint = n60Var2.f38183g1;
                if (n60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                n60Var2.f38179f1.invalidate();
                return;
        }
    }
}
