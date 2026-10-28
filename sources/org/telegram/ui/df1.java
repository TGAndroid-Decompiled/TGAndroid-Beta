package org.telegram.ui;

import java.util.Iterator;
public final class df1 implements org.telegram.ui.ActionBar.b2 {
    public final ff1 f38603a;

    public df1(ff1 ff1Var) {
        this.f38603a = ff1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        if1 if1Var = this.f38603a.f39352a;
        Iterator it = if1Var.e.iterator();
        while (it.hasNext()) {
            if1.V(if1Var, ((Integer) it.next()).intValue());
        }
        if1Var.e.clear();
        if1Var.W();
    }
}
