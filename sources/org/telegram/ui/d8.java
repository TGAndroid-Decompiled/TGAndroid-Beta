package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f32529a;
    public final float f32530b;
    public final float f32531c;
    public final float d;
    public final int e;
    public final boolean f32532f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f32529a = g8Var;
        this.f32530b = f7;
        this.f32531c = f10;
        this.d = f11;
        this.e = i10;
        this.f32532f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f32530b;
        g8 g8Var = this.f32529a;
        g8Var.f33479a = f7;
        g8Var.f33480b = this.f32531c;
        g8Var.f33481c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f32532f) {
            e8Var.f32843w.remove(i10);
        }
    }
}
