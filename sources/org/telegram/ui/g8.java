package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37119a;
    public final float f37120b;
    public final float f37121c;
    public final float d;
    public final int e;
    public final boolean f37122f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37119a = j8Var;
        this.f37120b = f7;
        this.f37121c = f10;
        this.d = f11;
        this.e = i10;
        this.f37122f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37120b;
        j8 j8Var = this.f37119a;
        j8Var.f38093a = f7;
        j8Var.f38094b = this.f37121c;
        j8Var.f38095c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37122f) {
            h8Var.f37475w.remove(i10);
        }
    }
}
