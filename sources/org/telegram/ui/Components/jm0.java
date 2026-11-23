package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class jm0 extends v4.u0 {
    public final int f36562a;
    public final org.telegram.ui.cx f36563b;
    public final org.telegram.ui.kw f36564c;

    public jm0(org.telegram.ui.kw kwVar, org.telegram.ui.cx cxVar, int i7) {
        this.f36562a = i7;
        this.f36564c = kwVar;
        this.f36563b = cxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f36562a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36563b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36563b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36563b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36563b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.ui.mw mwVar;
        int i11;
        ek0 ek0Var;
        switch (this.f36562a) {
            case 0:
                org.telegram.ui.kw kwVar = this.f36564c;
                kwVar.f40515r0.W();
                kwVar.P();
                return;
            case 1:
                org.telegram.ui.kw kwVar2 = this.f36564c;
                kwVar2.f40522y0.X();
                kwVar2.P();
                return;
            case 2:
                org.telegram.ui.kw kwVar3 = this.f36564c;
                nm0 nm0Var = kwVar3.f40503e0;
                v4.c0 c0Var = kwVar3.f40504f0;
                int L0 = c0Var.L0();
                int N0 = c0Var.N0();
                int abs = Math.abs(c0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((nm0Var.V.a() != 0 && !nm0Var.Y) || !nm0Var.X) && (N0 == b10 - 1 || ((mwVar = nm0Var.V) != null && mwVar.a() != 0 && (i11 = nm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    nm0Var.P();
                }
                kwVar3.P();
                return;
            default:
                org.telegram.ui.kw kwVar4 = this.f36564c;
                pm0 pm0Var = kwVar4.m0;
                if (pm0Var.f37623b0 && !pm0Var.Z && !TextUtils.isEmpty(pm0Var.f37626e0) && (ek0Var = pm0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < ek0Var.getChildCount()) {
                            if (ek0Var.getChildAt(i12) instanceof yz) {
                                if (pm0Var.f37623b0 && !pm0Var.Z && !TextUtils.isEmpty(pm0Var.f37626e0)) {
                                    pm0Var.W(true);
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
