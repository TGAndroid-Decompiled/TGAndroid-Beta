package org.telegram.ui.ActionBar;

import android.view.View;
public final class s3 implements Runnable {
    public final int f28573a;
    public final u3 f28574b;

    public s3(u3 u3Var, int i3) {
        this.f28573a = i3;
        this.f28574b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f28573a) {
            case 0:
                u3 u3Var = this.f28574b;
                View view = u3Var.f28685m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    t3 t3Var = u3Var.f28691s;
                    t3Var.getClass();
                    System.currentTimeMillis();
                    t3Var.f28629c = false;
                    u3Var.f28691s.a();
                    return;
                }
                return;
            default:
                u3 u3Var2 = this.f28574b;
                View view2 = u3Var2.f28685m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    t3 t3Var2 = u3Var2.f28691s;
                    t3Var2.f28628b = false;
                    t3Var2.a();
                    return;
                }
                return;
        }
    }
}
