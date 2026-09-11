package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f35706a;
    public final float f35707b;
    public final float f35708c;
    public final float d;
    public final int f35709e;
    public final boolean f35710f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f35706a = g8Var;
        this.f35707b = f7;
        this.f35708c = f10;
        this.d = f11;
        this.f35709e = i10;
        this.f35710f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f35707b;
        g8 g8Var = this.f35706a;
        g8Var.f36592a = f7;
        g8Var.f36593b = this.f35708c;
        g8Var.f36594c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.f35709e;
        sparseArray.remove(i10);
        if (!this.f35710f) {
            e8Var.f35970w.remove(i10);
        }
    }
}
