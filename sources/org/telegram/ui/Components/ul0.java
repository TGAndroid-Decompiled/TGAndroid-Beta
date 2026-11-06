package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class ul0 extends v4.s0 {
    public final int f38675a;
    public final org.telegram.ui.ww f38676b;
    public final org.telegram.ui.fw f38677c;

    public ul0(org.telegram.ui.fw fwVar, org.telegram.ui.ww wwVar, int i7) {
        this.f38675a = i7;
        this.f38677c = fwVar;
        this.f38676b = wwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f38675a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38676b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38676b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38676b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38676b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.hw hwVar;
        int i11;
        pj0 pj0Var;
        switch (this.f38675a) {
            case 0:
                org.telegram.ui.fw fwVar = this.f38677c;
                fwVar.f33593q0.W();
                fwVar.T();
                return;
            case 1:
                org.telegram.ui.fw fwVar2 = this.f38677c;
                fwVar2.f33600x0.X();
                fwVar2.T();
                return;
            case 2:
                org.telegram.ui.fw fwVar3 = this.f38677c;
                yl0 yl0Var = fwVar3.f33581d0;
                v4.b0 b0Var = fwVar3.f33582e0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((yl0Var.U.a() != 0 && !yl0Var.X) || !yl0Var.W) && (N0 == b10 - 1 || ((hwVar = yl0Var.U) != null && hwVar.a() != 0 && (i11 = yl0Var.Y) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    yl0Var.P();
                }
                fwVar3.T();
                return;
            default:
                org.telegram.ui.fw fwVar4 = this.f38677c;
                am0 am0Var = fwVar4.f33589l0;
                if (am0Var.f40341a0 && !am0Var.Y && !TextUtils.isEmpty(am0Var.f40344d0) && (pj0Var = am0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < pj0Var.getChildCount()) {
                            if (pj0Var.getChildAt(i12) instanceof lz) {
                                if (am0Var.f40341a0 && !am0Var.Y && !TextUtils.isEmpty(am0Var.f40344d0)) {
                                    am0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                fwVar4.T();
                return;
        }
    }
}
