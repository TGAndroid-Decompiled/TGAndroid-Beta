package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class a50 extends AnimatorListenerAdapter {
    public final int f35920a;
    public final g60 f35921b;

    public a50(g60 g60Var, int i10) {
        this.f35920a = i10;
        this.f35921b = g60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f35920a) {
            case 0:
                g60 g60Var = this.f35921b;
                g60Var.V.setVisibility(4);
                g60Var.W.setVisibility(4);
                g60Var.U.setVisibility(4);
                return;
            case 1:
                this.f35921b.f37933h0 = null;
                return;
            default:
                g60 g60Var2 = this.f35921b;
                g60Var2.f37934h1 = null;
                Paint paint = g60Var2.f37930g1;
                if (g60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                g60Var2.f37926f1.invalidate();
                return;
        }
    }
}
