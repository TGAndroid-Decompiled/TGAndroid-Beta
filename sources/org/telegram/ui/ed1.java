package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class ed1 extends AnimatorListenerAdapter {
    public final boolean f37279a;
    public final int f37280b;
    public final int f37281c;
    public final boolean d;
    public final xd1 f37282e;

    public ed1(xd1 xd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f37282e = xd1Var;
        this.f37279a = z10;
        this.f37280b = i10;
        this.f37281c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.f37282e;
        FrameLayout[] frameLayoutArr = xd1Var.L0;
        xd1Var.f44030r1 = null;
        int i10 = this.f37281c;
        int i11 = this.f37280b;
        boolean z10 = this.f37279a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = xd1Var.f43984b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.q91[] q91VarArr = xd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        q91VarArr[c10].setVisibility(4);
    }
}
