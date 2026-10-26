package org.telegram.ui.ActionBar;

import android.view.View;
public final class k4 implements Runnable {
    public final int f22807a;
    public final m4 f22808b;

    public k4(m4 m4Var, int i10) {
        this.f22807a = i10;
        this.f22808b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f22807a) {
            case 0:
                m4 m4Var = this.f22808b;
                View view = m4Var.f22875m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    l4 l4Var = m4Var.f22881s;
                    l4Var.getClass();
                    System.currentTimeMillis();
                    l4Var.f22829c = false;
                    m4Var.f22881s.a();
                    return;
                }
                return;
            default:
                m4 m4Var2 = this.f22808b;
                View view2 = m4Var2.f22875m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    l4 l4Var2 = m4Var2.f22881s;
                    l4Var2.f22828b = false;
                    l4Var2.a();
                    return;
                }
                return;
        }
    }
}
