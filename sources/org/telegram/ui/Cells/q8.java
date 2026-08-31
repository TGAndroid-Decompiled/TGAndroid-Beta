package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q8 extends AnimatorListenerAdapter {
    public final int f23377a;
    public final int f23378b;
    public final s8 f23379c;

    public q8(s8 s8Var, int i10, int i11) {
        this.f23377a = i11;
        this.f23379c = s8Var;
        this.f23378b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23377a) {
            case 0:
                s8 s8Var = this.f23379c;
                s8Var.f23756r = 0;
                s8Var.setBackgroundColor(this.f23378b);
                s8Var.invalidate();
                return;
            default:
                int i10 = this.f23378b;
                s8 s8Var2 = this.f23379c;
                s8Var2.setBackgroundColor(i10);
                s8Var2.f23756r = 0;
                s8Var2.invalidate();
                return;
        }
    }
}
