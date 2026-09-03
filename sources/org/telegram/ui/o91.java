package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class o91 extends org.telegram.ui.Components.c81 {
    public final boolean f36695a;
    public final boolean f36696b;
    public final boolean f36697c;
    public final FrameLayout d;
    public final oa1 e;

    public o91(oa1 oa1Var, boolean z4, boolean z10, boolean z11, FrameLayout frameLayout) {
        this.e = oa1Var;
        this.f36695a = z4;
        this.f36696b = z10;
        this.f36697c = z11;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        oa1 oa1Var = this.e;
        if (oa1Var.f36723i0) {
            return oa1Var.f36721g0;
        }
        boolean z4 = this.f36695a;
        FrameLayout frameLayout = this.d;
        if (z4) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36696b) {
            if (i10 == 0) {
                return oa1Var.f36721g0;
            }
            i10--;
        }
        if (this.f36697c && i10 == 0) {
            return oa1Var.f36722h0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f36723i0) {
            return 1;
        }
        return (this.f36695a ? 1 : 0) + (this.f36696b ? 1 : 0) + (this.f36697c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
