package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f33570a;
    public final float f33571b;
    public final float f33572c;
    public final float d;
    public final int e;
    public final boolean f33573f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = g8Var;
        this.f33570a = i8Var;
        this.f33571b = f7;
        this.f33572c = f10;
        this.d = f11;
        this.e = i10;
        this.f33573f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33571b;
        i8 i8Var = this.f33570a;
        i8Var.f34503a = f7;
        i8Var.f34504b = this.f33572c;
        i8Var.f34505c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33573f) {
            g8Var.f33904w.remove(i10);
        }
    }
}
