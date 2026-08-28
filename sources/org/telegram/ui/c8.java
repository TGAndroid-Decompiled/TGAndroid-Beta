package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class c8 extends AnimatorListenerAdapter {
    public final f8 f37089a;
    public final float f37090b;
    public final float f37091c;
    public final float d;
    public final int f37092e;
    public final boolean f37093f;
    public final d8 h;

    public c8(d8 d8Var, f8 f8Var, float f10, float f11, float f12, int i9, boolean z10) {
        this.h = d8Var;
        this.f37089a = f8Var;
        this.f37090b = f10;
        this.f37091c = f11;
        this.d = f12;
        this.f37092e = i9;
        this.f37093f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f37090b;
        f8 f8Var = this.f37089a;
        f8Var.f38152a = f10;
        f8Var.f38153b = this.f37091c;
        f8Var.f38154c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d8 d8Var = this.h;
        SparseArray sparseArray = d8Var.v;
        int i9 = this.f37092e;
        sparseArray.remove(i9);
        if (!this.f37093f) {
            d8Var.f37441w.remove(i9);
        }
    }
}
