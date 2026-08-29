package org.telegram.ui;

import java.util.Iterator;
public final class af1 implements org.telegram.ui.ActionBar.b2 {
    public final cf1 f36542a;

    public af1(cf1 cf1Var) {
        this.f36542a = cf1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ff1 ff1Var = this.f36542a.f37098a;
        Iterator it = ff1Var.f38146e.iterator();
        while (it.hasNext()) {
            ff1.U(ff1Var, ((Integer) it.next()).intValue());
        }
        ff1Var.f38146e.clear();
        ff1Var.V();
    }
}
