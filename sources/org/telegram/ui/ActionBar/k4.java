package org.telegram.ui.ActionBar;

import android.view.View;
public final class k4 implements Runnable {
    public final int f22808a;
    public final m4 f22809b;

    public k4(m4 m4Var, int i10) {
        this.f22808a = i10;
        this.f22809b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f22808a) {
            case 0:
                m4 m4Var = this.f22809b;
                View view = m4Var.f22876m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    l4 l4Var = m4Var.f22882s;
                    l4Var.getClass();
                    System.currentTimeMillis();
                    l4Var.f22830c = false;
                    m4Var.f22882s.a();
                    return;
                }
                return;
            default:
                m4 m4Var2 = this.f22809b;
                View view2 = m4Var2.f22876m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    l4 l4Var2 = m4Var2.f22882s;
                    l4Var2.f22829b = false;
                    l4Var2.a();
                    return;
                }
                return;
        }
    }
}
