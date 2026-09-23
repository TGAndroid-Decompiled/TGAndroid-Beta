package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends s4.s0 {
    public final int f26448a;
    public final org.telegram.ui.ry f26449b;
    public final org.telegram.ui.ay f26450c;

    public nn0(org.telegram.ui.ay ayVar, org.telegram.ui.ry ryVar, int i10) {
        this.f26448a = i10;
        this.f26450c = ayVar;
        this.f26449b = ryVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f26448a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26449b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26449b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26449b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26449b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.dy dyVar;
        int i12;
        ml0 ml0Var;
        switch (this.f26448a) {
            case 0:
                org.telegram.ui.ay ayVar = this.f26450c;
                ayVar.f30347o0.V();
                ayVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.ay ayVar2 = this.f26450c;
                ayVar2.f30354v0.W();
                ayVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.ay ayVar3 = this.f26450c;
                rn0 rn0Var = ayVar3.f30335b0;
                s4.c0 c0Var = ayVar3.f30336c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((rn0Var.U.a() != 0 && !rn0Var.X) || !rn0Var.W) && (N0 == h - 1 || ((dyVar = rn0Var.U) != null && dyVar.a() != 0 && (i12 = rn0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    rn0Var.Q();
                }
                ayVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.ay ayVar4 = this.f26450c;
                tn0 tn0Var = ayVar4.f30343j0;
                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.f28549b0) && (ml0Var = tn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ml0Var.getChildCount()) {
                            if (ml0Var.getChildAt(i13) instanceof u00) {
                                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.f28549b0)) {
                                    tn0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                ayVar4.S(i10, i11);
                return;
        }
    }
}
