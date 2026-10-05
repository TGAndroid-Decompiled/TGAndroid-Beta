package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f36539a;
    public final float f36540b;
    public final float f36541c;
    public final float d;
    public final int f36542e;
    public final boolean f36543f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f36539a = j8Var;
        this.f36540b = f7;
        this.f36541c = f10;
        this.d = f11;
        this.f36542e = i10;
        this.f36543f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36540b;
        j8 j8Var = this.f36539a;
        j8Var.f37602a = f7;
        j8Var.f37603b = this.f36541c;
        j8Var.f37604c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.f36542e;
        sparseArray.remove(i10);
        if (!this.f36543f) {
            h8Var.f37027w.remove(i10);
        }
    }
}
