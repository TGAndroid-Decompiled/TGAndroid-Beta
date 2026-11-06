package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class a41 extends org.telegram.ui.Components.m61 {
    public final boolean f43563a;
    public final boolean f43564b;
    public final boolean f43565c;
    public final FrameLayout d;
    public final c51 f43566e;

    public a41(c51 c51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f43566e = c51Var;
        this.f43563a = z9;
        this.f43564b = z10;
        this.f43565c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f43566e;
        if (c51Var.f44681n0) {
            return c51Var.f44676i0;
        }
        boolean z9 = this.f43563a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f43564b) {
            if (i7 == 0) {
                return c51Var.f44676i0;
            }
            i7--;
        }
        if (this.f43565c && i7 == 0) {
            return c51Var.f44677j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f43566e.f44681n0) {
            return 1;
        }
        return (this.f43563a ? 1 : 0) + (this.f43564b ? 1 : 0) + (this.f43565c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
