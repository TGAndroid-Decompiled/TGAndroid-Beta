package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f47165a;
    public final float f47166b;
    public final float f47167c;
    public final float d;
    public final int f47168e;
    public final boolean f47169f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f47165a = h8Var;
        this.f47166b = f10;
        this.f47167c = f11;
        this.d = f12;
        this.f47168e = i7;
        this.f47169f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f47166b;
        h8 h8Var = this.f47165a;
        h8Var.f48276a = f10;
        h8Var.f48277b = this.f47167c;
        h8Var.f48278c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47606w;
        int i7 = this.f47168e;
        sparseArray.remove(i7);
        if (!this.f47169f) {
            f8Var.f47607x.remove(i7);
        }
    }
}
