package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p30 implements hg.a2 {
    public final q30 f29295a;

    public p30(q30 q30Var) {
        this.f29295a = q30Var;
    }

    @Override
    public final a0.i G() {
        return null;
    }

    @Override
    public final boolean Q(int i10) {
        return true;
    }

    @Override
    public final void f(int i10) {
        q30 q30Var = this.f29295a;
        r30 r30Var = q30Var.f29590w;
        if (i10 >= 0 && i10 == q30Var.f29587n && !q30Var.h) {
            boolean z10 = true;
            int i11 = q30Var.f29586f - 1;
            if (r30Var.f29008s.getVisibility() != 0) {
                z10 = false;
            }
            q30Var.l();
            if (q30Var.f29586f > i11) {
                r30Var.J(i11);
            }
            if (!q30Var.d.e() && r30Var.d.R0()) {
                r30Var.f29008s.e(false, z10);
            }
        }
    }

    @Override
    public final a0.i w() {
        return this.f29295a.f29590w.f29942e0;
    }

    @Override
    public final void Y(ArrayList arrayList) {
    }
}
