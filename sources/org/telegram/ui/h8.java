package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class h8 extends AnimatorListenerAdapter {
    public final k8 f34598a;
    public final float f34599b;
    public final float f34600c;
    public final float d;
    public final int e;
    public final boolean f34601f;
    public final i8 h;

    public h8(i8 i8Var, k8 k8Var, float f10, float f11, float f12, int i10, boolean z4) {
        this.h = i8Var;
        this.f34598a = k8Var;
        this.f34599b = f10;
        this.f34600c = f11;
        this.d = f12;
        this.e = i10;
        this.f34601f = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f10 = this.f34599b;
        k8 k8Var = this.f34598a;
        k8Var.f35439a = f10;
        k8Var.f35440b = this.f34600c;
        k8Var.f35441c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i8 i8Var = this.h;
        SparseArray sparseArray = i8Var.v;
        int i10 = this.e;
        sparseArray.remove(i10);
        if (!this.f34601f) {
            i8Var.f34835w.remove(i10);
        }
    }
}
