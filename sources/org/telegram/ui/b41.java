package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class b41 extends org.telegram.ui.Components.b71 {
    public final boolean f45775a;
    public final boolean f45776b;
    public final boolean f45777c;
    public final FrameLayout d;
    public final c51 f45778e;

    public b41(c51 c51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f45778e = c51Var;
        this.f45775a = z10;
        this.f45776b = z11;
        this.f45777c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f45778e;
        if (c51Var.f46450o0) {
            return c51Var.f46445j0;
        }
        boolean z10 = this.f45775a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f45776b) {
            if (i7 == 0) {
                return c51Var.f46445j0;
            }
            i7--;
        }
        if (this.f45777c && i7 == 0) {
            return c51Var.f46446k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f45778e.f46450o0) {
            return 1;
        }
        return (this.f45775a ? 1 : 0) + (this.f45776b ? 1 : 0) + (this.f45777c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
