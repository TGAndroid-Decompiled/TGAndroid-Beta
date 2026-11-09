package org.telegram.ui.Components;

import android.content.Context;
public final class tl0 extends cv0 {
    public final int K;
    public final org.telegram.ui.hw L;

    public tl0(org.telegram.ui.hw hwVar, Context context, mz mzVar, int i7) {
        super(context, mzVar, 1, null);
        this.K = i7;
        this.L = hwVar;
    }

    @Override
    public final void setVisibility(int i7) {
        switch (this.K) {
            case 0:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
            case 1:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
            case 2:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
            default:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i7);
                    return;
                }
        }
    }
}
