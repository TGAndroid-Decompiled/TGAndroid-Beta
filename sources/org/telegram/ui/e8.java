package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f33299a;
    public final float f33300b;
    public final float f33301c;
    public final float d;
    public final int e;
    public final boolean f33302f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f7, float f10, float f11, int i10, boolean z10) {
        this.h = f8Var;
        this.f33299a = h8Var;
        this.f33300b = f7;
        this.f33301c = f10;
        this.d = f11;
        this.e = i10;
        this.f33302f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f7 = this.f33300b;
        h8 h8Var = this.f33299a;
        h8Var.f34152a = f7;
        h8Var.f34153b = this.f33301c;
        h8Var.f34154c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f33302f) {
            f8Var.f33563w.remove(i10);
        }
    }
}
