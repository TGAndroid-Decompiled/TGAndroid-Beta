package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class uo0 extends s4.t0 {
    public final int f31538a;
    public final org.telegram.ui.sy f31539b;
    public final org.telegram.ui.cy f31540c;

    public uo0(org.telegram.ui.cy cyVar, org.telegram.ui.sy syVar, int i10) {
        this.f31538a = i10;
        this.f31540c = cyVar;
        this.f31539b = syVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f31538a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31539b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31539b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31539b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31539b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ey eyVar;
        int i12;
        sm0 sm0Var;
        switch (this.f31538a) {
            case 0:
                org.telegram.ui.cy cyVar = this.f31540c;
                cyVar.f26449o0.V();
                cyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.cy cyVar2 = this.f31540c;
                cyVar2.f26456v0.W();
                cyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.cy cyVar3 = this.f31540c;
                yo0 yo0Var = cyVar3.f26437b0;
                s4.d0 d0Var = cyVar3.f26438c0;
                int L0 = d0Var.L0();
                int N0 = d0Var.N0();
                int abs = Math.abs(d0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((yo0Var.U.a() != 0 && !yo0Var.X) || !yo0Var.W) && (N0 == h - 1 || ((eyVar = yo0Var.U) != null && eyVar.a() != 0 && (i12 = yo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    yo0Var.Q();
                }
                cyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.cy cyVar4 = this.f31540c;
                ap0 ap0Var = cyVar4.f26445j0;
                if (ap0Var.Y && !ap0Var.W && !TextUtils.isEmpty(ap0Var.f28456b0) && (sm0Var = ap0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < sm0Var.getChildCount()) {
                            if (sm0Var.getChildAt(i13) instanceof k10) {
                                if (ap0Var.Y && !ap0Var.W && !TextUtils.isEmpty(ap0Var.f28456b0)) {
                                    ap0Var.V(true);
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
