package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class x1 extends i5 {
    public final int d;

    public x1(Context context, int i9) {
        super(context);
        this.d = i9;
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
    public final void setTextColor(int i9) {
        switch (this.d) {
            case 0:
                super.setTextColor(i9);
                setBackground(f6.G0(AndroidUtilities.dp(20.0f), i9));
                return;
            case 1:
                super.setTextColor(i9);
                setBackground(f6.G0(AndroidUtilities.dp(20.0f), i9));
                return;
            case 2:
                super.setTextColor(i9);
                setBackground(f6.G0(AndroidUtilities.dp(20.0f), i9));
                return;
            default:
                super.setTextColor(i9);
                setBackgroundDrawable(f6.G0(AndroidUtilities.dp(20.0f), i9));
                return;
        }
    }
}
