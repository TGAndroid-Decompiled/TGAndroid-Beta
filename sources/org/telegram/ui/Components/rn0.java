package org.telegram.ui.Components;

import android.content.Context;
public final class rn0 extends ax0 {
    public final int H;
    public final org.telegram.ui.yx I;

    public rn0(org.telegram.ui.yx yxVar, Context context, u00 u00Var, int i10) {
        super(context, u00Var, 1, null);
        this.H = i10;
        this.I = yxVar;
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.H) {
            case 0:
                if (this.I.J0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 1:
                if (this.I.J0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 2:
                if (this.I.J0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            default:
                if (this.I.J0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
        }
    }
}
