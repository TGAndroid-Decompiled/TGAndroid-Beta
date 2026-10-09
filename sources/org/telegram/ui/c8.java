package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class c8 extends AnimatorListenerAdapter {
    public final f8 f36574a;
    public final float f36575b;
    public final float f36576c;
    public final float d;
    public final int f36577e;
    public final boolean f36578f;
    public final d8 h;

    public c8(d8 d8Var, f8 f8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = d8Var;
        this.f36574a = f8Var;
        this.f36575b = f7;
        this.f36576c = f10;
        this.d = f11;
        this.f36577e = i10;
        this.f36578f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36575b;
        f8 f8Var = this.f36574a;
        f8Var.f37475a = f7;
        f8Var.f37476b = this.f36576c;
        f8Var.f37477c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d8 d8Var = this.h;
        SparseArray sparseArray = d8Var.v;
        int i10 = this.f36577e;
        sparseArray.remove(i10);
        if (!this.f36578f) {
            d8Var.f36887w.remove(i10);
        }
    }
}
