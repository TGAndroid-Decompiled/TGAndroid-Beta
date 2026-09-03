package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class kp0 extends f2.z0 {
    public final int f26380a;
    public final lq0 f26381b;

    public kp0(lq0 lq0Var, int i10) {
        this.f26380a = i10;
        this.f26381b = lq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        nb nbVar;
        switch (this.f26380a) {
            case 0:
                if (i11 != 0) {
                    lq0 lq0Var = this.f26381b;
                    lq0.s0(lq0Var);
                    lq0Var.f26848n0 = lq0Var.m0;
                    return;
                }
                return;
            case 1:
                lq0 lq0Var2 = this.f26381b;
                if (i11 != 0) {
                    lq0.s0(lq0Var2);
                    lq0Var2.f26848n0 = lq0Var2.m0;
                }
                ic icVar = ic.f25664w;
                if (icVar != null && (nbVar = icVar.e) != null && (nbVar.getParent() instanceof View) && ((View) ic.f25664w.e.getParent()).getParent() == lq0Var2.f26859w) {
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
                    lq0 lq0Var3 = this.f26381b;
                    lq0.s0(lq0Var3);
                    lq0Var3.f26848n0 = lq0Var3.m0;
                    return;
                }
                return;
        }
    }
}
