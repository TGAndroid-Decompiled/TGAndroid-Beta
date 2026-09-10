package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f31855a;
    public final float f31856b;
    public final float f31857c;
    public final float d;
    public final int e;
    public final boolean f31858f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f31855a = g8Var;
        this.f31856b = f7;
        this.f31857c = f10;
        this.d = f11;
        this.e = i10;
        this.f31858f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f31856b;
        g8 g8Var = this.f31855a;
        g8Var.f33035a = f7;
        g8Var.f33036b = this.f31857c;
        g8Var.f33037c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f31858f) {
            e8Var.f32116w.remove(i10);
        }
    }
}
