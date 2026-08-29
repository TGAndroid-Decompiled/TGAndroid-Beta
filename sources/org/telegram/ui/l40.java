package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class l40 extends AnimatorListenerAdapter {
    public final int f40086a;
    public final r50 f40087b;

    public l40(r50 r50Var, int i10) {
        this.f40086a = i10;
        this.f40087b = r50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f40086a) {
            case 0:
                r50 r50Var = this.f40087b;
                r50Var.R.setVisibility(4);
                r50Var.S.setVisibility(4);
                r50Var.Q.setVisibility(4);
                return;
            case 1:
                this.f40087b.f41880d0 = null;
                return;
            default:
                r50 r50Var2 = this.f40087b;
                r50Var2.f41881d1 = null;
                Paint paint = r50Var2.f41878c1;
                if (r50Var2.P1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                r50Var2.f41873b1.invalidate();
                return;
        }
    }
}
