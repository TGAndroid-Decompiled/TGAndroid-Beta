package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class os0 extends org.telegram.ui.Components.oj0 {
    public final PremiumPreviewFragment f48547c;

    public os0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f48547c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56931f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48547c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f48547c;
            if (i7 < premiumPreviewFragment.f41594n || i7 >= premiumPreviewFragment.f41599r) {
                if (i7 >= premiumPreviewFragment.f41606w && i7 < premiumPreviewFragment.f41608x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f41610y && i7 != premiumPreviewFragment.D && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.H) {
                    if (i7 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f41601s && i7 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.os0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View ns0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                ns0Var = new ns0(this, context);
                break;
            case 2:
                ns0Var = new org.telegram.ui.Cells.y6(context, 0, 0);
                break;
            case 3:
            default:
                ns0Var = new l00(6, context, this);
                ns0Var.setTag(-33024);
                break;
            case 4:
                ns0Var = new bi.t(context);
                break;
            case 5:
                ns0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                ns0Var = new View(context);
                ns0Var.setTag(-33024);
                break;
            case 7:
                ns0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.f2) this.f48547c).resourceProvider;
                ns0Var = new org.telegram.ui.Cells.m8(23, context, f6Var, false, true);
                break;
        }
        return jg.g.r(ns0Var, ns0Var, -1, -2);
    }
}
