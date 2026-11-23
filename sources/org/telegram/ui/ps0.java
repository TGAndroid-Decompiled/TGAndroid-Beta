package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ps0 extends org.telegram.ui.Components.dk0 {
    public final PremiumPreviewFragment f51138c;

    public ps0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f51138c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51138c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f51138c;
            if (i7 < premiumPreviewFragment.f43563n || i7 >= premiumPreviewFragment.f43568r) {
                if (i7 >= premiumPreviewFragment.f43575w && i7 < premiumPreviewFragment.f43577x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f43579y && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
                    if (i7 == premiumPreviewFragment.G) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f43570s && i7 != premiumPreviewFragment.H) {
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
    public final void t(v4.f1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ps0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View os0Var;
        org.telegram.ui.ActionBar.i6 i6Var;
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
                os0Var = new tv(7, context, this);
                os0Var.setTag(-33024);
                break;
            case 4:
                os0Var = new ai.l2(context);
                break;
            case 5:
                os0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                os0Var = new View(context);
                os0Var.setTag(-33024);
                break;
            case 7:
                os0Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.g2) this.f51138c).resourceProvider;
                os0Var = new org.telegram.ui.Cells.m8(23, context, i6Var, false, true);
                break;
        }
        return i5.c.q(os0Var, os0Var, -1, -2);
    }
}
