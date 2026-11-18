package org.telegram.ui.Components;

import android.content.Context;
public final class em0 extends kv0 {
    public final int L;
    public final org.telegram.ui.kw M;

    public em0(org.telegram.ui.kw kwVar, Context context, wz wzVar, int i7) {
        super(context, wzVar, 1, null);
        this.L = i7;
        this.M = kwVar;
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
