package org.telegram.ui;

import java.util.Iterator;
public final class mg1 implements org.telegram.ui.ActionBar.z1 {
    public final og1 f38258a;

    public mg1(og1 og1Var) {
        this.f38258a = og1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        rg1 rg1Var = this.f38258a.f38954a;
        Iterator it = rg1Var.e.iterator();
        while (it.hasNext()) {
            rg1.U(rg1Var, ((Integer) it.next()).intValue());
        }
        rg1Var.e.clear();
        rg1Var.V();
    }
}
