package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class b41 extends org.telegram.ui.Components.b71 {
    public final boolean f45726a;
    public final boolean f45727b;
    public final boolean f45728c;
    public final FrameLayout d;
    public final c51 f45729e;

    public b41(c51 c51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f45729e = c51Var;
        this.f45726a = z10;
        this.f45727b = z11;
        this.f45728c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f45729e;
        if (c51Var.f46434o0) {
            return c51Var.f46429j0;
        }
        boolean z10 = this.f45726a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f45727b) {
            if (i7 == 0) {
                return c51Var.f46429j0;
            }
            i7--;
        }
        if (this.f45728c && i7 == 0) {
            return c51Var.f46430k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f45729e.f46434o0) {
            return 1;
        }
        return (this.f45726a ? 1 : 0) + (this.f45727b ? 1 : 0) + (this.f45728c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
