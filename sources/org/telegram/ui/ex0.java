package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ex0 extends org.telegram.ui.Components.ul0 {
    public final PremiumPreviewFragment f32642c;

    public ex0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f32642c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f32642c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f32642c;
            if (i10 < premiumPreviewFragment.f30283n || i10 >= premiumPreviewFragment.f30288r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f30295w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f30297x && i10 != premiumPreviewFragment.f30299y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f30290s && i10 != premiumPreviewFragment.G) {
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
                dx0Var = new org.telegram.ui.Cells.c7(context, 0, 0);
                break;
            case 3:
            default:
                dx0Var = new t50(this, context, 5);
                dx0Var.setTag(-33024);
                break;
            case 4:
                dx0Var = new qg.a(context);
                break;
            case 5:
                dx0Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 6:
                dx0Var = new View(context);
                dx0Var.setTag(-33024);
                break;
            case 7:
                dx0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) this.f32642c).resourceProvider;
                dx0Var = new org.telegram.ui.Cells.s8(23, context, f6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(dx0Var, dx0Var, -1, -2);
    }
}
