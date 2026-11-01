package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class r11 extends tk0 {
    public final ArrayList f29856c = new ArrayList();
    public String d;
    public final u11 e;

    public r11(u11 u11Var) {
        this.e = u11Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f29856c.size();
    }

    @Override
    public final void t(s4.c1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        t11 t11Var = new t11(this.e, viewGroup.getContext());
        t11Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(t11Var);
    }
}
