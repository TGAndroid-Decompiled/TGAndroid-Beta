package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class c8 extends AnimatorListenerAdapter {
    public final f8 f36576a;
    public final float f36577b;
    public final float f36578c;
    public final float d;
    public final int f36579e;
    public final boolean f36580f;
    public final d8 h;

    public c8(d8 d8Var, f8 f8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = d8Var;
        this.f36576a = f8Var;
        this.f36577b = f7;
        this.f36578c = f10;
        this.d = f11;
        this.f36579e = i10;
        this.f36580f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36577b;
        f8 f8Var = this.f36576a;
        f8Var.f37477a = f7;
        f8Var.f37478b = this.f36578c;
        f8Var.f37479c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d8 d8Var = this.h;
        SparseArray sparseArray = d8Var.v;
        int i10 = this.f36579e;
        sparseArray.remove(i10);
        if (!this.f36580f) {
            d8Var.f36889w.remove(i10);
        }
    }
}
