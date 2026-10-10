package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class to0 extends s4.t0 {
    public final int f31193a;
    public final org.telegram.ui.ty f31194b;
    public final org.telegram.ui.dy f31195c;

    public to0(org.telegram.ui.dy dyVar, org.telegram.ui.ty tyVar, int i10) {
        this.f31193a = i10;
        this.f31195c = dyVar;
        this.f31194b = tyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f31193a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31194b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31194b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31194b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31194b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.fy fyVar;
        int i12;
        rm0 rm0Var;
        switch (this.f31193a) {
            case 0:
                org.telegram.ui.dy dyVar = this.f31195c;
                dyVar.f26139o0.V();
                dyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.dy dyVar2 = this.f31195c;
                dyVar2.f26146v0.W();
                dyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.dy dyVar3 = this.f31195c;
                xo0 xo0Var = dyVar3.f26127b0;
                s4.d0 d0Var = dyVar3.f26128c0;
                int L0 = d0Var.L0();
                int N0 = d0Var.N0();
                int abs = Math.abs(d0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((xo0Var.U.a() != 0 && !xo0Var.X) || !xo0Var.W) && (N0 == h - 1 || ((fyVar = xo0Var.U) != null && fyVar.a() != 0 && (i12 = xo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    xo0Var.Q();
                }
                dyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.dy dyVar4 = this.f31195c;
                zo0 zo0Var = dyVar4.f26135j0;
                if (zo0Var.Y && !zo0Var.W && !TextUtils.isEmpty(zo0Var.f28539b0) && (rm0Var = zo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < rm0Var.getChildCount()) {
                            if (rm0Var.getChildAt(i13) instanceof k10) {
                                if (zo0Var.Y && !zo0Var.W && !TextUtils.isEmpty(zo0Var.f28539b0)) {
                                    zo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                dyVar4.S(i10, i11);
                return;
        }
    }
}
