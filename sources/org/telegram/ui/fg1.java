package org.telegram.ui;

import java.util.Iterator;
public final class fg1 implements org.telegram.ui.ActionBar.z1 {
    public final hg1 f37679a;

    public fg1(hg1 hg1Var) {
        this.f37679a = hg1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        kg1 kg1Var = this.f37679a.f38408a;
        Iterator it = kg1Var.f39337e.iterator();
        while (it.hasNext()) {
            kg1.U(kg1Var, ((Integer) it.next()).intValue());
        }
        kg1Var.f39337e.clear();
        kg1Var.V();
    }
}
