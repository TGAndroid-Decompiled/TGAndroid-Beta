package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g8 extends AnimatorListenerAdapter {
    public final j8 f36522a;
    public final float f36523b;
    public final float f36524c;
    public final float d;
    public final int f36525e;
    public final boolean f36526f;
    public final h8 h;

    public g8(h8 h8Var, j8 j8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = h8Var;
        this.f36522a = j8Var;
        this.f36523b = f7;
        this.f36524c = f10;
        this.d = f11;
        this.f36525e = i10;
        this.f36526f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36523b;
        j8 j8Var = this.f36522a;
        j8Var.f37593a = f7;
        j8Var.f37594b = this.f36524c;
        j8Var.f37595c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h8 h8Var = this.h;
        SparseArray sparseArray = h8Var.v;
        int i10 = this.f36525e;
        sparseArray.remove(i10);
        if (!this.f36526f) {
            h8Var.f36997w.remove(i10);
        }
    }
}
