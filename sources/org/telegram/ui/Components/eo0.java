package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class eo0 extends v4.t0 {
    public final int f34926a;
    public final ap0 f34927b;

    public eo0(ap0 ap0Var, int i7) {
        this.f34926a = i7;
        this.f34927b = ap0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        lb lbVar;
        switch (this.f34926a) {
            case 0:
                ap0 ap0Var = this.f34927b;
                if (i10 != 0) {
                    ap0.J0(ap0Var);
                    ap0Var.f33558m2 = ap0Var.f33556l2;
                }
                gc gcVar = gc.f35481w;
                if (gcVar != null && (lbVar = gcVar.f35485e) != null && (lbVar.getParent() instanceof View) && ((View) gc.f35481w.f35485e.getParent()).getParent() == ap0Var.f33578x1) {
                    gc.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    ap0 ap0Var2 = this.f34927b;
                    ap0.J0(ap0Var2);
                    ap0Var2.f33558m2 = ap0Var2.f33556l2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    ap0 ap0Var3 = this.f34927b;
                    ap0.J0(ap0Var3);
                    ap0Var3.f33558m2 = ap0Var3.f33556l2;
                    return;
                }
                return;
        }
    }
}
