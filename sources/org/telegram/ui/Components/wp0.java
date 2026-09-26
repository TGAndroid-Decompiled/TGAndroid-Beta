package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class wp0 extends s4.s0 {
    public final int f30178a;
    public final vq0 f30179b;

    public wp0(vq0 vq0Var, int i10) {
        this.f30178a = i10;
        this.f30179b = vq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ub ubVar;
        switch (this.f30178a) {
            case 0:
                if (i11 != 0) {
                    vq0 vq0Var = this.f30179b;
                    vq0.s0(vq0Var);
                    vq0Var.f29734q0 = vq0Var.f29733p0;
                    return;
                }
                return;
            case 1:
                vq0 vq0Var2 = this.f30179b;
                if (i11 != 0) {
                    vq0.s0(vq0Var2);
                    vq0Var2.f29734q0 = vq0Var2.f29733p0;
                }
                qc qcVar = qc.f27628w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f27628w.e.getParent()).getParent() == vq0Var2.f29742w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = vq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    vq0.A0(vq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    vq0 vq0Var3 = this.f30179b;
                    vq0.s0(vq0Var3);
                    vq0Var3.f29734q0 = vq0Var3.f29733p0;
                    return;
                }
                return;
        }
    }
}
