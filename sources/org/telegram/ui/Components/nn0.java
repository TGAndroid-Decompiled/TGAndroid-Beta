package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends s4.s0 {
    public final int f28840a;
    public final org.telegram.ui.uy f28841b;
    public final org.telegram.ui.ey f28842c;

    public nn0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
        this.f28840a = i10;
        this.f28842c = eyVar;
        this.f28841b = uyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28840a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28841b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28841b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28841b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28841b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.gy gyVar;
        int i12;
        ll0 ll0Var;
        switch (this.f28840a) {
            case 0:
                org.telegram.ui.ey eyVar = this.f28842c;
                eyVar.f32962o0.V();
                eyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.ey eyVar2 = this.f28842c;
                eyVar2.f32969v0.W();
                eyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.ey eyVar3 = this.f28842c;
                rn0 rn0Var = eyVar3.f32950b0;
                s4.c0 c0Var = eyVar3.f32951c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((rn0Var.U.a() != 0 && !rn0Var.X) || !rn0Var.W) && (N0 == h - 1 || ((gyVar = rn0Var.U) != null && gyVar.a() != 0 && (i12 = rn0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    rn0Var.Q();
                }
                eyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.ey eyVar4 = this.f28842c;
                tn0 tn0Var = eyVar4.f32958j0;
                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.f30406b0) && (ll0Var = tn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ll0Var.getChildCount()) {
                            if (ll0Var.getChildAt(i13) instanceof t00) {
                                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.f30406b0)) {
                                    tn0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                eyVar4.S(i10, i11);
                return;
        }
    }
}
