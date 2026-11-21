package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class b41 extends org.telegram.ui.Components.b71 {
    public final boolean f45771a;
    public final boolean f45772b;
    public final boolean f45773c;
    public final FrameLayout d;
    public final c51 f45774e;

    public b41(c51 c51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f45774e = c51Var;
        this.f45771a = z10;
        this.f45772b = z11;
        this.f45773c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f45774e;
        if (c51Var.f46447o0) {
            return c51Var.f46442j0;
        }
        boolean z10 = this.f45771a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f45772b) {
            if (i7 == 0) {
                return c51Var.f46442j0;
            }
            i7--;
        }
        if (this.f45773c && i7 == 0) {
            return c51Var.f46443k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f45774e.f46447o0) {
            return 1;
        }
        return (this.f45771a ? 1 : 0) + (this.f45772b ? 1 : 0) + (this.f45773c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
