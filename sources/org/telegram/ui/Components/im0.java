package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class im0 extends v4.u0 {
    public final int f36054a;
    public final org.telegram.ui.bx f36055b;
    public final org.telegram.ui.jw f36056c;

    public im0(org.telegram.ui.jw jwVar, org.telegram.ui.bx bxVar, int i7) {
        this.f36054a = i7;
        this.f36056c = jwVar;
        this.f36055b = bxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f36054a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36055b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36055b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36055b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36055b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.lw lwVar;
        int i11;
        ek0 ek0Var;
        switch (this.f36054a) {
            case 0:
                org.telegram.ui.jw jwVar = this.f36056c;
                jwVar.f40097r0.W();
                jwVar.R();
                return;
            case 1:
                org.telegram.ui.jw jwVar2 = this.f36056c;
                jwVar2.f40104y0.X();
                jwVar2.R();
                return;
            case 2:
                org.telegram.ui.jw jwVar3 = this.f36056c;
                mm0 mm0Var = jwVar3.f40085e0;
                v4.c0 c0Var = jwVar3.f40086f0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((mm0Var.V.a() != 0 && !mm0Var.Y) || !mm0Var.X) && (N0 == b10 - 1 || ((lwVar = mm0Var.V) != null && lwVar.a() != 0 && (i11 = mm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    mm0Var.P();
                }
                jwVar3.R();
                return;
            default:
                org.telegram.ui.jw jwVar4 = this.f36056c;
                om0 om0Var = jwVar4.m0;
                if (om0Var.f36504b0 && !om0Var.Z && !TextUtils.isEmpty(om0Var.f36507e0) && (ek0Var = om0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < ek0Var.getChildCount()) {
                            if (ek0Var.getChildAt(i12) instanceof vz) {
                                if (om0Var.f36504b0 && !om0Var.Z && !TextUtils.isEmpty(om0Var.f36507e0)) {
                                    om0Var.W(true);
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                jwVar4.R();
                return;
        }
    }
}
