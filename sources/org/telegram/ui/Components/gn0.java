package org.telegram.ui.Components;

import android.content.Context;
public final class gn0 extends qw0 {
    public final int G;
    public final org.telegram.ui.ox H;

    public gn0(org.telegram.ui.ox oxVar, Context context, p00 p00Var, int i10) {
        super(context, p00Var, 1, null);
        this.G = i10;
        this.H = oxVar;
    }

    @Override
    public final void setVisibility(int i10) {
        switch (this.G) {
            case 0:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 1:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            case 2:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
            default:
                if (this.H.I0.getTag() != null) {
                    super.setVisibility(8);
                    return;
                } else {
                    super.setVisibility(i10);
                    return;
                }
        }
    }
}
