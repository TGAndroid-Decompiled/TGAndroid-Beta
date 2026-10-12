package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f37664a;
    public final float f37665b;
    public final float f37666c;
    public final float d;
    public final int f37667e;
    public final boolean f37668f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = g8Var;
        this.f37664a = i8Var;
        this.f37665b = f7;
        this.f37666c = f10;
        this.d = f11;
        this.f37667e = i10;
        this.f37668f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f37665b;
        i8 i8Var = this.f37664a;
        i8Var.f38799a = f7;
        i8Var.f38800b = this.f37666c;
        i8Var.f38801c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.f37667e;
        sparseArray.remove(i10);
        if (!this.f37668f) {
            g8Var.f37973w.remove(i10);
        }
    }
}
