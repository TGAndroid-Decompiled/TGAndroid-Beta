package org.telegram.ui;

import java.util.Iterator;
public final class eg1 implements org.telegram.ui.ActionBar.a2 {
    public final gg1 f33333a;

    public eg1(gg1 gg1Var) {
        this.f33333a = gg1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jg1 jg1Var = this.f33333a.f33901a;
        Iterator it = jg1Var.e.iterator();
        while (it.hasNext()) {
            jg1.U(jg1Var, ((Integer) it.next()).intValue());
        }
        jg1Var.e.clear();
        jg1Var.V();
    }
}
