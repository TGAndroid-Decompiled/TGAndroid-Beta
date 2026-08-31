package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f8 extends AnimatorListenerAdapter {
    public final i8 f36783a;
    public final float f36784b;
    public final float f36785c;
    public final float d;
    public final int f36786e;
    public final boolean f36787f;
    public final g8 h;

    public f8(g8 g8Var, i8 i8Var, float f10, float f11, float f12, int i10, boolean z4) {
        this.h = g8Var;
        this.f36783a = i8Var;
        this.f36784b = f10;
        this.f36785c = f11;
        this.d = f12;
        this.f36786e = i10;
        this.f36787f = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f36784b;
        i8 i8Var = this.f36783a;
        i8Var.f37769a = f10;
        i8Var.f37770b = this.f36785c;
        i8Var.f37771c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g8 g8Var = this.h;
        SparseArray sparseArray = g8Var.v;
        int i10 = this.f36786e;
        sparseArray.remove(i10);
        if (!this.f36787f) {
            g8Var.f37118w.remove(i10);
        }
    }
}
