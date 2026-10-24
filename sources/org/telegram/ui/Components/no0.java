package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class no0 extends s4.r0 {
    public final int f28985a;
    public final org.telegram.ui.ey f28986b;
    public final org.telegram.ui.nx f28987c;

    public no0(org.telegram.ui.nx nxVar, org.telegram.ui.ey eyVar, int i10) {
        this.f28985a = i10;
        this.f28987c = nxVar;
        this.f28986b = eyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28985a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28986b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28986b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28986b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28986b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.px pxVar;
        int i12;
        lm0 lm0Var;
        switch (this.f28985a) {
            case 0:
                org.telegram.ui.nx nxVar = this.f28987c;
                nxVar.f33315o0.V();
                nxVar.R(i10, i11);
                return;
            case 1:
                org.telegram.ui.nx nxVar2 = this.f28987c;
                nxVar2.f33322v0.W();
                nxVar2.R(i10, i11);
                return;
            case 2:
                org.telegram.ui.nx nxVar3 = this.f28987c;
                ro0 ro0Var = nxVar3.f33303b0;
                s4.b0 b0Var = nxVar3.f33304c0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((ro0Var.U.a() != 0 && !ro0Var.X) || !ro0Var.W) && (N0 == h - 1 || ((pxVar = ro0Var.U) != null && pxVar.a() != 0 && (i12 = ro0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    ro0Var.P();
                }
                nxVar3.R(i10, i11);
                return;
            default:
                org.telegram.ui.nx nxVar4 = this.f28987c;
                to0 to0Var = nxVar4.f33311j0;
                if (to0Var.f24797a0 && !to0Var.Y && !TextUtils.isEmpty(to0Var.f24800d0) && (lm0Var = to0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < lm0Var.getChildCount()) {
                            if (lm0Var.getChildAt(i13) instanceof z00) {
                                if (to0Var.f24797a0 && !to0Var.Y && !TextUtils.isEmpty(to0Var.f24800d0)) {
                                    to0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                nxVar4.R(i10, i11);
                return;
        }
    }
}
