package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class c11 extends dk0 {
    public final ArrayList f33982c = new ArrayList();
    public String d;
    public final h11 f33983e;

    public c11(h11 h11Var) {
        this.f33983e = h11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z10) {
        ek0 ek0Var = this.f33983e.f35748r;
        if (!z10) {
            f();
            return;
        }
        boolean canScrollVertically = ek0Var.canScrollVertically(-1);
        v4.o.c(new jg.g(this, arrayList, 3), true).c(this);
        if (!canScrollVertically) {
            ek0Var.v0(0);
        }
    }

    @Override
    public final int b() {
        return this.f33982c.size();
    }

    @Override
    public final void t(v4.f1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c11.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        g11 g11Var = new g11(this.f33983e, viewGroup.getContext());
        g11Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(g11Var);
    }
}
