package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class oc implements h5.d {
    public final int f39652a;
    public final boolean f39653b;
    public final Object f39654c;

    public oc(int i10, Object obj, boolean z4) {
        this.f39652a = i10;
        this.f39654c = obj;
        this.f39653b = z4;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.j81 j81Var;
        switch (this.f39652a) {
            case 0:
                rc rcVar = (rc) this.f39654c;
                View view = (View) obj;
                qc qcVar = (qc) view;
                rcVar.f40810b.getClass();
                if (RecyclerView.R(view) == rcVar.f40812e) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qcVar.f40429s = z4;
                if (!this.f39653b) {
                    qcVar.v.f(z4, true);
                }
                qcVar.invalidate();
                return;
            case 1:
                xn xnVar = (xn) this.f39654c;
                View view2 = (View) obj;
                boolean z12 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z13 = this.f39653b;
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
                        t1Var.f23921k8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).f24242b0 = z13;
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.k81 k81Var = (org.telegram.ui.Components.k81) this.f39654c;
                View view3 = (View) obj;
                k81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.i81) {
                    org.telegram.ui.Components.i81 i81Var = (org.telegram.ui.Components.i81) view3;
                    if (this.f39653b && (j81Var = k81Var.f28346y) != null && ((oh.h4) j81Var).Q(R)) {
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
