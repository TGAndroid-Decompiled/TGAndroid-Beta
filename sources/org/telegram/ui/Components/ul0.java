package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class ul0 extends v4.s0 {
    public final int f38710a;
    public final org.telegram.ui.zw f38711b;
    public final org.telegram.ui.iw f38712c;

    public ul0(org.telegram.ui.iw iwVar, org.telegram.ui.zw zwVar, int i7) {
        this.f38710a = i7;
        this.f38712c = iwVar;
        this.f38711b = zwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f38710a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38711b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38711b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38711b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f38711b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.kw kwVar;
        int i11;
        pj0 pj0Var;
        switch (this.f38710a) {
            case 0:
                org.telegram.ui.iw iwVar = this.f38712c;
                iwVar.f33602q0.W();
                iwVar.T();
                return;
            case 1:
                org.telegram.ui.iw iwVar2 = this.f38712c;
                iwVar2.f33609x0.X();
                iwVar2.T();
                return;
            case 2:
                org.telegram.ui.iw iwVar3 = this.f38712c;
                yl0 yl0Var = iwVar3.f33590d0;
                v4.b0 b0Var = iwVar3.f33591e0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((yl0Var.U.a() != 0 && !yl0Var.X) || !yl0Var.W) && (N0 == b10 - 1 || ((kwVar = yl0Var.U) != null && kwVar.a() != 0 && (i11 = yl0Var.Y) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    yl0Var.P();
                }
                iwVar3.T();
                return;
            default:
                org.telegram.ui.iw iwVar4 = this.f38712c;
                am0 am0Var = iwVar4.f33598l0;
                if (am0Var.f40057a0 && !am0Var.Y && !TextUtils.isEmpty(am0Var.f40060d0) && (pj0Var = am0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < pj0Var.getChildCount()) {
                            if (pj0Var.getChildAt(i12) instanceof lz) {
                                if (am0Var.f40057a0 && !am0Var.Y && !TextUtils.isEmpty(am0Var.f40060d0)) {
                                    am0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                iwVar4.T();
                return;
        }
    }
}
