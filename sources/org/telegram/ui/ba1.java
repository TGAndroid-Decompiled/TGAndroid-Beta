package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.a81 {
    public final boolean f34681a;
    public final boolean f34682b;
    public final boolean f34683c;
    public final FrameLayout d;
    public final bb1 f34684e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f34684e = bb1Var;
        this.f34681a = z10;
        this.f34682b = z11;
        this.f34683c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f34684e;
        if (bb1Var.f34707l0) {
            return bb1Var.f34705j0;
        }
        boolean z10 = this.f34681a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f34682b) {
            if (i10 == 0) {
                return bb1Var.f34705j0;
            }
            i10--;
        }
        if (this.f34683c && i10 == 0) {
            return bb1Var.f34706k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f34684e.f34707l0) {
            return 1;
        }
        return (this.f34681a ? 1 : 0) + (this.f34682b ? 1 : 0) + (this.f34683c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
