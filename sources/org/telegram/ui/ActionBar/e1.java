package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class e1 extends AnimatorListenerAdapter {

    public final boolean f22872a;

    public final int f22873b;

    public final int f22874c;
    public final int d;

    public final f1 f22875e;

    public e1(f1 f1Var, boolean z10, int i10, int i11, int i12) {
        this.f22875e = f1Var;
        this.f22872a = z10;
        this.f22873b = i10;
        this.f22874c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10 = this.f22872a ? 1.0f : 0.0f;
        int i10 = this.f22873b;
        int i11 = this.f22874c;
        int iD = i0.b.d(f10, i10, i11);
        f1 f1Var = this.f22875e;
        f1Var.setTextColor(iD);
        f1Var.setIconColor(i0.b.d(f10, this.d, i11));
    }
}
