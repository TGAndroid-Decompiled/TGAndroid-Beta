package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class h91 extends org.telegram.ui.Components.e81 {
    public final boolean f37406a;
    public final boolean f37407b;
    public final boolean f37408c;
    public final FrameLayout d;
    public final ha1 f37409e;

    public h91(ha1 ha1Var, boolean z4, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.f37409e = ha1Var;
        this.f37406a = z4;
        this.f37407b = z10;
        this.f37408c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ha1 ha1Var = this.f37409e;
        if (ha1Var.f37429i0) {
            return ha1Var.f37427g0;
        }
        boolean z4 = this.f37406a;
        FrameLayout frameLayout = this.d;
        if (z4) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f37407b) {
            if (i10 == 0) {
                return ha1Var.f37427g0;
            }
            i10--;
        }
        if (this.f37408c && i10 == 0) {
            return ha1Var.f37428h0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f37409e.f37429i0) {
            return 1;
        }
        return (this.f37406a ? 1 : 0) + (this.f37407b ? 1 : 0) + (this.f37408c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
