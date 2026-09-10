package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v8 extends AnimatorListenerAdapter {
    public final int f20566a;
    public final int f20567b;
    public final x8 f20568c;

    public v8(x8 x8Var, int i10, int i11) {
        this.f20566a = i11;
        this.f20568c = x8Var;
        this.f20567b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20566a) {
            case 0:
                x8 x8Var = this.f20568c;
                x8Var.f20727r = 0;
                x8Var.setBackgroundColor(this.f20567b);
                x8Var.invalidate();
                return;
            default:
                int i10 = this.f20567b;
                x8 x8Var2 = this.f20568c;
                x8Var2.setBackgroundColor(i10);
                x8Var2.f20727r = 0;
                x8Var2.invalidate();
                return;
        }
    }
}
