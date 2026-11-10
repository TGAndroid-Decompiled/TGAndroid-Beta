package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class f71 extends AnimatorListenerAdapter {
    public final boolean f45634a;
    public final int f45635b;
    public final int f45636c;
    public final boolean d;
    public final x71 f45637e;

    public f71(x71 x71Var, boolean z9, int i7, int i10, boolean z10) {
        this.f45637e = x71Var;
        this.f45634a = z9;
        this.f45635b = i7;
        this.f45636c = i10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.f45637e;
        FrameLayout[] frameLayoutArr = x71Var.M0;
        x71Var.f51613s1 = null;
        int i7 = this.f45636c;
        int i10 = this.f45635b;
        boolean z9 = this.f45634a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = x71Var.f51565b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w61[] w61VarArr = x71Var.K0;
        if (this.d) {
            c10 = 0;
        }
        w61VarArr[c10].setVisibility(4);
    }
}
