package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.f91 {
    public final boolean f36199a;
    public final boolean f36200b;
    public final boolean f36201c;
    public final FrameLayout d;
    public final bb1 f36202e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f36202e = bb1Var;
        this.f36199a = z10;
        this.f36200b = z11;
        this.f36201c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f36202e;
        if (bb1Var.f36220l0) {
            return bb1Var.f36218j0;
        }
        boolean z10 = this.f36199a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36200b) {
            if (i10 == 0) {
                return bb1Var.f36218j0;
            }
            i10--;
        }
        if (this.f36201c && i10 == 0) {
            return bb1Var.f36219k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f36202e.f36220l0) {
            return 1;
        }
        return (this.f36199a ? 1 : 0) + (this.f36200b ? 1 : 0) + (this.f36201c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
