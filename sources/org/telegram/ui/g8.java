package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37515a;
    public final float f37516b;
    public final float f37517c;
    public final float d;
    public final int e;
    public final boolean f37518f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37515a = j8Var;
        this.f37516b = f7;
        this.f37517c = f10;
        this.d = f11;
        this.e = i10;
        this.f37518f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37516b;
        j8 j8Var = this.f37515a;
        j8Var.f38477a = f7;
        j8Var.f38478b = this.f37517c;
        j8Var.f38479c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37518f) {
            h8Var.f37779w.remove(i10);
        }
    }
}
