package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class p81 extends org.telegram.ui.Components.v81 {
    public final boolean f40122a;
    public final boolean f40123b;
    public final boolean f40124c;
    public final FrameLayout d;
    public final p91 e;

    public p81(p91 p91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = p91Var;
        this.f40122a = z10;
        this.f40123b = z11;
        this.f40124c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        p91 p91Var = this.e;
        if (p91Var.f40145l0) {
            return p91Var.f40143j0;
        }
        boolean z10 = this.f40122a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40123b) {
            if (i10 == 0) {
                return p91Var.f40143j0;
            }
            i10--;
        }
        if (this.f40124c && i10 == 0) {
            return p91Var.f40144k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40145l0) {
            return 1;
        }
        return (this.f40122a ? 1 : 0) + (this.f40123b ? 1 : 0) + (this.f40124c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
