package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37149a;
    public final float f37150b;
    public final float f37151c;
    public final float d;
    public final int e;
    public final boolean f37152f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37149a = j8Var;
        this.f37150b = f7;
        this.f37151c = f10;
        this.d = f11;
        this.e = i10;
        this.f37152f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37150b;
        j8 j8Var = this.f37149a;
        j8Var.f38077a = f7;
        j8Var.f38078b = this.f37151c;
        j8Var.f38079c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37152f) {
            h8Var.f37457w.remove(i10);
        }
    }
}
