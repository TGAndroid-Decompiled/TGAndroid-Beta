package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class eo0 extends v4.u0 {
    public final int f34942a;
    public final ap0 f34943b;

    public eo0(ap0 ap0Var, int i7) {
        this.f34942a = i7;
        this.f34943b = ap0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        lb lbVar;
        switch (this.f34942a) {
            case 0:
                ap0 ap0Var = this.f34943b;
                if (i10 != 0) {
                    ap0.J0(ap0Var);
                    ap0Var.f33574m2 = ap0Var.f33572l2;
                }
                gc gcVar = gc.f35519w;
                if (gcVar != null && (lbVar = gcVar.f35523e) != null && (lbVar.getParent() instanceof View) && ((View) gc.f35519w.f35523e.getParent()).getParent() == ap0Var.f33594x1) {
                    gc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    ap0 ap0Var2 = this.f34943b;
                    ap0.J0(ap0Var2);
                    ap0Var2.f33574m2 = ap0Var2.f33572l2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    ap0 ap0Var3 = this.f34943b;
                    ap0.J0(ap0Var3);
                    ap0Var3.f33574m2 = ap0Var3.f33572l2;
                    return;
                }
                return;
        }
    }
}
