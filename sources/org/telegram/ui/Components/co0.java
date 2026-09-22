package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class co0 extends s4.s0 {
    public final int f23414a;
    public final org.telegram.ui.uy f23415b;
    public final org.telegram.ui.ey f23416c;

    public co0(org.telegram.ui.ey eyVar, org.telegram.ui.uy uyVar, int i10) {
        this.f23414a = i10;
        this.f23416c = eyVar;
        this.f23415b = uyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f23414a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23415b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23415b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23415b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f23415b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.gy gyVar;
        int i12;
        yl0 yl0Var;
        switch (this.f23414a) {
            case 0:
                org.telegram.ui.ey eyVar = this.f23416c;
                eyVar.f26850p0.V();
                eyVar.T(i10, i11);
                return;
            case 1:
                org.telegram.ui.ey eyVar2 = this.f23416c;
                eyVar2.f26857w0.W();
                eyVar2.T(i10, i11);
                return;
            case 2:
                org.telegram.ui.ey eyVar3 = this.f23416c;
                go0 go0Var = eyVar3.f26838c0;
                s4.c0 c0Var = eyVar3.f26839d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((go0Var.U.a() != 0 && !go0Var.X) || !go0Var.W) && (N0 == h - 1 || ((gyVar = go0Var.U) != null && gyVar.a() != 0 && (i12 = go0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    go0Var.Q();
                }
                eyVar3.T(i10, i11);
                return;
            default:
                org.telegram.ui.ey eyVar4 = this.f23416c;
                io0 io0Var = eyVar4.f26846k0;
                if (io0Var.Y && !io0Var.W && !TextUtils.isEmpty(io0Var.f28529b0) && (yl0Var = io0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < yl0Var.getChildCount()) {
                            if (yl0Var.getChildAt(i13) instanceof t00) {
                                if (io0Var.Y && !io0Var.W && !TextUtils.isEmpty(io0Var.f28529b0)) {
                                    io0Var.V(true);
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
