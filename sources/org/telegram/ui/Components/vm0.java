package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class vm0 extends s4.s0 {
    public final int f31288a;
    public final org.telegram.ui.ay f31289b;
    public final org.telegram.ui.kx f31290c;

    public vm0(org.telegram.ui.kx kxVar, org.telegram.ui.ay ayVar, int i10) {
        this.f31288a = i10;
        this.f31290c = kxVar;
        this.f31289b = ayVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f31288a) {
            case 0:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f31289b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f31289b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f31289b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(this.f31289b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.mx mxVar;
        int i12;
        tk0 tk0Var;
        switch (this.f31288a) {
            case 0:
                org.telegram.ui.kx kxVar = this.f31290c;
                kxVar.f26463q0.W();
                kxVar.T();
                return;
            case 1:
                org.telegram.ui.kx kxVar2 = this.f31290c;
                kxVar2.f26470x0.X();
                kxVar2.T();
                return;
            case 2:
                org.telegram.ui.kx kxVar3 = this.f31290c;
                zm0 zm0Var = kxVar3.f26451d0;
                s4.a0 a0Var = kxVar3.f26452e0;
                int L0 = a0Var.L0();
                int N0 = a0Var.N0();
                int abs = Math.abs(a0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((zm0Var.U.a() != 0 && !zm0Var.X) || !zm0Var.W) && (N0 == b10 - 1 || ((mxVar = zm0Var.U) != null && mxVar.a() != 0 && (i12 = zm0Var.Y) >= 0 && L0 <= i12 && N0 >= i12)))) {
                    zm0Var.P();
                }
                kxVar3.T();
                return;
            default:
                org.telegram.ui.kx kxVar4 = this.f31290c;
                bn0 bn0Var = kxVar4.f26459l0;
                if (bn0Var.f27072a0 && !bn0Var.Y && !TextUtils.isEmpty(bn0Var.f27075d0) && (tk0Var = bn0Var.d) != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < tk0Var.getChildCount()) {
                            if (tk0Var.getChildAt(i13) instanceof zz) {
                                if (bn0Var.f27072a0 && !bn0Var.Y && !TextUtils.isEmpty(bn0Var.f27075d0)) {
                                    bn0Var.W(true);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                kxVar4.T();
                return;
        }
    }
}
