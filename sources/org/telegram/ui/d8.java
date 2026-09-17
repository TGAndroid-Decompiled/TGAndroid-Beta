package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f35734a;
    public final float f35735b;
    public final float f35736c;
    public final float d;
    public final int f35737e;
    public final boolean f35738f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f35734a = g8Var;
        this.f35735b = f7;
        this.f35736c = f10;
        this.d = f11;
        this.f35737e = i10;
        this.f35738f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f35735b;
        g8 g8Var = this.f35734a;
        g8Var.f36620a = f7;
        g8Var.f36621b = this.f35736c;
        g8Var.f36622c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.f35737e;
        sparseArray.remove(i10);
        if (!this.f35738f) {
            e8Var.f35998w.remove(i10);
        }
    }
}
