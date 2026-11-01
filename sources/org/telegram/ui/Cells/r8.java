package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f22874a;
    public final int f22875b;
    public final t8 f22876c;

    public r8(t8 t8Var, int i10, int i11) {
        this.f22874a = i11;
        this.f22876c = t8Var;
        this.f22875b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22874a) {
            case 0:
                t8 t8Var = this.f22876c;
                t8Var.f23105r = 0;
                t8Var.setBackgroundColor(this.f22875b);
                t8Var.invalidate();
                return;
            default:
                int i10 = this.f22875b;
                t8 t8Var2 = this.f22876c;
                t8Var2.setBackgroundColor(i10);
                t8Var2.f23105r = 0;
                t8Var2.invalidate();
                return;
        }
    }
}
