package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f35733a;
    public final float f35734b;
    public final float f35735c;
    public final float d;
    public final int f35736e;
    public final boolean f35737f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f35733a = g8Var;
        this.f35734b = f7;
        this.f35735c = f10;
        this.d = f11;
        this.f35736e = i10;
        this.f35737f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f35734b;
        g8 g8Var = this.f35733a;
        g8Var.f36619a = f7;
        g8Var.f36620b = this.f35735c;
        g8Var.f36621c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.v;
        int i10 = this.f35736e;
        sparseArray.remove(i10);
        if (!this.f35737f) {
            e8Var.f35997w.remove(i10);
        }
    }
}
