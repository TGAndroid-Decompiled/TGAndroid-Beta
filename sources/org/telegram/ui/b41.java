package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class b41 extends org.telegram.ui.Components.y61 {
    public final boolean f45752a;
    public final boolean f45753b;
    public final boolean f45754c;
    public final FrameLayout d;
    public final c51 f45755e;

    public b41(c51 c51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f45755e = c51Var;
        this.f45752a = z10;
        this.f45753b = z11;
        this.f45754c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f45755e;
        if (c51Var.f46424o0) {
            return c51Var.f46419j0;
        }
        boolean z10 = this.f45752a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f45753b) {
            if (i7 == 0) {
                return c51Var.f46419j0;
            }
            i7--;
        }
        if (this.f45754c && i7 == 0) {
            return c51Var.f46420k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f45755e.f46424o0) {
            return 1;
        }
        return (this.f45752a ? 1 : 0) + (this.f45753b ? 1 : 0) + (this.f45754c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
