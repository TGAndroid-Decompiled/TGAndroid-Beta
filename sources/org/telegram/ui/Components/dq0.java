package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class dq0 extends s4.s0 {
    public final int f25840a;
    public final br0 f25841b;

    public dq0(br0 br0Var, int i10) {
        this.f25840a = i10;
        this.f25841b = br0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vb vbVar;
        switch (this.f25840a) {
            case 0:
                br0 br0Var = this.f25841b;
                if (i11 != 0) {
                    br0.k0(br0Var);
                    br0Var.f25071q0 = br0Var.f25070p0;
                }
                rc rcVar = rc.f30419w;
                if (rcVar != null && (vbVar = rcVar.f30423e) != null && (vbVar.getParent() instanceof View) && ((View) rc.f30419w.f30423e.getParent()).getParent() == br0Var.f25079w) {
                    rc.e();
                    return;
                }
                return;
            case 1:
                if (i11 != 0) {
                    br0 br0Var2 = this.f25841b;
                    br0.k0(br0Var2);
                    br0Var2.f25071q0 = br0Var2.f25070p0;
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    br0 br0Var3 = this.f25841b;
                    br0.k0(br0Var3);
                    br0Var3.f25071q0 = br0Var3.f25070p0;
                    return;
                }
                return;
        }
    }
}
