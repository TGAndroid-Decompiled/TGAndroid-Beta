package org.telegram.ui.Components;

import android.content.Context;
public final class wl0 extends cv0 {
    public final int L;
    public final org.telegram.ui.hw M;

    public wl0(org.telegram.ui.hw hwVar, Context context, pz pzVar, int i7) {
        super(context, pzVar, 1, null);
        this.L = i7;
        this.M = hwVar;
    }

    @Override
    public final void setVisibility(int i7) {
        switch (this.L) {
            case 0:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
            case 1:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
            case 2:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
            default:
                if (this.M.P0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
        }
    }
}
