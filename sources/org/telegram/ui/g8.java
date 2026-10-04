package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f36521a;
    public final float f36522b;
    public final float f36523c;
    public final float d;
    public final int f36524e;
    public final boolean f36525f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f36521a = j8Var;
        this.f36522b = f7;
        this.f36523c = f10;
        this.d = f11;
        this.f36524e = i10;
        this.f36525f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36522b;
        j8 j8Var = this.f36521a;
        j8Var.f37592a = f7;
        j8Var.f37593b = this.f36523c;
        j8Var.f37594c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.f36524e;
        sparseArray.remove(i10);
        if (!this.f36525f) {
            h8Var.f36996w.remove(i10);
        }
    }
}
