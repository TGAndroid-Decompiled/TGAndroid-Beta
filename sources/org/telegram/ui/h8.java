package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class h8 extends AnimatorListenerAdapter {
    public final k8 f36433a;
    public final float f36434b;
    public final float f36435c;
    public final float d;
    public final int e;
    public final boolean f36436f;
    public final i8 h;

    public h8(i8 i8Var, k8 k8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = i8Var;
        this.f36433a = k8Var;
        this.f36434b = f7;
        this.f36435c = f10;
        this.d = f11;
        this.e = i10;
        this.f36436f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36434b;
        k8 k8Var = this.f36433a;
        k8Var.f37321a = f7;
        k8Var.f37322b = this.f36435c;
        k8Var.f37323c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i8 i8Var = this.h;
        SparseArray sparseArray = i8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f36436f) {
            i8Var.f36751w.remove(i10);
        }
    }
}
