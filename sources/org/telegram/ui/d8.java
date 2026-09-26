package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f33052a;
    public final float f33053b;
    public final float f33054c;
    public final float d;
    public final int e;
    public final boolean f33055f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f33052a = g8Var;
        this.f33053b = f7;
        this.f33054c = f10;
        this.d = f11;
        this.e = i10;
        this.f33055f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33053b;
        g8 g8Var = this.f33052a;
        g8Var.f33846a = f7;
        g8Var.f33847b = this.f33054c;
        g8Var.f33848c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33055f) {
            e8Var.f33294w.remove(i10);
        }
    }
}
