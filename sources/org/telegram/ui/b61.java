package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class b61 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.a6 {
    public int f44185e;
    public final f61 f44186f;

    public b61(f61 f61Var, Context context) {
        super(context);
        this.f44186f = f61Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                if (x02 != this.f44185e) {
                    this.f44185e = x02;
                    h0Var.setOuterColor(x02);
                    h0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
