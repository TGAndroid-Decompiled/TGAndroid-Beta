package org.telegram.ui;

import java.util.Iterator;
public final class n91 implements org.telegram.ui.ActionBar.p1 {
    public final p91 f47921a;

    public n91(p91 p91Var) {
        this.f47921a = p91Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        s91 s91Var = this.f47921a.f48498a;
        Iterator it = s91Var.f49454e.iterator();
        while (it.hasNext()) {
            s91.Z(s91Var, ((Integer) it.next()).intValue());
        }
        s91Var.f49454e.clear();
        s91Var.a0();
    }
}
