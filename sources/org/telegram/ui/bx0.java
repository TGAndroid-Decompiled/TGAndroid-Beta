package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class bx0 extends org.telegram.ui.Components.rm0 {
    public final PremiumPreviewFragment f36467c;

    public bx0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f36467c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36467c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f36467c;
            if (i10 < premiumPreviewFragment.f34170n || i10 >= premiumPreviewFragment.f34175r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f34182w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f34184x && i10 != premiumPreviewFragment.f34186y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f34177s && i10 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx0.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View ax0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                ax0Var = new ax0(this, context);
                break;
            case 2:
                ax0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                ax0Var = new q50(this, context, 5);
                ax0Var.setTag(-33024);
                break;
            case 4:
                ax0Var = new rg.a(context);
                break;
            case 5:
                ax0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                ax0Var = new View(context);
                ax0Var.setTag(-33024);
                break;
            case 7:
                ax0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.m2) this.f36467c).resourceProvider;
                ax0Var = new org.telegram.ui.Cells.r8(23, context, d6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(ax0Var, ax0Var, -1, -2);
    }
}
