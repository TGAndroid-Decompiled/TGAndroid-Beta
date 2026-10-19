package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class fq0 extends s4.r0 {
    public final int f26341a;
    public final er0 f26342b;

    public fq0(er0 er0Var, int i10) {
        this.f26341a = i10;
        this.f26342b = er0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.f26341a) {
            case 0:
                if (i11 != 0) {
                    er0 er0Var = this.f26342b;
                    er0.v0(er0Var);
                    er0Var.f25999r0 = er0Var.f25997q0;
                    return;
                }
                return;
            case 1:
                er0 er0Var2 = this.f26342b;
                if (i11 != 0) {
                    er0.v0(er0Var2);
                    er0Var2.f25999r0 = er0Var2.f25997q0;
                }
                qc qcVar = qc.f29589w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f29589w.e.getParent()).getParent() == er0Var2.f26007x) {
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
                    er0 er0Var3 = this.f26342b;
                    er0.v0(er0Var3);
                    er0Var3.f25999r0 = er0Var3.f25997q0;
                    return;
                }
                return;
        }
    }
}
