package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class bp0 extends org.telegram.ui.ActionBar.p1 {

    public final cp0 f27191x;

    public bp0(cp0 cp0Var, cp0 cp0Var2) {
        super(cp0Var2);
        this.f27191x = cp0Var;
    }

    @Override
    public final boolean b() {
        sp0 sp0Var = this.f27191x.D0;
        if (sp0Var.isDismissed() || !sp0Var.U) {
            return false;
        }
        return !sp0Var.d.m();
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        cp0 cp0Var = this.f27191x;
        sp0 sp0Var = cp0Var.D0;
        int i10 = sp0.W0;
        for (int i11 = 0; i11 < ((org.telegram.ui.ActionBar.e3) sp0Var).containerView.getChildCount(); i11++) {
            View childAt = ((org.telegram.ui.ActionBar.e3) sp0Var).containerView.getChildAt(i11);
            if (childAt != sp0Var.h && childAt != sp0Var.v && childAt != sp0Var.O[1] && childAt != sp0Var.f32549x && childAt != sp0Var.f32522c && childAt != sp0Var.Y && childAt != sp0Var.f32527f) {
                childAt.setTranslationY(f10);
            }
        }
        so0 so0Var = sp0Var.B;
        sp0Var.f32538p0 = f10;
        int i12 = cp0Var.f27529x0;
        if (i12 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i13 = cp0Var.f27530y0;
            sp0Var.f32534l0 = (int) ((i13 * f11) + (i12 * f12));
            float f13 = ((i12 - i13) * f12) + f10;
            so0Var.setTranslationY(f13);
            if (z10) {
                sp0Var.C.setTranslationY(f13);
            } else {
                sp0Var.C.setTranslationY(f13 + sp0Var.B.getPaddingTop());
            }
        } else {
            int i14 = cp0Var.f27531z0;
            if (i14 != -1) {
                float f14 = 1.0f - f11;
                int i15 = cp0Var.A0;
                sp0Var.f32534l0 = (int) ((i15 * f11) + (i14 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    so0Var.setTranslationY(f10 - ((i14 - i15) * f11));
                } else {
                    so0Var.setTranslationY(((i15 - i14) * f14) + f10);
                }
            }
        }
        sp0Var.B.setTopGlowOffset((int) (sp0Var.f32534l0 + sp0Var.f32538p0));
        sp0Var.f32520b.setTranslationY(sp0Var.f32534l0 + sp0Var.f32538p0);
        sp0Var.M.setTranslationY(sp0Var.f32534l0 + sp0Var.f32538p0);
        sp0Var.f32522c.invalidate();
        sp0Var.setCurrentPanTranslationY(sp0Var.f32538p0);
        sp0Var.Y0();
        cp0Var.invalidate();
    }

    @Override
    public final void f() {
        sp0 sp0Var = this.f27191x.D0;
        vo0 vo0Var = sp0Var.d;
        if (vo0Var == null || !vo0Var.m()) {
            int i10 = sp0Var.J0;
            AndroidUtilities.dp(20.0f);
        }
        sp0Var.f32536n0 = false;
        int i11 = sp0Var.f32534l0;
        sp0Var.m0 = i11;
        sp0Var.B.setTopGlowOffset(i11);
        sp0Var.f32520b.setTranslationY(sp0Var.f32534l0);
        sp0Var.M.setTranslationY(sp0Var.f32534l0);
        sp0Var.B.setTranslationY(0.0f);
        sp0Var.C.setTranslationY(0.0f);
        sp0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        cp0 cp0Var = this.f27191x;
        sp0 sp0Var = cp0Var.D0;
        int i11 = sp0Var.m0;
        int i12 = sp0Var.f32534l0;
        if (i11 != i12) {
            cp0Var.f27529x0 = i11;
            cp0Var.f27530y0 = i12;
            sp0Var.f32536n0 = true;
            sp0Var.f32534l0 = i11;
        } else {
            cp0Var.f27529x0 = -1;
        }
        int i13 = cp0Var.f27527v0;
        int i14 = cp0Var.f27528w0;
        if (i13 != i14) {
            cp0Var.f27531z0 = 0;
            cp0Var.A0 = 0;
            sp0Var.f32536n0 = true;
            if (z10) {
                cp0Var.A0 = i13 - i14;
            } else {
                cp0Var.A0 = 0 - (i13 - i14);
            }
            sp0Var.f32534l0 = z10 ? cp0Var.f27529x0 : cp0Var.f27530y0;
        } else {
            cp0Var.f27531z0 = -1;
        }
        sp0Var.B.setTopGlowOffset((int) (sp0Var.f32538p0 + sp0Var.f32534l0));
        sp0Var.f32520b.setTranslationY(sp0Var.f32538p0 + sp0Var.f32534l0);
        sp0Var.M.setTranslationY(sp0Var.f32538p0 + sp0Var.f32534l0);
        cp0Var.invalidate();
    }
}
