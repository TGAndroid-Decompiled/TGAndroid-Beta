package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class vl0 extends v4.s0 {
    public final int f39125a;
    public final org.telegram.ui.yw f39126b;
    public final org.telegram.ui.hw f39127c;

    public vl0(org.telegram.ui.hw hwVar, org.telegram.ui.yw ywVar, int i7) {
        this.f39125a = i7;
        this.f39127c = hwVar;
        this.f39126b = ywVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f39125a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f39126b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f39126b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f39126b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f39126b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.jw jwVar;
        int i11;
        qj0 qj0Var;
        switch (this.f39125a) {
            case 0:
                org.telegram.ui.hw hwVar = this.f39127c;
                hwVar.f34007q0.W();
                hwVar.T();
                return;
            case 1:
                org.telegram.ui.hw hwVar2 = this.f39127c;
                hwVar2.f34014x0.X();
                hwVar2.T();
                return;
            case 2:
                org.telegram.ui.hw hwVar3 = this.f39127c;
                zl0 zl0Var = hwVar3.f33995d0;
                v4.b0 b0Var = hwVar3.f33996e0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((zl0Var.U.a() != 0 && !zl0Var.X) || !zl0Var.W) && (N0 == b10 - 1 || ((jwVar = zl0Var.U) != null && jwVar.a() != 0 && (i11 = zl0Var.Y) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    zl0Var.P();
                }
                hwVar3.T();
                return;
            default:
                org.telegram.ui.hw hwVar4 = this.f39127c;
                bm0 bm0Var = hwVar4.f34003l0;
                if (bm0Var.f40469a0 && !bm0Var.Y && !TextUtils.isEmpty(bm0Var.f40472d0) && (qj0Var = bm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < qj0Var.getChildCount()) {
                            if (qj0Var.getChildAt(i12) instanceof mz) {
                                if (bm0Var.f40469a0 && !bm0Var.Y && !TextUtils.isEmpty(bm0Var.f40472d0)) {
                                    bm0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                hwVar4.T();
                return;
        }
    }
}
