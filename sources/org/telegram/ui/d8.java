package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f44883a;
    public final float f44884b;
    public final float f44885c;
    public final float d;
    public final int f44886e;
    public final boolean f44887f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f10, float f11, float f12, int i7, boolean z9) {
        this.h = e8Var;
        this.f44883a = g8Var;
        this.f44884b = f10;
        this.f44885c = f11;
        this.d = f12;
        this.f44886e = i7;
        this.f44887f = z9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f44884b;
        g8 g8Var = this.f44883a;
        g8Var.f45932a = f10;
        g8Var.f45933b = this.f44885c;
        g8Var.f45934c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f45325w;
        int i7 = this.f44886e;
        sparseArray.remove(i7);
        if (!this.f44887f) {
            e8Var.f45326x.remove(i7);
        }
    }
}
