package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class c61 extends org.telegram.ui.Cells.j0 implements org.telegram.ui.ActionBar.b6 {
    public int f46467e;
    public final g61 f46468f;

    public c61(g61 g61Var, Context context) {
        super(context);
        this.f46468f = g61Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.i0 i0Var = this.d;
        if (i0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
                if (x02 != this.f46467e) {
                    this.f46467e = x02;
                    i0Var.setOuterColor(x02);
                    i0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
