package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f47195a;
    public final float f47196b;
    public final float f47197c;
    public final float d;
    public final int f47198e;
    public final boolean f47199f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f47195a = h8Var;
        this.f47196b = f10;
        this.f47197c = f11;
        this.d = f12;
        this.f47198e = i7;
        this.f47199f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f47196b;
        h8 h8Var = this.f47195a;
        h8Var.f48293a = f10;
        h8Var.f48294b = this.f47197c;
        h8Var.f48295c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47636w;
        int i7 = this.f47198e;
        sparseArray.remove(i7);
        if (!this.f47199f) {
            f8Var.f47637x.remove(i7);
        }
    }
}
