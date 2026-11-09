package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class o01 extends pj0 {
    public final ArrayList f36593c = new ArrayList();
    public String d;
    public final t01 f36594e;

    public o01(t01 t01Var) {
        this.f36594e = t01Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f36593c.size();
    }

    @Override
    public final void t(v4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        s01 s01Var = new s01(this.f36594e, viewGroup.getContext());
        s01Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(s01Var);
    }
}
