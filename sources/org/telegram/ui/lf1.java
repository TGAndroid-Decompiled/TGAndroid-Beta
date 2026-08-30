package org.telegram.ui;

import java.util.Iterator;
public final class lf1 implements org.telegram.ui.ActionBar.c2 {
    public final nf1 f36077a;

    public lf1(nf1 nf1Var) {
        this.f36077a = nf1Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        qf1 qf1Var = this.f36077a.f36618a;
        Iterator it = qf1Var.e.iterator();
        while (it.hasNext()) {
            qf1.U(qf1Var, ((Integer) it.next()).intValue());
        }
        qf1Var.e.clear();
        qf1Var.V();
    }
}
