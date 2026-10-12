package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yo0 extends s4.t0 {
    public final int f33146a;
    public final org.telegram.ui.vy f33147b;
    public final org.telegram.ui.fy f33148c;

    public yo0(org.telegram.ui.fy fyVar, org.telegram.ui.vy vyVar, int i10) {
        this.f33146a = i10;
        this.f33148c = fyVar;
        this.f33147b = vyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f33146a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33147b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33147b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33147b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f33147b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.hy hyVar;
        int i12;
        wm0 wm0Var;
        switch (this.f33146a) {
            case 0:
                org.telegram.ui.fy fyVar = this.f33148c;
                fyVar.f27603o0.V();
                fyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.fy fyVar2 = this.f33148c;
                fyVar2.f27610v0.W();
                fyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.fy fyVar3 = this.f33148c;
                cp0 cp0Var = fyVar3.f27591b0;
                s4.d0 d0Var = fyVar3.f27592c0;
                int L0 = d0Var.L0();
                int N0 = d0Var.N0();
                int abs = Math.abs(d0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((cp0Var.U.a() != 0 && !cp0Var.X) || !cp0Var.W) && (N0 == h - 1 || ((hyVar = cp0Var.U) != null && hyVar.a() != 0 && (i12 = cp0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    cp0Var.Q();
                }
                fyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.fy fyVar4 = this.f33148c;
                ep0 ep0Var = fyVar4.f27599j0;
                if (ep0Var.Y && !ep0Var.W && !TextUtils.isEmpty(ep0Var.f28658b0) && (wm0Var = ep0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < wm0Var.getChildCount()) {
                            if (wm0Var.getChildAt(i13) instanceof m10) {
                                if (ep0Var.Y && !ep0Var.W && !TextUtils.isEmpty(ep0Var.f28658b0)) {
                                    ep0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                fyVar4.S(i10, i11);
                return;
        }
    }
}
