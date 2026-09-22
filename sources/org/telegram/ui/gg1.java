package org.telegram.ui;

import java.util.Iterator;
public final class gg1 implements org.telegram.ui.ActionBar.a2 {
    public final ig1 f33913a;

    public gg1(ig1 ig1Var) {
        this.f33913a = ig1Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lg1 lg1Var = this.f33913a.f34582a;
        Iterator it = lg1Var.e.iterator();
        while (it.hasNext()) {
            lg1.U(lg1Var, ((Integer) it.next()).intValue());
        }
        lg1Var.e.clear();
        lg1Var.V();
    }
}
