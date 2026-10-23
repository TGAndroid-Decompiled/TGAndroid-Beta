package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class p81 extends org.telegram.ui.Components.w81 {
    public final boolean f40123a;
    public final boolean f40124b;
    public final boolean f40125c;
    public final FrameLayout d;
    public final p91 e;

    public p81(p91 p91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = p91Var;
        this.f40123a = z10;
        this.f40124b = z11;
        this.f40125c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        p91 p91Var = this.e;
        if (p91Var.f40146l0) {
            return p91Var.f40144j0;
        }
        boolean z10 = this.f40123a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40124b) {
            if (i10 == 0) {
                return p91Var.f40144j0;
            }
            i10--;
        }
        if (this.f40125c && i10 == 0) {
            return p91Var.f40145k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40146l0) {
            return 1;
        }
        return (this.f40123a ? 1 : 0) + (this.f40124b ? 1 : 0) + (this.f40125c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
