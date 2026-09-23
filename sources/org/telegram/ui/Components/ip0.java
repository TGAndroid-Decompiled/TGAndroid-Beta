package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ip0 extends s4.s0 {
    public final int f25041a;
    public final hq0 f25042b;

    public ip0(hq0 hq0Var, int i10) {
        this.f25041a = i10;
        this.f25042b = hq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ub ubVar;
        switch (this.f25041a) {
            case 0:
                if (i11 != 0) {
                    hq0 hq0Var = this.f25042b;
                    hq0.s0(hq0Var);
                    hq0Var.f24792q0 = hq0Var.f24791p0;
                    return;
                }
                return;
            case 1:
                hq0 hq0Var2 = this.f25042b;
                if (i11 != 0) {
                    hq0.s0(hq0Var2);
                    hq0Var2.f24792q0 = hq0Var2.f24791p0;
                }
                qc qcVar = qc.f27299w;
                if (qcVar != null && (ubVar = qcVar.e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f27299w.e.getParent()).getParent() == hq0Var2.f24800w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = hq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    hq0.A0(hq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    hq0 hq0Var3 = this.f25042b;
                    hq0.s0(hq0Var3);
                    hq0Var3.f24792q0 = hq0Var3.f24791p0;
                    return;
                }
                return;
        }
    }
}
