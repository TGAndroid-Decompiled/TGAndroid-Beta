package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class e71 extends AnimatorListenerAdapter {
    public final boolean f45313a;
    public final int f45314b;
    public final int f45315c;
    public final boolean d;
    public final w71 f45316e;

    public e71(w71 w71Var, boolean z9, int i7, int i10, boolean z10) {
        this.f45316e = w71Var;
        this.f45313a = z9;
        this.f45314b = i7;
        this.f45315c = i10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w71 w71Var = this.f45316e;
        FrameLayout[] frameLayoutArr = w71Var.M0;
        w71Var.f50954s1 = null;
        int i7 = this.f45315c;
        int i10 = this.f45314b;
        boolean z9 = this.f45313a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = w71Var.f50906b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.x61[] x61VarArr = w71Var.K0;
        if (this.d) {
            c10 = 0;
        }
        x61VarArr[c10].setVisibility(4);
    }
}
