package org.telegram.ui.Components;

import android.content.Context;
public final class sl0 extends av0 {
    public final int K;
    public final org.telegram.ui.fw L;

    public sl0(org.telegram.ui.fw fwVar, Context context, lz lzVar, int i7) {
        super(context, lzVar, 1, null);
        this.K = i7;
        this.L = fwVar;
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
