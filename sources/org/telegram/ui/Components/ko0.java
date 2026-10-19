package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ko0 extends s4.r0 {
    public final int f27925a;
    public final org.telegram.ui.cy f27926b;
    public final org.telegram.ui.lx f27927c;

    public ko0(org.telegram.ui.lx lxVar, org.telegram.ui.cy cyVar, int i10) {
        this.f27925a = i10;
        this.f27927c = lxVar;
        this.f27926b = cyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f27925a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27926b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27926b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27926b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27926b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.nx nxVar;
        int i12;
        im0 im0Var;
        switch (this.f27925a) {
            case 0:
                org.telegram.ui.lx lxVar = this.f27927c;
                lxVar.f31361o0.V();
                lxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.lx lxVar2 = this.f27927c;
                lxVar2.f31368v0.W();
                lxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.lx lxVar3 = this.f27927c;
                oo0 oo0Var = lxVar3.f31349b0;
                s4.b0 b0Var = lxVar3.f31350c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((oo0Var.U.a() != 0 && !oo0Var.X) || !oo0Var.W) && (N0 == h - 1 || ((nxVar = oo0Var.U) != null && nxVar.a() != 0 && (i12 = oo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    oo0Var.Q();
                }
                lxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.lx lxVar4 = this.f27927c;
                qo0 qo0Var = lxVar4.f31357j0;
                if (qo0Var.Y && !qo0Var.W && !TextUtils.isEmpty(qo0Var.f25339b0) && (im0Var = qo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < im0Var.getChildCount()) {
                            if (im0Var.getChildAt(i13) instanceof b10) {
                                if (qo0Var.Y && !qo0Var.W && !TextUtils.isEmpty(qo0Var.f25339b0)) {
                                    qo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                lxVar4.S(i10, i11);
                return;
        }
    }
}
