package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f34181a;
    public final float f34182b;
    public final float f34183c;
    public final float d;
    public final int e;
    public final boolean f34184f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f10, float f11, float f12, int i10, boolean z4) {
        this.h = g8Var;
        this.f34181a = i8Var;
        this.f34182b = f10;
        this.f34183c = f11;
        this.d = f12;
        this.e = i10;
        this.f34184f = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f34182b;
        i8 i8Var = this.f34181a;
        i8Var.f35039a = f10;
        i8Var.f35040b = this.f34183c;
        i8Var.f35041c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f34184f) {
            g8Var.f34477w.remove(i10);
        }
    }
}
