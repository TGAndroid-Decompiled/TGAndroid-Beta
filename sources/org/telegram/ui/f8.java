package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f47716a;
    public final float f47717b;
    public final float f47718c;
    public final float d;
    public final int f47719e;
    public final boolean f47720f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = g8Var;
        this.f47716a = i8Var;
        this.f47717b = f10;
        this.f47718c = f11;
        this.d = f12;
        this.f47719e = i7;
        this.f47720f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f47717b;
        i8 i8Var = this.f47716a;
        i8Var.f48742a = f10;
        i8Var.f48743b = this.f47718c;
        i8Var.f48744c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.f48166w;
        int i7 = this.f47719e;
        sparseArray.remove(i7);
        if (!this.f47720f) {
            g8Var.f48167x.remove(i7);
        }
    }
}
