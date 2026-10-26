package org.telegram.ui;

import java.util.Iterator;
public final class bf1 implements org.telegram.ui.ActionBar.b2 {
    public final df1 f38085a;

    public bf1(df1 df1Var) {
        this.f38085a = df1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        gf1 gf1Var = this.f38085a.f38858a;
        Iterator it = gf1Var.e.iterator();
        while (it.hasNext()) {
            gf1.V(gf1Var, ((Integer) it.next()).intValue());
        }
        gf1Var.e.clear();
        gf1Var.W();
    }
}
