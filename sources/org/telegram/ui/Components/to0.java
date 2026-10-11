package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class to0 extends s4.t0 {
    public final int f31312a;
    public final org.telegram.ui.sy f31313b;
    public final org.telegram.ui.cy f31314c;

    public to0(org.telegram.ui.cy cyVar, org.telegram.ui.sy syVar, int i10) {
        this.f31312a = i10;
        this.f31314c = cyVar;
        this.f31313b = syVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f31312a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31313b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31313b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31313b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31313b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ey eyVar;
        int i12;
        rm0 rm0Var;
        switch (this.f31312a) {
            case 0:
                org.telegram.ui.cy cyVar = this.f31314c;
                cyVar.f26177o0.V();
                cyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.cy cyVar2 = this.f31314c;
                cyVar2.f26184v0.W();
                cyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.cy cyVar3 = this.f31314c;
                xo0 xo0Var = cyVar3.f26165b0;
                s4.d0 d0Var = cyVar3.f26166c0;
                int L0 = d0Var.L0();
                int N0 = d0Var.N0();
                int abs = Math.abs(d0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((xo0Var.U.a() != 0 && !xo0Var.X) || !xo0Var.W) && (N0 == h - 1 || ((eyVar = xo0Var.U) != null && eyVar.a() != 0 && (i12 = xo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    xo0Var.Q();
                }
                cyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.cy cyVar4 = this.f31314c;
                zo0 zo0Var = cyVar4.f26173j0;
                if (zo0Var.Y && !zo0Var.W && !TextUtils.isEmpty(zo0Var.f28615b0) && (rm0Var = zo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < rm0Var.getChildCount()) {
                            if (rm0Var.getChildAt(i13) instanceof k10) {
                                if (zo0Var.Y && !zo0Var.W && !TextUtils.isEmpty(zo0Var.f28615b0)) {
                                    zo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                cyVar4.S(i10, i11);
                return;
        }
    }
}
