package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class d61 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.c6 {
    public int f44909e;
    public final h61 f44910f;

    public d61(h61 h61Var, Context context) {
        super(context);
        this.f44910f = h61Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Jj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Jj, false);
                if (x02 != this.f44909e) {
                    this.f44909e = x02;
                    h0Var.setOuterColor(x02);
                    h0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
