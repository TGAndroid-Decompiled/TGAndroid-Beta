package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class d8 extends AnimatorListenerAdapter {
    public final g8 f36522a;
    public final float f36523b;
    public final float f36524c;
    public final float d;
    public final int e;
    public final boolean f36525f;
    public final e8 h;

    public d8(e8 e8Var, g8 g8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = e8Var;
        this.f36522a = g8Var;
        this.f36523b = f7;
        this.f36524c = f10;
        this.d = f11;
        this.e = i10;
        this.f36525f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f36523b;
        g8 g8Var = this.f36522a;
        g8Var.f37373a = f7;
        g8Var.f37374b = this.f36524c;
        g8Var.f37375c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e8 e8Var = this.h;
        SparseArray sparseArray = e8Var.f36773w;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f36525f) {
            e8Var.f36774x.remove(i10);
        }
    }
}
