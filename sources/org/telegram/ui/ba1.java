package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.o81 {
    public final boolean f32306a;
    public final boolean f32307b;
    public final boolean f32308c;
    public final FrameLayout d;
    public final bb1 e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = bb1Var;
        this.f32306a = z10;
        this.f32307b = z11;
        this.f32308c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.e;
        if (bb1Var.f32328l0) {
            return bb1Var.f32326j0;
        }
        boolean z10 = this.f32306a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f32307b) {
            if (i10 == 0) {
                return bb1Var.f32326j0;
            }
            i10--;
        }
        if (this.f32308c && i10 == 0) {
            return bb1Var.f32327k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f32328l0) {
            return 1;
        }
        return (this.f32306a ? 1 : 0) + (this.f32307b ? 1 : 0) + (this.f32308c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
