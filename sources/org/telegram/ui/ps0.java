package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ps0 extends org.telegram.ui.Components.oj0 {
    public final PremiumPreviewFragment f48948c;

    public ps0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f48948c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56955f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48948c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f48948c;
            if (i7 < premiumPreviewFragment.f41618n || i7 >= premiumPreviewFragment.f41623r) {
                if (i7 >= premiumPreviewFragment.f41630w && i7 < premiumPreviewFragment.f41632x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f41634y && i7 != premiumPreviewFragment.D && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.H) {
                    if (i7 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f41625s && i7 != premiumPreviewFragment.G) {
                        if (i7 == premiumPreviewFragment.showAdsRow) {
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
    public final void t(v4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ps0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View os0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                os0Var = new os0(this, context);
                break;
            case 2:
                os0Var = new org.telegram.ui.Cells.y6(context, 0, 0);
                break;
            case 3:
            default:
                os0Var = new l00(6, context, this);
                os0Var.setTag(-33024);
                break;
            case 4:
                os0Var = new bi.t(context);
                break;
            case 5:
                os0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                os0Var = new View(context);
                os0Var.setTag(-33024);
                break;
            case 7:
                os0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.f2) this.f48948c).resourceProvider;
                os0Var = new org.telegram.ui.Cells.m8(23, context, f6Var, false, true);
                break;
        }
        return jg.g.r(os0Var, os0Var, -1, -2);
    }
}
