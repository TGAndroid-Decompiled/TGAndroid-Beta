package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class fs0 extends org.telegram.ui.Components.sj0 {
    public final PremiumPreviewFragment f45364c;

    public fs0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f45364c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 1 || i3 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45364c.h;
    }

    @Override
    public final int d(int i3) {
        if (i3 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f45364c;
            if (i3 < premiumPreviewFragment.f41649n || i3 >= premiumPreviewFragment.f41654r) {
                if (i3 >= premiumPreviewFragment.f41661w && i3 < premiumPreviewFragment.f41663x) {
                    return 1;
                }
                if (i3 == 0) {
                    return 4;
                }
                if (i3 != premiumPreviewFragment.f41665y && i3 != premiumPreviewFragment.E && i3 != premiumPreviewFragment.F && i3 != premiumPreviewFragment.I) {
                    if (i3 == premiumPreviewFragment.G) {
                        return 6;
                    }
                    if (i3 != premiumPreviewFragment.f41656s && i3 != premiumPreviewFragment.H) {
                        if (i3 == premiumPreviewFragment.showAdsRow) {
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
    public final void t(u4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fs0.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View es0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        switch (i3) {
            case 1:
                es0Var = new es0(this, context);
                break;
            case 2:
                es0Var = new org.telegram.ui.Cells.x6(context, 0, 0);
                break;
            case 3:
            default:
                es0Var = new org.telegram.ui.Components.voip.r0(8, context, this);
                es0Var.setTag(-33024);
                break;
            case 4:
                es0Var = new ci.q(context);
                break;
            case 5:
                es0Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 6:
                es0Var = new View(context);
                es0Var.setTag(-33024);
                break;
            case 7:
                es0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.d2) this.f45364c).resourceProvider;
                es0Var = new org.telegram.ui.Cells.l8(23, context, e6Var, false, true);
                break;
        }
        return k2.p1.p(es0Var, es0Var, -1, -2);
    }
}
