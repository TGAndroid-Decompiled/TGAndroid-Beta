package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class c50 extends AnimatorListenerAdapter {
    public final int f35005a;
    public final j60 f35006b;

    public c50(j60 j60Var, int i10) {
        this.f35005a = i10;
        this.f35006b = j60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f35005a) {
            case 0:
                j60 j60Var = this.f35006b;
                j60Var.V.setVisibility(4);
                j60Var.W.setVisibility(4);
                j60Var.U.setVisibility(4);
                return;
            case 1:
                this.f35006b.f37543h0 = null;
                return;
            default:
                j60 j60Var2 = this.f35006b;
                j60Var2.f37544h1 = null;
                Paint paint = j60Var2.f37540g1;
                if (j60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                j60Var2.f37536f1.invalidate();
                return;
        }
    }
}
