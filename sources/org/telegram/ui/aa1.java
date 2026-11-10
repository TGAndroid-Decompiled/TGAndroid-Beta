package org.telegram.ui;

import java.util.Iterator;
public final class aa1 implements org.telegram.ui.ActionBar.r1 {
    public final ca1 f43624a;

    public aa1(ca1 ca1Var) {
        this.f43624a = ca1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        fa1 fa1Var = this.f43624a.f44287a;
        Iterator it = fa1Var.f45672e.iterator();
        while (it.hasNext()) {
            fa1.Z(fa1Var, ((Integer) it.next()).intValue());
        }
        fa1Var.f45672e.clear();
        fa1Var.a0();
    }
}
