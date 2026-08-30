package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zf0 extends AnimatorListenerAdapter {
    public final int f31338a;
    public final ag0 f31339b;

    public zf0(ag0 ag0Var, int i10) {
        this.f31338a = i10;
        this.f31339b = ag0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31338a) {
            case 0:
                ag0 ag0Var = this.f31339b;
                ag0Var.h = false;
                ag0Var.f23381a = ag0Var.f23383c;
                ag0Var.invalidate();
                int i10 = ag0Var.G;
                if (i10 >= 0) {
                    ag0Var.b(i10);
                    ag0Var.G = -1;
                    return;
                }
                return;
            default:
                ag0 ag0Var2 = this.f31339b;
                ag0Var2.f23385n = false;
                ag0Var2.h = false;
                ag0Var2.invalidate();
                int i11 = ag0Var2.G;
                if (i11 >= 0) {
                    ag0Var2.b(i11);
                    ag0Var2.G = -1;
                }
                ag0Var2.a();
                return;
        }
    }
}
