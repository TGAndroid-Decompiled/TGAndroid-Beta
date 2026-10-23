package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class kq0 extends s4.r0 {
    public final int f28126a;
    public final ir0 f28127b;

    public kq0(ir0 ir0Var, int i10) {
        this.f28126a = i10;
        this.f28127b = ir0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.f28126a) {
            case 0:
                if (i11 != 0) {
                    ir0 ir0Var = this.f28127b;
                    ir0.z0(ir0Var);
                    ir0Var.f27430r0 = ir0Var.f27428q0;
                    return;
                }
                return;
            case 1:
                ir0 ir0Var2 = this.f28127b;
                if (i11 != 0) {
                    ir0.z0(ir0Var2);
                    ir0Var2.f27430r0 = ir0Var2.f27428q0;
                }
                qc qcVar = qc.f29825w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f29825w.e.getParent()).getParent() == ir0Var2.f27438x) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = ir0Var2.P0) != null) {
                    fVar.f(i10, i11);
                    ir0.J0(ir0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    ir0 ir0Var3 = this.f28127b;
                    ir0.z0(ir0Var3);
                    ir0Var3.f27430r0 = ir0Var3.f27428q0;
                    return;
                }
                return;
        }
    }
}
