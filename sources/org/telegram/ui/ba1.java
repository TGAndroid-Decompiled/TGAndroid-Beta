package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class ba1 extends org.telegram.ui.Components.q81 {
    public final boolean f32324a;
    public final boolean f32325b;
    public final boolean f32326c;
    public final FrameLayout d;
    public final bb1 e;

    public ba1(bb1 bb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = bb1Var;
        this.f32324a = z10;
        this.f32325b = z11;
        this.f32326c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        bb1 bb1Var = this.e;
        if (bb1Var.f32346l0) {
            return bb1Var.f32344j0;
        }
        boolean z10 = this.f32324a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f32325b) {
            if (i10 == 0) {
                return bb1Var.f32344j0;
            }
            i10--;
        }
        if (this.f32326c && i10 == 0) {
            return bb1Var.f32345k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f32346l0) {
            return 1;
        }
        return (this.f32324a ? 1 : 0) + (this.f32325b ? 1 : 0) + (this.f32326c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
