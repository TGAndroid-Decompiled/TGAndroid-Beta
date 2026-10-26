package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pq0 extends s4.u0 {
    public final int f31699a;
    public final mr0 f31700b;

    public pq0(mr0 mr0Var, int i10) {
        this.f31699a = i10;
        this.f31700b = mr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ub ubVar;
        switch (this.f31699a) {
            case 0:
                mr0 mr0Var = this.f31700b;
                if (i11 != 0) {
                    mr0.r0(mr0Var);
                    mr0Var.f30720r0 = mr0Var.f30718q0;
                }
                qc qcVar = qc.f31882x;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f31882x.e.getParent()).getParent() == mr0Var.f30728x) {
                    qc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    mr0 mr0Var2 = this.f31700b;
                    mr0.r0(mr0Var2);
                    mr0Var2.f30720r0 = mr0Var2.f30718q0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    mr0 mr0Var3 = this.f31700b;
                    mr0.r0(mr0Var3);
                    mr0Var3.f30720r0 = mr0Var3.f30718q0;
                    return;
                }
                return;
        }
    }
}
