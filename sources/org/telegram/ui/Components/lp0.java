package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class lp0 extends f2.a1 {
    public final int f28823a;
    public final lq0 f28824b;

    public lp0(lq0 lq0Var, int i10) {
        this.f28823a = i10;
        this.f28824b = lq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        nb nbVar;
        switch (this.f28823a) {
            case 0:
                if (i11 != 0) {
                    lq0 lq0Var = this.f28824b;
                    lq0.s0(lq0Var);
                    lq0Var.f28842n0 = lq0Var.m0;
                    return;
                }
                return;
            case 1:
                lq0 lq0Var2 = this.f28824b;
                if (i11 != 0) {
                    lq0.s0(lq0Var2);
                    lq0Var2.f28842n0 = lq0Var2.m0;
                }
                ic icVar = ic.f27770w;
                if (icVar != null && (nbVar = icVar.f27774e) != null && (nbVar.getParent() instanceof View) && ((View) ic.f27770w.f27774e.getParent()).getParent() == lq0Var2.f28853w) {
                    ic.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = lq0Var2.L0) != null) {
                    eVar.f(i10, i11);
                    lq0.A0(lq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    lq0 lq0Var3 = this.f28824b;
                    lq0.s0(lq0Var3);
                    lq0Var3.f28842n0 = lq0Var3.m0;
                    return;
                }
                return;
        }
    }
}
