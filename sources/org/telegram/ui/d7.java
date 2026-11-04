package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.fj0 {
    public final org.telegram.ui.Components.tj0 f44574a;
    public final e7 f44575b;

    public d7(e7 e7Var, org.telegram.ui.Components.tj0 tj0Var) {
        this.f44575b = e7Var;
        this.f44574a = tj0Var;
    }

    @Override
    public final void f(int i3, View view) {
        u7 u7Var = this.f44575b.f44913f;
        org.telegram.ui.Components.tj0 tj0Var = this.f44574a;
        g7 g7Var = (g7) tj0Var.getAdapter();
        n7 n7Var = (n7) g7Var.f45561e.get(i3);
        if (view instanceof org.telegram.ui.Cells.n7) {
            u7.a(u7Var, n7Var, (p7) g7Var, tj0Var);
            return;
        }
        j7 j7Var = u7Var.G;
        if (j7Var != null) {
            j7Var.a(n7Var.f47906c, n7Var.d, false);
        }
    }
}
