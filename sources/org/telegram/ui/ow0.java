package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ow0 extends org.telegram.ui.Components.lm0 {
    public final PremiumPreviewFragment f42302c;

    public ow0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f42302c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42302c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f42302c;
            if (i10 < premiumPreviewFragment.f35881n || i10 >= premiumPreviewFragment.f35886r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f35893w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f35895x && i10 != premiumPreviewFragment.f35897y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f35888s && i10 != premiumPreviewFragment.G) {
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
    public final void v(s4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ow0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View nw0Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                nw0Var = new nw0(this, context);
                break;
            case 2:
                nw0Var = new org.telegram.ui.Cells.f7(context, 0, 0);
                break;
            case 3:
            default:
                nw0Var = new z10(this, context, 6);
                nw0Var.setTag(-33024);
                break;
            case 4:
                nw0Var = new tg.a(context);
                break;
            case 5:
                nw0Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 6:
                nw0Var = new View(context);
                nw0Var.setTag(-33024);
                break;
            case 7:
                nw0Var = new org.telegram.ui.Cells.q4(context);
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) this.f42302c).resourceProvider;
                nw0Var = new org.telegram.ui.Cells.v8(23, context, u6Var, false, true);
                break;
        }
        return ic.a.n(nw0Var, nw0Var, -1, -2);
    }
}
