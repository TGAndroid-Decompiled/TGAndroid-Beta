package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37218a;
    public final float f37219b;
    public final float f37220c;
    public final float d;
    public final int e;
    public final boolean f37221f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37218a = j8Var;
        this.f37219b = f7;
        this.f37220c = f10;
        this.d = f11;
        this.e = i10;
        this.f37221f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37219b;
        j8 j8Var = this.f37218a;
        j8Var.f38202a = f7;
        j8Var.f38203b = this.f37220c;
        j8Var.f38204c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37221f) {
            h8Var.f37540w.remove(i10);
        }
    }
}
