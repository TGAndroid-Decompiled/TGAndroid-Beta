package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class e50 extends AnimatorListenerAdapter {
    public final int f33281a;
    public final k60 f33282b;

    public e50(k60 k60Var, int i10) {
        this.f33281a = i10;
        this.f33282b = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f33281a) {
            case 0:
                k60 k60Var = this.f33282b;
                k60Var.V.setVisibility(4);
                k60Var.W.setVisibility(4);
                k60Var.U.setVisibility(4);
                return;
            case 1:
                this.f33282b.f35041h0 = null;
                return;
            default:
                k60 k60Var2 = this.f33282b;
                k60Var2.f35042h1 = null;
                Paint paint = k60Var2.f35038g1;
                if (k60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                k60Var2.f35034f1.invalidate();
                return;
        }
    }
}
