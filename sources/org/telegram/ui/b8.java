package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class b8 extends AnimatorListenerAdapter {
    public final e8 f36293a;
    public final float f36294b;
    public final float f36295c;
    public final float d;
    public final int f36296e;
    public final boolean f36297f;
    public final c8 h;

    public b8(c8 c8Var, e8 e8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = c8Var;
        this.f36293a = e8Var;
        this.f36294b = f7;
        this.f36295c = f10;
        this.d = f11;
        this.f36296e = i10;
        this.f36297f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36294b;
        e8 e8Var = this.f36293a;
        e8Var.f37230a = f7;
        e8Var.f37231b = this.f36295c;
        e8Var.f37232c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c8 c8Var = this.h;
        SparseArray sparseArray = c8Var.v;
        int i10 = this.f36296e;
        sparseArray.remove(i10);
        if (!this.f36297f) {
            c8Var.f36625w.remove(i10);
        }
    }
}
