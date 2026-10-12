package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class h8 extends AnimatorListenerAdapter {
    public final k8 f36643a;
    public final float f36644b;
    public final float f36645c;
    public final float d;
    public final int e;
    public final boolean f36646f;
    public final i8 h;

    public h8(i8 i8Var, k8 k8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = i8Var;
        this.f36643a = k8Var;
        this.f36644b = f7;
        this.f36645c = f10;
        this.d = f11;
        this.e = i10;
        this.f36646f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36644b;
        k8 k8Var = this.f36643a;
        k8Var.f37600a = f7;
        k8Var.f37601b = this.f36645c;
        k8Var.f37602c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i8 i8Var = this.h;
        SparseArray sparseArray = i8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f36646f) {
            i8Var.f37063w.remove(i10);
        }
    }
}
