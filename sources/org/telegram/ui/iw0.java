package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class iw0 extends org.telegram.ui.Components.hm0 {
    public final PremiumPreviewFragment f38007c;

    public iw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f38007c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38007c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f38007c;
            if (i10 < premiumPreviewFragment.f33508n || i10 >= premiumPreviewFragment.f33513r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f33520w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f33522x && i10 != premiumPreviewFragment.f33524y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f33515s && i10 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iw0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View hw0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                hw0Var = new hw0(this, context);
                break;
            case 2:
                hw0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                hw0Var = new x10(this, context, 6);
                hw0Var.setTag(-33024);
                break;
            case 4:
                hw0Var = new sg.a(context);
                break;
            case 5:
                hw0Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 6:
                hw0Var = new View(context);
                hw0Var.setTag(-33024);
                break;
            case 7:
                hw0Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) this.f38007c).resourceProvider;
                hw0Var = new org.telegram.ui.Cells.q8(23, context, d6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(hw0Var, hw0Var, -1, -2);
    }
}
