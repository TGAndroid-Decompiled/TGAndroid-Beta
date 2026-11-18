package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f47118a;
    public final float f47119b;
    public final float f47120c;
    public final float d;
    public final int f47121e;
    public final boolean f47122f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f47118a = h8Var;
        this.f47119b = f10;
        this.f47120c = f11;
        this.d = f12;
        this.f47121e = i7;
        this.f47122f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f47119b;
        h8 h8Var = this.f47118a;
        h8Var.f48213a = f10;
        h8Var.f48214b = this.f47120c;
        h8Var.f48215c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47564w;
        int i7 = this.f47121e;
        sparseArray.remove(i7);
        if (!this.f47122f) {
            f8Var.f47565x.remove(i7);
        }
    }
}
