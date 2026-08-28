package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class i40 extends AnimatorListenerAdapter {
    public final int f39002a;
    public final o50 f39003b;

    public i40(o50 o50Var, int i9) {
        this.f39002a = i9;
        this.f39003b = o50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        switch (this.f39002a) {
            case 0:
                o50 o50Var = this.f39003b;
                o50Var.R.setVisibility(4);
                o50Var.S.setVisibility(4);
                o50Var.Q.setVisibility(4);
                return;
            case 1:
                this.f39003b.f40893d0 = null;
                return;
            default:
                o50 o50Var2 = this.f39003b;
                o50Var2.f40894d1 = null;
                Paint paint = o50Var2.f40890c1;
                if (o50Var2.P1 == 3) {
                    i9 = -1163700;
                } else {
                    i9 = -12761513;
                }
                paint.setColor(i9);
                o50Var2.f40885b1.invalidate();
                return;
        }
    }
}
