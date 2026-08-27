package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class hf0 extends AnimatorListenerAdapter {

    public final int f28986a;

    public final if0 f28987b;

    public hf0(if0 if0Var, int i10) {
        this.f28986a = i10;
        this.f28987b = if0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28986a) {
            case 0:
                if0 if0Var = this.f28987b;
                if0Var.h = false;
                if0Var.f29348a = if0Var.f29350c;
                if0Var.invalidate();
                int i10 = if0Var.F;
                if (i10 >= 0) {
                    if0Var.b(i10);
                    if0Var.F = -1;
                }
                break;
            default:
                if0 if0Var2 = this.f28987b;
                if0Var2.f29353n = false;
                if0Var2.h = false;
                if0Var2.invalidate();
                int i11 = if0Var2.F;
                if (i11 >= 0) {
                    if0Var2.b(i11);
                    if0Var2.F = -1;
                }
                if0Var2.a();
                break;
        }
    }
}
