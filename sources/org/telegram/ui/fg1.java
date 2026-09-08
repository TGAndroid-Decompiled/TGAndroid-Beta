package org.telegram.ui;

import java.util.Iterator;
public final class fg1 implements org.telegram.ui.ActionBar.a2 {
    public final hg1 f36430a;

    public fg1(hg1 hg1Var) {
        this.f36430a = hg1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        kg1 kg1Var = this.f36430a.f37024a;
        Iterator it = kg1Var.f38093e.iterator();
        while (it.hasNext()) {
            kg1.U(kg1Var, ((Integer) it.next()).intValue());
        }
        kg1Var.f38093e.clear();
        kg1Var.V();
    }
}
