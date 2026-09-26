package org.telegram.ui.Components;

import android.content.Context;
public final class zn0 extends jx0 {
    public final int K;
    public final org.telegram.ui.zx L;

    public zn0(org.telegram.ui.zx zxVar, Context context, v00 v00Var, int i10) {
        super(context, v00Var, 1, null);
        this.K = i10;
        this.L = zxVar;
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
