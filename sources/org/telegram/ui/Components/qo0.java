package org.telegram.ui.Components;

import android.content.Context;
public final class qo0 extends ey0 {
    public final int K;
    public final org.telegram.ui.jx L;

    public qo0(org.telegram.ui.jx jxVar, Context context, c10 c10Var, int i10) {
        super(context, c10Var, 1, null);
        this.K = i10;
        this.L = jxVar;
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
