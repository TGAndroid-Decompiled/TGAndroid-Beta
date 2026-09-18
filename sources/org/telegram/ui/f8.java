package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f33574a;
    public final float f33575b;
    public final float f33576c;
    public final float d;
    public final int e;
    public final boolean f33577f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = g8Var;
        this.f33574a = i8Var;
        this.f33575b = f7;
        this.f33576c = f10;
        this.d = f11;
        this.e = i10;
        this.f33577f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33575b;
        i8 i8Var = this.f33574a;
        i8Var.f34508a = f7;
        i8Var.f34509b = this.f33576c;
        i8Var.f34510c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33577f) {
            g8Var.f33908w.remove(i10);
        }
    }
}
