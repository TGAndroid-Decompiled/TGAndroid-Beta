package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.g91 {
    public final boolean f36243a;
    public final boolean f36244b;
    public final boolean f36245c;
    public final FrameLayout d;
    public final bb1 f36246e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f36246e = bb1Var;
        this.f36243a = z10;
        this.f36244b = z11;
        this.f36245c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f36246e;
        if (bb1Var.f36264l0) {
            return bb1Var.f36262j0;
        }
        boolean z10 = this.f36243a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36244b) {
            if (i10 == 0) {
                return bb1Var.f36262j0;
            }
            i10--;
        }
        if (this.f36245c && i10 == 0) {
            return bb1Var.f36263k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f36246e.f36264l0) {
            return 1;
        }
        return (this.f36243a ? 1 : 0) + (this.f36244b ? 1 : 0) + (this.f36245c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
