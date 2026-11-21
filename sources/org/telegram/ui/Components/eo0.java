package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class eo0 extends v4.u0 {
    public final int f34944a;
    public final ap0 f34945b;

    public eo0(ap0 ap0Var, int i7) {
        this.f34944a = i7;
        this.f34945b = ap0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        lb lbVar;
        switch (this.f34944a) {
            case 0:
                ap0 ap0Var = this.f34945b;
                if (i10 != 0) {
                    ap0.J0(ap0Var);
                    ap0Var.f33561m2 = ap0Var.f33559l2;
                }
                gc gcVar = gc.f35500w;
                if (gcVar != null && (lbVar = gcVar.f35504e) != null && (lbVar.getParent() instanceof View) && ((View) gc.f35500w.f35504e.getParent()).getParent() == ap0Var.f33581x1) {
                    gc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    ap0 ap0Var2 = this.f34945b;
                    ap0.J0(ap0Var2);
                    ap0Var2.f33561m2 = ap0Var2.f33559l2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    ap0 ap0Var3 = this.f34945b;
                    ap0.J0(ap0Var3);
                    ap0Var3.f33561m2 = ap0Var3.f33559l2;
                    return;
                }
                return;
        }
    }
}
