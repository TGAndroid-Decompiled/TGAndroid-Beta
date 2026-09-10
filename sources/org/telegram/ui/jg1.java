package org.telegram.ui;

import java.util.Iterator;
public final class jg1 implements org.telegram.ui.ActionBar.c2 {
    public final lg1 f34099a;

    public jg1(lg1 lg1Var) {
        this.f34099a = lg1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        og1 og1Var = this.f34099a.f34714a;
        Iterator it = og1Var.e.iterator();
        while (it.hasNext()) {
            og1.U(og1Var, ((Integer) it.next()).intValue());
        }
        og1Var.e.clear();
        og1Var.V();
    }
}
