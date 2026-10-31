package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f22873a;
    public final int f22874b;
    public final t8 f22875c;

    public r8(t8 t8Var, int i10, int i11) {
        this.f22873a = i11;
        this.f22875c = t8Var;
        this.f22874b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22873a) {
            case 0:
                t8 t8Var = this.f22875c;
                t8Var.f23104r = 0;
                t8Var.setBackgroundColor(this.f22874b);
                t8Var.invalidate();
                return;
            default:
                int i10 = this.f22874b;
                t8 t8Var2 = this.f22875c;
                t8Var2.setBackgroundColor(i10);
                t8Var2.f23104r = 0;
                t8Var2.invalidate();
                return;
        }
    }
}
