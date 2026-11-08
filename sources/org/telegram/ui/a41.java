package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class a41 extends org.telegram.ui.Components.m61 {
    public final boolean f43566a;
    public final boolean f43567b;
    public final boolean f43568c;
    public final FrameLayout d;
    public final c51 f43569e;

    public a41(c51 c51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f43569e = c51Var;
        this.f43566a = z9;
        this.f43567b = z10;
        this.f43568c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f43569e;
        if (c51Var.f44684n0) {
            return c51Var.f44679i0;
        }
        boolean z9 = this.f43566a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f43567b) {
            if (i7 == 0) {
                return c51Var.f44679i0;
            }
            i7--;
        }
        if (this.f43568c && i7 == 0) {
            return c51Var.f44680j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f43569e.f44684n0) {
            return 1;
        }
        return (this.f43566a ? 1 : 0) + (this.f43567b ? 1 : 0) + (this.f43568c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
