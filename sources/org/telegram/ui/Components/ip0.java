package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ip0 extends s4.s0 {
    public final int f25114a;
    public final hq0 f25115b;

    public ip0(hq0 hq0Var, int i10) {
        this.f25114a = i10;
        this.f25115b = hq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        sb sbVar;
        switch (this.f25114a) {
            case 0:
                if (i11 != 0) {
                    hq0 hq0Var = this.f25115b;
                    hq0.s0(hq0Var);
                    hq0Var.f24773q0 = hq0Var.f24772p0;
                    return;
                }
                return;
            case 1:
                hq0 hq0Var2 = this.f25115b;
                if (i11 != 0) {
                    hq0.s0(hq0Var2);
                    hq0Var2.f24773q0 = hq0Var2.f24772p0;
                }
                oc ocVar = oc.f26744w;
                if (ocVar != null && (sbVar = ocVar.e) != null && (sbVar.getParent() instanceof View) && ((View) oc.f26744w.e.getParent()).getParent() == hq0Var2.f24781w) {
                    oc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = hq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    hq0.A0(hq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    hq0 hq0Var3 = this.f25115b;
                    hq0.s0(hq0Var3);
                    hq0Var3.f24773q0 = hq0Var3.f24772p0;
                    return;
                }
                return;
        }
    }
}
