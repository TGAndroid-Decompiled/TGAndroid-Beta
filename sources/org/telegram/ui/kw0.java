package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class kw0 extends org.telegram.ui.Components.lm0 {
    public final PremiumPreviewFragment f39082c;

    public kw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f39082c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39082c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f39082c;
            if (i10 < premiumPreviewFragment.f33815n || i10 >= premiumPreviewFragment.f33820r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f33827w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f33829x && i10 != premiumPreviewFragment.f33831y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f33822s && i10 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kw0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View jw0Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                jw0Var = new jw0(this, context);
                break;
            case 2:
                jw0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                jw0Var = new e50(this, context, 5);
                jw0Var.setTag(-33024);
                break;
            case 4:
                jw0Var = new sg.a(context);
                break;
            case 5:
                jw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                jw0Var = new View(context);
                jw0Var.setTag(-33024);
                break;
            case 7:
                jw0Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.o2) this.f39082c).resourceProvider;
                jw0Var = new org.telegram.ui.Cells.r8(23, context, g6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(jw0Var, jw0Var, -1, -2);
    }
}
