package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f33036a;
    public final float f33037b;
    public final float f33038c;
    public final float d;
    public final int e;
    public final boolean f33039f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f33036a = g8Var;
        this.f33037b = f7;
        this.f33038c = f10;
        this.d = f11;
        this.e = i10;
        this.f33039f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33037b;
        g8 g8Var = this.f33036a;
        g8Var.f33831a = f7;
        g8Var.f33832b = this.f33038c;
        g8Var.f33833c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33039f) {
            e8Var.f33267w.remove(i10);
        }
    }
}
