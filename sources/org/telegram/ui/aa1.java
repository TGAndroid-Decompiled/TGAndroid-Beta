package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class aa1 extends org.telegram.ui.Components.h91 {
    public final boolean f35956a;
    public final boolean f35957b;
    public final boolean f35958c;
    public final FrameLayout d;
    public final ab1 f35959e;

    public aa1(ab1 ab1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f35959e = ab1Var;
        this.f35956a = z10;
        this.f35957b = z11;
        this.f35958c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ab1 ab1Var = this.f35959e;
        if (ab1Var.f35977l0) {
            return ab1Var.f35975j0;
        }
        boolean z10 = this.f35956a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f35957b) {
            if (i10 == 0) {
                return ab1Var.f35975j0;
            }
            i10--;
        }
        if (this.f35958c && i10 == 0) {
            return ab1Var.f35976k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f35959e.f35977l0) {
            return 1;
        }
        return (this.f35956a ? 1 : 0) + (this.f35957b ? 1 : 0) + (this.f35958c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
