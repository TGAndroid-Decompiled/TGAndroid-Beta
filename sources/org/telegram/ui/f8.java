package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f36703a;
    public final float f36704b;
    public final float f36705c;
    public final float d;
    public final int f36706e;
    public final boolean f36707f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f10, float f11, float f12, int i10, boolean z4) {
        this.h = g8Var;
        this.f36703a = i8Var;
        this.f36704b = f10;
        this.f36705c = f11;
        this.d = f12;
        this.f36706e = i10;
        this.f36707f = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f36704b;
        i8 i8Var = this.f36703a;
        i8Var.f37569a = f10;
        i8Var.f37570b = this.f36705c;
        i8Var.f37571c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.f36706e;
        sparseArray.remove(i10);
        if (!this.f36707f) {
            g8Var.f37020w.remove(i10);
        }
    }
}
