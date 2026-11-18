package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class b41 extends org.telegram.ui.Components.y61 {
    public final boolean f45742a;
    public final boolean f45743b;
    public final boolean f45744c;
    public final FrameLayout d;
    public final c51 f45745e;

    public b41(c51 c51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f45745e = c51Var;
        this.f45742a = z10;
        this.f45743b = z11;
        this.f45744c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        c51 c51Var = this.f45745e;
        if (c51Var.f46415o0) {
            return c51Var.f46410j0;
        }
        boolean z10 = this.f45742a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f45743b) {
            if (i7 == 0) {
                return c51Var.f46410j0;
            }
            i7--;
        }
        if (this.f45744c && i7 == 0) {
            return c51Var.f46411k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f45745e.f46415o0) {
            return 1;
        }
        return (this.f45742a ? 1 : 0) + (this.f45743b ? 1 : 0) + (this.f45744c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
