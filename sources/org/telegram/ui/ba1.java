package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.a81 {
    public final boolean f34680a;
    public final boolean f34681b;
    public final boolean f34682c;
    public final FrameLayout d;
    public final bb1 f34683e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f34683e = bb1Var;
        this.f34680a = z10;
        this.f34681b = z11;
        this.f34682c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f34683e;
        if (bb1Var.f34706l0) {
            return bb1Var.f34704j0;
        }
        boolean z10 = this.f34680a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f34681b) {
            if (i10 == 0) {
                return bb1Var.f34704j0;
            }
            i10--;
        }
        if (this.f34682c && i10 == 0) {
            return bb1Var.f34705k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f34683e.f34706l0) {
            return 1;
        }
        return (this.f34680a ? 1 : 0) + (this.f34681b ? 1 : 0) + (this.f34682c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
