package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xp0 extends s4.s0 {
    public final int f30437a;
    public final wq0 f30438b;

    public xp0(wq0 wq0Var, int i10) {
        this.f30437a = i10;
        this.f30438b = wq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ub ubVar;
        switch (this.f30437a) {
            case 0:
                if (i11 != 0) {
                    wq0 wq0Var = this.f30438b;
                    wq0.s0(wq0Var);
                    wq0Var.f30137q0 = wq0Var.f30136p0;
                    return;
                }
                return;
            case 1:
                wq0 wq0Var2 = this.f30438b;
                if (i11 != 0) {
                    wq0.s0(wq0Var2);
                    wq0Var2.f30137q0 = wq0Var2.f30136p0;
                }
                qc qcVar = qc.f27634w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f27634w.e.getParent()).getParent() == wq0Var2.f30145w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = wq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    wq0.A0(wq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    wq0 wq0Var3 = this.f30438b;
                    wq0.s0(wq0Var3);
                    wq0Var3.f30137q0 = wq0Var3.f30136p0;
                    return;
                }
                return;
        }
    }
}
