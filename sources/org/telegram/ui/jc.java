package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class jc implements f5.d {
    public final int f39505a;
    public final boolean f39506b;
    public final Object f39507c;

    public jc(int i10, Object obj, boolean z10) {
        this.f39505a = i10;
        this.f39507c = obj;
        this.f39506b = z10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.x71 x71Var;
        switch (this.f39505a) {
            case 0:
                mc mcVar = (mc) this.f39507c;
                View view = (View) obj;
                lc lcVar = (lc) view;
                mcVar.f40520b.getClass();
                if (RecyclerView.R(view) == mcVar.f40522e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lcVar.f40162s = z10;
                if (!this.f39506b) {
                    lcVar.v.f(z10, true);
                }
                lcVar.invalidate();
                return;
            case 1:
                tn tnVar = (tn) this.f39507c;
                View view2 = (View) obj;
                boolean z13 = view2 instanceof org.telegram.ui.Cells.s1;
                boolean z14 = this.f39506b;
                if (z13) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view2;
                    if (s1Var.A8 && s1Var.C8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != z14 && tnVar.B9()) {
                        s1Var.A8 = z14;
                        s1Var.C8 = tnVar.B9();
                        s1Var.f25402j8 = true;
                        s1Var.forceLayout();
                        return;
                    }
                    return;
                } else if (view2 instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) view2).f25758a0 = z14;
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) this.f39507c;
                View view3 = (View) obj;
                y71Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof org.telegram.ui.Components.w71) {
                    org.telegram.ui.Components.w71 w71Var = (org.telegram.ui.Components.w71) view3;
                    if (this.f39506b && (x71Var = y71Var.f34963y) != null && ((org.telegram.ui.Components.n) x71Var).f(R)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    w71Var.setReordering(z12);
                    return;
                }
                return;
        }
    }
}
