package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class kc implements d5.d {
    public final int f39798a;
    public final boolean f39799b;
    public final Object f39800c;

    public kc(int i9, Object obj, boolean z10) {
        this.f39798a = i9;
        this.f39800c = obj;
        this.f39799b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.l71 l71Var;
        switch (this.f39798a) {
            case 0:
                nc ncVar = (nc) this.f39800c;
                View view = (View) obj;
                mc mcVar = (mc) view;
                ncVar.f40693b.getClass();
                if (RecyclerView.R(view) == ncVar.f40695e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mcVar.f40388s = z10;
                if (!this.f39799b) {
                    mcVar.v.f(z10, true);
                }
                mcVar.invalidate();
                return;
            case 1:
                qn qnVar = (qn) this.f39800c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof org.telegram.ui.Cells.t1;
                boolean z14 = this.f39799b;
                if (z13) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                    if (t1Var.A8 && t1Var.C8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != z14 && qnVar.B9()) {
                        t1Var.A8 = z14;
                        t1Var.C8 = qnVar.B9();
                        t1Var.f25438j8 = true;
                        t1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).f25825a0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) this.f39800c;
                View view3 = (View) obj;
                m71Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.k71) {
                    org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) view3;
                    if (this.f39799b && (l71Var = m71Var.f30759y) != null && ((n2.p) l71Var).o(R)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k71Var.setReordering(z12);
                    return;
                }
                return;
        }
    }
}
