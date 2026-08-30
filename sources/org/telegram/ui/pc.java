package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class pc implements h5.d {
    public final int f37273a;
    public final boolean f37274b;
    public final Object f37275c;

    public pc(int i10, Object obj, boolean z4) {
        this.f37273a = i10;
        this.f37275c = obj;
        this.f37274b = z4;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.j81 j81Var;
        switch (this.f37273a) {
            case 0:
                sc scVar = (sc) this.f37275c;
                View view = (View) obj;
                rc rcVar = (rc) view;
                scVar.f38292b.getClass();
                if (RecyclerView.R(view) == scVar.e) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rcVar.f37979s = z4;
                if (!this.f37274b) {
                    rcVar.v.f(z4, true);
                }
                rcVar.invalidate();
                return;
            case 1:
                xn xnVar = (xn) this.f37275c;
                View view2 = (View) obj;
                boolean z12 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z13 = this.f37274b;
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
                        t1Var.f22119k8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).f22428b0 = z13;
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.k81 k81Var = (org.telegram.ui.Components.k81) this.f37275c;
                View view3 = (View) obj;
                k81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.i81) {
                    org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) view3;
                    if (this.f37274b && (j81Var = k81Var.f26229y) != null && ((o2.o) j81Var).j(R)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i81Var.setReordering(z11);
                    return;
                }
                return;
        }
    }
}
