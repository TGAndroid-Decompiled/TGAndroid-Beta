package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class k01 extends oj0 {
    public final ArrayList f35137c = new ArrayList();
    public String d;
    public final n01 f35138e;

    public k01(n01 n01Var) {
        this.f35138e = n01Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f35137c.size();
    }

    @Override
    public final void t(v4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        m01 m01Var = new m01(this.f35138e, viewGroup.getContext());
        m01Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(m01Var);
    }
}
