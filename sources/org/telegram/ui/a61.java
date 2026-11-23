package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;
public final class a61 extends org.telegram.ui.Cells.j0 implements org.telegram.ui.ActionBar.c6 {
    public int f45606e;
    public final e61 f45607f;

    public a61(e61 e61Var, Context context) {
        super(context);
        this.f45607f = e61Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.i0 i0Var = this.d;
        if (i0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                if (x02 != this.f45606e) {
                    this.f45606e = x02;
                    i0Var.setOuterColor(x02);
                    i0Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
