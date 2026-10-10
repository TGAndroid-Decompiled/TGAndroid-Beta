package org.telegram.ui;

import java.util.Iterator;
public final class gg1 implements org.telegram.ui.ActionBar.a2 {
    public final ig1 f38061a;

    public gg1(ig1 ig1Var) {
        this.f38061a = ig1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lg1 lg1Var = this.f38061a.f38680a;
        Iterator it = lg1Var.f39621e.iterator();
        while (it.hasNext()) {
            lg1.U(lg1Var, ((Integer) it.next()).intValue());
        }
        lg1Var.f39621e.clear();
        lg1Var.V();
    }
}
