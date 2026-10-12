package org.telegram.ui;

import java.util.Iterator;
public final class ig1 implements org.telegram.ui.ActionBar.z1 {
    public final kg1 f38905a;

    public ig1(kg1 kg1Var) {
        this.f38905a = kg1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ng1 ng1Var = this.f38905a.f39485a;
        Iterator it = ng1Var.f40415e.iterator();
        while (it.hasNext()) {
            ng1.U(ng1Var, ((Integer) it.next()).intValue());
        }
        ng1Var.f40415e.clear();
        ng1Var.V();
    }
}
