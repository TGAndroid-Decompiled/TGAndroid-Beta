package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class by0 implements View.OnClickListener {
    public final int f25112a;
    public final sy0 f25113b;

    public by0(sy0 sy0Var, int i10) {
        this.f25112a = i10;
        this.f25113b = sy0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f25112a) {
            case 0:
                sy0 sy0Var = this.f25113b;
                org.telegram.ui.ActionBar.o2 o2Var = sy0Var.L;
                if (o2Var != null) {
                    new sg.y0(o2Var, 11, false).show();
                    return;
                } else if (sy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) sy0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                sy0.J(this.f25113b);
                return;
            case 2:
                this.f25113b.s0();
                return;
            case 3:
                sy0 sy0Var2 = this.f25113b;
                if (sy0Var2.Y != null) {
                    sy0Var2.w0(sy0Var2.U);
                    sy0Var2.s0();
                    sy0Var2.U = null;
                    return;
                }
                sy0Var2.f30636b0.a(sy0Var2.T, null, sy0Var2.S, null, sy0Var2.f30645i0, true, 0, 0);
                sy0Var2.dismiss();
                return;
            case 4:
                this.f25113b.f30649n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                sy0 sy0Var3 = this.f25113b;
                org.telegram.ui.z60 z60Var = sy0Var3.f30639d0;
                org.telegram.ui.e70 e70Var = z60Var.f44028c;
                s4.b0 b0Var = e70Var.h;
                boolean z10 = e70Var.N;
                int L0 = b0Var.L0();
                vl0 vl0Var = (vl0) e70Var.d.K(L0);
                if (vl0Var != null) {
                    i10 = vl0Var.f46342a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = e70Var.f36821n;
                if (z60Var.f44026a) {
                    e70Var.f36822r = null;
                    e70Var.f36823s = true;
                } else {
                    e70Var.f36822r = z60Var.f44027b;
                    e70Var.f36823s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.fz(z60Var, 10), 350L);
                }
                e70Var.h0();
                e70Var.f0(e70Var.f36822r, true);
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
                if (e70Var.f36821n != -1) {
                    if (!e70Var.M) {
                        for (int i13 = 0; i13 < e70Var.d.getChildCount(); i13++) {
                            View childAt2 = e70Var.d.getChildAt(i13);
                            if (e70Var.d.T(childAt2).b() == e70Var.E + e70Var.f36821n) {
                                ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                            }
                        }
                    }
                    e70Var.e.m(e70Var.f36821n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    e70Var.h.h1(L0 + 1, i10);
                }
                if (e70Var.M) {
                    e70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.o2) e70Var).actionBar;
                    kVar.g(true);
                }
                sy0Var3.dismiss();
                return;
            case 6:
                sy0.t(this.f25113b);
                return;
            case 7:
                sy0.n(this.f25113b);
                return;
            case 8:
                sy0 sy0Var4 = this.f25113b;
                sy0Var4.f30649n.n();
                sy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new dy0(sy0Var4, 3), 200L);
                return;
            case 9:
                sy0.D(this.f25113b);
                return;
            case 10:
                sy0 sy0Var5 = this.f25113b;
                if (sy0Var5.R) {
                    sy0Var5.p0();
                    return;
                } else {
                    sy0Var5.r0();
                    return;
                }
            case 11:
                sy0.C(this.f25113b);
                return;
            case 12:
                sy0.s(this.f25113b);
                return;
            case 13:
                sy0.p(this.f25113b);
                return;
            default:
                this.f25113b.dismiss();
                return;
        }
    }
}
