package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class gw0 extends org.telegram.ui.Components.im0 {
    public final PremiumPreviewFragment f37428c;

    public gw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f37428c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37428c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f37428c;
            if (i10 < premiumPreviewFragment.f33513n || i10 >= premiumPreviewFragment.f33518r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f33525w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f33527x && i10 != premiumPreviewFragment.f33529y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f33520s && i10 != premiumPreviewFragment.G) {
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
    public final void v(s4.b1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gw0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View fw0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                fw0Var = new fw0(this, context);
                break;
            case 2:
                fw0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                fw0Var = new v10(this, context, 6);
                fw0Var.setTag(-33024);
                break;
            case 4:
                fw0Var = new sg.a(context);
                break;
            case 5:
                fw0Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 6:
                fw0Var = new View(context);
                fw0Var.setTag(-33024);
                break;
            case 7:
                fw0Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) this.f37428c).resourceProvider;
                fw0Var = new org.telegram.ui.Cells.q8(23, context, d6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(fw0Var, fw0Var, -1, -2);
    }
}
