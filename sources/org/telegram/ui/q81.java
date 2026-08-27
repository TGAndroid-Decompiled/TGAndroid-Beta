package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

public final class q81 extends org.telegram.ui.Components.g71 {

    public final boolean f41540a;

    public final boolean f41541b;

    public final boolean f41542c;
    public final FrameLayout d;

    public final q91 f41543e;

    public q81(q91 q91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f41543e = q91Var;
        this.f41540a = z10;
        this.f41541b = z11;
        this.f41542c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        q91 q91Var = this.f41543e;
        if (q91Var.f41561h0) {
            return q91Var.f41559f0;
        }
        boolean z10 = this.f41540a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f41541b) {
            if (i10 == 0) {
                return q91Var.f41559f0;
            }
            i10--;
        }
        return (this.f41542c && i10 == 0) ? q91Var.f41560g0 : frameLayout;
    }

    @Override
    public final int e() {
        if (this.f41543e.f41561h0) {
            return 1;
        }
        return (this.f41540a ? 1 : 0) + (this.f41541b ? 1 : 0) + (this.f41542c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
