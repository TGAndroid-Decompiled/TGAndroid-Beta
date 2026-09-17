package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ip0 extends s4.s0 {
    public final int f27261a;
    public final hq0 f27262b;

    public ip0(hq0 hq0Var, int i10) {
        this.f27261a = i10;
        this.f27262b = hq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ub ubVar;
        switch (this.f27261a) {
            case 0:
                if (i11 != 0) {
                    hq0 hq0Var = this.f27262b;
                    hq0.s0(hq0Var);
                    hq0Var.f26835q0 = hq0Var.f26834p0;
                    return;
                }
                return;
            case 1:
                hq0 hq0Var2 = this.f27262b;
                if (i11 != 0) {
                    hq0.s0(hq0Var2);
                    hq0Var2.f26835q0 = hq0Var2.f26834p0;
                }
                qc qcVar = qc.f29699w;
                if (qcVar != null && (ubVar = qcVar.f29703e) != null && (ubVar.getParent() instanceof View) && ((View) qc.f29699w.f29703e.getParent()).getParent() == hq0Var2.f26843w) {
                    qc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = hq0Var2.O0) != null) {
                    fVar.f(i10, i11);
                    hq0.A0(hq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    hq0 hq0Var3 = this.f27262b;
                    hq0.s0(hq0Var3);
                    hq0Var3.f26835q0 = hq0Var3.f26834p0;
                    return;
                }
                return;
        }
    }
}
