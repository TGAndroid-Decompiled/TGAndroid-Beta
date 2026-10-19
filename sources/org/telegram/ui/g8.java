package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37208a;
    public final float f37209b;
    public final float f37210c;
    public final float d;
    public final int e;
    public final boolean f37211f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37208a = j8Var;
        this.f37209b = f7;
        this.f37210c = f10;
        this.d = f11;
        this.e = i10;
        this.f37211f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37209b;
        j8 j8Var = this.f37208a;
        j8Var.f38192a = f7;
        j8Var.f38193b = this.f37210c;
        j8Var.f38194c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37211f) {
            h8Var.f37530w.remove(i10);
        }
    }
}
