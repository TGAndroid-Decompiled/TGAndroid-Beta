package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class g50 extends AnimatorListenerAdapter {
    public final int f36314a;
    public final n60 f36315b;

    public g50(n60 n60Var, int i10) {
        this.f36314a = i10;
        this.f36315b = n60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f36314a) {
            case 0:
                n60 n60Var = this.f36315b;
                n60Var.V.setVisibility(4);
                n60Var.W.setVisibility(4);
                n60Var.U.setVisibility(4);
                return;
            case 1:
                this.f36315b.f38471h0 = null;
                return;
            default:
                n60 n60Var2 = this.f36315b;
                n60Var2.f38472h1 = null;
                Paint paint = n60Var2.f38468g1;
                if (n60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                n60Var2.f38464f1.invalidate();
                return;
        }
    }
}
