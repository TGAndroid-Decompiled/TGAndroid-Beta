package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class q40 extends AnimatorListenerAdapter {
    public final int f42612a;
    public final x50 f42613b;

    public q40(x50 x50Var, int i10) {
        this.f42612a = i10;
        this.f42613b = x50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f42612a) {
            case 0:
                x50 x50Var = this.f42613b;
                x50Var.V.setVisibility(4);
                x50Var.W.setVisibility(4);
                x50Var.U.setVisibility(4);
                return;
            case 1:
                this.f42613b.f45520h0 = null;
                return;
            default:
                x50 x50Var2 = this.f42613b;
                x50Var2.f45521h1 = null;
                Paint paint = x50Var2.f45517g1;
                if (x50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                x50Var2.f45513f1.invalidate();
                return;
        }
    }
}
