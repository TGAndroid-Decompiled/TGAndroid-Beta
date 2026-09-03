package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ow0 extends org.telegram.ui.Components.ql0 {
    public final PremiumPreviewFragment f36894c;

    public ow0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f36894c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36894c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f36894c;
            if (i10 < premiumPreviewFragment.f31941n || i10 >= premiumPreviewFragment.f31946r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f31953w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f31955x && i10 != premiumPreviewFragment.f31956y && i10 != premiumPreviewFragment.B && i10 != premiumPreviewFragment.E) {
                    if (i10 == premiumPreviewFragment.C) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f31948s && i10 != premiumPreviewFragment.D) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ow0.v(f2.l1, int):void");
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
                c2Var = new org.telegram.ui.Cells.y6(context, 0, 0);
                break;
            case 3:
            default:
                c2Var = new nw0(this, context, 0);
                c2Var.setTag(-33024);
                break;
            case 4:
                c2Var = new eg.a(context);
                break;
            case 5:
                c2Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                c2Var = new View(context);
                c2Var.setTag(-33024);
                break;
            case 7:
                c2Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                f6Var = ((org.telegram.ui.ActionBar.p2) this.f36894c).resourceProvider;
                c2Var = new org.telegram.ui.Cells.n8(23, context, f6Var, false, true);
                break;
        }
        return ai.n(c2Var, c2Var, -1, -2);
    }
}
