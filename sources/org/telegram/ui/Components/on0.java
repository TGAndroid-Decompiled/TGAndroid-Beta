package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class on0 extends s4.s0 {
    public final int f26826a;
    public final org.telegram.ui.wy f26827b;
    public final org.telegram.ui.gy f26828c;

    public on0(org.telegram.ui.gy gyVar, org.telegram.ui.wy wyVar, int i10) {
        this.f26826a = i10;
        this.f26828c = gyVar;
        this.f26827b = wyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f26826a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26827b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26827b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26827b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f26827b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.iy iyVar;
        int i12;
        ml0 ml0Var;
        switch (this.f26826a) {
            case 0:
                org.telegram.ui.gy gyVar = this.f26828c;
                gyVar.f30560p0.V();
                gyVar.T(i10, i11);
                return;
            case 1:
                org.telegram.ui.gy gyVar2 = this.f26828c;
                gyVar2.f30567w0.W();
                gyVar2.T(i10, i11);
                return;
            case 2:
                org.telegram.ui.gy gyVar3 = this.f26828c;
                sn0 sn0Var = gyVar3.f30548c0;
                s4.c0 c0Var = gyVar3.f30549d0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int h = recyclerView.getAdapter().h();
                if (abs > 0 && (((sn0Var.U.a() != 0 && !sn0Var.X) || !sn0Var.W) && (N0 == h - 1 || ((iyVar = sn0Var.U) != null && iyVar.a() != 0 && (i12 = sn0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    sn0Var.Q();
                }
                gyVar3.T(i10, i11);
                return;
            default:
                org.telegram.ui.gy gyVar4 = this.f26828c;
                un0 un0Var = gyVar4.f30556k0;
                if (un0Var.Y && !un0Var.W && !TextUtils.isEmpty(un0Var.f28197b0) && (ml0Var = un0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < ml0Var.getChildCount()) {
                            if (ml0Var.getChildAt(i13) instanceof t00) {
                                if (un0Var.Y && !un0Var.W && !TextUtils.isEmpty(un0Var.f28197b0)) {
                                    un0Var.V(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                gyVar4.T(i10, i11);
                return;
        }
    }
}
