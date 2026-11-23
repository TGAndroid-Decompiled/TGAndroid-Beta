package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class a11 extends dk0 {
    public final ArrayList f33317c = new ArrayList();
    public String d;
    public final f11 f33318e;

    public a11(f11 f11Var) {
        this.f33318e = f11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z10) {
        ek0 ek0Var = this.f33318e.f34968r;
        if (!z10) {
            f();
            return;
        }
        boolean canScrollVertically = ek0Var.canScrollVertically(-1);
        v4.p.c(new jg.g(this, arrayList, 3), true).c(this);
        if (!canScrollVertically) {
            ek0Var.v0(0);
        }
    }

    @Override
    public final int b() {
        return this.f33317c.size();
    }

    @Override
    public final void t(v4.f1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a11.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        e11 e11Var = new e11(this.f33318e, viewGroup.getContext());
        e11Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(e11Var);
    }
}
