package org.telegram.ui;

import java.util.Iterator;
public final class fg1 implements org.telegram.ui.ActionBar.z1 {
    public final hg1 f37713a;

    public fg1(hg1 hg1Var) {
        this.f37713a = hg1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        kg1 kg1Var = this.f37713a.f38442a;
        Iterator it = kg1Var.f39371e.iterator();
        while (it.hasNext()) {
            kg1.U(kg1Var, ((Integer) it.next()).intValue());
        }
        kg1Var.f39371e.clear();
        kg1Var.V();
    }
}
