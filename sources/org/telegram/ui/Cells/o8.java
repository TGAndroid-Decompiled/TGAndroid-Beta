package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o8 extends AnimatorListenerAdapter {
    public final int f24815a;
    public final int f24816b;
    public final q8 f24817c;

    public o8(q8 q8Var, int i10, int i11) {
        this.f24815a = i11;
        this.f24817c = q8Var;
        this.f24816b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24815a) {
            case 0:
                q8 q8Var = this.f24817c;
                q8Var.f25086r = 0;
                q8Var.setBackgroundColor(this.f24816b);
                q8Var.invalidate();
                return;
            default:
                int i10 = this.f24816b;
                q8 q8Var2 = this.f24817c;
                q8Var2.setBackgroundColor(i10);
                q8Var2.f25086r = 0;
                q8Var2.invalidate();
                return;
        }
    }
}
