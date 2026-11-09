package org.telegram.ui.Components;

import java.util.ArrayList;
public final class g20 implements jg.y1 {
    public final h20 f33850a;

    public g20(h20 h20Var) {
        this.f33850a = h20Var;
    }

    @Override
    public final a0.h X0() {
        return null;
    }

    @Override
    public final boolean k1(int i7) {
        return true;
    }

    @Override
    public final void q(int i7) {
        h20 h20Var = this.f33850a;
        i20 i20Var = h20Var.f34160x;
        if (i7 >= 0 && i7 == h20Var.f34156n && !h20Var.h) {
            boolean z9 = true;
            int i10 = h20Var.f34155f - 1;
            if (i20Var.f32534q1.getVisibility() != 0) {
                z9 = false;
            }
            h20Var.f();
            if (h20Var.f34155f > i10) {
                i20Var.O0(i10);
            }
            if (!h20Var.d.e() && i20Var.f32530k1.R0()) {
                i20Var.f32534q1.e(false, z9);
            }
        }
    }

    @Override
    public final a0.h v0() {
        return this.f33850a.f34160x.V1;
    }

    @Override
    public final void m1(ArrayList arrayList) {
    }
}
