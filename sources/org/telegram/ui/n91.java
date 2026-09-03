package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class n91 extends org.telegram.ui.Components.d81 {
    public final boolean f39237a;
    public final boolean f39238b;
    public final boolean f39239c;
    public final FrameLayout d;
    public final na1 f39240e;

    public n91(na1 na1Var, boolean z4, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f39240e = na1Var;
        this.f39237a = z4;
        this.f39238b = z10;
        this.f39239c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        na1 na1Var = this.f39240e;
        if (na1Var.f39261i0) {
            return na1Var.f39259g0;
        }
        boolean z4 = this.f39237a;
        FrameLayout frameLayout = this.d;
        if (z4) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f39238b) {
            if (i10 == 0) {
                return na1Var.f39259g0;
            }
            i10--;
        }
        if (this.f39239c && i10 == 0) {
            return na1Var.f39260h0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f39240e.f39261i0) {
            return 1;
        }
        return (this.f39237a ? 1 : 0) + (this.f39238b ? 1 : 0) + (this.f39239c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
