package org.telegram.ui.Components;

import android.content.Context;
public final class lo0 extends vx0 {
    public final int K;
    public final org.telegram.ui.nx L;

    public lo0(org.telegram.ui.nx nxVar, Context context, z00 z00Var, int i10) {
        super(context, z00Var, 1, null);
        this.K = i10;
        this.L = nxVar;
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.K) {
            case 0:
                if (this.L.M0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 1:
                if (this.L.M0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 2:
                if (this.L.M0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            default:
                if (this.L.M0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
        }
    }
}
