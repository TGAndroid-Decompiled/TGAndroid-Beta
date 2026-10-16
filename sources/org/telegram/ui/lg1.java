package org.telegram.ui;

import java.util.Iterator;
public final class lg1 implements org.telegram.ui.ActionBar.z1 {
    public final ng1 f37746a;

    public lg1(ng1 ng1Var) {
        this.f37746a = ng1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        qg1 qg1Var = this.f37746a.f38393a;
        Iterator it = qg1Var.e.iterator();
        while (it.hasNext()) {
            qg1.U(qg1Var, ((Integer) it.next()).intValue());
        }
        qg1Var.e.clear();
        qg1Var.V();
    }
}
