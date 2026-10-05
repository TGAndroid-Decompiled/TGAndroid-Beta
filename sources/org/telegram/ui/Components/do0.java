package org.telegram.ui.Components;

import android.content.Context;
public final class do0 extends ux0 {
    public final int K;
    public final org.telegram.ui.dy L;

    public do0(org.telegram.ui.dy dyVar, Context context, w00 w00Var, int i10) {
        super(context, w00Var, 1, null);
        this.K = i10;
        this.L = dyVar;
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.K) {
            case 0:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 1:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 2:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            default:
                if (this.L.O0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
        }
    }
}
