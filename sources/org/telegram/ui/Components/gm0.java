package org.telegram.ui.Components;

import android.content.Context;
public final class gm0 extends mv0 {
    public final int L;
    public final org.telegram.ui.jw M;

    public gm0(org.telegram.ui.jw jwVar, Context context, vz vzVar, int i7) {
        super(context, vzVar, 1, null);
        this.L = i7;
        this.M = jwVar;
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
