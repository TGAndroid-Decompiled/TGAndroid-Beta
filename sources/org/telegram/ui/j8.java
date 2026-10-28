package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class j8 extends AnimatorListenerAdapter {
    public final m8 f40460a;
    public final float f40461b;
    public final float f40462c;
    public final float d;
    public final int e;
    public final boolean f40463f;
    public final k8 h;

    public j8(k8 k8Var, m8 m8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = k8Var;
        this.f40460a = m8Var;
        this.f40461b = f7;
        this.f40462c = f10;
        this.d = f11;
        this.e = i10;
        this.f40463f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f40461b;
        m8 m8Var = this.f40460a;
        m8Var.f41349a = f7;
        m8Var.f41350b = this.f40462c;
        m8Var.f41351c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k8 k8Var = this.h;
        SparseArray sparseArray = k8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f40463f) {
            k8Var.f40684w.remove(i10);
        }
    }
}
