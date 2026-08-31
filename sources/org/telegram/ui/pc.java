package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pc implements h5.d {
    public final int f40010a;
    public final boolean f40011b;
    public final Object f40012c;

    public pc(int i10, Object obj, boolean z4) {
        this.f40010a = i10;
        this.f40012c = obj;
        this.f40011b = z4;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.k81 k81Var;
        switch (this.f40010a) {
            case 0:
                sc scVar = (sc) this.f40012c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.f41225b.getClass();
                if (RecyclerView.R(view) == scVar.f41227e) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rcVar.f40926s = z4;
                if (!this.f40011b) {
                    rcVar.v.f(z4, true);
                }
                rcVar.invalidate();
                return;
            case 1:
                xn xnVar = (xn) this.f40012c;
                View view2 = (View) obj;
                boolean z12 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z13 = this.f40011b;
                if (z12) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if (t1Var.B8 && t1Var.D8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != z13 && xnVar.B9()) {
                        t1Var.B8 = z13;
                        t1Var.D8 = xnVar.B9();
                        t1Var.f23919k8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).f24240b0 = z13;
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.l81 l81Var = (org.telegram.ui.Components.l81) this.f40012c;
                View view3 = (View) obj;
                l81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.j81) {
                    org.telegram.ui.Components.j81 j81Var = (org.telegram.ui.Components.j81) view3;
                    if (this.f40011b && (k81Var = l81Var.f28671y) != null && ((oh.h4) k81Var).Q(R)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j81Var.setReordering(z11);
                    return;
                }
                return;
        }
    }
}
