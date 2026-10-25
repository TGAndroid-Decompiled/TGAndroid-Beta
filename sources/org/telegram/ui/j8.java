package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class j8 extends AnimatorListenerAdapter {
    public final m8 f40475a;
    public final float f40476b;
    public final float f40477c;
    public final float d;
    public final int e;
    public final boolean f40478f;
    public final k8 h;

    public j8(k8 k8Var, m8 m8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = k8Var;
        this.f40475a = m8Var;
        this.f40476b = f7;
        this.f40477c = f10;
        this.d = f11;
        this.e = i10;
        this.f40478f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f40476b;
        m8 m8Var = this.f40475a;
        m8Var.f41485a = f7;
        m8Var.f41486b = this.f40477c;
        m8Var.f41487c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k8 k8Var = this.h;
        SparseArray sparseArray = k8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f40478f) {
            k8Var.f40821w.remove(i10);
        }
    }
}
