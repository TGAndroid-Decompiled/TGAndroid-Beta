package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ly0 implements View.OnClickListener {
    public final int f30312a;
    public final dz0 f30313b;

    public ly0(dz0 dz0Var, int i10) {
        this.f30312a = i10;
        this.f30313b = dz0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.r5 r5Var;
        switch (this.f30312a) {
            case 0:
                dz0 dz0Var = this.f30313b;
                org.telegram.ui.ActionBar.r2 r2Var = dz0Var.L;
                if (r2Var != null) {
                    new tg.y0(r2Var, 11, false).show();
                    return;
                } else if (dz0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) dz0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                dz0.J(this.f30313b);
                return;
            case 2:
                this.f30313b.s0();
                return;
            case 3:
                dz0 dz0Var2 = this.f30313b;
                if (dz0Var2.Y != null) {
                    dz0Var2.w0(dz0Var2.U);
                    dz0Var2.s0();
                    dz0Var2.U = null;
                    return;
                }
                dz0Var2.f27580b0.a(dz0Var2.T, null, dz0Var2.S, null, dz0Var2.f27589i0, true, 0, 0);
                dz0Var2.dismiss();
                return;
            case 4:
                this.f30313b.f27593n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                dz0 dz0Var3 = this.f30313b;
                org.telegram.ui.c70 c70Var = dz0Var3.f27583d0;
                org.telegram.ui.h70 h70Var = c70Var.f38208c;
                s4.c0 c0Var = h70Var.h;
                boolean z10 = h70Var.N;
                int L0 = c0Var.L0();
                wl0 wl0Var = (wl0) h70Var.d.K(L0);
                if (wl0Var != null) {
                    i10 = wl0Var.f47773a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = h70Var.f39807n;
                if (c70Var.f38206a) {
                    h70Var.f39808r = null;
                    h70Var.f39809s = true;
                } else {
                    h70Var.f39808r = c70Var.f38207b;
                    h70Var.f39809s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r00(c70Var, 9), 350L);
                }
                h70Var.i0();
                h70Var.g0(h70Var.f39808r, true);
                if (i11 != -1) {
                    if (!h70Var.M) {
                        for (int i12 = 0; i12 < h70Var.d.getChildCount(); i12++) {
                            View childAt = h70Var.d.getChildAt(i12);
                            if (h70Var.d.T(childAt).b() == h70Var.E + i11) {
                                ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                            }
                        }
                    }
                    h70Var.e.m(i11);
                }
                if (h70Var.f39807n != -1) {
                    if (!h70Var.M) {
                        for (int i13 = 0; i13 < h70Var.d.getChildCount(); i13++) {
                            View childAt2 = h70Var.d.getChildAt(i13);
                            if (h70Var.d.T(childAt2).b() == h70Var.E + h70Var.f39807n) {
                                ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                            }
                        }
                    }
                    h70Var.e.m(h70Var.f39807n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    h70Var.h.h1(L0 + 1, i10);
                }
                if (h70Var.M) {
                    h70Var.L.P("", false);
                    r5Var = ((org.telegram.ui.ActionBar.r2) h70Var).simpleActionBar;
                    r5Var.f(true);
                }
                dz0Var3.dismiss();
                return;
            case 6:
                dz0.s(this.f30313b);
                return;
            case 7:
                dz0.n(this.f30313b);
                return;
            case 8:
                dz0 dz0Var4 = this.f30313b;
                dz0Var4.f27593n.o();
                dz0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ny0(dz0Var4, 3), 200L);
                return;
            case 9:
                dz0.D(this.f30313b);
                return;
            case 10:
                dz0 dz0Var5 = this.f30313b;
                if (dz0Var5.R) {
                    dz0Var5.p0();
                    return;
                } else {
                    dz0Var5.r0();
                    return;
                }
            case 11:
                dz0.C(this.f30313b);
                return;
            case 12:
                dz0.r(this.f30313b);
                return;
            case 13:
                dz0.o(this.f30313b);
                return;
            default:
                this.f30313b.dismiss();
                return;
        }
    }
}
