package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class qc1 extends AnimatorListenerAdapter {
    public final boolean f40432a;
    public final int f40433b;
    public final int f40434c;
    public final boolean d;
    public final jd1 f40435e;

    public qc1(jd1 jd1Var, boolean z4, int i10, int i11, boolean z10) {
        this.f40435e = jd1Var;
        this.f40432a = z4;
        this.f40433b = i10;
        this.f40434c = i11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jd1 jd1Var = this.f40435e;
        FrameLayout[] frameLayoutArr = jd1Var.I0;
        jd1Var.f38000o1 = null;
        int i10 = this.f40434c;
        int i11 = this.f40433b;
        boolean z4 = this.f40432a;
        if (z4 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = jd1Var.f37964b;
        char c3 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.m81[] m81VarArr = jd1Var.G0;
        if (this.d) {
            c3 = 0;
        }
        m81VarArr[c3].setVisibility(4);
    }
}
