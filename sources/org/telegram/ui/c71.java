package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class c71 extends AnimatorListenerAdapter {
    public final boolean f44710a;
    public final int f44711b;
    public final int f44712c;
    public final boolean d;
    public final u71 f44713e;

    public c71(u71 u71Var, boolean z9, int i7, int i10, boolean z10) {
        this.f44713e = u71Var;
        this.f44710a = z9;
        this.f44711b = i7;
        this.f44712c = i10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u71 u71Var = this.f44713e;
        FrameLayout[] frameLayoutArr = u71Var.M0;
        u71Var.f50317s1 = null;
        int i7 = this.f44712c;
        int i10 = this.f44711b;
        boolean z9 = this.f44710a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = u71Var.f50269b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.w61[] w61VarArr = u71Var.K0;
        if (this.d) {
            c10 = 0;
        }
        w61VarArr[c10].setVisibility(4);
    }
}
