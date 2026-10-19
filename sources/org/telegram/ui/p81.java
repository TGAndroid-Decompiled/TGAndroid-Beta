package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class p81 extends org.telegram.ui.Components.v81 {
    public final boolean f40113a;
    public final boolean f40114b;
    public final boolean f40115c;
    public final FrameLayout d;
    public final p91 e;

    public p81(p91 p91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = p91Var;
        this.f40113a = z10;
        this.f40114b = z11;
        this.f40115c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        p91 p91Var = this.e;
        if (p91Var.f40136l0) {
            return p91Var.f40134j0;
        }
        boolean z10 = this.f40113a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40114b) {
            if (i10 == 0) {
                return p91Var.f40134j0;
            }
            i10--;
        }
        if (this.f40115c && i10 == 0) {
            return p91Var.f40135k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40136l0) {
            return 1;
        }
        return (this.f40113a ? 1 : 0) + (this.f40114b ? 1 : 0) + (this.f40115c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
