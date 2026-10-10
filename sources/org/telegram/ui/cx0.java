package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class cx0 extends org.telegram.ui.Components.qm0 {
    public final PremiumPreviewFragment f36792c;

    public cx0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f36792c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36792c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f36792c;
            if (i10 < premiumPreviewFragment.f34180n || i10 >= premiumPreviewFragment.f34185r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f34192w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f34194x && i10 != premiumPreviewFragment.f34196y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f34187s && i10 != premiumPreviewFragment.G) {
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
    public final void v(s4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cx0.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View bx0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                bx0Var = new bx0(this, context);
                break;
            case 2:
                bx0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                bx0Var = new q50(this, context, 5);
                bx0Var.setTag(-33024);
                break;
            case 4:
                bx0Var = new rg.a(context);
                break;
            case 5:
                bx0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                bx0Var = new View(context);
                bx0Var.setTag(-33024);
                break;
            case 7:
                bx0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                e6Var = ((org.telegram.ui.ActionBar.n2) this.f36792c).resourceProvider;
                bx0Var = new org.telegram.ui.Cells.r8(23, context, e6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(bx0Var, bx0Var, -1, -2);
    }
}
