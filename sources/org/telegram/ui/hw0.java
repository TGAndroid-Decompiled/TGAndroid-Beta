package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class hw0 extends org.telegram.ui.Components.rl0 {
    public final PremiumPreviewFragment f34962c;

    public hw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f34962c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f34962c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f34962c;
            if (i10 < premiumPreviewFragment.f31967n || i10 >= premiumPreviewFragment.f31972r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f31979w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f31981x && i10 != premiumPreviewFragment.f31982y && i10 != premiumPreviewFragment.B && i10 != premiumPreviewFragment.E) {
                    if (i10 == premiumPreviewFragment.C) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f31974s && i10 != premiumPreviewFragment.D) {
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
    public final void v(f2.l1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hw0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View c2Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                c2Var = new eg.c2(this, context);
                break;
            case 2:
                c2Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                c2Var = new gw0(this, context, 0);
                c2Var.setTag(-33024);
                break;
            case 4:
                c2Var = new eg.a(context);
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 6:
                c2Var = new View(context);
                c2Var.setTag(-33024);
                break;
            case 7:
                c2Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) this.f34962c).resourceProvider;
                c2Var = new org.telegram.ui.Cells.o8(23, context, f6Var, false, true);
                break;
        }
        return yh.o(c2Var, c2Var, -1, -2);
    }
}
