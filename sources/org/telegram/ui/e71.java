package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f47156a;
    public final int f47157b;
    public final int f47158c;
    public final boolean d;
    public final x71 f47159e;

    public e71(x71 x71Var, boolean z10, int i7, int i10, boolean z11) {
        this.f47159e = x71Var;
        this.f47156a = z10;
        this.f47157b = i7;
        this.f47158c = i10;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        x71 x71Var = this.f47159e;
        FrameLayout[] frameLayoutArr = x71Var.N0;
        x71Var.f53692t1 = null;
        int i7 = this.f47158c;
        int i10 = this.f47157b;
        boolean z10 = this.f47156a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = x71Var.f53641b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.k71[] k71VarArr = x71Var.L0;
        if (this.d) {
            c10 = 0;
        }
        k71VarArr[c10].setVisibility(4);
    }
}
