package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class l40 extends AnimatorListenerAdapter {
    public final int f38776a;
    public final s50 f38777b;

    public l40(s50 s50Var, int i10) {
        this.f38776a = i10;
        this.f38777b = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f38776a) {
            case 0:
                s50 s50Var = this.f38777b;
                s50Var.V.setVisibility(4);
                s50Var.W.setVisibility(4);
                s50Var.U.setVisibility(4);
                return;
            case 1:
                this.f38777b.f40963h0 = null;
                return;
            default:
                s50 s50Var2 = this.f38777b;
                s50Var2.f40964h1 = null;
                Paint paint = s50Var2.f40960g1;
                if (s50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                s50Var2.f40956f1.invalidate();
                return;
        }
    }
}
