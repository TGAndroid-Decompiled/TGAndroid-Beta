package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pq0 extends s4.u0 {
    public final int f31697a;
    public final mr0 f31698b;

    public pq0(mr0 mr0Var, int i10) {
        this.f31697a = i10;
        this.f31698b = mr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ub ubVar;
        switch (this.f31697a) {
            case 0:
                mr0 mr0Var = this.f31698b;
                if (i11 != 0) {
                    mr0.r0(mr0Var);
                    mr0Var.f30718r0 = mr0Var.f30716q0;
                }
                qc qcVar = qc.f31880x;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f31880x.e.getParent()).getParent() == mr0Var.f30726x) {
                    qc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    mr0 mr0Var2 = this.f31698b;
                    mr0.r0(mr0Var2);
                    mr0Var2.f30718r0 = mr0Var2.f30716q0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    mr0 mr0Var3 = this.f31698b;
                    mr0.r0(mr0Var3);
                    mr0Var3.f30718r0 = mr0Var3.f30716q0;
                    return;
                }
                return;
        }
    }
}
