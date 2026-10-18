package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ko0 extends s4.r0 {
    public final int f27947a;
    public final org.telegram.ui.ey f27948b;
    public final org.telegram.ui.nx f27949c;

    public ko0(org.telegram.ui.nx nxVar, org.telegram.ui.ey eyVar, int i10) {
        this.f27947a = i10;
        this.f27949c = nxVar;
        this.f27948b = eyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f27947a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27948b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27948b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27948b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f27948b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.px pxVar;
        int i12;
        im0 im0Var;
        switch (this.f27947a) {
            case 0:
                org.telegram.ui.nx nxVar = this.f27949c;
                nxVar.f31352o0.V();
                nxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.nx nxVar2 = this.f27949c;
                nxVar2.f31359v0.W();
                nxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.nx nxVar3 = this.f27949c;
                oo0 oo0Var = nxVar3.f31340b0;
                s4.b0 b0Var = nxVar3.f31341c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((oo0Var.U.a() != 0 && !oo0Var.X) || !oo0Var.W) && (N0 == h - 1 || ((pxVar = oo0Var.U) != null && pxVar.a() != 0 && (i12 = oo0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    oo0Var.Q();
                }
                nxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.nx nxVar4 = this.f27949c;
                qo0 qo0Var = nxVar4.f31348j0;
                if (qo0Var.Y && !qo0Var.W && !TextUtils.isEmpty(qo0Var.f25365b0) && (im0Var = qo0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < im0Var.getChildCount()) {
                            if (im0Var.getChildAt(i13) instanceof b10) {
                                if (qo0Var.Y && !qo0Var.W && !TextUtils.isEmpty(qo0Var.f25365b0)) {
                                    qo0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                nxVar4.S(i10, i11);
                return;
        }
    }
}
