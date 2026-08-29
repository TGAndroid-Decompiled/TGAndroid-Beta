package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class cp0 extends f2.a1 {
    public final int f27548a;
    public final dq0 f27549b;

    public cp0(dq0 dq0Var, int i10) {
        this.f27548a = i10;
        this.f27549b = dq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        rb rbVar;
        switch (this.f27548a) {
            case 0:
                if (i11 != 0) {
                    dq0 dq0Var = this.f27549b;
                    dq0.s0(dq0Var);
                    dq0Var.m0 = dq0Var.f27842l0;
                    return;
                }
                return;
            case 1:
                dq0 dq0Var2 = this.f27549b;
                if (i11 != 0) {
                    dq0.s0(dq0Var2);
                    dq0Var2.m0 = dq0Var2.f27842l0;
                }
                mc mcVar = mc.f30644w;
                if (mcVar != null && (rbVar = mcVar.f30648e) != null && (rbVar.getParent() instanceof View) && ((View) mc.f30644w.f30648e.getParent()).getParent() == dq0Var2.f27855w) {
                    mc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = dq0Var2.K0) != null) {
                    eVar.f(i10, i11);
                    dq0.A0(dq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    dq0 dq0Var3 = this.f27549b;
                    dq0.s0(dq0Var3);
                    dq0Var3.m0 = dq0Var3.f27842l0;
                    return;
                }
                return;
        }
    }
}
