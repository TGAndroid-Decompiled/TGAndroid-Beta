package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ij extends org.telegram.ui.Components.q30 {
    public final int I;

    public ij(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var, z10);
        this.I = i11;
    }

    @Override
    public int c() {
        switch (this.I) {
            case 0:
                return org.telegram.messenger.i0.L(56.0f) / 2;
            default:
                return super.c();
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.I) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
