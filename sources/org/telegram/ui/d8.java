package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f45014a;
    public final float f45015b;
    public final float f45016c;
    public final float d;
    public final int f45017e;
    public final boolean f45018f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.f45014a = g8Var;
        this.f45015b = f10;
        this.f45016c = f11;
        this.d = f12;
        this.f45017e = i7;
        this.f45018f = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f45015b;
        g8 g8Var = this.f45014a;
        g8Var.f45916a = f10;
        g8Var.f45917b = this.f45016c;
        g8Var.f45918c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f45235w;
        int i7 = this.f45017e;
        sparseArray.remove(i7);
        if (!this.f45018f) {
            e8Var.f45236x.remove(i7);
        }
    }
}
