package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class c61 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.b6 {
    public int f44231e;
    public final g61 f44232f;

    public c61(g61 g61Var, Context context) {
        super(context);
        this.f44232f = g61Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Jj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Jj, false);
                if (x02 != this.f44231e) {
                    this.f44231e = x02;
                    h0Var.setOuterColor(x02);
                    h0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
