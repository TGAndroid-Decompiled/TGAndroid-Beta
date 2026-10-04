package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class c50 extends AnimatorListenerAdapter {
    public final int f35285a;
    public final h60 f35286b;

    public c50(h60 h60Var, int i10) {
        this.f35285a = i10;
        this.f35286b = h60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f35285a) {
            case 0:
                h60 h60Var = this.f35286b;
                h60Var.V.setVisibility(4);
                h60Var.W.setVisibility(4);
                h60Var.U.setVisibility(4);
                return;
            case 1:
                this.f35286b.f36909h0 = null;
                return;
            default:
                h60 h60Var2 = this.f35286b;
                h60Var2.f36910h1 = null;
                Paint paint = h60Var2.f36906g1;
                if (h60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                h60Var2.f36902f1.invalidate();
                return;
        }
    }
}
