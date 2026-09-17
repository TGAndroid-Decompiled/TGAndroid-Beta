package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ex0 extends org.telegram.ui.Components.ll0 {
    public final PremiumPreviewFragment f33489c;

    public ex0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f33489c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33489c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f33489c;
            if (i10 < premiumPreviewFragment.f31184n || i10 >= premiumPreviewFragment.f31189r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f31196w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f31198x && i10 != premiumPreviewFragment.f31200y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f31191s && i10 != premiumPreviewFragment.G) {
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
    public final void v(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ex0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View dx0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                dx0Var = new dx0(this, context);
                break;
            case 2:
                dx0Var = new org.telegram.ui.Cells.a7(context, 0, 0);
                break;
            case 3:
            default:
                dx0Var = new u50(this, context, 5);
                dx0Var.setTag(-33024);
                break;
            case 4:
                dx0Var = new rg.a(context);
                break;
            case 5:
                dx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                dx0Var = new View(context);
                dx0Var.setTag(-33024);
                break;
            case 7:
                dx0Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.o2) this.f33489c).resourceProvider;
                dx0Var = new org.telegram.ui.Cells.r8(23, context, f6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(dx0Var, dx0Var, -1, -2);
    }
}
