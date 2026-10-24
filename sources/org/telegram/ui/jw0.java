package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class jw0 extends org.telegram.ui.Components.km0 {
    public final PremiumPreviewFragment f38697c;

    public jw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f38697c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38697c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f38697c;
            if (i10 < premiumPreviewFragment.f33817n || i10 >= premiumPreviewFragment.f33822r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f33829w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f33831x && i10 != premiumPreviewFragment.f33833y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f33824s && i10 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jw0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View iw0Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                iw0Var = new iw0(this, context);
                break;
            case 2:
                iw0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                iw0Var = new e50(this, context, 5);
                iw0Var.setTag(-33024);
                break;
            case 4:
                iw0Var = new sg.a(context);
                break;
            case 5:
                iw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                iw0Var = new View(context);
                iw0Var.setTag(-33024);
                break;
            case 7:
                iw0Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.o2) this.f38697c).resourceProvider;
                iw0Var = new org.telegram.ui.Cells.r8(23, context, g6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(iw0Var, iw0Var, -1, -2);
    }
}
