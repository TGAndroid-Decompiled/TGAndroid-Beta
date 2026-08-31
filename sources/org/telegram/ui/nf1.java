package org.telegram.ui;

import java.util.Iterator;
public final class nf1 implements org.telegram.ui.ActionBar.c2 {
    public final pf1 f39424a;

    public nf1(pf1 pf1Var) {
        this.f39424a = pf1Var;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        sf1 sf1Var = this.f39424a.f40030a;
        Iterator it = sf1Var.f41280e.iterator();
        while (it.hasNext()) {
            sf1.U(sf1Var, ((Integer) it.next()).intValue());
        }
        sf1Var.f41280e.clear();
        sf1Var.V();
    }
}
