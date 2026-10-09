package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.f91 {
    public final boolean f36197a;
    public final boolean f36198b;
    public final boolean f36199c;
    public final FrameLayout d;
    public final bb1 f36200e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f36200e = bb1Var;
        this.f36197a = z10;
        this.f36198b = z11;
        this.f36199c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f36200e;
        if (bb1Var.f36218l0) {
            return bb1Var.f36216j0;
        }
        boolean z10 = this.f36197a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36198b) {
            if (i10 == 0) {
                return bb1Var.f36216j0;
            }
            i10--;
        }
        if (this.f36199c && i10 == 0) {
            return bb1Var.f36217k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f36200e.f36218l0) {
            return 1;
        }
        return (this.f36197a ? 1 : 0) + (this.f36198b ? 1 : 0) + (this.f36199c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
