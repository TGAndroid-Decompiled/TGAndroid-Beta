package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class e8 extends AnimatorListenerAdapter {
    public final h8 f46624a;
    public final float f46625b;
    public final float f46626c;
    public final float d;
    public final int f46627e;
    public final boolean f46628f;
    public final f8 h;

    public e8(f8 f8Var, h8 h8Var, float f10, float f11, float f12, int i7, boolean z10) {
        this.h = f8Var;
        this.f46624a = h8Var;
        this.f46625b = f10;
        this.f46626c = f11;
        this.d = f12;
        this.f46627e = i7;
        this.f46628f = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f46625b;
        h8 h8Var = this.f46624a;
        h8Var.f47639a = f10;
        h8Var.f47640b = this.f46626c;
        h8Var.f47641c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f8 f8Var = this.h;
        SparseArray sparseArray = f8Var.f47056w;
        int i7 = this.f46627e;
        sparseArray.remove(i7);
        if (!this.f46628f) {
            f8Var.f47057x.remove(i7);
        }
    }
}
