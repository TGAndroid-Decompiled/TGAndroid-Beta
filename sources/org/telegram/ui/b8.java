package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class b8 extends AnimatorListenerAdapter {
    public final e8 f36710a;
    public final float f36711b;
    public final float f36712c;
    public final float d;
    public final int f36713e;
    public final boolean f36714f;
    public final c8 h;

    public b8(c8 c8Var, e8 e8Var, float f9, float f10, float f11, int i10, boolean z10) {
        this.h = c8Var;
        this.f36710a = e8Var;
        this.f36711b = f9;
        this.f36712c = f10;
        this.d = f11;
        this.f36713e = i10;
        this.f36714f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f9 = this.f36711b;
        e8 e8Var = this.f36710a;
        e8Var.f37719a = f9;
        e8Var.f37720b = this.f36712c;
        e8Var.f37721c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c8 c8Var = this.h;
        SparseArray sparseArray = c8Var.v;
        int i10 = this.f36713e;
        sparseArray.remove(i10);
        if (!this.f36714f) {
            c8Var.f37035w.remove(i10);
        }
    }
}
