package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class qc1 extends AnimatorListenerAdapter {
    public final boolean f37385a;
    public final int f37386b;
    public final int f37387c;
    public final boolean d;
    public final jd1 e;

    public qc1(jd1 jd1Var, boolean z4, int i10, int i11, boolean z10) {
        this.e = jd1Var;
        this.f37385a = z4;
        this.f37386b = i10;
        this.f37387c = i11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        jd1 jd1Var = this.e;
        FrameLayout[] frameLayoutArr = jd1Var.I0;
        jd1Var.f35217o1 = null;
        int i10 = this.f37387c;
        int i11 = this.f37386b;
        boolean z4 = this.f37385a;
        if (z4 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = jd1Var.f35182b;
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
