package org.telegram.ui.ActionBar;

import android.view.View;
public final class s3 implements Runnable {
    public final int f29587a;
    public final u3 f29588b;

    public s3(u3 u3Var, int i7) {
        this.f29587a = i7;
        this.f29588b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f29587a) {
            case 0:
                u3 u3Var = this.f29588b;
                View view = u3Var.f29736m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    t3 t3Var = u3Var.f29742s;
                    t3Var.getClass();
                    System.currentTimeMillis();
                    t3Var.f29665c = false;
                    u3Var.f29742s.a();
                    return;
                }
                return;
            default:
                u3 u3Var2 = this.f29588b;
                View view2 = u3Var2.f29736m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    t3 t3Var2 = u3Var2.f29742s;
                    t3Var2.f29664b = false;
                    t3Var2.a();
                    return;
                }
                return;
        }
    }
}
