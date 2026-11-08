package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f45020a;
    public final float f45021b;
    public final float f45022c;
    public final float d;
    public final int f45023e;
    public final boolean f45024f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.f45020a = g8Var;
        this.f45021b = f10;
        this.f45022c = f11;
        this.d = f12;
        this.f45023e = i7;
        this.f45024f = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f45021b;
        g8 g8Var = this.f45020a;
        g8Var.f45894a = f10;
        g8Var.f45895b = this.f45022c;
        g8Var.f45896c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f45229w;
        int i7 = this.f45023e;
        sparseArray.remove(i7);
        if (!this.f45024f) {
            e8Var.f45230x.remove(i7);
        }
    }
}
