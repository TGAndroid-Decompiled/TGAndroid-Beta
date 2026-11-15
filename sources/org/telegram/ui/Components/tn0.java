package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tn0 extends v4.t0 {
    public final int f39751a;
    public final po0 f39752b;

    public tn0(po0 po0Var, int i7) {
        this.f39751a = i7;
        this.f39752b = po0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        cb cbVar;
        switch (this.f39751a) {
            case 0:
                po0 po0Var = this.f39752b;
                if (i10 != 0) {
                    po0.I0(po0Var);
                    po0Var.f38352m2 = po0Var.f38350l2;
                }
                xb xbVar = xb.f41635w;
                if (xbVar != null && (cbVar = xbVar.f41639e) != null && (cbVar.getParent() instanceof View) && ((View) xb.f41635w.f41639e.getParent()).getParent() == po0Var.f38372x1) {
                    xb.e();
                    return;
                }
                return;
            case 1:
                if (i10 != 0) {
                    po0 po0Var2 = this.f39752b;
                    po0.I0(po0Var2);
                    po0Var2.f38352m2 = po0Var2.f38350l2;
                    return;
                }
                return;
            default:
                if (i10 != 0) {
                    po0 po0Var3 = this.f39752b;
                    po0.I0(po0Var3);
                    po0Var3.f38352m2 = po0Var3.f38350l2;
                    return;
                }
                return;
        }
    }
}
