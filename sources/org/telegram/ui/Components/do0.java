package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class do0 extends v4.u0 {
    public final int f34418a;
    public final zo0 f34419b;

    public do0(zo0 zo0Var, int i7) {
        this.f34418a = i7;
        this.f34419b = zo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        kb kbVar;
        switch (this.f34418a) {
            case 0:
                zo0 zo0Var = this.f34419b;
                if (i10 != 0) {
                    zo0.J0(zo0Var);
                    zo0Var.f42982m2 = zo0Var.f42980l2;
                }
                fc fcVar = fc.f35083w;
                if (fcVar != null && (kbVar = fcVar.f35087e) != null && (kbVar.getParent() instanceof View) && ((View) fc.f35083w.f35087e.getParent()).getParent() == zo0Var.f43002x1) {
                    fc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    zo0 zo0Var2 = this.f34419b;
                    zo0.J0(zo0Var2);
                    zo0Var2.f42982m2 = zo0Var2.f42980l2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    zo0 zo0Var3 = this.f34419b;
                    zo0.J0(zo0Var3);
                    zo0Var3.f42982m2 = zo0Var3.f42980l2;
                    return;
                }
                return;
        }
    }
}
