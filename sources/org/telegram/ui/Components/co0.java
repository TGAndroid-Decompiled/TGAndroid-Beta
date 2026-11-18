package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class co0 extends v4.u0 {
    public final int f34141a;
    public final yo0 f34142b;

    public co0(yo0 yo0Var, int i7) {
        this.f34141a = i7;
        this.f34142b = yo0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        lb lbVar;
        switch (this.f34141a) {
            case 0:
                yo0 yo0Var = this.f34142b;
                if (i10 != 0) {
                    yo0.J0(yo0Var);
                    yo0Var.f42565m2 = yo0Var.f42563l2;
                }
                gc gcVar = gc.f35453w;
                if (gcVar != null && (lbVar = gcVar.f35457e) != null && (lbVar.getParent() instanceof View) && ((View) gc.f35453w.f35457e.getParent()).getParent() == yo0Var.f42585x1) {
                    gc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    yo0 yo0Var2 = this.f34142b;
                    yo0.J0(yo0Var2);
                    yo0Var2.f42565m2 = yo0Var2.f42563l2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    yo0 yo0Var3 = this.f34142b;
                    yo0.J0(yo0Var3);
                    yo0Var3.f42565m2 = yo0Var3.f42563l2;
                    return;
                }
                return;
        }
    }
}
