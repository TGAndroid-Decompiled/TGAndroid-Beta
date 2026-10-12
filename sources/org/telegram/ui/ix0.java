package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ix0 extends org.telegram.ui.Components.lm0 {
    public final PremiumPreviewFragment f37213c;

    public ix0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f37213c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37213c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f37213c;
            if (i10 < premiumPreviewFragment.f32461n || i10 >= premiumPreviewFragment.f32466r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f32473w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f32475x && i10 != premiumPreviewFragment.f32477y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f32468s && i10 != premiumPreviewFragment.G) {
                        if (i10 == premiumPreviewFragment.showAdsRow) {
                            return 8;
                        }
                        return 0;
                    }
                    return 7;
                }
                return 5;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ix0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View hx0Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                hx0Var = new hx0(this, context);
                break;
            case 2:
                hx0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                hx0Var = new x50(this, context, 5);
                hx0Var.setTag(-33024);
                break;
            case 4:
                hx0Var = new sg.a(context);
                break;
            case 5:
                hx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                hx0Var = new View(context);
                hx0Var.setTag(-33024);
                break;
            case 7:
                hx0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.m2) this.f37213c).resourceProvider;
                hx0Var = new org.telegram.ui.Cells.r8(23, context, c6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(hx0Var, hx0Var, -1, -2);
    }
}
