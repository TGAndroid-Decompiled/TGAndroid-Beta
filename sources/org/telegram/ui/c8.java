package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class c8 extends AnimatorListenerAdapter {
    public final f8 f36620a;
    public final float f36621b;
    public final float f36622c;
    public final float d;
    public final int f36623e;
    public final boolean f36624f;
    public final d8 h;

    public c8(d8 d8Var, f8 f8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = d8Var;
        this.f36620a = f8Var;
        this.f36621b = f7;
        this.f36622c = f10;
        this.d = f11;
        this.f36623e = i10;
        this.f36624f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36621b;
        f8 f8Var = this.f36620a;
        f8Var.f37521a = f7;
        f8Var.f37522b = this.f36622c;
        f8Var.f37523c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d8 d8Var = this.h;
        SparseArray sparseArray = d8Var.v;
        int i10 = this.f36623e;
        sparseArray.remove(i10);
        if (!this.f36624f) {
            d8Var.f36933w.remove(i10);
        }
    }
}
