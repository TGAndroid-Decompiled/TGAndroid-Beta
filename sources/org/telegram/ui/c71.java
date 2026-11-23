package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class c71 extends AnimatorListenerAdapter {
    public final boolean f46729a;
    public final int f46730b;
    public final int f46731c;
    public final boolean d;
    public final v71 f46732e;

    public c71(v71 v71Var, boolean z10, int i7, int i10, boolean z11) {
        this.f46732e = v71Var;
        this.f46729a = z10;
        this.f46730b = i7;
        this.f46731c = i10;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        v71 v71Var = this.f46732e;
        FrameLayout[] frameLayoutArr = v71Var.N0;
        v71Var.f52900t1 = null;
        int i7 = this.f46731c;
        int i10 = this.f46730b;
        boolean z10 = this.f46729a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i7].setVisibility(4);
        }
        int i11 = v71Var.f52849b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i7 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.l71[] l71VarArr = v71Var.L0;
        if (this.d) {
            c10 = 0;
        }
        l71VarArr[c10].setVisibility(4);
    }
}
