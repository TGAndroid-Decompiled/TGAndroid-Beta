package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yp0 extends s4.s0 {
    public final int f30759a;
    public final vq0 f30760b;

    public yp0(vq0 vq0Var, int i10) {
        this.f30759a = i10;
        this.f30760b = vq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ub ubVar;
        switch (this.f30759a) {
            case 0:
                vq0 vq0Var = this.f30760b;
                if (i11 != 0) {
                    vq0.k0(vq0Var);
                    vq0Var.f29759q0 = vq0Var.f29758p0;
                }
                qc qcVar = qc.f27684w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f27684w.e.getParent()).getParent() == vq0Var.f29767w) {
                    qc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    vq0 vq0Var2 = this.f30760b;
                    vq0.k0(vq0Var2);
                    vq0Var2.f29759q0 = vq0Var2.f29758p0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    vq0 vq0Var3 = this.f30760b;
                    vq0.k0(vq0Var3);
                    vq0Var3.f29759q0 = vq0Var3.f29758p0;
                    return;
                }
                return;
        }
    }
}
