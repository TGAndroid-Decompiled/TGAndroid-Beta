package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f36664a;
    public final float f36665b;
    public final float f36666c;
    public final float d;
    public final int e;
    public final boolean f36667f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f36664a = g8Var;
        this.f36665b = f7;
        this.f36666c = f10;
        this.d = f11;
        this.e = i10;
        this.f36667f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36665b;
        g8 g8Var = this.f36664a;
        g8Var.f37450a = f7;
        g8Var.f37451b = this.f36666c;
        g8Var.f37452c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f36980w;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f36667f) {
            e8Var.f36981x.remove(i10);
        }
    }
}
