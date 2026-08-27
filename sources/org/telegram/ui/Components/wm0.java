package org.telegram.ui.Components;

import android.content.Context;

public final class wm0 extends iw0 {
    public final int G;
    public final org.telegram.ui.px H;

    public wm0(org.telegram.ui.px pxVar, Context context, h00 h00Var, int i10) {
        super(context, h00Var, 1, null);
        this.G = i10;
        this.H = pxVar;
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.G) {
            case 0:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                } else {
                    super.setVisibility(8);
                }
                break;
            case 1:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                } else {
                    super.setVisibility(8);
                }
                break;
            case 2:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                } else {
                    super.setVisibility(8);
                }
                break;
            default:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                } else {
                    super.setVisibility(8);
                }
                break;
        }
    }
}
