package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class j40 extends AnimatorListenerAdapter {
    public final int f38162a;
    public final q50 f38163b;

    public j40(q50 q50Var, int i10) {
        this.f38162a = i10;
        this.f38163b = q50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f38162a) {
            case 0:
                q50 q50Var = this.f38163b;
                q50Var.V.setVisibility(4);
                q50Var.W.setVisibility(4);
                q50Var.U.setVisibility(4);
                return;
            case 1:
                this.f38163b.f40399h0 = null;
                return;
            default:
                q50 q50Var2 = this.f38163b;
                q50Var2.f40400h1 = null;
                Paint paint = q50Var2.f40396g1;
                if (q50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                q50Var2.f40392f1.invalidate();
                return;
        }
    }
}
