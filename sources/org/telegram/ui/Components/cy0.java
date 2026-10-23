package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class cy0 implements View.OnClickListener {
    public final int f25450a;
    public final ty0 f25451b;

    public cy0(ty0 ty0Var, int i10) {
        this.f25450a = i10;
        this.f25451b = ty0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f25450a) {
            case 0:
                ty0 ty0Var = this.f25451b;
                org.telegram.ui.ActionBar.o2 o2Var = ty0Var.L;
                if (o2Var != null) {
                    new sg.y0(o2Var, 11, false).show();
                    return;
                } else if (ty0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ty0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                ty0.J(this.f25451b);
                return;
            case 2:
                this.f25451b.s0();
                return;
            case 3:
                ty0 ty0Var2 = this.f25451b;
                if (ty0Var2.Y != null) {
                    ty0Var2.w0(ty0Var2.U);
                    ty0Var2.s0();
                    ty0Var2.U = null;
                    return;
                }
                ty0Var2.f30929b0.a(ty0Var2.T, null, ty0Var2.S, null, ty0Var2.f30938i0, true, 0, 0);
                ty0Var2.dismiss();
                return;
            case 4:
                this.f25451b.f30942n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                ty0 ty0Var3 = this.f25451b;
                org.telegram.ui.z60 z60Var = ty0Var3.f30932d0;
                org.telegram.ui.e70 e70Var = z60Var.f44062c;
                s4.b0 b0Var = e70Var.h;
                boolean z10 = e70Var.N;
                int L0 = b0Var.L0();
                wl0 wl0Var = (wl0) e70Var.d.K(L0);
                if (wl0Var != null) {
                    i10 = wl0Var.f46343a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = e70Var.f36838n;
                if (z60Var.f44060a) {
                    e70Var.f36839r = null;
                    e70Var.f36840s = true;
                } else {
                    e70Var.f36839r = z60Var.f44061b;
                    e70Var.f36840s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.fz(z60Var, 10), 350L);
                }
                e70Var.h0();
                e70Var.f0(e70Var.f36839r, true);
                if (i11 != -1) {
                    if (!e70Var.M) {
                        for (int i12 = 0; i12 < e70Var.d.getChildCount(); i12++) {
                            View childAt = e70Var.d.getChildAt(i12);
                            if (e70Var.d.T(childAt).b() == e70Var.E + i11) {
                                ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                            }
                        }
                    }
                    e70Var.e.m(i11);
                }
                if (e70Var.f36838n != -1) {
                    if (!e70Var.M) {
                        for (int i13 = 0; i13 < e70Var.d.getChildCount(); i13++) {
                            View childAt2 = e70Var.d.getChildAt(i13);
                            if (e70Var.d.T(childAt2).b() == e70Var.E + e70Var.f36838n) {
                                ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                            }
                        }
                    }
                    e70Var.e.m(e70Var.f36838n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    e70Var.h.h1(L0 + 1, i10);
                }
                if (e70Var.M) {
                    e70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.o2) e70Var).actionBar;
                    kVar.g(true);
                }
                ty0Var3.dismiss();
                return;
            case 6:
                ty0.t(this.f25451b);
                return;
            case 7:
                ty0.n(this.f25451b);
                return;
            case 8:
                ty0 ty0Var4 = this.f25451b;
                ty0Var4.f30942n.n();
                ty0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ey0(ty0Var4, 3), 200L);
                return;
            case 9:
                ty0.D(this.f25451b);
                return;
            case 10:
                ty0 ty0Var5 = this.f25451b;
                if (ty0Var5.R) {
                    ty0Var5.p0();
                    return;
                } else {
                    ty0Var5.r0();
                    return;
                }
            case 11:
                ty0.C(this.f25451b);
                return;
            case 12:
                ty0.s(this.f25451b);
                return;
            case 13:
                ty0.p(this.f25451b);
                return;
            default:
                this.f25451b.dismiss();
                return;
        }
    }
}
