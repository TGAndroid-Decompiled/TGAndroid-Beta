package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f37660a;
    public final float f37661b;
    public final float f37662c;
    public final float d;
    public final int f37663e;
    public final boolean f37664f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = g8Var;
        this.f37660a = i8Var;
        this.f37661b = f7;
        this.f37662c = f10;
        this.d = f11;
        this.f37663e = i10;
        this.f37664f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37661b;
        i8 i8Var = this.f37660a;
        i8Var.f38796a = f7;
        i8Var.f38797b = this.f37662c;
        i8Var.f38798c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.f37663e;
        sparseArray.remove(i10);
        if (!this.f37664f) {
            g8Var.f37975w.remove(i10);
        }
    }
}
