package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class ky0 implements View.OnClickListener {
    public final int f30000a;
    public final cz0 f30001b;

    public ky0(cz0 cz0Var, int i10) {
        this.f30000a = i10;
        this.f30001b = cz0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.r5 r5Var;
        switch (this.f30000a) {
            case 0:
                cz0 cz0Var = this.f30001b;
                org.telegram.ui.ActionBar.r2 r2Var = cz0Var.L;
                if (r2Var != null) {
                    new tg.y0(r2Var, 11, false).show();
                    return;
                } else if (cz0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) cz0Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                cz0.J(this.f30001b);
                return;
            case 2:
                this.f30001b.s0();
                return;
            case 3:
                cz0 cz0Var2 = this.f30001b;
                if (cz0Var2.Y != null) {
                    cz0Var2.w0(cz0Var2.U);
                    cz0Var2.s0();
                    cz0Var2.U = null;
                    return;
                }
                cz0Var2.f27288b0.a(cz0Var2.T, null, cz0Var2.S, null, cz0Var2.f27297i0, true, 0, 0);
                cz0Var2.dismiss();
                return;
            case 4:
                this.f30001b.f27301n.getPopupLayout().getSwipeBack().b(true);
                return;
            case 5:
                cz0 cz0Var3 = this.f30001b;
                org.telegram.ui.a70 a70Var = cz0Var3.f27291d0;
                org.telegram.ui.f70 f70Var = a70Var.f37654c;
                s4.c0 c0Var = f70Var.h;
                boolean z10 = f70Var.N;
                int L0 = c0Var.L0();
                vl0 vl0Var = (vl0) f70Var.d.K(L0);
                if (vl0Var != null) {
                    i10 = vl0Var.f47735a.getTop();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                int i11 = f70Var.f39289n;
                if (a70Var.f37652a) {
                    f70Var.f39290r = null;
                    f70Var.f39291s = true;
                } else {
                    f70Var.f39290r = a70Var.f37653b;
                    f70Var.f39291s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.p00(a70Var, 9), 350L);
                }
                f70Var.i0();
                f70Var.g0(f70Var.f39290r, true);
                if (i11 != -1) {
                    if (!f70Var.M) {
                        for (int i12 = 0; i12 < f70Var.d.getChildCount(); i12++) {
                            View childAt = f70Var.d.getChildAt(i12);
                            if (f70Var.d.T(childAt).b() == f70Var.E + i11) {
                                ((org.telegram.ui.Cells.p8) childAt).b(false, true);
                            }
                        }
                    }
                    f70Var.e.m(i11);
                }
                if (f70Var.f39289n != -1) {
                    if (!f70Var.M) {
                        for (int i13 = 0; i13 < f70Var.d.getChildCount(); i13++) {
                            View childAt2 = f70Var.d.getChildAt(i13);
                            if (f70Var.d.T(childAt2).b() == f70Var.E + f70Var.f39289n) {
                                ((org.telegram.ui.Cells.p8) childAt2).b(true, true);
                            }
                        }
                    }
                    f70Var.e.m(f70Var.f39289n);
                }
                if (i10 != Integer.MAX_VALUE && !z10) {
                    f70Var.h.h1(L0 + 1, i10);
                }
                if (f70Var.M) {
                    f70Var.L.P("", false);
                    r5Var = ((org.telegram.ui.ActionBar.r2) f70Var).simpleActionBar;
                    r5Var.f(true);
                }
                cz0Var3.dismiss();
                return;
            case 6:
                cz0.s(this.f30001b);
                return;
            case 7:
                cz0.n(this.f30001b);
                return;
            case 8:
                cz0 cz0Var4 = this.f30001b;
                cz0Var4.f27301n.o();
                cz0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new my0(cz0Var4, 3), 200L);
                return;
            case 9:
                cz0.D(this.f30001b);
                return;
            case 10:
                cz0 cz0Var5 = this.f30001b;
                if (cz0Var5.R) {
                    cz0Var5.p0();
                    return;
                } else {
                    cz0Var5.r0();
                    return;
                }
            case 11:
                cz0.C(this.f30001b);
                return;
            case 12:
                cz0.r(this.f30001b);
                return;
            case 13:
                cz0.o(this.f30001b);
                return;
            default:
                this.f30001b.dismiss();
                return;
        }
    }
}
