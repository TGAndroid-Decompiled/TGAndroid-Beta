package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class yl0 extends v4.t0 {
    public final int f42038a;
    public final org.telegram.ui.yw f42039b;
    public final org.telegram.ui.hw f42040c;

    public yl0(org.telegram.ui.hw hwVar, org.telegram.ui.yw ywVar, int i7) {
        this.f42038a = i7;
        this.f42040c = hwVar;
        this.f42039b = ywVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f42038a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f42039b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f42039b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f42039b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f42039b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.jw jwVar;
        int i11;
        uj0 uj0Var;
        switch (this.f42038a) {
            case 0:
                org.telegram.ui.hw hwVar = this.f42040c;
                hwVar.f36052r0.W();
                hwVar.S();
                return;
            case 1:
                org.telegram.ui.hw hwVar2 = this.f42040c;
                hwVar2.f36059y0.X();
                hwVar2.S();
                return;
            case 2:
                org.telegram.ui.hw hwVar3 = this.f42040c;
                cm0 cm0Var = hwVar3.f36040e0;
                v4.b0 b0Var = hwVar3.f36041f0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((cm0Var.V.a() != 0 && !cm0Var.Y) || !cm0Var.X) && (N0 == b10 - 1 || ((jwVar = cm0Var.V) != null && jwVar.a() != 0 && (i11 = cm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    cm0Var.P();
                }
                hwVar3.S();
                return;
            default:
                org.telegram.ui.hw hwVar4 = this.f42040c;
                em0 em0Var = hwVar4.m0;
                if (em0Var.f34044b0 && !em0Var.Z && !TextUtils.isEmpty(em0Var.f34047e0) && (uj0Var = em0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < uj0Var.getChildCount()) {
                            if (uj0Var.getChildAt(i12) instanceof pz) {
                                if (em0Var.f34044b0 && !em0Var.Z && !TextUtils.isEmpty(em0Var.f34047e0)) {
                                    em0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                hwVar4.S();
                return;
        }
    }
}
