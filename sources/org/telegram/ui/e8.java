package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f47160a;
    public final float f47161b;
    public final float f47162c;
    public final float d;
    public final int f47163e;
    public final boolean f47164f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f47160a = h8Var;
        this.f47161b = f10;
        this.f47162c = f11;
        this.d = f12;
        this.f47163e = i7;
        this.f47164f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f47161b;
        h8 h8Var = this.f47160a;
        h8Var.f48256a = f10;
        h8Var.f48257b = this.f47162c;
        h8Var.f48258c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47598w;
        int i7 = this.f47163e;
        sparseArray.remove(i7);
        if (!this.f47164f) {
            f8Var.f47599x.remove(i7);
        }
    }
}
