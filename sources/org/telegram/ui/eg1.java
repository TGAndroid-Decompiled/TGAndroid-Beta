package org.telegram.ui;

import java.util.Iterator;
public final class eg1 implements org.telegram.ui.ActionBar.a2 {
    public final gg1 f33277a;

    public eg1(gg1 gg1Var) {
        this.f33277a = gg1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jg1 jg1Var = this.f33277a.f33843a;
        Iterator it = jg1Var.e.iterator();
        while (it.hasNext()) {
            jg1.U(jg1Var, ((Integer) it.next()).intValue());
        }
        jg1Var.e.clear();
        jg1Var.V();
    }
}
