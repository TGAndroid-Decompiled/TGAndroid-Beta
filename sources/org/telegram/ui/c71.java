package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class c71 extends AnimatorListenerAdapter {
    public final boolean f44690a;
    public final int f44691b;
    public final int f44692c;
    public final boolean d;
    public final u71 f44693e;

    public c71(u71 u71Var, boolean z9, int i7, int i10, boolean z10) {
        this.f44693e = u71Var;
        this.f44690a = z9;
        this.f44691b = i7;
        this.f44692c = i10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u71 u71Var = this.f44693e;
        FrameLayout[] frameLayoutArr = u71Var.M0;
        u71Var.f50296s1 = null;
        int i7 = this.f44692c;
        int i10 = this.f44691b;
        boolean z9 = this.f44690a;
        if (z9 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z9) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = u71Var.f50248b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.q61[] q61VarArr = u71Var.K0;
        if (this.d) {
            c10 = 0;
        }
        q61VarArr[c10].setVisibility(4);
    }
}
