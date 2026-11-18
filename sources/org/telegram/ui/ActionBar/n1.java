package org.telegram.ui.ActionBar;

import android.content.Context;
public final class n1 extends o5 {
    public final int d;

    public n1(Context context, int i7) {
        super(context);
        this.d = i7;
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.d) {
            case 0:
                super.setEnabled(z10);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                setAlpha(f10);
                return;
            case 1:
                super.setEnabled(z10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                setAlpha(f11);
                return;
            case 2:
                super.setEnabled(z10);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.5f;
                }
                setAlpha(f12);
                return;
            default:
                super.setEnabled(z10);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                setAlpha(f13);
                return;
        }
    }

    @Override
    public final void setTextColor(int i7) {
        switch (this.d) {
            case 0:
                super.setTextColor(i7);
                setBackground(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                return;
            case 1:
                super.setTextColor(i7);
                setBackground(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                return;
            case 2:
                super.setTextColor(i7);
                setBackground(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                return;
            default:
                super.setTextColor(i7);
                setBackgroundDrawable(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                return;
        }
    }
}
