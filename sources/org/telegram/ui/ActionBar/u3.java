package org.telegram.ui.ActionBar;

import android.view.View;
public final class u3 implements Runnable {
    public final int f28596a;
    public final w3 f28597b;

    public u3(w3 w3Var, int i7) {
        this.f28596a = i7;
        this.f28597b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f28596a) {
            case 0:
                w3 w3Var = this.f28597b;
                View view = w3Var.f28706m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    v3 v3Var = w3Var.f28712s;
                    v3Var.getClass();
                    System.currentTimeMillis();
                    v3Var.f28658c = false;
                    w3Var.f28712s.a();
                    return;
                }
                return;
            default:
                w3 w3Var2 = this.f28597b;
                View view2 = w3Var2.f28706m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    v3 v3Var2 = w3Var2.f28712s;
                    v3Var2.f28657b = false;
                    v3Var2.a();
                    return;
                }
                return;
        }
    }
}
