package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;

public final class d8 extends AnimatorListenerAdapter {

    public final g8 f37297a;

    public final float f37298b;

    public final float f37299c;
    public final float d;

    public final int f37300e;

    public final boolean f37301f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i10, boolean z10) {
        this.h = e8Var;
        this.f37297a = g8Var;
        this.f37298b = f10;
        this.f37299c = f11;
        this.d = f12;
        this.f37300e = i10;
        this.f37301f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f37298b;
        g8 g8Var = this.f37297a;
        g8Var.f38332a = f10;
        g8Var.f38333b = this.f37299c;
        g8Var.f38334c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.f37300e;
        sparseArray.remove(i10);
        if (this.f37301f) {
            return;
        }
        e8Var.f37661w.remove(i10);
    }
}
