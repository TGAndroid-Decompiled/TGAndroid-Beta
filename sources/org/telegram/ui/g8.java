package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37215a;
    public final float f37216b;
    public final float f37217c;
    public final float d;
    public final int e;
    public final boolean f37218f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37215a = j8Var;
        this.f37216b = f7;
        this.f37217c = f10;
        this.d = f11;
        this.e = i10;
        this.f37218f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37216b;
        j8 j8Var = this.f37215a;
        j8Var.f38199a = f7;
        j8Var.f38200b = this.f37217c;
        j8Var.f38201c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37218f) {
            h8Var.f37537w.remove(i10);
        }
    }
}
