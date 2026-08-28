package org.telegram.ui.Components;

import android.content.Context;
public final class um0 extends gw0 {
    public final int G;
    public final org.telegram.ui.mx H;

    public um0(org.telegram.ui.mx mxVar, Context context, e00 e00Var, int i9) {
        super(context, e00Var, 1, null);
        this.G = i9;
        this.H = mxVar;
    }

    @Override
    public final void setVisibility(int i9) {
        switch (this.G) {
            case 0:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i9);
                    return;
                }
            case 1:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i9);
                    return;
                }
            case 2:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i9);
                    return;
                }
            default:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i9);
                    return;
                }
        }
    }
}
