package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sn0 extends f2.a1 {
    public final int f31140a;
    public final org.telegram.ui.py f31141b;
    public final org.telegram.ui.yx f31142c;

    public sn0(org.telegram.ui.yx yxVar, org.telegram.ui.py pyVar, int i10) {
        this.f31140a = i10;
        this.f31142c = yxVar;
        this.f31141b = pyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f31140a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31141b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31141b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31141b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f31141b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ay ayVar;
        int i12;
        sl0 sl0Var;
        switch (this.f31140a) {
            case 0:
                org.telegram.ui.yx yxVar = this.f31142c;
                yxVar.f26331l0.V();
                yxVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.yx yxVar2 = this.f31142c;
                yxVar2.f26337s0.W();
                yxVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.yx yxVar3 = this.f31142c;
                wn0 wn0Var = yxVar3.V;
                f2.j0 j0Var = yxVar3.W;
                int L0 = j0Var.L0();
                int N0 = j0Var.N0();
                int abs = Math.abs(j0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((wn0Var.R.a() != 0 && !wn0Var.U) || !wn0Var.T) && (N0 == h - 1 || ((ayVar = wn0Var.R) != null && ayVar.a() != 0 && (i12 = wn0Var.V) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    wn0Var.Q();
                }
                yxVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.yx yxVar4 = this.f31142c;
                yn0 yn0Var = yxVar4.f26326g0;
                if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y) && (sl0Var = yn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < sl0Var.getChildCount()) {
                            if (sl0Var.getChildAt(i13) instanceof u00) {
                                if (yn0Var.V && !yn0Var.T && !TextUtils.isEmpty(yn0Var.Y)) {
                                    yn0Var.V(true);
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
