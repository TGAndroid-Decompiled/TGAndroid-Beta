package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f45013a;
    public final float f45014b;
    public final float f45015c;
    public final float d;
    public final int f45016e;
    public final boolean f45017f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.f45013a = g8Var;
        this.f45014b = f10;
        this.f45015c = f11;
        this.d = f12;
        this.f45016e = i7;
        this.f45017f = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f45014b;
        g8 g8Var = this.f45013a;
        g8Var.f45915a = f10;
        g8Var.f45916b = this.f45015c;
        g8Var.f45917c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f45234w;
        int i7 = this.f45016e;
        sparseArray.remove(i7);
        if (!this.f45017f) {
            e8Var.f45235x.remove(i7);
        }
    }
}
