package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class m01 extends oj0 {
    public final ArrayList f35812c = new ArrayList();
    public String d;
    public final r01 f35813e;

    public m01(r01 r01Var) {
        this.f35813e = r01Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f35812c.size();
    }

    @Override
    public final void t(v4.d1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        q01 q01Var = new q01(this.f35813e, viewGroup.getContext());
        q01Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(q01Var);
    }
}
