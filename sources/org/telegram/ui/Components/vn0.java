package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vn0 extends s4.s0 {
    public final int f28030a;
    public final org.telegram.ui.wy f28031b;
    public final org.telegram.ui.gy f28032c;

    public vn0(org.telegram.ui.gy gyVar, org.telegram.ui.wy wyVar, int i10) {
        this.f28030a = i10;
        this.f28032c = gyVar;
        this.f28031b = wyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f28030a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28031b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28031b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28031b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f28031b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.iy iyVar;
        int i12;
        vl0 vl0Var;
        switch (this.f28030a) {
            case 0:
                org.telegram.ui.gy gyVar = this.f28032c;
                gyVar.f23725o0.V();
                gyVar.S(i10, i11);
                return;
            case 1:
                org.telegram.ui.gy gyVar2 = this.f28032c;
                gyVar2.f23732v0.W();
                gyVar2.S(i10, i11);
                return;
            case 2:
                org.telegram.ui.gy gyVar3 = this.f28032c;
                ao0 ao0Var = gyVar3.f23713b0;
                s4.c0 c0Var = gyVar3.f23714c0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((ao0Var.U.a() != 0 && !ao0Var.X) || !ao0Var.W) && (N0 == h - 1 || ((iyVar = ao0Var.U) != null && iyVar.a() != 0 && (i12 = ao0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    ao0Var.Q();
                }
                gyVar3.S(i10, i11);
                return;
            default:
                org.telegram.ui.gy gyVar4 = this.f28032c;
                co0 co0Var = gyVar4.f23721j0;
                if (co0Var.Y && !co0Var.W && !TextUtils.isEmpty(co0Var.f29802b0) && (vl0Var = co0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < vl0Var.getChildCount()) {
                            if (vl0Var.getChildAt(i13) instanceof a10) {
                                if (co0Var.Y && !co0Var.W && !TextUtils.isEmpty(co0Var.f29802b0)) {
                                    co0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                gyVar4.S(i10, i11);
                return;
        }
    }
}
