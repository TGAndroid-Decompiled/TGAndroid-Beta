package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class wp0 extends s4.s0 {
    public final int f30146a;
    public final vq0 f30147b;

    public wp0(vq0 vq0Var, int i10) {
        this.f30146a = i10;
        this.f30147b = vq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        ub ubVar;
        switch (this.f30146a) {
            case 0:
                if (i11 != 0) {
                    vq0 vq0Var = this.f30147b;
                    vq0.s0(vq0Var);
                    vq0Var.f29731q0 = vq0Var.f29730p0;
                    return;
                }
                return;
            case 1:
                vq0 vq0Var2 = this.f30147b;
                if (i11 != 0) {
                    vq0.s0(vq0Var2);
                    vq0Var2.f29731q0 = vq0Var2.f29730p0;
                }
                qc qcVar = qc.f27543w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f27543w.e.getParent()).getParent() == vq0Var2.f29739w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = vq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    vq0.A0(vq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    vq0 vq0Var3 = this.f30147b;
                    vq0.s0(vq0Var3);
                    vq0Var3.f29731q0 = vq0Var3.f29730p0;
                    return;
                }
                return;
        }
    }
}
