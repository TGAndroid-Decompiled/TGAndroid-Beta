package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class j40 extends AnimatorListenerAdapter {
    public final int f38160a;
    public final q50 f38161b;

    public j40(q50 q50Var, int i10) {
        this.f38160a = i10;
        this.f38161b = q50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f38160a) {
            case 0:
                q50 q50Var = this.f38161b;
                q50Var.V.setVisibility(4);
                q50Var.W.setVisibility(4);
                q50Var.U.setVisibility(4);
                return;
            case 1:
                this.f38161b.f40404h0 = null;
                return;
            default:
                q50 q50Var2 = this.f38161b;
                q50Var2.f40405h1 = null;
                Paint paint = q50Var2.f40401g1;
                if (q50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                q50Var2.f40397f1.invalidate();
                return;
        }
    }
}
