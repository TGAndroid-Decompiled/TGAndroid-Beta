package org.telegram.ui.ActionBar;

import android.view.View;
public final class k4 implements Runnable {
    public final int f22805a;
    public final m4 f22806b;

    public k4(m4 m4Var, int i10) {
        this.f22805a = i10;
        this.f22806b = m4Var;
    }

    @Override
    public final void run() {
        switch (this.f22805a) {
            case 0:
                m4 m4Var = this.f22806b;
                View view = m4Var.f22873m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    l4 l4Var = m4Var.f22879s;
                    l4Var.getClass();
                    System.currentTimeMillis();
                    l4Var.f22827c = false;
                    m4Var.f22879s.a();
                    return;
                }
                return;
            default:
                m4 m4Var2 = this.f22806b;
                View view2 = m4Var2.f22873m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    l4 l4Var2 = m4Var2.f22879s;
                    l4Var2.f22826b = false;
                    l4Var2.a();
                    return;
                }
                return;
        }
    }
}
