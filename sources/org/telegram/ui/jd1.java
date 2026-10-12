package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class jd1 extends AnimatorListenerAdapter {
    public final boolean f37357a;
    public final int f37358b;
    public final int f37359c;
    public final boolean d;
    public final ce1 e;

    public jd1(ce1 ce1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = ce1Var;
        this.f37357a = z10;
        this.f37358b = i10;
        this.f37359c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ce1 ce1Var = this.e;
        FrameLayout[] frameLayoutArr = ce1Var.L0;
        ce1Var.f34901r1 = null;
        int i10 = this.f37359c;
        int i11 = this.f37358b;
        boolean z10 = this.f37357a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = ce1Var.f34856b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.l91[] l91VarArr = ce1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        l91VarArr[c10].setVisibility(4);
    }
}
