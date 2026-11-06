package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class a41 extends org.telegram.ui.Components.h61 {
    public final boolean f43539a;
    public final boolean f43540b;
    public final boolean f43541c;
    public final FrameLayout d;
    public final c51 f43542e;

    public a41(c51 c51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f43542e = c51Var;
        this.f43539a = z9;
        this.f43540b = z10;
        this.f43541c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f43542e;
        if (c51Var.f44661n0) {
            return c51Var.f44656i0;
        }
        boolean z9 = this.f43539a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f43540b) {
            if (i7 == 0) {
                return c51Var.f44656i0;
            }
            i7--;
        }
        if (this.f43541c && i7 == 0) {
            return c51Var.f44657j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f43542e.f44661n0) {
            return 1;
        }
        return (this.f43539a ? 1 : 0) + (this.f43540b ? 1 : 0) + (this.f43541c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
