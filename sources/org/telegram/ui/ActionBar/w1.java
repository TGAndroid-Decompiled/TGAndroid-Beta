package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class w1 extends k5 {
    public final int d;

    public w1(Context context, int i10) {
        super(context);
        this.d = i10;
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        switch (this.d) {
            case 0:
                super.setEnabled(z10);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                setAlpha(f7);
                return;
            case 1:
                super.setEnabled(z10);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                setAlpha(f10);
                return;
            case 2:
                super.setEnabled(z10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                setAlpha(f11);
                return;
            default:
                super.setEnabled(z10);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.5f;
                }
                setAlpha(f12);
                return;
        }
    }

    @Override
    public final void setTextColor(int i10) {
        switch (this.d) {
            case 0:
                super.setTextColor(i10);
                setBackground(j6.G0(AndroidUtilities.dp(20.0f), i10));
                return;
            case 1:
                super.setTextColor(i10);
                setBackground(j6.G0(AndroidUtilities.dp(20.0f), i10));
                return;
            case 2:
                super.setTextColor(i10);
                setBackground(j6.G0(AndroidUtilities.dp(20.0f), i10));
                return;
            default:
                super.setTextColor(i10);
                setBackgroundDrawable(j6.G0(AndroidUtilities.dp(20.0f), i10));
                return;
        }
    }
}
