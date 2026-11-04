package org.telegram.ui.Components;

import android.content.Context;
public final class vl0 extends zu0 {
    public final int L;
    public final org.telegram.ui.cw M;

    public vl0(org.telegram.ui.cw cwVar, Context context, iz izVar, int i3) {
        super(context, izVar, 1, null);
        this.L = i3;
        this.M = cwVar;
    }

    @Override
    public final void setVisibility(int i3) {
        switch (this.L) {
            case 0:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i3);
                    return;
                }
            case 1:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i3);
                    return;
                }
            case 2:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i3);
                    return;
                }
            default:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i3);
                    return;
                }
        }
    }
}
