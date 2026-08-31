package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class jw0 extends org.telegram.ui.Components.sl0 {
    public final PremiumPreviewFragment f38234c;

    public jw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f38234c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38234c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f38234c;
            if (i10 < premiumPreviewFragment.f34497n || i10 >= premiumPreviewFragment.f34502r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f34509w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f34511x && i10 != premiumPreviewFragment.f34512y && i10 != premiumPreviewFragment.B && i10 != premiumPreviewFragment.E) {
                    if (i10 == premiumPreviewFragment.C) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f34504s && i10 != premiumPreviewFragment.D) {
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
    public final void v(f2.m1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw0.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View b2Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                b2Var = new fg.b2(this, context);
                break;
            case 2:
                b2Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                b2Var = new iw0(this, context, 0);
                b2Var.setTag(-33024);
                break;
            case 4:
                b2Var = new fg.a(context);
                break;
            case 5:
                b2Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 6:
                b2Var = new View(context);
                b2Var.setTag(-33024);
                break;
            case 7:
                b2Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.p2) this.f38234c).resourceProvider;
                b2Var = new org.telegram.ui.Cells.o8(23, context, g6Var, false, true);
                break;
        }
        return yh.o(b2Var, b2Var, -1, -2);
    }
}
