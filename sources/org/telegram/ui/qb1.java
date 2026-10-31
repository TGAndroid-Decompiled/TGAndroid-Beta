package org.telegram.ui;

import java.util.Iterator;
public final class qb1 implements org.telegram.ui.ActionBar.u1 {
    public final sb1 f40949a;

    public qb1(sb1 sb1Var) {
        this.f40949a = sb1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        vb1 vb1Var = this.f40949a.f41465a;
        Iterator it = vb1Var.e.iterator();
        while (it.hasNext()) {
            vb1.Y(vb1Var, ((Integer) it.next()).intValue());
        }
        vb1Var.e.clear();
        vb1Var.Z();
    }
}
