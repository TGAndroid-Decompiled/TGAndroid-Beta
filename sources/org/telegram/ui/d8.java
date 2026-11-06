package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f44989a;
    public final float f44990b;
    public final float f44991c;
    public final float d;
    public final int f44992e;
    public final boolean f44993f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.f44989a = g8Var;
        this.f44990b = f10;
        this.f44991c = f11;
        this.d = f12;
        this.f44992e = i7;
        this.f44993f = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f44990b;
        g8 g8Var = this.f44989a;
        g8Var.f45889a = f10;
        g8Var.f45890b = this.f44991c;
        g8Var.f45891c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f45205w;
        int i7 = this.f44992e;
        sparseArray.remove(i7);
        if (!this.f44993f) {
            e8Var.f45206x.remove(i7);
        }
    }
}
