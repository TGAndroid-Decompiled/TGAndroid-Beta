package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f47191a;
    public final float f47192b;
    public final float f47193c;
    public final float d;
    public final int f47194e;
    public final boolean f47195f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f47191a = h8Var;
        this.f47192b = f10;
        this.f47193c = f11;
        this.d = f12;
        this.f47194e = i7;
        this.f47195f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f47192b;
        h8 h8Var = this.f47191a;
        h8Var.f48289a = f10;
        h8Var.f48290b = this.f47193c;
        h8Var.f48291c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47632w;
        int i7 = this.f47194e;
        sparseArray.remove(i7);
        if (!this.f47195f) {
            f8Var.f47633x.remove(i7);
        }
    }
}
