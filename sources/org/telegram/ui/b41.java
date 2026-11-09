package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class b41 extends org.telegram.ui.Components.n61 {
    public final boolean f43885a;
    public final boolean f43886b;
    public final boolean f43887c;
    public final FrameLayout d;
    public final d51 f43888e;

    public b41(d51 d51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f43888e = d51Var;
        this.f43885a = z9;
        this.f43886b = z10;
        this.f43887c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        d51 d51Var = this.f43888e;
        if (d51Var.f44843n0) {
            return d51Var.f44838i0;
        }
        boolean z9 = this.f43885a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f43886b) {
            if (i7 == 0) {
                return d51Var.f44838i0;
            }
            i7--;
        }
        if (this.f43887c && i7 == 0) {
            return d51Var.f44839j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f43888e.f44843n0) {
            return 1;
        }
        return (this.f43885a ? 1 : 0) + (this.f43886b ? 1 : 0) + (this.f43887c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
