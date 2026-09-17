package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jp0 extends s4.s0 {
    public final int f25399a;
    public final iq0 f25400b;

    public jp0(iq0 iq0Var, int i10) {
        this.f25399a = i10;
        this.f25400b = iq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        sb sbVar;
        switch (this.f25399a) {
            case 0:
                if (i11 != 0) {
                    iq0 iq0Var = this.f25400b;
                    iq0.s0(iq0Var);
                    iq0Var.f25003q0 = iq0Var.f25002p0;
                    return;
                }
                return;
            case 1:
                iq0 iq0Var2 = this.f25400b;
                if (i11 != 0) {
                    iq0.s0(iq0Var2);
                    iq0Var2.f25003q0 = iq0Var2.f25002p0;
                }
                oc ocVar = oc.f26695w;
                if (ocVar != null && (sbVar = ocVar.e) != null && (sbVar.getParent() instanceof View) && ((View) oc.f26695w.e.getParent()).getParent() == iq0Var2.f25011w) {
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
                    iq0 iq0Var3 = this.f25400b;
                    iq0.s0(iq0Var3);
                    iq0Var3.f25003q0 = iq0Var3.f25002p0;
                    return;
                }
                return;
        }
    }
}
