package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class cx0 extends org.telegram.ui.Components.kl0 {
    public final PremiumPreviewFragment f35567c;

    public cx0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f35567c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f35567c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f35567c;
            if (i10 < premiumPreviewFragment.f33787n || i10 >= premiumPreviewFragment.f33792r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f33799w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f33801x && i10 != premiumPreviewFragment.f33803y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f33794s && i10 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View bx0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                bx0Var = new bx0(this, context);
                break;
            case 2:
                bx0Var = new org.telegram.ui.Cells.a7(context, 0, 0);
                break;
            case 3:
            default:
                bx0Var = new t50(this, context, 5);
                bx0Var.setTag(-33024);
                break;
            case 4:
                bx0Var = new sg.a(context);
                break;
            case 5:
                bx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                bx0Var = new View(context);
                bx0Var.setTag(-33024);
                break;
            case 7:
                bx0Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.n2) this.f35567c).resourceProvider;
                bx0Var = new org.telegram.ui.Cells.r8(23, context, f6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.l(bx0Var, bx0Var, -1, -2);
    }
}
