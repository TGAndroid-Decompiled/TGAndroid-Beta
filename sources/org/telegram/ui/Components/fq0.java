package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fq0 extends s4.r0 {
    public final int f26339a;
    public final er0 f26340b;

    public fq0(er0 er0Var, int i10) {
        this.f26339a = i10;
        this.f26340b = er0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.f26339a) {
            case 0:
                if (i11 != 0) {
                    er0 er0Var = this.f26340b;
                    er0.v0(er0Var);
                    er0Var.f25997r0 = er0Var.f25995q0;
                    return;
                }
                return;
            case 1:
                er0 er0Var2 = this.f26340b;
                if (i11 != 0) {
                    er0.v0(er0Var2);
                    er0Var2.f25997r0 = er0Var2.f25995q0;
                }
                qc qcVar = qc.f29587w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f29587w.e.getParent()).getParent() == er0Var2.f26005x) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = er0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    er0.E0(er0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    er0 er0Var3 = this.f26340b;
                    er0.v0(er0Var3);
                    er0Var3.f25997r0 = er0Var3.f25995q0;
                    return;
                }
                return;
        }
    }
}
