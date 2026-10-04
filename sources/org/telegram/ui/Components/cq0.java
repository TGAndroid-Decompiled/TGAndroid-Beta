package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class cq0 extends s4.s0 {
    public final int f25431a;
    public final zq0 f25432b;

    public cq0(zq0 zq0Var, int i10) {
        this.f25431a = i10;
        this.f25432b = zq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vb vbVar;
        switch (this.f25431a) {
            case 0:
                zq0 zq0Var = this.f25432b;
                if (i11 != 0) {
                    zq0.k0(zq0Var);
                    zq0Var.f33622q0 = zq0Var.f33621p0;
                }
                rc rcVar = rc.f30337w;
                if (rcVar != null && (vbVar = rcVar.f30341e) != null && (vbVar.getParent() instanceof View) && ((View) rc.f30337w.f30341e.getParent()).getParent() == zq0Var.f33630w) {
                    rc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    zq0 zq0Var2 = this.f25432b;
                    zq0.k0(zq0Var2);
                    zq0Var2.f33622q0 = zq0Var2.f33621p0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    zq0 zq0Var3 = this.f25432b;
                    zq0.k0(zq0Var3);
                    zq0Var3.f33622q0 = zq0Var3.f33621p0;
                    return;
                }
                return;
        }
    }
}
