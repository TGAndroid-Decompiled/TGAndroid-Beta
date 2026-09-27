package org.telegram.ui.ActionBar;

import android.view.View;
public final class g4 implements Runnable {
    public final int f18901a;
    public final i4 f18902b;

    public g4(i4 i4Var, int i10) {
        this.f18901a = i10;
        this.f18902b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f18901a) {
            case 0:
                i4 i4Var = this.f18902b;
                View view = i4Var.f18987m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    h4 h4Var = i4Var.f18993s;
                    h4Var.getClass();
                    System.currentTimeMillis();
                    h4Var.f18946c = false;
                    i4Var.f18993s.a();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f18902b;
                View view2 = i4Var2.f18987m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    h4 h4Var2 = i4Var2.f18993s;
                    h4Var2.f18945b = false;
                    h4Var2.a();
                    return;
                }
                return;
        }
    }
}
