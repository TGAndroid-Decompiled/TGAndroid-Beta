package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class q11 extends sk0 {
    public final ArrayList f29508c = new ArrayList();
    public final t11 d;

    public q11(t11 t11Var) {
        this.d = t11Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f29508c.size();
    }

    @Override
    public final void t(s4.c1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q11.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s11 s11Var = new s11(this.d, viewGroup.getContext());
        s11Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(s11Var);
    }
}
