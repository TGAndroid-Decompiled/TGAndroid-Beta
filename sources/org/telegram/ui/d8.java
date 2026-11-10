package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f44924a;
    public final float f44925b;
    public final float f44926c;
    public final float d;
    public final int f44927e;
    public final boolean f44928f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.f44924a = g8Var;
        this.f44925b = f10;
        this.f44926c = f11;
        this.d = f12;
        this.f44927e = i7;
        this.f44928f = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f44925b;
        g8 g8Var = this.f44924a;
        g8Var.f46036a = f10;
        g8Var.f46037b = this.f44926c;
        g8Var.f46038c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f45199w;
        int i7 = this.f44927e;
        sparseArray.remove(i7);
        if (!this.f44928f) {
            e8Var.f45200x.remove(i7);
        }
    }
}
