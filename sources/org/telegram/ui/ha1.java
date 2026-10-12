package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ha1 extends org.telegram.ui.Components.c91 {
    public final boolean f36680a;
    public final boolean f36681b;
    public final boolean f36682c;
    public final FrameLayout d;
    public final hb1 e;

    public ha1(hb1 hb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = hb1Var;
        this.f36680a = z10;
        this.f36681b = z11;
        this.f36682c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        hb1 hb1Var = this.e;
        if (hb1Var.f36701l0) {
            return hb1Var.f36699j0;
        }
        boolean z10 = this.f36680a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36681b) {
            if (i10 == 0) {
                return hb1Var.f36699j0;
            }
            i10--;
        }
        if (this.f36682c && i10 == 0) {
            return hb1Var.f36700k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f36701l0) {
            return 1;
        }
        return (this.f36680a ? 1 : 0) + (this.f36681b ? 1 : 0) + (this.f36682c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
