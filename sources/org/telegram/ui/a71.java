package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class a71 extends AnimatorListenerAdapter {
    public final boolean f44952a;
    public final int f44953b;
    public final int f44954c;
    public final boolean d;
    public final t71 f44955e;

    public a71(t71 t71Var, boolean z10, int i7, int i10, boolean z11) {
        this.f44955e = t71Var;
        this.f44952a = z10;
        this.f44953b = i7;
        this.f44954c = i10;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        t71 t71Var = this.f44955e;
        FrameLayout[] frameLayoutArr = t71Var.N0;
        t71Var.f51463t1 = null;
        int i7 = this.f44954c;
        int i10 = this.f44953b;
        boolean z10 = this.f44952a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = t71Var.f51412b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.x61[] x61VarArr = t71Var.L0;
        if (this.d) {
            c10 = 0;
        }
        x61VarArr[c10].setVisibility(4);
    }
}
