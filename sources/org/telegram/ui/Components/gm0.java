package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class gm0 extends v4.u0 {
    public final int f35527a;
    public final org.telegram.ui.cx f35528b;
    public final org.telegram.ui.kw f35529c;

    public gm0(org.telegram.ui.kw kwVar, org.telegram.ui.cx cxVar, int i7) {
        this.f35527a = i7;
        this.f35529c = kwVar;
        this.f35528b = cxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f35527a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f35528b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f35528b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f35528b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f35528b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.mw mwVar;
        int i11;
        ck0 ck0Var;
        switch (this.f35527a) {
            case 0:
                org.telegram.ui.kw kwVar = this.f35529c;
                kwVar.f39197r0.W();
                kwVar.P();
                return;
            case 1:
                org.telegram.ui.kw kwVar2 = this.f35529c;
                kwVar2.f39204y0.X();
                kwVar2.P();
                return;
            case 2:
                org.telegram.ui.kw kwVar3 = this.f35529c;
                km0 km0Var = kwVar3.f39185e0;
                v4.c0 c0Var = kwVar3.f39186f0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((km0Var.V.a() != 0 && !km0Var.Y) || !km0Var.X) && (N0 == b10 - 1 || ((mwVar = km0Var.V) != null && mwVar.a() != 0 && (i11 = km0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    km0Var.P();
                }
                kwVar3.P();
                return;
            default:
                org.telegram.ui.kw kwVar4 = this.f35529c;
                mm0 mm0Var = kwVar4.m0;
                if (mm0Var.f36868b0 && !mm0Var.Z && !TextUtils.isEmpty(mm0Var.f36871e0) && (ck0Var = mm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < ck0Var.getChildCount()) {
                            if (ck0Var.getChildAt(i12) instanceof wz) {
                                if (mm0Var.f36868b0 && !mm0Var.Z && !TextUtils.isEmpty(mm0Var.f36871e0)) {
                                    mm0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                kwVar4.P();
                return;
        }
    }
}
