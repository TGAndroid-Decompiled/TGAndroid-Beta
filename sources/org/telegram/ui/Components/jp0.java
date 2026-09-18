package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jp0 extends s4.s0 {
    public final int f25402a;
    public final iq0 f25403b;

    public jp0(iq0 iq0Var, int i10) {
        this.f25402a = i10;
        this.f25403b = iq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        sb sbVar;
        switch (this.f25402a) {
            case 0:
                if (i11 != 0) {
                    iq0 iq0Var = this.f25403b;
                    iq0.s0(iq0Var);
                    iq0Var.f25006q0 = iq0Var.f25005p0;
                    return;
                }
                return;
            case 1:
                iq0 iq0Var2 = this.f25403b;
                if (i11 != 0) {
                    iq0.s0(iq0Var2);
                    iq0Var2.f25006q0 = iq0Var2.f25005p0;
                }
                oc ocVar = oc.f26698w;
                if (ocVar != null && (sbVar = ocVar.e) != null && (sbVar.getParent() instanceof View) && ((View) oc.f26698w.e.getParent()).getParent() == iq0Var2.f25014w) {
                    oc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = iq0Var2.O0) != null) {
                    iVar.f(i10, i11);
                    iq0.A0(iq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    iq0 iq0Var3 = this.f25403b;
                    iq0.s0(iq0Var3);
                    iq0Var3.f25006q0 = iq0Var3.f25005p0;
                    return;
                }
                return;
        }
    }
}
