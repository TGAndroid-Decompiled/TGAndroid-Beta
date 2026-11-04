package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class k01 extends sj0 {
    public final ArrayList f35234c = new ArrayList();
    public String d;
    public final n01 f35235e;

    public k01(n01 n01Var) {
        this.f35235e = n01Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f35234c.size();
    }

    @Override
    public final void t(u4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k01.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        m01 m01Var = new m01(this.f35235e, viewGroup.getContext());
        m01Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(m01Var);
    }
}
