package org.telegram.ui;

import java.util.Iterator;
public final class gg1 implements org.telegram.ui.ActionBar.b2 {
    public final ig1 f33969a;

    public gg1(ig1 ig1Var) {
        this.f33969a = ig1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        lg1 lg1Var = this.f33969a.f34564a;
        Iterator it = lg1Var.e.iterator();
        while (it.hasNext()) {
            lg1.U(lg1Var, ((Integer) it.next()).intValue());
        }
        lg1Var.e.clear();
        lg1Var.V();
    }
}
