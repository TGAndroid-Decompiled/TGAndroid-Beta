package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class lc implements d5.d {

    public final int f40043a;

    public final boolean f40044b;

    public final Object f40045c;

    public lc(int i10, Object obj, boolean z10) {
        this.f40043a = i10;
        this.f40045c = obj;
        this.f40044b = z10;
    }

    @Override
    public final void accept(Object obj) {
        org.telegram.ui.Components.n71 n71Var;
        switch (this.f40043a) {
            case 0:
                oc ocVar = (oc) this.f40045c;
                View view = (View) obj;
                nc ncVar = (nc) view;
                ocVar.f41058b.getClass();
                boolean z10 = RecyclerView.R(view) == ocVar.f41060e;
                ncVar.f40727s = z10;
                if (!this.f40044b) {
                    ncVar.v.f(z10, true);
                }
                ncVar.invalidate();
                break;
            case 1:
                rn rnVar = (rn) this.f40045c;
                View view2 = (View) obj;
                boolean z11 = view2 instanceof org.telegram.ui.Cells.s1;
                boolean z12 = this.f40044b;
                if (!z11) {
                    if (view2 instanceof org.telegram.ui.Cells.v0) {
                        ((org.telegram.ui.Cells.v0) view2).f25728a0 = z12;
                    }
                    break;
                } else {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                    if ((s1Var.A8 && s1Var.C8) != z12 && rnVar.B9()) {
                        s1Var.A8 = z12;
                        s1Var.C8 = rnVar.B9();
                        s1Var.f25391j8 = true;
                        s1Var.forceLayout();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Components.o71 o71Var = (org.telegram.ui.Components.o71) this.f40045c;
                View view3 = (View) obj;
                o71Var.v.getClass();
                int iR = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.m71) {
                    ((org.telegram.ui.Components.m71) view3).setReordering(this.f40044b && (n71Var = o71Var.f31227y) != null && ((m5.o) n71Var).q(iR));
                }
                break;
        }
    }
}
