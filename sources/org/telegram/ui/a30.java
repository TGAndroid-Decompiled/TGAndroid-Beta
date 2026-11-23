package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class a30 extends AnimatorListenerAdapter {
    public final int f45489a;
    public final f40 f45490b;

    public a30(f40 f40Var, int i7) {
        this.f45489a = i7;
        this.f45490b = f40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f45489a) {
            case 0:
                f40 f40Var = this.f45490b;
                f40Var.Q1.setVisibility(4);
                f40Var.R1.setVisibility(4);
                f40Var.P1.setVisibility(4);
                return;
            case 1:
                this.f45490b.f47479c2 = null;
                return;
            default:
                f40 f40Var2 = this.f45490b;
                f40Var2.f47480c3 = null;
                Paint paint = f40Var2.f47476b3;
                if (f40Var2.S3 == 3) {
                    i7 = -1163700;
                } else {
                    i7 = -12761513;
                }
                paint.setColor(i7);
                f40Var2.f47472a3.invalidate();
                return;
        }
    }
}
