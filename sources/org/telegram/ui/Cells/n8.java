package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class n8 extends AnimatorListenerAdapter {

    public final int f24734a;

    public final int f24735b;

    public final p8 f24736c;

    public n8(p8 p8Var, int i10, int i11) {
        this.f24734a = i11;
        this.f24736c = p8Var;
        this.f24735b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24734a) {
            case 0:
                p8 p8Var = this.f24736c;
                p8Var.f25006r = 0;
                p8Var.setBackgroundColor(this.f24735b);
                p8Var.invalidate();
                break;
            default:
                int i10 = this.f24735b;
                p8 p8Var2 = this.f24736c;
                p8Var2.setBackgroundColor(i10);
                p8Var2.f25006r = 0;
                p8Var2.invalidate();
                break;
        }
    }
}
