package org.telegram.ui.Components;

import android.content.Context;
public final class pn0 extends zw0 {
    public final int H;
    public final org.telegram.ui.zx I;

    public pn0(org.telegram.ui.zx zxVar, Context context, u00 u00Var, int i10) {
        super(context, u00Var, 1, null);
        this.H = i10;
        this.I = zxVar;
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
