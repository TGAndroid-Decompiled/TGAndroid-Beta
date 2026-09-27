package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f33838a;
    public final float f33839b;
    public final float f33840c;
    public final float d;
    public final int e;
    public final boolean f33841f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f33838a = j8Var;
        this.f33839b = f7;
        this.f33840c = f10;
        this.d = f11;
        this.e = i10;
        this.f33841f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33839b;
        j8 j8Var = this.f33838a;
        j8Var.f34655a = f7;
        j8Var.f34656b = this.f33840c;
        j8Var.f34657c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33841f) {
            h8Var.f34158w.remove(i10);
        }
    }
}
