package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class tn0 extends f2.a1 {
    public final int f31417a;
    public final org.telegram.ui.py f31418b;
    public final org.telegram.ui.yx f31419c;

    public tn0(org.telegram.ui.yx yxVar, org.telegram.ui.py pyVar, int i10) {
        this.f31417a = i10;
        this.f31419c = yxVar;
        this.f31418b = pyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f31417a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31418b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31418b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31418b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31418b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ay ayVar;
        int i12;
        tl0 tl0Var;
        switch (this.f31417a) {
            case 0:
                org.telegram.ui.yx yxVar = this.f31419c;
                yxVar.f26608l0.V();
                yxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.yx yxVar2 = this.f31419c;
                yxVar2.f26614s0.W();
                yxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.yx yxVar3 = this.f31419c;
                xn0 xn0Var = yxVar3.V;
                f2.j0 j0Var = yxVar3.W;
                int L0 = j0Var.L0();
                int N0 = j0Var.N0();
                int abs = Math.abs(j0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((xn0Var.R.a() != 0 && !xn0Var.U) || !xn0Var.T) && (N0 == h - 1 || ((ayVar = xn0Var.R) != null && ayVar.a() != 0 && (i12 = xn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    xn0Var.Q();
                }
                yxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.yx yxVar4 = this.f31419c;
                zn0 zn0Var = yxVar4.f26603g0;
                if (zn0Var.V && !zn0Var.T && !TextUtils.isEmpty(zn0Var.Y) && (tl0Var = zn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < tl0Var.getChildCount()) {
                            if (tl0Var.getChildAt(i13) instanceof u00) {
                                if (zn0Var.V && !zn0Var.T && !TextUtils.isEmpty(zn0Var.Y)) {
                                    zn0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                yxVar4.S(i10, i11);
                return;
        }
    }
}
