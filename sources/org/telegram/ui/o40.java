package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class o40 extends AnimatorListenerAdapter {
    public final int f42085a;
    public final v50 f42086b;

    public o40(v50 v50Var, int i10) {
        this.f42085a = i10;
        this.f42086b = v50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f42085a) {
            case 0:
                v50 v50Var = this.f42086b;
                v50Var.V.setVisibility(4);
                v50Var.W.setVisibility(4);
                v50Var.U.setVisibility(4);
                return;
            case 1:
                this.f42086b.f44636h0 = null;
                return;
            default:
                v50 v50Var2 = this.f42086b;
                v50Var2.f44637h1 = null;
                Paint paint = v50Var2.f44633g1;
                if (v50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                v50Var2.f44629f1.invalidate();
                return;
        }
    }
}
