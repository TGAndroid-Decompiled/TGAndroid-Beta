package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class ed1 extends AnimatorListenerAdapter {
    public final boolean f33336a;
    public final int f33337b;
    public final int f33338c;
    public final boolean d;
    public final xd1 e;

    public ed1(xd1 xd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = xd1Var;
        this.f33336a = z10;
        this.f33337b = i10;
        this.f33338c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.e;
        FrameLayout[] frameLayoutArr = xd1Var.L0;
        xd1Var.f39542r1 = null;
        int i10 = this.f33338c;
        int i11 = this.f33337b;
        boolean z10 = this.f33336a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = xd1Var.f39497b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.a91[] a91VarArr = xd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        a91VarArr[c10].setVisibility(4);
    }
}
