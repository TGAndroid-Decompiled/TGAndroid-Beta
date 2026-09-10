package org.telegram.ui.Components;

import java.util.ArrayList;
public final class z30 implements fg.c2 {
    public final a40 f29580a;

    public z30(a40 a40Var) {
        this.f29580a = a40Var;
    }

    @Override
    public final a0.i D() {
        return this.f29580a.f21385w.f21708e0;
    }

    @Override
    public final a0.i P() {
        return null;
    }

    @Override
    public final void a(int i10) {
        a40 a40Var = this.f29580a;
        b40 b40Var = a40Var.f21385w;
        if (i10 >= 0 && i10 == a40Var.f21382n && !a40Var.h) {
            boolean z10 = true;
            int i11 = a40Var.f21381f - 1;
            if (b40Var.f21749s.getVisibility() != 0) {
                z10 = false;
            }
            a40Var.l();
            if (a40Var.f21381f > i11) {
                b40Var.J(i11);
            }
            if (!a40Var.d.e() && b40Var.d.R0()) {
                b40Var.f21749s.e(false, z10);
            }
        }
    }

    @Override
    public final boolean c0(int i10) {
        return true;
    }

    @Override
    public final void k0(ArrayList arrayList) {
    }
}
