package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class m40 extends AnimatorListenerAdapter {
    public final int f39438a;
    public final u50 f39439b;

    public m40(u50 u50Var, int i10) {
        this.f39438a = i10;
        this.f39439b = u50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f39438a) {
            case 0:
                u50 u50Var = this.f39439b;
                u50Var.V.setVisibility(4);
                u50Var.W.setVisibility(4);
                u50Var.U.setVisibility(4);
                return;
            case 1:
                this.f39439b.f42246h0 = null;
                return;
            default:
                u50 u50Var2 = this.f39439b;
                u50Var2.f42247h1 = null;
                Paint paint = u50Var2.f42243g1;
                if (u50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                u50Var2.f42239f1.invalidate();
                return;
        }
    }
}
