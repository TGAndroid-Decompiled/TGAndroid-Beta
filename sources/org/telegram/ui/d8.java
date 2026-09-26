package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f33051a;
    public final float f33052b;
    public final float f33053c;
    public final float d;
    public final int e;
    public final boolean f33054f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f33051a = g8Var;
        this.f33052b = f7;
        this.f33053c = f10;
        this.d = f11;
        this.e = i10;
        this.f33054f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33052b;
        g8 g8Var = this.f33051a;
        g8Var.f33845a = f7;
        g8Var.f33846b = this.f33053c;
        g8Var.f33847c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33054f) {
            e8Var.f33293w.remove(i10);
        }
    }
}
