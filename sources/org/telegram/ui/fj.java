package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class fj extends org.telegram.ui.Components.k40 {
    public final int I;

    public fj(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(i10, context, d6Var, z10);
        this.I = i11;
    }

    @Override
    public int c() {
        switch (this.I) {
            case 0:
                return AndroidUtilities.dp(56.0f) / 2;
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
            case 3:
                super.setVisibility(i10);
                if (i10 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        return;
                    } catch (Exception unused3) {
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
