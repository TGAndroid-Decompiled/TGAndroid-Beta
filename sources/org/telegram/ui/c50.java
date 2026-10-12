package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class c50 extends AnimatorListenerAdapter {
    public final int f36328a;
    public final i60 f36329b;

    public c50(i60 i60Var, int i10) {
        this.f36328a = i10;
        this.f36329b = i60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f36328a) {
            case 0:
                i60 i60Var = this.f36329b;
                i60Var.V.setVisibility(4);
                i60Var.W.setVisibility(4);
                i60Var.U.setVisibility(4);
                return;
            case 1:
                this.f36329b.f38708h0 = null;
                return;
            default:
                i60 i60Var2 = this.f36329b;
                i60Var2.f38709h1 = null;
                Paint paint = i60Var2.f38705g1;
                if (i60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                i60Var2.f38701f1.invalidate();
                return;
        }
    }
}
