package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class n01 extends oj0 {
    public final ArrayList f36185c = new ArrayList();
    public String d;
    public final s01 f36186e;

    public n01(s01 s01Var) {
        this.f36186e = s01Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f36185c.size();
    }

    @Override
    public final void t(v4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        r01 r01Var = new r01(this.f36186e, viewGroup.getContext());
        r01Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(r01Var);
    }
}
