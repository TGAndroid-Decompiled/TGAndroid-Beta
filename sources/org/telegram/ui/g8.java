package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f37214a;
    public final float f37215b;
    public final float f37216c;
    public final float d;
    public final int e;
    public final boolean f37217f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f37214a = j8Var;
        this.f37215b = f7;
        this.f37216c = f10;
        this.d = f11;
        this.e = i10;
        this.f37217f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37215b;
        j8 j8Var = this.f37214a;
        j8Var.f38198a = f7;
        j8Var.f38199b = this.f37216c;
        j8Var.f38200c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f37217f) {
            h8Var.f37536w.remove(i10);
        }
    }
}
