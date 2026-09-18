package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class cd1 extends AnimatorListenerAdapter {
    public final boolean f32636a;
    public final int f32637b;
    public final int f32638c;
    public final boolean d;
    public final vd1 e;

    public cd1(vd1 vd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = vd1Var;
        this.f32636a = z10;
        this.f32637b = i10;
        this.f32638c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vd1 vd1Var = this.e;
        FrameLayout[] frameLayoutArr = vd1Var.L0;
        vd1Var.f38515r1 = null;
        int i10 = this.f32638c;
        int i11 = this.f32637b;
        boolean z10 = this.f32636a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = vd1Var.f38470b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.y81[] y81VarArr = vd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        y81VarArr[c10].setVisibility(4);
    }
}
