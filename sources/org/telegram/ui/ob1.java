package org.telegram.ui;

import java.util.Iterator;
public final class ob1 implements org.telegram.ui.ActionBar.u1 {
    public final qb1 f40127a;

    public ob1(qb1 qb1Var) {
        this.f40127a = qb1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        tb1 tb1Var = this.f40127a.f40741a;
        Iterator it = tb1Var.e.iterator();
        while (it.hasNext()) {
            tb1.Z(tb1Var, ((Integer) it.next()).intValue());
        }
        tb1Var.e.clear();
        tb1Var.a0();
    }
}
