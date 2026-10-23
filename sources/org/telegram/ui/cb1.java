package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.FileLog;
public abstract class cb1 extends org.telegram.ui.Cells.j0 implements org.telegram.ui.ActionBar.b6 {
    public int e;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Cells.i0 i0Var = this.d;
        if (i0Var != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false);
                if (x02 != this.e) {
                    this.e = x02;
                    i0Var.setOuterColor(x02);
                    i0Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
