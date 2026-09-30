package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yp0 extends s4.s0 {
    public final int f30773a;
    public final xq0 f30774b;

    public yp0(xq0 xq0Var, int i10) {
        this.f30773a = i10;
        this.f30774b = xq0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        vb vbVar;
        switch (this.f30773a) {
            case 0:
                if (i11 != 0) {
                    xq0 xq0Var = this.f30774b;
                    xq0.s0(xq0Var);
                    xq0Var.f30473q0 = xq0Var.f30472p0;
                    return;
                }
                return;
            case 1:
                xq0 xq0Var2 = this.f30774b;
                if (i11 != 0) {
                    xq0.s0(xq0Var2);
                    xq0Var2.f30473q0 = xq0Var2.f30472p0;
                }
                rc rcVar = rc.f27939w;
                if (rcVar != null && (vbVar = rcVar.e) != null && (vbVar.getParent() instanceof View) && ((View) rc.f27939w.e.getParent()).getParent() == xq0Var2.f30481w) {
                    rc.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = xq0Var2.O0) != null) {
                    hVar.f(i10, i11);
                    xq0.A0(xq0Var2);
                    return;
                }
                return;
            default:
                if (i11 != 0) {
                    xq0 xq0Var3 = this.f30774b;
                    xq0.s0(xq0Var3);
                    xq0Var3.f30473q0 = xq0Var3.f30472p0;
                    return;
                }
                return;
        }
    }
}
