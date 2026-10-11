package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class b8 extends AnimatorListenerAdapter {
    public final e8 f36327a;
    public final float f36328b;
    public final float f36329c;
    public final float d;
    public final int f36330e;
    public final boolean f36331f;
    public final c8 h;

    public b8(c8 c8Var, e8 e8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = c8Var;
        this.f36327a = e8Var;
        this.f36328b = f7;
        this.f36329c = f10;
        this.d = f11;
        this.f36330e = i10;
        this.f36331f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36328b;
        e8 e8Var = this.f36327a;
        e8Var.f37264a = f7;
        e8Var.f37265b = this.f36329c;
        e8Var.f37266c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c8 c8Var = this.h;
        SparseArray sparseArray = c8Var.v;
        int i10 = this.f36330e;
        sparseArray.remove(i10);
        if (!this.f36331f) {
            c8Var.f36659w.remove(i10);
        }
    }
}
