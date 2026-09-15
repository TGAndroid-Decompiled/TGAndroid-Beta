package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nn0 extends s4.s0 {
    public final int f26541a;
    public final org.telegram.ui.uy f26542b;
    public final org.telegram.ui.ey f26543c;

    public nn0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
        this.f26541a = i10;
        this.f26543c = eyVar;
        this.f26542b = uyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f26541a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26542b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26542b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26542b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26542b.getParentActivity().getCurrentFocus());
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
        switch (this.f26541a) {
            case 0:
                org.telegram.ui.ey eyVar = this.f26543c;
                eyVar.f30299o0.V();
                eyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.ey eyVar2 = this.f26543c;
                eyVar2.f30306v0.W();
                eyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.ey eyVar3 = this.f26543c;
                rn0 rn0Var = eyVar3.f30287b0;
                s4.c0 c0Var = eyVar3.f30288c0;
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
                org.telegram.ui.ey eyVar4 = this.f26543c;
                tn0 tn0Var = eyVar4.f30295j0;
                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.f28179b0) && (ll0Var = tn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ll0Var.getChildCount()) {
                            if (ll0Var.getChildAt(i13) instanceof t00) {
                                if (tn0Var.Y && !tn0Var.W && !TextUtils.isEmpty(tn0Var.f28179b0)) {
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
