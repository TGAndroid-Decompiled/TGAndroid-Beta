package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class a30 extends AnimatorListenerAdapter {
    public final int f43546a;
    public final f40 f43547b;

    public a30(f40 f40Var, int i7) {
        this.f43546a = i7;
        this.f43547b = f40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.f43546a) {
            case 0:
                f40 f40Var = this.f43547b;
                f40Var.P1.setVisibility(4);
                f40Var.Q1.setVisibility(4);
                f40Var.O1.setVisibility(4);
                return;
            case 1:
                this.f43547b.f45508b2 = null;
                return;
            default:
                f40 f40Var2 = this.f43547b;
                f40Var2.f45509b3 = null;
                Paint paint = f40Var2.f45505a3;
                if (f40Var2.N3 == 3) {
                    i7 = -1163700;
                } else {
                    i7 = -12761513;
                }
                paint.setColor(i7);
                f40Var2.Z2.invalidate();
                return;
        }
    }
}
