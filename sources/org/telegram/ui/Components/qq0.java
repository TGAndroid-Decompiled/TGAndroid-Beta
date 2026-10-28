package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class qq0 extends s4.u0 {
    public final int f32006a;
    public final nr0 f32007b;

    public qq0(nr0 nr0Var, int i10) {
        this.f32006a = i10;
        this.f32007b = nr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ub ubVar;
        switch (this.f32006a) {
            case 0:
                nr0 nr0Var = this.f32007b;
                if (i11 != 0) {
                    nr0.r0(nr0Var);
                    nr0Var.f31051r0 = nr0Var.f31049q0;
                }
                qc qcVar = qc.f31854x;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f31854x.e.getParent()).getParent() == nr0Var.f31059x) {
                    qc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    nr0 nr0Var2 = this.f32007b;
                    nr0.r0(nr0Var2);
                    nr0Var2.f31051r0 = nr0Var2.f31049q0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    nr0 nr0Var3 = this.f32007b;
                    nr0.r0(nr0Var3);
                    nr0Var3.f31051r0 = nr0Var3.f31049q0;
                    return;
                }
                return;
        }
    }
}
