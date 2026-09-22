package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f32965a;
    public final float f32966b;
    public final float f32967c;
    public final float d;
    public final int e;
    public final boolean f32968f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f32965a = g8Var;
        this.f32966b = f7;
        this.f32967c = f10;
        this.d = f11;
        this.e = i10;
        this.f32968f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f32966b;
        g8 g8Var = this.f32965a;
        g8Var.f33786a = f7;
        g8Var.f33787b = this.f32967c;
        g8Var.f33788c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f32968f) {
            e8Var.f33222w.remove(i10);
        }
    }
}
