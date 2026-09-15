package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f32946a;
    public final float f32947b;
    public final float f32948c;
    public final float d;
    public final int e;
    public final boolean f32949f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f32946a = g8Var;
        this.f32947b = f7;
        this.f32948c = f10;
        this.d = f11;
        this.e = i10;
        this.f32949f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f32947b;
        g8 g8Var = this.f32946a;
        g8Var.f33838a = f7;
        g8Var.f33839b = this.f32948c;
        g8Var.f33840c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f32949f) {
            e8Var.f33268w.remove(i10);
        }
    }
}
