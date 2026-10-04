package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class cq0 extends s4.s0 {
    public final int f25426a;
    public final zq0 f25427b;

    public cq0(zq0 zq0Var, int i10) {
        this.f25426a = i10;
        this.f25427b = zq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vb vbVar;
        switch (this.f25426a) {
            case 0:
                zq0 zq0Var = this.f25427b;
                if (i11 != 0) {
                    zq0.k0(zq0Var);
                    zq0Var.f33616q0 = zq0Var.f33615p0;
                }
                rc rcVar = rc.f30331w;
                if (rcVar != null && (vbVar = rcVar.f30335e) != null && (vbVar.getParent() instanceof View) && ((View) rc.f30331w.f30335e.getParent()).getParent() == zq0Var.f33624w) {
                    rc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    zq0 zq0Var2 = this.f25427b;
                    zq0.k0(zq0Var2);
                    zq0Var2.f33616q0 = zq0Var2.f33615p0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    zq0 zq0Var3 = this.f25427b;
                    zq0.k0(zq0Var3);
                    zq0Var3.f33616q0 = zq0Var3.f33615p0;
                    return;
                }
                return;
        }
    }
}
