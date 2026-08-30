package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class g91 extends org.telegram.ui.Components.c81 {
    public final boolean f34520a;
    public final boolean f34521b;
    public final boolean f34522c;
    public final FrameLayout d;
    public final ga1 e;

    public g91(ga1 ga1Var, boolean z4, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = ga1Var;
        this.f34520a = z4;
        this.f34521b = z10;
        this.f34522c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ga1 ga1Var = this.e;
        if (ga1Var.f34539i0) {
            return ga1Var.f34537g0;
        }
        boolean z4 = this.f34520a;
        FrameLayout frameLayout = this.d;
        if (z4) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f34521b) {
            if (i10 == 0) {
                return ga1Var.f34537g0;
            }
            i10--;
        }
        if (this.f34522c && i10 == 0) {
            return ga1Var.f34538h0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f34539i0) {
            return 1;
        }
        return (this.f34520a ? 1 : 0) + (this.f34521b ? 1 : 0) + (this.f34522c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
