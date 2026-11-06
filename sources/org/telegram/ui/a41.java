package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class a41 extends org.telegram.ui.Components.l61 {
    public final boolean f43564a;
    public final boolean f43565b;
    public final boolean f43566c;
    public final FrameLayout d;
    public final c51 f43567e;

    public a41(c51 c51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f43567e = c51Var;
        this.f43564a = z9;
        this.f43565b = z10;
        this.f43566c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f43567e;
        if (c51Var.f44682n0) {
            return c51Var.f44677i0;
        }
        boolean z9 = this.f43564a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f43565b) {
            if (i7 == 0) {
                return c51Var.f44677i0;
            }
            i7--;
        }
        if (this.f43566c && i7 == 0) {
            return c51Var.f44678j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f43567e.f44682n0) {
            return 1;
        }
        return (this.f43564a ? 1 : 0) + (this.f43565b ? 1 : 0) + (this.f43566c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
