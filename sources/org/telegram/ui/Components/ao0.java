package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ao0 extends s4.s0 {
    public final int f22730a;
    public final org.telegram.ui.uy f22731b;
    public final org.telegram.ui.ey f22732c;

    public ao0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
        this.f22730a = i10;
        this.f22732c = eyVar;
        this.f22731b = uyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f22730a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22731b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22731b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22731b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f22731b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.gy gyVar;
        int i12;
        vl0 vl0Var;
        switch (this.f22730a) {
            case 0:
                org.telegram.ui.ey eyVar = this.f22732c;
                eyVar.f26208p0.V();
                eyVar.T(i10, i11);
                return;
            case 1:
                org.telegram.ui.ey eyVar2 = this.f22732c;
                eyVar2.f26215w0.W();
                eyVar2.T(i10, i11);
                return;
            case 2:
                org.telegram.ui.ey eyVar3 = this.f22732c;
                eo0 eo0Var = eyVar3.f26196c0;
                s4.c0 c0Var = eyVar3.f26197d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((eo0Var.U.a() != 0 && !eo0Var.X) || !eo0Var.W) && (N0 == h - 1 || ((gyVar = eo0Var.U) != null && gyVar.a() != 0 && (i12 = eo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    eo0Var.Q();
                }
                eyVar3.T(i10, i11);
                return;
            default:
                org.telegram.ui.ey eyVar4 = this.f22732c;
                go0 go0Var = eyVar4.f26204k0;
                if (go0Var.Y && !go0Var.W && !TextUtils.isEmpty(go0Var.f28436b0) && (vl0Var = go0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < vl0Var.getChildCount()) {
                            if (vl0Var.getChildAt(i13) instanceof t00) {
                                if (go0Var.Y && !go0Var.W && !TextUtils.isEmpty(go0Var.f28436b0)) {
                                    go0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                eyVar4.T(i10, i11);
                return;
        }
    }
}
