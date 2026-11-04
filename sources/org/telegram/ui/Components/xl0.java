package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class xl0 extends u4.t0 {
    public final int f40412a;
    public final org.telegram.ui.uw f40413b;
    public final org.telegram.ui.cw f40414c;

    public xl0(org.telegram.ui.cw cwVar, org.telegram.ui.uw uwVar, int i3) {
        this.f40412a = i3;
        this.f40414c = cwVar;
        this.f40413b = uwVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        switch (this.f40412a) {
            case 0:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.f40413b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.f40413b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.f40413b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(this.f40413b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.ui.ew ewVar;
        int i11;
        tj0 tj0Var;
        switch (this.f40412a) {
            case 0:
                org.telegram.ui.cw cwVar = this.f40414c;
                cwVar.f34763r0.W();
                cwVar.T();
                return;
            case 1:
                org.telegram.ui.cw cwVar2 = this.f40414c;
                cwVar2.f34770y0.X();
                cwVar2.T();
                return;
            case 2:
                org.telegram.ui.cw cwVar3 = this.f40414c;
                bm0 bm0Var = cwVar3.f34751e0;
                u4.b0 b0Var = cwVar3.f34752f0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((bm0Var.V.a() != 0 && !bm0Var.Y) || !bm0Var.X) && (N0 == b10 - 1 || ((ewVar = bm0Var.V) != null && ewVar.a() != 0 && (i11 = bm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    bm0Var.P();
                }
                cwVar3.T();
                return;
            default:
                org.telegram.ui.cw cwVar4 = this.f40414c;
                dm0 dm0Var = cwVar4.m0;
                if (dm0Var.f40465b0 && !dm0Var.Z && !TextUtils.isEmpty(dm0Var.f40468e0) && (tj0Var = dm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < tj0Var.getChildCount()) {
                            if (tj0Var.getChildAt(i12) instanceof iz) {
                                if (dm0Var.f40465b0 && !dm0Var.Z && !TextUtils.isEmpty(dm0Var.f40468e0)) {
                                    dm0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                cwVar4.T();
                return;
        }
    }
}
