package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class gq0 extends s4.r0 {
    public final int f26649a;
    public final fr0 f26650b;

    public gq0(fr0 fr0Var, int i10) {
        this.f26649a = i10;
        this.f26650b = fr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.f26649a) {
            case 0:
                if (i11 != 0) {
                    fr0 fr0Var = this.f26650b;
                    fr0.v0(fr0Var);
                    fr0Var.f26385r0 = fr0Var.f26383q0;
                    return;
                }
                return;
            case 1:
                fr0 fr0Var2 = this.f26650b;
                if (i11 != 0) {
                    fr0.v0(fr0Var2);
                    fr0Var2.f26385r0 = fr0Var2.f26383q0;
                }
                qc qcVar = qc.f29523w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f29523w.e.getParent()).getParent() == fr0Var2.f26393x) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = fr0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    fr0.E0(fr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    fr0 fr0Var3 = this.f26650b;
                    fr0.v0(fr0Var3);
                    fr0Var3.f26385r0 = fr0Var3.f26383q0;
                    return;
                }
                return;
        }
    }
}
