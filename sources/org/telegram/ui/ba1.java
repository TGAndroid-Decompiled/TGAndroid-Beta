package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.a81 {
    public final boolean f34707a;
    public final boolean f34708b;
    public final boolean f34709c;
    public final FrameLayout d;
    public final bb1 f34710e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f34710e = bb1Var;
        this.f34707a = z10;
        this.f34708b = z11;
        this.f34709c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f34710e;
        if (bb1Var.f34733l0) {
            return bb1Var.f34731j0;
        }
        boolean z10 = this.f34707a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f34708b) {
            if (i10 == 0) {
                return bb1Var.f34731j0;
            }
            i10--;
        }
        if (this.f34709c && i10 == 0) {
            return bb1Var.f34732k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f34710e.f34733l0) {
            return 1;
        }
        return (this.f34707a ? 1 : 0) + (this.f34708b ? 1 : 0) + (this.f34709c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
