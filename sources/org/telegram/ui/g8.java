package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37219a;
    public final float f37220b;
    public final float f37221c;
    public final float d;
    public final int e;
    public final boolean f37222f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37219a = j8Var;
        this.f37220b = f7;
        this.f37221c = f10;
        this.d = f11;
        this.e = i10;
        this.f37222f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37220b;
        j8 j8Var = this.f37219a;
        j8Var.f38203a = f7;
        j8Var.f38204b = this.f37221c;
        j8Var.f38205c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37222f) {
            h8Var.f37541w.remove(i10);
        }
    }
}
