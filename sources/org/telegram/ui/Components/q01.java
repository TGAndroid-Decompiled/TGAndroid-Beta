package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class q01 extends tj0 {
    public final ArrayList f38458c = new ArrayList();
    public String d;
    public final v01 f38459e;

    public q01(v01 v01Var) {
        this.f38459e = v01Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f38458c.size();
    }

    @Override
    public final void t(v4.e1 r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q01.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        u01 u01Var = new u01(this.f38459e, viewGroup.getContext());
        u01Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(u01Var);
    }
}
