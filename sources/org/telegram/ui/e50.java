package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class e50 extends AnimatorListenerAdapter {
    public final int f33285a;
    public final k60 f33286b;

    public e50(k60 k60Var, int i10) {
        this.f33285a = i10;
        this.f33286b = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f33285a) {
            case 0:
                k60 k60Var = this.f33286b;
                k60Var.V.setVisibility(4);
                k60Var.W.setVisibility(4);
                k60Var.U.setVisibility(4);
                return;
            case 1:
                this.f33286b.f35046h0 = null;
                return;
            default:
                k60 k60Var2 = this.f33286b;
                k60Var2.f35047h1 = null;
                Paint paint = k60Var2.f35043g1;
                if (k60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                k60Var2.f35039f1.invalidate();
                return;
        }
    }
}
