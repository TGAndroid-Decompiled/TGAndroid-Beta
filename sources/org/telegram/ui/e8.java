package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f44916a;
    public final float f44917b;
    public final float f44918c;
    public final float d;
    public final int f44919e;
    public final boolean f44920f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i3, boolean z10) {
        this.h = f8Var;
        this.f44916a = h8Var;
        this.f44917b = f10;
        this.f44918c = f11;
        this.d = f12;
        this.f44919e = i3;
        this.f44920f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f44917b;
        h8 h8Var = this.f44916a;
        h8Var.f45850a = f10;
        h8Var.f45851b = this.f44918c;
        h8Var.f45852c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f45183w;
        int i3 = this.f44919e;
        sparseArray.remove(i3);
        if (!this.f44920f) {
            f8Var.f45184x.remove(i3);
        }
    }
}
