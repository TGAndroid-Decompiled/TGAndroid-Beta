package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class ed1 extends AnimatorListenerAdapter {
    public final boolean f37235a;
    public final int f37236b;
    public final int f37237c;
    public final boolean d;
    public final xd1 f37238e;

    public ed1(xd1 xd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f37238e = xd1Var;
        this.f37235a = z10;
        this.f37236b = i10;
        this.f37237c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.f37238e;
        FrameLayout[] frameLayoutArr = xd1Var.L0;
        xd1Var.f43986r1 = null;
        int i10 = this.f37237c;
        int i11 = this.f37236b;
        boolean z10 = this.f37235a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = xd1Var.f43940b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.p91[] p91VarArr = xd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        p91VarArr[c10].setVisibility(4);
    }
}
