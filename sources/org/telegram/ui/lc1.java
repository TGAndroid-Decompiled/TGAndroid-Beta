package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class lc1 extends AnimatorListenerAdapter {
    public final boolean f38707a;
    public final int f38708b;
    public final int f38709c;
    public final boolean d;
    public final ed1 f38710e;

    public lc1(ed1 ed1Var, boolean z4, int i10, int i11, boolean z10) {
        this.f38710e = ed1Var;
        this.f38707a = z4;
        this.f38708b = i10;
        this.f38709c = i11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ed1 ed1Var = this.f38710e;
        FrameLayout[] frameLayoutArr = ed1Var.I0;
        ed1Var.f36525o1 = null;
        int i10 = this.f38709c;
        int i11 = this.f38708b;
        boolean z4 = this.f38707a;
        if (z4 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z4) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = ed1Var.f36489b;
        char c3 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.n81[] n81VarArr = ed1Var.G0;
        if (this.d) {
            c3 = 0;
        }
        n81VarArr[c3].setVisibility(4);
    }
}
