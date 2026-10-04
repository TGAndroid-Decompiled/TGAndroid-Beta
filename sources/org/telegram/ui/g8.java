package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f36527a;
    public final float f36528b;
    public final float f36529c;
    public final float d;
    public final int f36530e;
    public final boolean f36531f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f36527a = j8Var;
        this.f36528b = f7;
        this.f36529c = f10;
        this.d = f11;
        this.f36530e = i10;
        this.f36531f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36528b;
        j8 j8Var = this.f36527a;
        j8Var.f37598a = f7;
        j8Var.f37599b = this.f36529c;
        j8Var.f37600c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.f36530e;
        sparseArray.remove(i10);
        if (!this.f36531f) {
            h8Var.f37002w.remove(i10);
        }
    }
}
