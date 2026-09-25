package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vp0 extends s4.s0 {
    public final int f29786a;
    public final uq0 f29787b;

    public vp0(uq0 uq0Var, int i10) {
        this.f29786a = i10;
        this.f29787b = uq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ub ubVar;
        switch (this.f29786a) {
            case 0:
                if (i11 != 0) {
                    uq0 uq0Var = this.f29787b;
                    uq0.s0(uq0Var);
                    uq0Var.f28893q0 = uq0Var.f28892p0;
                    return;
                }
                return;
            case 1:
                uq0 uq0Var2 = this.f29787b;
                if (i11 != 0) {
                    uq0.s0(uq0Var2);
                    uq0Var2.f28893q0 = uq0Var2.f28892p0;
                }
                qc qcVar = qc.f27571w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f27571w.e.getParent()).getParent() == uq0Var2.f28901w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = uq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    uq0.A0(uq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    uq0 uq0Var3 = this.f29787b;
                    uq0.s0(uq0Var3);
                    uq0Var3.f28893q0 = uq0Var3.f28892p0;
                    return;
                }
                return;
        }
    }
}
