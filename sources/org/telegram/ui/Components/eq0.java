package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class eq0 extends s4.r0 {
    public final int f25986a;
    public final dr0 f25987b;

    public eq0(dr0 dr0Var, int i10) {
        this.f25986a = i10;
        this.f25987b = dr0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.f25986a) {
            case 0:
                if (i11 != 0) {
                    dr0 dr0Var = this.f25987b;
                    dr0.t0(dr0Var);
                    dr0Var.f25678q0 = dr0Var.f25677p0;
                    return;
                }
                return;
            case 1:
                dr0 dr0Var2 = this.f25987b;
                if (i11 != 0) {
                    dr0.t0(dr0Var2);
                    dr0Var2.f25678q0 = dr0Var2.f25677p0;
                }
                qc qcVar = qc.f29638w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f29638w.e.getParent()).getParent() == dr0Var2.f25686w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = dr0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    dr0.B0(dr0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    dr0 dr0Var3 = this.f25987b;
                    dr0.t0(dr0Var3);
                    dr0Var3.f25678q0 = dr0Var3.f25677p0;
                    return;
                }
                return;
        }
    }
}
