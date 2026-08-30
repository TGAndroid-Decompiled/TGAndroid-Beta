package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class lp0 extends f2.z0 {
    public final int f26840a;
    public final lq0 f26841b;

    public lp0(lq0 lq0Var, int i10) {
        this.f26840a = i10;
        this.f26841b = lq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        nb nbVar;
        switch (this.f26840a) {
            case 0:
                if (i11 != 0) {
                    lq0 lq0Var = this.f26841b;
                    lq0.s0(lq0Var);
                    lq0Var.f26858n0 = lq0Var.m0;
                    return;
                }
                return;
            case 1:
                lq0 lq0Var2 = this.f26841b;
                if (i11 != 0) {
                    lq0.s0(lq0Var2);
                    lq0Var2.f26858n0 = lq0Var2.m0;
                }
                ic icVar = ic.f25665w;
                if (icVar != null && (nbVar = icVar.e) != null && (nbVar.getParent() instanceof View) && ((View) ic.f25665w.e.getParent()).getParent() == lq0Var2.f26869w) {
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
                    lq0 lq0Var3 = this.f26841b;
                    lq0.s0(lq0Var3);
                    lq0Var3.f26858n0 = lq0Var3.m0;
                    return;
                }
                return;
        }
    }
}
