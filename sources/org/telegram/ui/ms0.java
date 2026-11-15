package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ms0 extends org.telegram.ui.Components.tj0 {
    public final PremiumPreviewFragment f49312c;

    public ms0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f49312c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49312c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f49312c;
            if (i7 < premiumPreviewFragment.f42992n || i7 >= premiumPreviewFragment.f42997r) {
                if (i7 >= premiumPreviewFragment.f43004w && i7 < premiumPreviewFragment.f43006x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f43008y && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
                    if (i7 == premiumPreviewFragment.G) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f42999s && i7 != premiumPreviewFragment.H) {
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
    public final void t(v4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ms0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View ls0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                ls0Var = new ls0(this, context);
                break;
            case 2:
                ls0Var = new org.telegram.ui.Cells.x6(context, 0, 0);
                break;
            case 3:
            default:
                ls0Var = new rv(7, context, this);
                ls0Var.setTag(-33024);
                break;
            case 4:
                ls0Var = new ai.r2(context);
                break;
            case 5:
                ls0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 6:
                ls0Var = new View(context);
                ls0Var.setTag(-33024);
                break;
            case 7:
                ls0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.e2) this.f49312c).resourceProvider;
                ls0Var = new org.telegram.ui.Cells.l8(23, context, e6Var, false, true);
                break;
        }
        return i5.c.q(ls0Var, ls0Var, -1, -2);
    }
}
