package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.a81 {
    public final boolean f34708a;
    public final boolean f34709b;
    public final boolean f34710c;
    public final FrameLayout d;
    public final bb1 f34711e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f34711e = bb1Var;
        this.f34708a = z10;
        this.f34709b = z11;
        this.f34710c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.f34711e;
        if (bb1Var.f34734l0) {
            return bb1Var.f34732j0;
        }
        boolean z10 = this.f34708a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f34709b) {
            if (i10 == 0) {
                return bb1Var.f34732j0;
            }
            i10--;
        }
        if (this.f34710c && i10 == 0) {
            return bb1Var.f34733k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f34711e.f34734l0) {
            return 1;
        }
        return (this.f34708a ? 1 : 0) + (this.f34709b ? 1 : 0) + (this.f34710c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
