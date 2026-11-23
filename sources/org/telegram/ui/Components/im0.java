package org.telegram.ui.Components;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
public final class im0 extends v4.t0 {
    public final int f36236a;
    public final org.telegram.ui.cx f36237b;
    public final org.telegram.ui.kw f36238c;

    public im0(org.telegram.ui.kw kwVar, org.telegram.ui.cx cxVar, int i7) {
        this.f36236a = i7;
        this.f36238c = kwVar;
        this.f36237b = cxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.f36236a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36237b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36237b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36237b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f36237b.getParentActivity().getCurrentFocus());
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
        switch (this.f36236a) {
            case 0:
                org.telegram.ui.kw kwVar = this.f36238c;
                kwVar.f39917r0.W();
                kwVar.P();
                return;
            case 1:
                org.telegram.ui.kw kwVar2 = this.f36238c;
                kwVar2.f39924y0.X();
                kwVar2.P();
                return;
            case 2:
                org.telegram.ui.kw kwVar3 = this.f36238c;
                mm0 mm0Var = kwVar3.f39905e0;
                v4.b0 b0Var = kwVar3.f39906f0;
                int L0 = b0Var.L0();
                int N0 = b0Var.N0();
                int abs = Math.abs(b0Var.N0() - L0) + 1;
                int b10 = recyclerView.getAdapter().b();
                if (abs > 0 && (((mm0Var.V.a() != 0 && !mm0Var.Y) || !mm0Var.X) && (N0 == b10 - 1 || ((mwVar = mm0Var.V) != null && mwVar.a() != 0 && (i11 = mm0Var.Z) >= 0 && L0 <= i11 && N0 >= i11)))) {
                    mm0Var.P();
                }
                kwVar3.P();
                return;
            default:
                org.telegram.ui.kw kwVar4 = this.f36238c;
                om0 om0Var = kwVar4.m0;
                if (om0Var.f37578b0 && !om0Var.Z && !TextUtils.isEmpty(om0Var.f37581e0) && (ek0Var = om0Var.d) != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < ek0Var.getChildCount()) {
                            if (ek0Var.getChildAt(i12) instanceof yz) {
                                if (om0Var.f37578b0 && !om0Var.Z && !TextUtils.isEmpty(om0Var.f37581e0)) {
                                    om0Var.W(true);
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
