package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f46614a;
    public final float f46615b;
    public final float f46616c;
    public final float d;
    public final int f46617e;
    public final boolean f46618f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f46614a = h8Var;
        this.f46615b = f10;
        this.f46616c = f11;
        this.d = f12;
        this.f46617e = i7;
        this.f46618f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f46615b;
        h8 h8Var = this.f46614a;
        h8Var.f47629a = f10;
        h8Var.f47630b = this.f46616c;
        h8Var.f47631c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47040w;
        int i7 = this.f46617e;
        sparseArray.remove(i7);
        if (!this.f46618f) {
            f8Var.f47041x.remove(i7);
        }
    }
}
