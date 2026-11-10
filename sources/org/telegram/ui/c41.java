package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class c41 extends org.telegram.ui.Components.m61 {
    public final boolean f44231a;
    public final boolean f44232b;
    public final boolean f44233c;
    public final FrameLayout d;
    public final e51 f44234e;

    public c41(e51 e51Var, boolean z9, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f44234e = e51Var;
        this.f44231a = z9;
        this.f44232b = z10;
        this.f44233c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        e51 e51Var = this.f44234e;
        if (e51Var.f45156n0) {
            return e51Var.f45151i0;
        }
        boolean z9 = this.f44231a;
        FrameLayout frameLayout = this.d;
        if (z9) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f44232b) {
            if (i7 == 0) {
                return e51Var.f45151i0;
            }
            i7--;
        }
        if (this.f44233c && i7 == 0) {
            return e51Var.f45152j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f44234e.f45156n0) {
            return 1;
        }
        return (this.f44231a ? 1 : 0) + (this.f44232b ? 1 : 0) + (this.f44233c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
